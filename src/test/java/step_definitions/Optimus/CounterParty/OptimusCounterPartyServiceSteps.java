package step_definitions.Optimus.CounterParty;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.OptimusActions.OptimusCounterPartyCreateActions;
import modules.OptimusActions.OptimusRelatedCounterPartyActions;
import modules.OptimusActions.OptimusServiceCounterPartyActions;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

import java.util.HashMap;

public class OptimusCounterPartyServiceSteps {

    public static HashMap<String, String> dataMap;

    public static String sname;

    public OptimusCounterPartyServiceSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }

    @And("Open Services side tab in Counterparty")
    public void openServicesSideTabInCounterparty() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusServiceCounterPartyActions.clickMainServiceTab();
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

    @And("Open Create New Services counterparty page")
    public void openCreateNewServicesCounterpartyPage() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusServiceCounterPartyActions.clickServicesCreateTab();
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


    @And("Enter field values for new Service in Counter Party")
    public void enterFieldValuesForNewServiceInCounterParty() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                sname = dataMap.get("ServiceName") + KeywordUtil.generateRandomNumber200to500();
                OptimusServiceCounterPartyActions.service_ServiceName(sname);
                OptimusServiceCounterPartyActions.serviceCp_FeeRate(dataMap.get("FeeRate"));
                OptimusServiceCounterPartyActions.serviceCp_ChargeRate(dataMap.get("ChargeRate"));
                OptimusServiceCounterPartyActions.serviceCp_ServiceSignerName(dataMap.get("ServiceSignerName"));
                OptimusServiceCounterPartyActions.serviceCp_ServiceContactPerson(dataMap.get("ServiceContactPerson"));
                OptimusServiceCounterPartyActions.serviceCp_ServiceContactPersonEmail(dataMap.get("ServiceContactPersonEmail"));
                OptimusServiceCounterPartyActions.serviceCp_ServiceContactPersonMobile(dataMap.get("ServiceContactPersonMobile"));
                OptimusServiceCounterPartyActions.serviceCp_ExpectedTradingVolume(dataMap.get("ExpectedTradingVolume"));
                OptimusServiceCounterPartyActions.serviceCp_MiningServiceTransferFee(dataMap.get("MiningServiceTransferFee"));
                OptimusServiceCounterPartyActions.serviceCp_MiningServiceHashrate(dataMap.get("MiningServiceHashrate"));
                OptimusServiceCounterPartyActions.serviceCp_MiningServicePower(dataMap.get("MiningServicePower"));
                OptimusServiceCounterPartyActions.serviceCp_MiningServicePowerCharge(dataMap.get("MiningServicePowerCharge"));
                OptimusServiceCounterPartyActions.serviceCp_ServiceRemarks(dataMap.get("ServiceRemarks"));
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

    @And("Enter Date And Dropdown Fields For New Service in Counter Party")
    public void enterDateAndDropdownFieldsForNewServiceInCounterParty() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusServiceCounterPartyActions.service_CounterpartyID(dataMap.get("Counterparty"));
                OptimusServiceCounterPartyActions.service_BusinessUnit(dataMap.get("BusinessUnit"));
                OptimusServiceCounterPartyActions.service_ServiceType(dataMap.get("ServiceType"));
                OptimusServiceCounterPartyActions.serviceCp_ServiceTier(dataMap.get("ServiceTier"));
                OptimusServiceCounterPartyActions.serviceCp_FeeType(dataMap.get("FeeType"));
                OptimusServiceCounterPartyActions.serviceCp_ChargeType(dataMap.get("ChargeType"));
                OptimusServiceCounterPartyActions.serviceCp_ServiceEntity(dataMap.get("ServiceEntity"));
                OptimusServiceCounterPartyActions.serviceCp_ServiceStatus(dataMap.get("ServiceStatus"));
                OptimusServiceCounterPartyActions.serviceCp_ServiceStartDate(dataMap.get("ServiceStartDate"));
                OptimusServiceCounterPartyActions.serviceCp_ServiceEndDate(dataMap.get("ServiceEndDate"));
                OptimusServiceCounterPartyActions.serviceCp_ReferralPerson(dataMap.get("ReferralPerson"));
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

    @And("Approve the Services Task in Counter Party")
    public void approveTheServicesTaskInCounterParty() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//Approve All tasks
                OptimusCounterPartyCreateActions.searchTasks(sname);
                OptimusCounterPartyCreateActions.selectFirstTask();
                OptimusCounterPartyCreateActions.selectAllTasks();
                OptimusCounterPartyCreateActions.approveAllSelectedTasks();

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

    @And("Open Services CP List tab")
    public void openServicesCPListTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusServiceCounterPartyActions.clickServicesListTab();
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

    @And("Search for New Service in Result List")
    public void searchForNewServiceInResultList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyCreateActions.searchCounterParty(sname);
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

    @And("Click Create button to Create New Service CounterParty")
    public void clickCreateButtonToCreateNewServiceCounterParty() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusServiceCounterPartyActions.clickCreateBtn();
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

    @Then("verify Services exists in List")
    public void verifyServicesExistsInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyCreateActions.waitRelatedPartySearchResultLoad();
                Assert.assertEquals(OptimusServiceCounterPartyActions.getServiceNameFromResultList(), sname);
                Assert.assertEquals(OptimusServiceCounterPartyActions.getFeeRateFromResultList(), dataMap.get("FeeRate"));
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
