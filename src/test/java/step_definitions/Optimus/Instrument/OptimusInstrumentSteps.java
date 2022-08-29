package step_definitions.Optimus.Instrument;

import io.cucumber.java.en.And;
import modules.OptimusActions.OptimusInstrumentActions;
import modules.OptimusActions.OptimusSettlementActions;
import org.testng.Assert;
import pageFactory.OptimusPages.Instrument.InstrumentMainPage;
import pageFactory.OptimusPages.Portfolio.PortfolioMainPage;
import pageFactory.OptimusPages.Settlement.SettlementMainPage;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;

import java.util.HashMap;

import static utilities.KeywordUtil.waitForVisible;

public class OptimusInstrumentSteps {

    public static HashMap<String, String> dataMap;

    public OptimusInstrumentSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }

    @And("Open the Instrument Tab")
    public void openTheInstrumentTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(InstrumentMainPage.Instrument_MainTab);
                OptimusInstrumentActions.clickInstrumentTab();

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

    @And("Click the Tokens link")
    public void clickTheTokensLink() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(InstrumentMainPage.Instrument_token);
                OptimusInstrumentActions.clickTokenLink();
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
    @And("Enter All the field detail")
    public void enterAllTheFieldDetail() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(InstrumentMainPage.Instrument_assetName);
                OptimusInstrumentActions.createAssetName(dataMap.get("Asset Name"));
                OptimusInstrumentActions.createAssetCode(dataMap.get("Asset Code"));
                OptimusInstrumentActions.createAssetType(dataMap.get("Asset Type"));
                OptimusInstrumentActions.createAssetSubType(dataMap.get("Asset Sub-Type"));
                OptimusInstrumentActions.createDecimalConvention(dataMap.get("Decimal Convention"));
                OptimusInstrumentActions.createGST(dataMap.get("GST"));
                OptimusInstrumentActions.createBlockchainNetwork(dataMap.get("Blockchain Network"));
                OptimusInstrumentActions.createYOR(dataMap.get("Year of Release"));
                OptimusInstrumentActions.createCountrty(dataMap.get("Country"));
                OptimusInstrumentActions.createStatus(dataMap.get("Status"));
                OptimusInstrumentActions.createNotes(dataMap.get("Notes"));
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
    @And("Click Create Instrument")
    public void clickCreateInstrument() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.clickCreateInstrument();
                OptimusSettlementActions.waitForSuccessMsgToAppear();
                OptimusSettlementActions.waitForSuccessMsgToDisappear();
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
    @And("Open New Token")
    public void openNewToken() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(InstrumentMainPage.Instrument_Newtoken);
                OptimusInstrumentActions.clickNewToken();

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

    @And("Navigate to Instrument Task")
    public void navigateToInstrumentTask() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.newSettlement_inputsearchtext);
                OptimusSettlementActions.inputValue(dataMap.get("Asset Name"));

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

    @And("Input the Asset")
    public void inputTheAsset() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.selectSettlementCheckbox();
                waitForVisible(SettlementMainPage.newSettlement_selectAll);
                OptimusSettlementActions.selectAllSettlementbtn();


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
    @And("Approve the Asset created")
    public void approveTheAssetCreated() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.selectApprovebtn();
                OptimusSettlementActions.waitForSuccessMsgToAppear();
                OptimusSettlementActions.waitForSuccessMsgToDisappear();
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

    @And("Verify the Token Created")
    public void verifyTheTokenCreated() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusInstrumentActions.clickTokenLink();
                waitForVisible(SettlementMainPage.newSettlement_edit);
                OptimusSettlementActions.sortSettlementRef();
                OptimusSettlementActions.inputValue(dataMap.get("Asset Name"));
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
