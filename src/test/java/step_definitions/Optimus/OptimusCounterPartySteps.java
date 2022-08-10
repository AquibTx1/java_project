package step_definitions.Optimus;

import io.cucumber.java.en.And;
import modules.OptimusActions.OptimusCounterPartyCreateActions;
import modules.OptimusActions.OptimusLoginActions;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

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

                OptimusCounterPartyCreateActions.navigateToCreateCounterPartyPage();

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


    @And("Enter Mandatory fields of New Counter Party")
    public void enterMandatoryFieldsOfNewCounterParty() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//Mandatory Fields Entry
                OptimusCounterPartyCreateActions.createCP_SalesForceId(dataMap.get("SalesForceID"));
                OptimusCounterPartyCreateActions.createCP_NicknameInternal(dataMap.get("NicknameInternal") + KeywordUtil.generateRandomNumber());
                OptimusCounterPartyCreateActions.createCP_TIN1(dataMap.get("TIN1"));
                OptimusCounterPartyCreateActions.createCP_ClientType(dataMap.get("ClientType"));
                OptimusCounterPartyCreateActions.createCP_EntityType(dataMap.get("EntityType"));
                OptimusCounterPartyCreateActions.createCP_RegisteredAddress(dataMap.get("RegisteredAddress"));
                OptimusCounterPartyCreateActions.createCP_AuthorizedPersonEmail(dataMap.get("AuthorizedPersonEmail"));

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

    @And("Click Create Counter Party Button")
    public void clickCreateCounterPartyButton() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//Click Create Counter Party Button
                OptimusCounterPartyCreateActions.clickCreateCounterPartyBtn();

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

    @And("Enter Optional Fields of New Counter Party")
    public void enterOptionalFieldsOfNewCounterParty() {
    }
}
