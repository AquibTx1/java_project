package step_definitions.NitroX;

import NitroXPages.NitroXHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.ConfigReader;
import utilities.GlobalUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;

import static utilities.KeywordUtil.getElementText;
import static utilities.KeywordUtil.waitForVisible;

public class NitroXHomeSteps {


    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    static Class thisClass = NitroXHomeSteps.class;

    public NitroXHomeSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }

    @When("Choose mode value using dropdown")
    public void chooseModeValueUsingDropdown() {
        try {
            waitForVisible(NitroXHomePage.modeTextbyID);
            KeywordUtil.click(NitroXHomePage.modeTextField, "Mode text field clicked.");
            waitForVisible(NitroXHomePage.spotDropdown);
            if (dataMap.get("Mode").equalsIgnoreCase("Spot")) {
                KeywordUtil.click(NitroXHomePage.spotDropdown, "Spot mode selected from dropdown.");
            } else if (dataMap.get("Mode").equalsIgnoreCase("Futures")) {
                KeywordUtil.click(NitroXHomePage.FutureDropdown, "Future mode selected from dropdown.");
            } else {
                Assert.fail("Please provide a valid mode value in .xlsx file");
            }
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("Choose mode value using input text")
    public void chooseModeValueUsingInputText() {
        waitForVisible(NitroXHomePage.modeTextbyID);
        KeywordUtil.inputText(NitroXHomePage.modeTextbyID, dataMap.get("Mode"), "Mode value entered using send keys.");
        KeywordUtil.pressEnter(NitroXHomePage.modeTextbyID);
    }

    @Then("Verify mode value")
    public void verifyModeValue() {
        try {
            Assert.assertEquals(getElementText(NitroXHomePage.modeValueAfterSelection), dataMap.get("Mode"));
            LogUtil.infoLog(thisClass, dataMap.get("Mode") + ": mode entered");
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("Enter the Trading Account")
    public void EnterTheTradingAccount() {
        try {
            KeywordUtil.click(NitroXHomePage.tradingaccount, "Trading Account text field clicked.");
            KeywordUtil.inputText(NitroXHomePage.inputtradingaccount, dataMap.get("TradingAccount"), "Enter the Account detail");
            KeywordUtil.pressEnter(NitroXHomePage.inputtradingaccount);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate Selected Trading Account")
    public void validateSelectedTradingAccount() {
        try {
            Assert.assertEquals(getElementText(NitroXHomePage.tradingAccountSibling), dataMap.get("TradingAccount"));
            LogUtil.infoLog(thisClass, dataMap.get("TradingAccount")+": trading account entered");
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("Select the Trading Account")
    public void selectTheTradingAccount() {

        try {
            KeywordUtil.click(NitroXHomePage.tradingaccount, "Trading Account text field clicked.");
            waitForVisible(NitroXHomePage.selecttradingaccount1);
            if (dataMap.get("TradingAccount").equalsIgnoreCase(ConfigReader.getValue("TradingAccount1"))) {
                KeywordUtil.click(NitroXHomePage.selecttradingaccount1, "First Trading Account selected from dropdown.");
            } else if (dataMap.get("TradingAccount").equalsIgnoreCase(ConfigReader.getValue("TradingAccount2"))) {
                KeywordUtil.click(NitroXHomePage.selecttradingaccount2, "Second Trading Account selected from dropdown");
            }
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }

    }
}
