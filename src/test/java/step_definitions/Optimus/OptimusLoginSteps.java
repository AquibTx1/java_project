package step_definitions.Optimus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.OptimusActions.OptimusLoginActions;
import modules.XAlphaActions.XAlphaLoginActions;
import org.testng.Assert;
import pageFactory.OptimusPages.OptimusLoginPage;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;

import java.util.HashMap;

public class OptimusLoginSteps {
    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    public OptimusLoginSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }

    @And("Input Optimus Username and Password")
    public void inputOptimusUsernameAndPassword() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusLoginActions.enterUsername(dataMap);
                OptimusLoginActions.enterPassword(dataMap);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @And("Click Optimus Login Button")
    public void clickOptimusLoginButton() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusLoginActions.clickLoginBtn();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify user is able to login to Optimus successfully")
    public void verifyUserIsAbleToLoginToOptimusSuccessfully() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusLoginActions.waitForLogoutBtn();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Verify Optimus validation message is displayed")
    public void verifyOptimusValidationMessageIsDisplayed() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusLoginActions.waitForValidationMsg();
                Assert.assertEquals(OptimusLoginActions.getValidationMsg(), dataMap.get("Validation"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }
}
