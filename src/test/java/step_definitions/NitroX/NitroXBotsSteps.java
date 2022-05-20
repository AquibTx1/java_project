package step_definitions.NitroX;

import modules.NitroXActions.NitroXHome;
import pageFactory.NitroXPages.NitroXBotsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.NitroXActions.NitroXBotsAction;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;

import java.util.HashMap;

import static utilities.KeywordUtil.*;

public class NitroXBotsSteps {


    public static  int totalbotbefore,finalbotvalue;
    public static HashMap<String, String> dataMap ;
    public NitroXBotsSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }
    @And("Verify total Bots Before staring the Buy execution")
    public void verifyCountNumberOfBotsBeforeBuyingSelling() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn,"Scrolled to Total Bot Bot Filtered");
                totalbotbefore=NitroXBotsAction.getTotalFilteredBots();

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

    @And("Click Start Bot ,Select the Service,Method and Input Bot Quantity")
    public void clickStartBotSelectTheServiceMethodAndInputBotQuantity() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.clickStart();
                NitroXBotsAction.waitforBotWindow();
                NitroXBotsAction.inputService(dataMap);
                NitroXBotsAction.inputMethod(dataMap);
                NitroXBotsAction.inputBotQuantity(dataMap);
                waitForVisible(NitroXBotsPage.orderdirection);
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

    @When("Select Buy Order and Select the MinTime and MaxTime Break")
    public void select_buy_order_and_select_the_min_time_and_max_time_break() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(NitroXBotsPage.orderdirection);
                NitroXBotsAction.inputOrderDirection(dataMap);
                NitroXBotsAction.inputMinTime(dataMap);
                NitroXBotsAction.inputMaxTime(dataMap);
                NitroXBotsAction.inputMinPrice(dataMap);
                NitroXBotsAction.inputMaxPrice(dataMap);

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
    @When("Input the Time, Quantity and Submit the Order")
    public void input_the_time_quantity_and_submit_the_order() {
        // Write code here that turns the phrase above into concrete actions
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.inputOrderAmount(dataMap);
                NitroXBotsAction.inputOrderType(dataMap);
                NitroXBotsAction.inputTrigerCondtion();
                NitroXBotsAction.clickSubmit();

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
    @Then("Verify Bot Count in Total Filtered")
    public void verifyBotCountInTotalFiltered() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.getBotSubmitSuccessMsg();
                delay(2000);
                Assert.assertEquals(NitroXBotsAction.getTotalFilteredBots()-1,totalbotbefore);

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

    @And("Click total filtered bots and click the detail bot")
    public void clickTotalFilteredBotsAndClickTheDetailBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
               NitroXBotsAction.selecttotalBots();
               NitroXBotsAction.sortStartTime();
               NitroXBotsAction.selectLatestBotName();
               NitroXBotsAction.selectConfig();

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
    @Then("Verify new Bot in detail and config")
    public void verifyNewBotInDetaiilAndConfig() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {

                waitForVisible(NitroXBotsPage.trrigger);
                Assert.assertEquals(NitroXBotsAction.getTrigerConditionvalue(),NitroXBotsAction.trrigervalue);
               // Assert.assertEquals();
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
        //dataMap=null;

    }

    @And("Verify the Buy Order in Dealt Order")
    public void CloseConfigTabandVerifyOrderinDealttoBuy() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.CloseConfigTab();
                NitroXBotsAction.CloseBotDetail();
                delay(2000);
                NitroXBotsAction.clickDealtOrdersTab();
                Assert.assertEquals(NitroXBotsAction.getDealtOrderPrice(), NitroXBotsAction.getPrice());
                NitroXBotsAction.stopAllBots();
                NitroXBotsAction.CloseBotDetail();


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


    /*******************************Steps For Sell**************************************************************************/

    @And("Verify total Bots Before starting Sell execution")
    public void verifyCountNumberOfBotsBeforeSelling() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn,"Scrolled to Total Bot Before");
                totalbotbefore=NitroXBotsAction.getTotalFilteredBots();
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


    @And("Start Bot ,Select the Service,Method and Input Bot Quantity")
    public void clickStartBotSelectServiceAndInputBotQuantity() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.clickStart();
                NitroXBotsAction.waitforBotWindow();
                NitroXBotsAction.inputService(dataMap);
                NitroXBotsAction.inputMethod(dataMap);
                NitroXBotsAction.inputBotQuantity(dataMap);
                waitForVisible(NitroXBotsPage.orderdirection);

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

    @When("Select Sell Order and Select the MinTime and MaxTime Break")
    public void select_sell_order_and_select_the_min_time_and_max_time_break() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(NitroXBotsPage.orderdirection);
                NitroXBotsAction.inputOrderDirection(dataMap);
                NitroXBotsAction.inputMinTime(dataMap);
                NitroXBotsAction.inputMaxTime(dataMap);
                NitroXBotsAction.inputMinPrice(dataMap);
                NitroXBotsAction.inputMaxPrice(dataMap);

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

    @And("Verify the Sell Order in Dealt Order")
    public void CloseConfigTabandVerifyOrderinDealt() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.CloseConfigTab();
                NitroXBotsAction.CloseBotDetail();
                delay(1000);
                NitroXBotsAction.clickDealtOrdersTab();
                Assert.assertEquals(NitroXBotsAction.getDealtOrderPrice(), NitroXBotsAction.getBidPrice());
                NitroXBotsAction.stopAllBots();
                NitroXBotsAction.CloseBotDetail();

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


/****************************************SNIPER BOT****************************************************************/


@And("Verify total Bots Before starting the Sniper Bot Buy execution")
public void CountNumberOfBotsBeforeBuyingSelling() {

    if (BaseStepDefinitions.checkSkipExecutionFlags()) {
        BaseStepDefinitions.skipThisStep();
    } else {
        try {
            scrollingToElementofAPage(NitroXBotsPage.startbtn,"Scrolled to Total Bot Filtered");
            totalbotbefore=NitroXBotsAction.getTotalFilteredBots();

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
    @And("Click Start Bot and Select the Service,Method and Input Bot Quantity")
    public void StartBotSelectTheServiceMethodAndInputBotQuantity() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.clickStart();
                NitroXBotsAction.waitforBotWindow();
                NitroXBotsAction.inputService(dataMap);
                NitroXBotsAction.inputMethod(dataMap);
                NitroXBotsAction.inputBotQuantity(dataMap);

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


    @When("Select Buy Order ,Side and Min,Max Price and MaxSlippageThreashold")
    public void selectSideMinPriceandMaxPrice() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {

                NitroXBotsAction.inputTotalAmount(dataMap);
                NitroXBotsAction.selectSide(dataMap);
                NitroXBotsAction.inputMinPriceforSniper(dataMap);
                NitroXBotsAction.inputMaxPriceforSniper(dataMap);
                NitroXBotsAction.inputMaxThreshold(dataMap);


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


    @And("Enter Quantity and Submit the Order")
    public void enterQuantityAndSubmitTheOrder() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.inputTrigerCondtion();
                NitroXBotsAction.clickSubmit();

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


    @Then("Verify Bots in Total Filtered on homePage")
    public void verifyBotCountTotalFiltered() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.getBotSubmitSuccessMsg();
                delay(2000);
                Assert.assertEquals(NitroXBotsAction.getTotalFilteredBots()-1,totalbotbefore);

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

    @And("Click total filtered bots and Check the Bot in Detail and Config")
    public void clickTotalFilteredBotsValidatetheBot() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(NitroXBotsPage.startbtn, "Scrolled to start element");
                NitroXBotsAction.selecttotalBots();
                NitroXBotsAction.sortStartTime();
                NitroXBotsAction.selectLatestBotName();
                NitroXBotsAction.selectConfig();

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

    @Then("Verify new Bot in detail and config for Snipper Bot")
    public void verifyNewBotInDetaiilAndConfigTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(NitroXBotsPage.s_trrigger);
                Assert.assertEquals(NitroXBotsAction.getTrigerConditionvalue_Sniper(),NitroXBotsAction.trrigervalue);
                // Assert.assertEquals();
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

    @And("Verify the Order in Dealt Order for Sniper Bot")
    public void CloseConfigTabandVerifyOrderinDealtOrderSniper() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.CloseConfigTab();
                NitroXBotsAction.CloseBotDetail();
                delay(1000);
                NitroXBotsAction.clickDealtOrdersTab();
                Assert.assertEquals(NitroXBotsAction.getDealtOrderPrice(), NitroXBotsAction.getPrice());
                NitroXBotsAction.stopAllBots();
                NitroXBotsAction.CloseBotDetail();


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
        /***
         *
         * Snipper Sell order
         */


    @When("Select Sell Order ,Side and Min,Max Price and MaxSlippageThreashold")
    public void selectSideMinPriceandMaxPriceforSellOrder() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {

                NitroXBotsAction.inputTotalAmount(dataMap);
                NitroXBotsAction.selectSide(dataMap);
                NitroXBotsAction.inputMinPriceforSniper(dataMap);
                NitroXBotsAction.inputMaxPriceforSniper(dataMap);
                NitroXBotsAction.inputMaxThreshold(dataMap);


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

    @And("Verify the Order in Dealt Order for Sniper Bot Sell Order")
    public void CloseConfigTabandVerifyOrderinDealtOrderSniperSell() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                NitroXBotsAction.CloseConfigTab();
                NitroXBotsAction.CloseBotDetail();
                delay(1000);
                NitroXBotsAction.clickDealtOrdersTab();
                Assert.assertEquals(NitroXBotsAction.getDealtOrderPrice(), NitroXBotsAction.getBidPrice());
                NitroXBotsAction.stopAllBots();
                NitroXBotsAction.CloseBotDetail();


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

}
