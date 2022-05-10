package step_definitions.NitroX;

import NitroXPages.NitroXHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.NitroXActions.NitroXHome;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.ConfigReader;
import utilities.GlobalUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;

import static utilities.KeywordUtil.*;

public class NitroXHomeSteps {


    public static HashMap<String, String> dataMap = new HashMap<String, String>();

    static Class thisClass = NitroXHomeSteps.class;

    public NitroXHomeSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }

    @When("Choose mode value using dropdown")
    public void chooseModeValueUsingDropdown() {
        try {
            NitroXHome.selectmode(dataMap);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("Choose mode value using input text")
    public void chooseModeValueUsingInputText() {
        try
        {
            NitroXHome.inputMode(dataMap);
        }
        catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
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
            NitroXHome.inputTradingAccount(dataMap);
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
            NitroXHome.selectTradingAccount(dataMap);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }

    }

    @And("Enter The Base and Quote Currency")
    public void enterTheBaseAndQuoteCurrency() {

        try
        {
            //NitroXHome.selectmode(dataMap);
            //NitroXHome.selectTradingAccount(dataMap);
            NitroXHome.selectBaseCurrency(dataMap);
            NitroXHome.selectQuoteCurrency(dataMap);
        }
        catch (Throwable e)
        {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
        
    }
    @Then("Validate the Base and Quote Currency")
    public void validateTheBaseAndQuoteCurrency() {

        Assert.assertTrue(KeywordUtil.verifyInputText(NitroXHomePage.Basecurrency,dataMap.get("Base"),"Base Currency Entered"));
        Assert.assertTrue(KeywordUtil.verifyInputText(NitroXHomePage.Quotecurrency,dataMap.get("Quote"),"Quote Currency Entered"));
    }
}
