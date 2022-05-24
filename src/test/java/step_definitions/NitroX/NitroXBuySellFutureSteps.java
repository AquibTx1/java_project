package step_definitions.NitroX;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import modules.NitroXActions.NitroXBuySellFutureAction;
import modules.NitroXActions.NitroXHome;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;

import java.util.HashMap;

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
    @And("Create A buy Order less than Market Price for Future Mode")
    public void createABuyOrderLessThanMarketPriceFutureMode() {
        //check if this step needs to be skipped
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {

                System.out.println("Hello");
//                NitroXHome.ClearInputPrice();
//                NitroXHome.InputOpenOrderBidPrice();
//                NitroXHome.ClearOrderQuantity();
//                NitroXHome.InputCustomQuantity(dataMap);

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
           // NitroXBuySellFutureAction.ClickBuyButton();
        }
        //increase the step counter by 1
        if (BaseStepDefinitions.getSITflag()) {
            BaseStepDefinitions.increaseCounter();
        }
    }

}
