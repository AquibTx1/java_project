package step_definitions.NitroX;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.NitroXActions.NitroXBuySellFutureAction;
import modules.NitroXActions.NitroXHome;
import org.testng.Assert;
import pageFactory.NitroXPages.NitroXBuySellFuturePage;
import pageFactory.NitroXPages.NitroXHomePage;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;

import java.util.HashMap;
import java.util.Locale;

import static utilities.KeywordUtil.waitForVisible;

public class NitroXBuySellFutureSteps {

    public static HashMap<String, String> dataMap ;
    public NitroXBuySellFutureSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }



    @When("Choose Mode, Trading Account and Instrument")
    public void chooseModeTradingAccountAndInstrumentType() {

        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBuySellFutureAction.selectmode(dataMap);
                NitroXBuySellFutureAction.inputTradingAccount(dataMap);
                NitroXBuySellFutureAction.inputInstrument(dataMap);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }


    @And("Choose Position Mode,Leverage and Margin Type")
    public void choosePositionModeLeverageAndMarginType()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(NitroXBuySellFuturePage.lowestAskPrice);
                NitroXBuySellFutureAction.inputPositionMode(dataMap);
                NitroXBuySellFutureAction.inputLeverage(dataMap);
                NitroXBuySellFutureAction.selectMarginType(dataMap);

            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }
    @And("Create A buy Order less than Market Price for Future Mode")
    public void createABuyOrderLessThanMarketPriceFutureMode() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {

                //added the Same Method of Spot
                NitroXHome.ClearInputPrice();
                NitroXBuySellFutureAction.InputOpenOrderAskPrice();
                NitroXHome.ClearOrderQuantity();
                NitroXHome.InputCustomQuantity(dataMap);

            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }




    @And("Click Buy Order and Validate")
    public void clickBuyButton() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
           NitroXBuySellFutureAction.ClickBuyButton();
        }
        //increase the step counter by 1
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    @Then("Validate order is in Open State for Future Mode")
    public void validateOrderIsInOpenState() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {

            waitForVisible(NitroXBuySellFuturePage.validOrder);
            NitroXBuySellFutureAction.clickOpenState();
            Assert.assertEquals(NitroXHome.getSideofNthOpenOrder(1), dataMap.get("Side").toUpperCase(Locale.ROOT));
            Assert.assertEquals(NitroXHome.getPriceofNthOpenOrder(1), NitroXHome.getOrderFormPrice());

            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }



}
