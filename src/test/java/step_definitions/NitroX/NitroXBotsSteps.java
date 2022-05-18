package step_definitions.NitroX;

import NitroXPages.NitroXBotsPage;
import NitroXPages.NitroXHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.NitroXActions.NitroXBotsAction;
import modules.NitroXActions.NitroXHome;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

import java.util.HashMap;

import static modules.NitroXActions.NitroXBotsAction.totalfiltered;
import static utilities.KeywordUtil.*;

public class NitroXBotsSteps {


    public static  int totalbotbefore,finalbotvalue;
    public static HashMap<String, String> dataMap = BaseStepDefinitions.dataMap;

    @And("Verify Bots Before Buying or Selling")
    public void verifyCountNumberOfBotsBeforeBuyingSelling() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                totalbotbefore=NitroXBotsAction.getTotalFilteredBots();
                System.out.println("Total Bots Befoe Buying"+totalbotbefore);
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
                NitroXBotsAction.inputOrderDirection(dataMap);
                NitroXBotsAction.inputMinTime(dataMap);
                NitroXBotsAction.inputMaxTime(dataMap);
                NitroXBotsAction.inputMinPrice(dataMap);
                NitroXBotsAction.inputMaxPrice(dataMap);
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
                System.out.println("Total Bots now "+totalfiltered);
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
