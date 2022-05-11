package step_definitions.NitroX;

import NitroXPages.NitroXHomePage;
import NitroXPages.NitroXLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javassist.compiler.ast.Keyword;
import modules.NitroXActions.NitroXHome;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.ConfigReader;
import utilities.GlobalUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.time.Clock;
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
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.selectmode(dataMap);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @When("Choose mode value using input text")
    public void chooseModeValueUsingInputText() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            try {
                NitroXHome.inputMode(dataMap);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @Then("Verify mode value")
    public void verifyModeValue() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
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
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @When("Input random mode")
    public void inputRandomMode() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            waitForVisible(NitroXHomePage.modeTextbyID);
            KeywordUtil.inputText(NitroXHomePage.modeTextbyID, "random", "Mode value entered using send keys.");
            KeywordUtil.pressEnter(NitroXHomePage.modeTextbyID);
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
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
            LogUtil.infoLog(thisClass, dataMap.get("TradingAccount") + ": trading account entered");
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("Select the Trading Account")
    public void selectTheTradingAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.selectTradingAccount(dataMap);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }

    }

    @And("Enter The Base and Quote Currency")
    public void enterTheBaseAndQuoteCurrency() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.selectBaseCurrency(dataMap);
                NitroXHome.selectQuoteCurrency(dataMap);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @Then("Validate the Base and Quote Currency")
    public void validateTheBaseAndQuoteCurrency() {
        Assert.assertTrue(KeywordUtil.verifyInputText(NitroXHomePage.Basecurrency, dataMap.get("Base"), "Base Currency Entered"));
        Assert.assertTrue(KeywordUtil.verifyInputText(NitroXHomePage.Quotecurrency, dataMap.get("Quote"), "Quote Currency Entered"));
    }

    @And("Input the Price and Quantity")
    public void InputThePriceAndQuanitiy() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            NitroXHome.InputthePrice();
            NitroXHome.InputQuantity(dataMap);
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @And("Create A buy Order")
    public void createABuyOrder() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            NitroXHome.CreateOrder();
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @Then("Validate User do not allowed to buy")
    public void validateUserDoNotAllowedToBuy() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            //execute the step when checkSkipExecutionFlags() returns false
            waitForVisible(NitroXHomePage.invalidOrder);
        }
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @And("Create A buy Order less than Market Price")
    public void createABuyOrderLessThanMarketPrice() {
        try {
            NitroXHome.InputOpenOrderBidPrice();
            NitroXHome.InputCustomQuantity(dataMap);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate Order is in Open State")
    public void validateOrderIsInOpenState() {
        waitForVisible(NitroXHomePage.validOrder);

    }

    @And("Cancel Nth Open Order")
    public void cancelNthOpenOrder() {
        //wait for open order to display
        NitroXHome.waitForOpenOrdersTable();
        //get time of Nth open order
        NitroXHome.getTimeofNthOpenOrder(Integer.parseInt(dataMap.get("OpenOrderNumber")));
        //click on cancel button
        NitroXHome.cancelNthOpenOrder(Integer.parseInt(dataMap.get("OpenOrderNumber")));
        //verify the time of very first order changes to verify the order is cancelled
        NitroXHome.verifyOrderCancelledBasedOnTime();
    }

    @Then("Verify Success Message")
    public void verifySuccessMessage() {
        //wait and verify for the success message
        NitroXHome.getOrderCancelledSuccessMsg();
    }

    @And("Click Buy Button")
    public void clickBuyButton() {
        NitroXHome.CreateOrder();
    }

    @And("Create Buy Order Equal to Market Price")
    public void createBuyOrderEqualToMarketPrice() {
        //pick lowest ask price and also store it in a variable to assert later
        //input quantity and also store it in a variable to assert later
    }

    @And("Click Sell Button")
    public void clickSellButton() {
        //click sell button
    }

    @Then("Validate Order Moves to Dealt Orders")
    public void validateOrderMovesToDealtOrders() {
        //get price and quantity of the first row under dealt orders
        //Assert price and quantity at the time of placing order with first row of dealt orders
    }

}
