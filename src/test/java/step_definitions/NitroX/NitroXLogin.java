package step_definitions.NitroX;

import NitroXPages.NitroXLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.NitroXActions.NitoXUserLogin;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.ExcelDataUtil;
import utilities.GlobalUtil;

import java.util.HashMap;

import static utilities.KeywordUtil.*;

public class NitroXLogin {

    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    public NitroXLogin()
    {
        //constructor of the class to load datamap from BaseStepDefinitions
        dataMap = BaseStepDefinitions.dataMap;
    }

    @Given("^Read the \"([^\"]*)\" and \"([^\"]*)\" from Excel file$")
    public void readTheAndFromExcelFile(String Sheetname, String TestCaseID) {

        try {
            dataMap = ExcelDataUtil.getTestDataWithTestCaseID(Sheetname, TestCaseID);

        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("^Navigate to the NitroX url$")
    public void navigateToTheNitroXUrl() {
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

    @When("^User enter the username and password$")
    public void user_enter_the_username_and_password() {
        try {
            NitoXUserLogin.login(dataMap);

        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Verify user is on HomePage")
    public void verifyUserIsOnHomePage() {
        try {
            boolean ele = isWebElementVisible(NitroXLoginPage.homepage, "Check the HomePage");
            if (ele)
                System.out.println("User is on the Page");
            else
                System.out.println("Invalid Credentails");
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
}
