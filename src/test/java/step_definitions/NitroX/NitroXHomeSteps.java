package step_definitions.NitroX;

import NitroXPages.NitroXHomePage;
import NitroXPages.NitroXLoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

import java.util.HashMap;

import static utilities.KeywordUtil.getElementText;
import static utilities.KeywordUtil.waitForVisible;

public class NitroXHomeSteps {

    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    public NitroXHomeSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }

    @When("Choose mode value using dropdown")
    public void chooseModeValueUsingDropdown() {
        try {
            KeywordUtil.click(NitroXHomePage.modeTextField, "Mode text field clicked.");
            waitForVisible(NitroXHomePage.spotDropdown);
            if (dataMap.get("Mode").equalsIgnoreCase("Spot")) {
                KeywordUtil.click(NitroXHomePage.spotDropdown, "Spot mode is clicked from dropdown.");
            } else if (dataMap.get("Mode").equalsIgnoreCase("Futures")) {
                KeywordUtil.click(NitroXHomePage.spotDropdown, "Spot mode is clicked from dropdown.");
            } else {
                System.out.println("choose a valid value");
            }
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Verify mode value")
    public void verifyModeValue() {
        try {
            Assert.assertEquals(NitroXHomePage.getModeTextFieldGeneric, dataMap.get("Mode"));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
}
