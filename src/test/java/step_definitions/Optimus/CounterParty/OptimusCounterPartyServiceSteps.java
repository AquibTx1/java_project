package step_definitions.Optimus.CounterParty;

import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.OptimusActions.OptimusCounterPartyCreateActions;
import modules.OptimusActions.OptimusRelatedCounterPartyActions;
import modules.OptimusActions.OptimusServiceCounterPartyActions;
import org.testng.Assert;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyListPage;
import step_definitions.BaseStepDefinitions;
import step_definitions.RunCukesTest;
import utilities.GlobalUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;

import java.util.HashMap;

public class OptimusCounterPartyServiceSteps {

    public static HashMap<String, String> dataMap;

    public static String sname;
    public static String sRef;
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


    @And("Enter field values for Service in Counter Party")
    public void enterFieldValuesForServiceInCounterParty() {
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

    @And("Open Existing Services from List page")
    public void openExistingServicesFromListPage() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyCreateActions.searchCounterParty(dataMap.get("ServiceName"));
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

    @And("Take the Service Reference from details page")
    public void takeTheServiceReferenceFromDetailsPage() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                sRef = OptimusServiceCounterPartyActions.service_GetServiceReferenceID();
                sname = OptimusServiceCounterPartyActions.getServiceNameFromDetailsPage();
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

    @And("Click on Edit Link in Search Results to Load Service details")
    public void clickOnEditLinkInSearchResultsToLoadServiceDetails() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusServiceCounterPartyActions.clickEditLinkinResult();
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

    @And("Approve the Services Task from Reference in Counter Party")
    public void approveTheServicesTaskFromReferenceInCounterParty() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//Approve All tasks
                OptimusCounterPartyCreateActions.searchTasks(sRef);
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

    @And("Search for Service in Result List")
    public void searchForServiceInResultList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyCreateActions.searchCounterParty(sRef);
                OptimusCounterPartyCreateActions.waitRelatedPartySearchResultLoad();
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

    @And("Search for existing Service in List")
    public void searchForExistingServiceInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyCreateActions.searchCounterParty(dataMap.get("ServiceName"));
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

    @And("Enter Date And Dropdown Fields For Edit Service in Counter Party")
    public void enterDateAndDropdownFieldsForEditServiceInCounterParty() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusServiceCounterPartyActions.service_CounterpartyID_Update(dataMap.get("Counterparty"));
                OptimusServiceCounterPartyActions.service_BusinessUnit_Update(dataMap.get("BusinessUnit"));
                OptimusServiceCounterPartyActions.service_ServiceType_Update(dataMap.get("ServiceType"));
                OptimusServiceCounterPartyActions.serviceCp_ServiceTier_Update(dataMap.get("ServiceTier"));
                OptimusServiceCounterPartyActions.serviceCp_FeeType_Update(dataMap.get("FeeType"));
                OptimusServiceCounterPartyActions.serviceCp_ChargeType_Update(dataMap.get("ChargeType"));
                OptimusServiceCounterPartyActions.serviceCp_ServiceEntity_Update(dataMap.get("ServiceEntity"));
                OptimusServiceCounterPartyActions.serviceCp_ServiceStatus_Update(dataMap.get("ServiceStatus"));
                OptimusServiceCounterPartyActions.serviceCp_ServiceStartDate_Update(dataMap.get("ServiceStartDate"));
                OptimusServiceCounterPartyActions.serviceCp_ServiceEndDate_Update(dataMap.get("ServiceEndDate"));
                OptimusServiceCounterPartyActions.serviceCp_ReferralPerson_Update(dataMap.get("ReferralPerson"));
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

    @Then("verify Updated and Approved Service shown in Search Result")
    public void verifyUpdatedAndApprovedServiceShownInSearchResult() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyCreateActions.waitRelatedPartySearchResultLoad();
                Assert.assertEquals(OptimusServiceCounterPartyActions.getServiceReferenceFromResultList(), sRef);
                Assert.assertEquals(OptimusServiceCounterPartyActions.getServiceNameFromResultList(), sname);
                Assert.assertEquals(OptimusServiceCounterPartyActions.getFeeRateFromResultList(), dataMap.get("FeeRate"));
                RunCukesTest.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringGreyColor("Values verified from Search result List"));
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
