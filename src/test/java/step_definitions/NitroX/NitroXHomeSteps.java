package step_definitions.NitroX;

import NitroXPages.NitroXHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
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
            LogUtil.infoLog(thisClass, dataMap.get("Mode") + ": mode entered");
            Assert.assertEquals(getElementText(NitroXHomePage.modeValueAfterSelection), dataMap.get("Mode"));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("Select the Trading Account")
    public void selectTheTradingAccount() {
    }

    @Then("Validate The Select Trading")
    public void validateTheSelectTrading() {
    }
}
