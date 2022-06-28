import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.notifications
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.sshExec
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import java.io.BufferedReader
import java.io.File

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2021.2"

var projectName = "AltonomyQABDD"

project {

    buildType(makeBuild("${projectName}_Build", "Build"))

    params {
        param("env.DOCKER_FILE_PATH", "Dockerfile")
        param("env.DOCKER_IMAGE_NAME", "altonomy/qa-bdd")
        param("env.PACKAGE_NAME", "altonomy-qa-bdd")
        param("env.HELM_CHART_PATH", "helm")
        param("env.RUNDECK_STAGING_JOB_ID","355fbccf-275d-4c44-bec2-28285d1465a7")
        param("env.RUNDECK_TEST_JOB_ID","15fe57ac-a8fc-4155-8cd4-af98bbc392c8")
    }
}

fun loadScriptFromFile(path: String): String {
    val bufferedReader: BufferedReader = File(path).bufferedReader()
    return bufferedReader.use { it.readText() }.trimIndent()
}

fun makeBuild(
    buildId: String,
    buildName: String,
) = object : BuildType({
    id(buildId)
    name = buildName

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {

        script {
            name = "Set Env Vars"
            executionMode = BuildStep.ExecutionMode.DEFAULT
            scriptContent = loadScriptFromFile("scripts/set-env.sh")
        }

        script {
            name = "Build Image"
            executionMode = BuildStep.ExecutionMode.DEFAULT
            scriptContent = loadScriptFromFile("scripts/build.sh")
        }

        script {
            name = "Publish to ECR"
            executionMode = BuildStep.ExecutionMode.DEFAULT
            scriptContent = loadScriptFromFile("scripts/publish.sh")
        }
        
        script {
            name = "Docker Pull via Rundeck for test image"
            executionMode = BuildStep.ExecutionMode.DEFAULT
            scriptContent = loadScriptFromFile("scripts/docker-pull.sh")
            conditions {
            equals("teamcity.build.branch.is_default", "false")
             }
        }

        script {
            name = "Docker Pull via Rundeck for latest image"
            executionMode = BuildStep.ExecutionMode.DEFAULT
            scriptContent = loadScriptFromFile("scripts/docker-stagingpull.sh")
            conditions {
            equals("teamcity.build.branch.is_default", "true")
             }
        }

        sshExec {
            name = "Docker Test Run for test environment"
            commands = loadScriptFromFile("scripts/docker-test.sh")
            targetUrl = "qa.altono.app"
            executionMode = BuildStep.ExecutionMode.DEFAULT
            conditions {
            equals("teamcity.build.branch.is_default", "false")
             }
            authMethod = defaultPrivateKey {
                username = "centos"
            }
        }

        sshExec {
            name = "Docker Test Run for staging environment"
            commands = loadScriptFromFile("scripts/docker-stagingtest.sh")
            targetUrl = "qa.altono.app"
            executionMode = BuildStep.ExecutionMode.DEFAULT
            conditions {
            equals("teamcity.build.branch.is_default", "true")
             }
            authMethod = defaultPrivateKey {
                username = "centos"
            }
        }


        sshExec {
            name = "Docker Clean"
            commands = loadScriptFromFile("scripts/docker-clean.sh")
            targetUrl = "qa.altono.app"
            executionMode = BuildStep.ExecutionMode.ALWAYS
            authMethod = defaultPrivateKey {
                username = "centos"
            }
        }

    }

    features {
        notifications {
            notifierSettings = emailNotifier {
                email = "sg.it@blockchain.com"
            }
        buildFailedToStart = true
        buildFailed = true
        firstBuildErrorOccurs = true
        buildProbablyHanging = true
    }
}    

    triggers {
        vcs {
        }
    }
}) {}
