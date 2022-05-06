package step_definitions;

import NitroXPages.NitroXLoginPage;
import io.cucumber.java.en.Given;
import modules.NitroXActions.NitroXUserLogin;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.ExcelDataUtil;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

import java.util.HashMap;

public class BaseStepDefinitions extends KeywordUtil {

    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    @Given("Read test data {string} and {string} from Excel file")
    public void readTestDataAndFromExcelFile(String sheetName, String testCaseID) {
        try {
            KeywordUtil.cucumberTagName = "Web";
            dataMap = ExcelDataUtil.getTestDataWithTestCaseID(sheetName, testCaseID);

        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Given("Login to NitroX app with valid login credentials")
    public void loginToNitroXAppWithValidLoginCredentials() {
        try {
            navigateToUrl(ConfigReader.getValue("NitroX"));
            inputText(NitroXLoginPage.username, ConfigReader.getValue("nitroxUsername"), "Enter the username");
            inputText(NitroXLoginPage.password, ConfigReader.getValue("nitroxPassword"), "Enter the password");
            click(NitroXLoginPage.loginbtn, "Click on Sign on Button");
            waitForVisible(NitroXLoginPage.homepage);
            System.out.println("Home Page" + KeywordUtil.getElementText(NitroXLoginPage.homepage));
            Assert.assertEquals(KeywordUtil.getElementText(NitroXLoginPage.homepage), "Home");
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
}
