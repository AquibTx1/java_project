package step_definitions.Optimus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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


    String nicknameInt;

    @And("Open CounterParty main tab")
    public void openCounterPartyMainTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyCreateActions.openCounterPartyMainTab();
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

    @And("Click the CounterParty link")
    public void clickTheCounterPartyLink() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyCreateActions.openCounterPartySubTab();
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

    @And("Open CounterParty Tasks sub tab")
    public void openCounterPartyTasksSubTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyCreateActions.openTasksTab();
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
                nicknameInt = dataMap.get("NicknameInternal") + KeywordUtil.generateRandomNumber200to500();
                OptimusCounterPartyCreateActions.createCP_SalesForceId(dataMap.get("SalesForceID"));
                OptimusCounterPartyCreateActions.createCP_NicknameInternal(nicknameInt);
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

    @And("Enter Optional Fields of New Counter Party")
    public void enterOptionalFieldsOfNewCounterParty() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//Optional Fields Entry
                OptimusCounterPartyCreateActions.waitfor2seconds();
                OptimusCounterPartyCreateActions.createCP_NitroClientID(dataMap.get("NitroClientID") + KeywordUtil.generateRandomNumber200to500());
                OptimusCounterPartyCreateActions.createCP_ElwoodID(dataMap.get("ElwoodID"));
                OptimusCounterPartyCreateActions.createCP_NicknameExternal(dataMap.get("NicknameExternal"));
                OptimusCounterPartyCreateActions.createCP_ParentAccount(dataMap.get("ParentAccount"));
//Basic Details
                OptimusCounterPartyCreateActions.createCP_FirstName(dataMap.get("FirstName"));
                OptimusCounterPartyCreateActions.createCP_LastName(dataMap.get("LastName"));
                OptimusCounterPartyCreateActions.createCP_IdentificationExpiryDate(dataMap.get("IdentificationExpiryDate"));
                OptimusCounterPartyCreateActions.createCP_Gender(dataMap.get("Gender"));
                OptimusCounterPartyCreateActions.createCP_Nationality(dataMap.get("Nationality"));
                OptimusCounterPartyCreateActions.createCP_DateOfBirth(dataMap.get("DateofBirth"));
                OptimusCounterPartyCreateActions.createCP_Occupation(dataMap.get("Occupation"));
                OptimusCounterPartyCreateActions.createCP_CompanyOfEmployment(dataMap.get("CompanyofEmployment"));
                OptimusCounterPartyCreateActions.createCP_IndustryOfEmployment(dataMap.get("IndustryofEmployment"));
                OptimusCounterPartyCreateActions.createCP_IdentificationIssueDate(dataMap.get("IdentificationIssueDate"));
                //Changed sequence of Identification Expiry date
                OptimusCounterPartyCreateActions.createCP_MobileNumber(dataMap.get("MobileNumber"));
                OptimusCounterPartyCreateActions.createCP_PEPDeclarationToggle();
                OptimusCounterPartyCreateActions.createCP_PEPDeclarationRemarks(dataMap.get("PEPDeclarationRemarks"));
                OptimusCounterPartyCreateActions.createCP_Alias(dataMap.get("Alias"));
                OptimusCounterPartyCreateActions.createCP_TIN2(dataMap.get("TIN2"));
                OptimusCounterPartyCreateActions.createCP_TIN3(dataMap.get("TIN3"));
// Company and Other Information - Optional fields
                OptimusCounterPartyCreateActions.createCP_CompanyName(dataMap.get("CompanyName"));
                OptimusCounterPartyCreateActions.createCP_FormerRegisteredName(dataMap.get("FormerRegisteredName"));
                OptimusCounterPartyCreateActions.waitfor2seconds();
                OptimusCounterPartyCreateActions.createCP_IdentificationNumber(dataMap.get("IdentificationNumber"));
                OptimusCounterPartyCreateActions.createCP_IdentificationType(dataMap.get("IdentificationType"));
                OptimusCounterPartyCreateActions.createCP_CountryOfIncorporation(dataMap.get("CountryofIncorporation"));
                OptimusCounterPartyCreateActions.createCP_StateOfIncorporation(dataMap.get("StateofIncorporation"));
////                OptimusCounterPartyCreateActions.createCP_OperatingAddress(dataMap.get("OperatingAddress"));
////                OptimusCounterPartyCreateActions.createCP_CountryOfOperation(dataMap.get("CountryofOperation"));
////                OptimusCounterPartyCreateActions.createCP_OnboardingMode(dataMap.get("OnboardingMode"));
////                OptimusCounterPartyCreateActions.createCP_PrimaryBusinessActivity(dataMap.get("PrimaryBusinessActivity"));
                OptimusCounterPartyCreateActions.createCP_PrimaryBusinessActivityRemarks(dataMap.get("PrimaryBusinessActivityRemarks"));
                OptimusCounterPartyCreateActions.createCP_CorporateWebsite(dataMap.get("CorporateWebsite"));
                OptimusCounterPartyCreateActions.createCP_GSTRegisteredToggle();
                OptimusCounterPartyCreateActions.createCP_FinancialInstitutionToggle();
                OptimusCounterPartyCreateActions.createCP_PaymentServiceProviderToggle();
                OptimusCounterPartyCreateActions.createCP_SourceOfFunds(dataMap.get("SourceofFunds"));
                OptimusCounterPartyCreateActions.createCP_SourceOfFundsRemarks(dataMap.get("SourceofFundsRemarks"));
                OptimusCounterPartyCreateActions.createCP_AuthorizedPerson(dataMap.get("AuthorizedPerson"));
                OptimusCounterPartyCreateActions.createCP_AuthorizedPersonMobile(dataMap.get("AuthorizedPersonMobile"));
                OptimusCounterPartyCreateActions.createCP_BusinessPurposeForRelationship(dataMap.get("BusinessPurposeforRelationship"));
                OptimusCounterPartyCreateActions.createCP_AppointmentOthers(dataMap.get("AppointmentOthers"));
//Additional Information - Optional Fields
                OptimusCounterPartyCreateActions.createCP_GroupAssociation(dataMap.get("GroupAssociation"));
                OptimusCounterPartyCreateActions.createCP_OnboardedDate(dataMap.get("OnboardedDate"));
                OptimusCounterPartyCreateActions.createCP_ClientTier(dataMap.get("ClientTier"));
                OptimusCounterPartyCreateActions.createCP_KYCRefreshDate(dataMap.get("KYCRefreshDate"));
                OptimusCounterPartyCreateActions.waitfor2seconds();
                OptimusCounterPartyCreateActions.createCP_ClientTierRemarks(dataMap.get("ClientTierRemarks"));
                OptimusCounterPartyCreateActions.createCP_RiskScore(dataMap.get("RiskScore"));
                OptimusCounterPartyCreateActions.waitfor2seconds();
                OptimusCounterPartyCreateActions.createCP_RiskScoreRemarks(dataMap.get("RiskScoreRemarks"));
                OptimusCounterPartyCreateActions.createCP_ExecutionFeeRate(dataMap.get("ExecutionFeeRate"));
                OptimusCounterPartyCreateActions.createCP_ReferralPersonInternal(dataMap.get("ReferralPersonInternal"));
                OptimusCounterPartyCreateActions.waitfor2seconds();
                OptimusCounterPartyCreateActions.createCP_ReferralPersonExternal(dataMap.get("ReferralPersonExternal"));
                OptimusCounterPartyCreateActions.createCP_ReferralExternalRebate(dataMap.get("ReferralExternalRebate"));
                OptimusCounterPartyCreateActions.createCP_FaceToFaceVerificationStatus(dataMap.get("FacetoFaceVerificationStatus"));
                OptimusCounterPartyCreateActions.createCP_FaceToFaceVerificationRemarks(dataMap.get("FacetoFaceVerificationRemarks"));
                OptimusCounterPartyCreateActions.waitfor2seconds();
                OptimusCounterPartyCreateActions.createCP_VouchedStatus(dataMap.get("VouchedStatus"));
                OptimusCounterPartyCreateActions.createCP_VouchedByPerson(dataMap.get("VouchedbyPerson"));
                OptimusCounterPartyCreateActions.createCP_VouchedRemarks(dataMap.get("VouchedRemarks"));
                OptimusCounterPartyCreateActions.waitfor2seconds();
                OptimusCounterPartyCreateActions.createCP_ManagementRemarks(dataMap.get("ManagementRemarks"));
                OptimusCounterPartyCreateActions.createCP_CounterpartyStatus(dataMap.get("CounterpartyStatus"));
                OptimusCounterPartyCreateActions.createCP_CounterpartyRemarks(dataMap.get("CounterpartyRemarks"));


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
//Click Create CounterParty Button
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


    @And("Verify Counter Party Success Message")
    public void verifyCounterPartySuccessMessage() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//Verify Success Message of create counter party
                OptimusCounterPartyCreateActions.waitForSuccessMessage();
                Assert.assertEquals(OptimusCounterPartyCreateActions.getSuccessMessageText(), "Success!", "Expected and Actual matching");
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

    @And("Approve the CounterParty Task")
    public void approveTheCounterPartyTask() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//Approve All tasks
                OptimusCounterPartyCreateActions.searchTasks(nicknameInt);
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

    @Then("verify CounterParty is updated")
    public void verifyCounterPartyIsUpdated() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//Approve All tasks

                OptimusCounterPartyCreateActions.searchCounterParty(nicknameInt);
                OptimusCounterPartyCreateActions.checkCounterPart_FirstResultListLoad();
                Assert.assertEquals(OptimusCounterPartyCreateActions.getNickNameFromList(), nicknameInt);
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

    @And("Open CounterParty List tab")
    public void openCounterPartyListTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//Approve All tasks
                OptimusCounterPartyCreateActions.openListTab();
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
