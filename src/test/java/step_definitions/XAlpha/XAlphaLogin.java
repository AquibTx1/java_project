package step_definitions.XAlpha;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.NitroXActions.NitroXUserLogin;
import modules.XAlphaActions.XAlphaLoginActions;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;

import java.util.HashMap;

public class XAlphaLogin {

    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    public XAlphaLogin() {
        dataMap = BaseStepDefinitions.dataMap;
    }

    @And("Input XAlpha Username and Password")
    public void inputXAlphaUsernameAndPassword() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaLoginActions.enterUsername(dataMap);
                XAlphaLoginActions.enterPassword(dataMap);
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

    @And("Click XAlpha Login Button")
    public void clickXAlphaLoginButton() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaLoginActions.clickLoginBtn();
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

    @Then("Verify User is Able to Login to XAlpha Successfully")
    public void verifyUserIsAbleToLoginToXAlphaSuccessfully() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                XAlphaLoginActions.waitForLogoutBtn();
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
