package step_definitions.Optimus;

import io.cucumber.java.en.And;
import modules.OptimusActions.OptimusCounterPartyCreateActions;
import modules.OptimusActions.OptimusLoginActions;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;

import java.util.HashMap;

public class OptimusCounterPartySteps {

    public static HashMap<String, String> dataMap;

    public OptimusCounterPartySteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }



    @And("Click the CounterParty link")
    public void clickTheCounterPartyLink()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {

            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }






}
