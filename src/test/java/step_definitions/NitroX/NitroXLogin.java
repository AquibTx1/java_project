package step_definitions.NitroX;

import NitroXPages.NitroXLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.NitroXActions.NitroXUserLogin;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

import java.util.HashMap;

import static utilities.KeywordUtil.*;

public class NitroXLogin {

    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    public NitroXLogin() {
        //constructor of the class to load datamap from BaseStepDefinitions
        dataMap = BaseStepDefinitions.dataMap;
    }

    @When("^Navigate to the url$")
    public void navigateToTheUrl() {
        try {
            navigateToUrl(dataMap.get("URL"));
            //boolean  =
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("^Input username and password$")
    public void inputUsernameAndPassword() {
        try {
            NitroXUserLogin.enterusername(dataMap);
            NitroXUserLogin.enterpassword(dataMap);

        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }

    }

    @And("Click submit button")
    public void clickSubmitButton() {

        try {
            NitroXUserLogin.clickloginbtn();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Verify user is able to login successfully")
    public void verifyUserIsAbleToLoginSuccessfully() {
        KeywordUtil.waitForVisible(NitroXLoginPage.homepage);
        System.out.println("Home Page" + KeywordUtil.getElementText(NitroXLoginPage.homepage));
        Assert.assertEquals(KeywordUtil.getElementText(NitroXLoginPage.homepage), "Home");
    }

    @Then("Verify validation message is displayed")
    public void verifyValidationMessageIsDisplayed() {
        waitForVisible(NitroXLoginPage.invalidLoginValidation);
        Assert.assertEquals(getElementText(NitroXLoginPage.invalidLoginValidation), dataMap.get("Validation"));
    }
}
