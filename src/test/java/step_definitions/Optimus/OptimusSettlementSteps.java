package step_definitions.Optimus;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.OptimusActions.OptimusCounterPartyCreateActions;
import modules.OptimusActions.OptimusLoginActions;
import modules.OptimusActions.OptimusSettlementActions;
import org.testng.Assert;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyCreatePage;
import pageFactory.OptimusPages.Settlement.SettlementMainPage;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;
import static utilities.KeywordUtil.*;


import java.util.HashMap;


public class OptimusSettlementSteps {

    public static HashMap<String, String> dataMap;

    public OptimusSettlementSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }




    @And("Click the Settlement Tab")
    public void clickTheSettlementTab()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.settlement_MainTab);
                OptimusSettlementActions.clickSettlement();

                OptimusSettlementActions.clickSettlementLink();
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

    @And("Choose New Settlement")
    public void chooseNewSettlement() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.choosenewSettlement();
                waitForVisible(SettlementMainPage.newSettlement_CounterpartyID);

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

    @And("Enter the Settlement Ref detail")
    public void enterTheSettlementRefDetail() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.newSettlement_CounterParty(dataMap.get("Counterparty Name"));
                delay(5000);
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

    @And("Enter the Basic Information detail")
    public void enterTheBasicInformationDetail() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.newSettlement_ExternalNickName(dataMap.get("Settlement Nickname External"));

                OptimusSettlementActions.newSettlement_InternalNickName(dataMap.get("Settlement Nickname Internal"));

                OptimusSettlementActions.chooseSettlementType(dataMap.get("Settlement Type"));

                OptimusSettlementActions.chooseCurrency(dataMap.get("Currency"));

                OptimusSettlementActions.chooseTransferMethod(dataMap.get("Transfer Method"));
                OptimusSettlementActions.chooseNetwork(dataMap.get("Network"));
                //OptimusSettlementActions.chooseCustodian(dataMap.get("Custodian"));

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

    @And("Enter the Bank Information detail")
    public void enterTheBankInformationDetail() {
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

    @And("Enter Additional Information")
    public void enterAdditionalInformation() {
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

    @Then("Click Create Settlement and verify")
    public void clickCreateSettlementAndVerify() {
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
