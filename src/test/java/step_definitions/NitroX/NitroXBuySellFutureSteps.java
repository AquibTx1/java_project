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
import utilities.LogUtil;

import java.util.HashMap;
import java.util.Locale;

import static utilities.KeywordUtil.*;

public class NitroXBuySellFutureSteps {

    public static HashMap<String, String> dataMap ;

    static Class thisClass = NitroXBuySellFutureSteps.class;

    static String firstOpenOrderTime;
    public NitroXBuySellFutureSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }



    @When("Choose Mode, Trading Account and Instrument")
    public void chooseModeTradingAccountAndInstrumentType()
    {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBuySellFutureAction.selectmode(dataMap);
                NitroXBuySellFutureAction.inputTradingAccount(dataMap);
                NitroXBuySellFutureAction.inputInstrument(dataMap);
                scrollingToElementofAPage(NitroXBuySellFuturePage.openOrderTab,"Scrolled to Tab");

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
    @And("Validate No previous position")
    public void validateNoPreviousPostion() {
        //Assert price and quantity at the time of placing order with first row of dealt orders
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBuySellFutureAction.validateInstrument(dataMap);

            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
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
        boolean flag = false;
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //click buy button
                NitroXHome.ClickBuyButton();

                //wait and verify for the success message
                NitroXHome.waitForNotifMsg();
                int i = 0;
                while (i < 2) {
                    if (NitroXHome.getNotifMsg().contains("Could not place order.")) {
                        NitroXHome.waitForNotifMsgToDisappear();
                        delay(4000);
                        //click sell button again
                        NitroXHome.ClickBuyButton();
                        LogUtil.infoLog(thisClass, "BUY button click counter=" + i);
                        NitroXHome.waitForNotifMsg();
                        i++;
                    } else {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    Assert.assertTrue(NitroXHome.getNotifMsg().contains("Order submitted successfully"));
                    NitroXHome.waitForInvisibleOrderSubmittedMsg();
                } else {
                    LogUtil.errorLog(thisClass, "Could you not place BUY order two times in a row");
                    assert false;
                }
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
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
            try {
                scrollingToElementofAPage(NitroXBuySellFuturePage.openOrderTab,"Scrolled to Element");
                NitroXBuySellFutureAction.clickOpenState();
                Assert.assertEquals(NitroXHome.getSideofNthOpenOrder(1), dataMap.get("Side").toUpperCase(Locale.ROOT));
                Assert.assertEquals(NitroXHome.getPriceofNthOpenOrder(1), NitroXHome.getOrderFormPrice());
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
    @And("Go to Open Order & Cancel First Open Buy Order")
    public void goToOpenOrderCancelFirstOpenBuyOrder() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBuySellFuturePage.openOrderTab,"Scrolled To Open Order");
                NitroXBuySellFutureAction.clickOpenState();
                NitroXBuySellFutureAction.cancelFirstBuyOrderforFutureMode();
                // NitroXBuySellFutureAction.

            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        //increase the step counter by 1
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

    /***************************Test Case-36 ***************************/
    @And("Create Buy Order Equal to Ask Price for Future Mode")
    public void createBuyOrderEqualToAskPrice() {

        //pick lowest ask price and also store it in a variable to assert later
        //input quantity and also store it in a variable to assert later
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //NitroXhome Spot Methods Used As They Have same Feature
                NitroXHome.scrollToAskPrices();
                NitroXHome.ClearInputPrice();
                NitroXHome.InputthePrice(NitroXHome.getHighestAskPrice());
                NitroXHome.ClearOrderQuantity();
                NitroXHome.InputCustomQuantity(dataMap);

            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
    }
    @Then("Verify Order Submitted Success Message-Future Mode")
    public void verifyOrderSubmittedSuccessMessage() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //wait and verify for the success message
                NitroXHome.getOrderSubmittedSuccessMsg();
                //increase the step counter by 1
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
    @Then("Validate Order Moves to Dealt Orders-Future Mode")
    public void validateOrderMovesToDealtOrdersFutureMode() {

        //Assert price and quantity at the time of placing order with first row of dealt orders
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.scrollToOrdersPlaced();
                NitroXHome.waitForInvisibleOrderSubmittedMsg();
                NitroXHome.clickDealtOrdersTab();
                Assert.assertEquals(NitroXHome.getSideofNthDealtOrder(1), dataMap.get("Side").toUpperCase(Locale.ROOT));
                //Assert.assertEquals(NitroXHome.getPriceofNthDealtOrder(1), NitroXHome.getOrderFormPrice());
                Assert.assertEquals(NitroXBuySellFutureAction.getQuantityofNthDealtOrder(1), NitroXHome.getOrderFormQuantity());
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
    }

    @And("Create Buy Order Greater than Ask Price for Future Mode")
    public void createBuyOrderGreaterThanAskPriceForFutureMode() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                //NitroXHome.InputBuyOrderPrice();
                NitroXHome.scrollToAskPrices();
                NitroXHome.ClearInputPrice();
                NitroXHome.InputthePrice(NitroXHome.getHighestAskPrice() + 0.009);
                NitroXHome.ClearOrderQuantity();
                NitroXHome.InputCustomQuantity(dataMap);
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
    }

    @And("Validate previous position for buy order")
    public void validatePreviousPositionForBuyOrder() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {

                NitroXBuySellFutureAction.getPreorderAmount(dataMap);
                NitroXBuySellFutureAction.validateAmount(dataMap);

            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }

    }
    @And("Create Buy Order")
    public void createBuyOrder() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {

                NitroXBuySellFutureAction.ClickBuyButton();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }

    }

    @And("Cancel First Open Sell Order for FutureMode")
    public void cancelFirstOpenSellOrderForFutureMode()
    {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXHome.scrollToOrdersPlaced();
                NitroXBuySellFutureAction.clickOpenState();
                delay(5000);
                firstOpenOrderTime = NitroXHome.getTimeofNthOpenOrder(1);
                NitroXBuySellFutureAction.cancelFirstSellOrder();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                e.printStackTrace();
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
        }
        //increase the step counter by 1
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

}




