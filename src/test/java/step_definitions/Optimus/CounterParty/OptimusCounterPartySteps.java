package step_definitions.Optimus.CounterParty;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.OptimusActions.OptimusCounterPartyCreateActions;
import modules.OptimusActions.OptimusCounterPartyUpdateActions;
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


    static String nicknameInt;
    static String cpRef;

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

    @And("Click Create CounterParty link")
    public void clickCreateCounterPartyLink() {
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

    @And("Take the CP Reference")
    public void takeTheCPReference() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                cpRef = OptimusCounterPartyUpdateActions.getCPRef();
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
                OptimusCounterPartyCreateActions.waitfor3seconds();
                OptimusCounterPartyCreateActions.createCP_NitroClientID(dataMap.get("NitroClientID") + KeywordUtil.generateRandomNumber200to500());
                OptimusCounterPartyCreateActions.createCP_ElwoodID(dataMap.get("ElwoodID"));
                OptimusCounterPartyCreateActions.createCP_NicknameExternal(dataMap.get("NicknameExternal"));
                OptimusCounterPartyCreateActions.createCP_ParentAccount(dataMap.get("ParentAccount"));
//Basic Details
                OptimusCounterPartyCreateActions.createCP_FirstName(dataMap.get("FirstName"));
                OptimusCounterPartyCreateActions.waitfor3seconds();
                OptimusCounterPartyCreateActions.createCP_LastName(dataMap.get("LastName"));
                OptimusCounterPartyCreateActions.createCP_IdentificationExpiryDate(dataMap.get("IdentificationExpiryDate"));
                OptimusCounterPartyCreateActions.waitfor5seconds();
                OptimusCounterPartyCreateActions.createCP_Gender(dataMap.get("Gender"));
                OptimusCounterPartyCreateActions.createCP_Nationality(dataMap.get("Nationality"));
                OptimusCounterPartyCreateActions.waitfor5seconds();
                OptimusCounterPartyCreateActions.createCP_DateOfBirth(dataMap.get("DateofBirth"));
                OptimusCounterPartyCreateActions.createCP_Occupation(dataMap.get("Occupation"));
                OptimusCounterPartyCreateActions.waitfor5seconds();
                OptimusCounterPartyCreateActions.createCP_CompanyOfEmployment(dataMap.get("CompanyofEmployment"));
                OptimusCounterPartyCreateActions.createCP_IndustryOfEmployment(dataMap.get("IndustryofEmployment"));
                OptimusCounterPartyCreateActions.createCP_IdentificationIssueDate(dataMap.get("IdentificationIssueDate"));
                //Changed sequence of Identification Expiry date
                OptimusCounterPartyCreateActions.waitfor3seconds();
                OptimusCounterPartyCreateActions.createCP_MobileNumber(dataMap.get("MobileNumber"));
                OptimusCounterPartyCreateActions.createCP_PEPDeclarationToggle();
                OptimusCounterPartyCreateActions.createCP_PEPDeclarationRemarks(dataMap.get("PEPDeclarationRemarks"));
                OptimusCounterPartyCreateActions.createCP_Alias(dataMap.get("Alias"));
                OptimusCounterPartyCreateActions.waitfor3seconds();
                OptimusCounterPartyCreateActions.createCP_TIN2(dataMap.get("TIN2"));
                OptimusCounterPartyCreateActions.createCP_TIN3(dataMap.get("TIN3"));
// Company and Other Information - Optional fields
                OptimusCounterPartyCreateActions.createCP_CompanyName(dataMap.get("CompanyName"));
                OptimusCounterPartyCreateActions.createCP_FormerRegisteredName(dataMap.get("FormerRegisteredName"));
                OptimusCounterPartyCreateActions.waitfor3seconds();
                OptimusCounterPartyCreateActions.createCP_IdentificationNumber(dataMap.get("IdentificationNumber"));
                OptimusCounterPartyCreateActions.createCP_IdentificationType(dataMap.get("IdentificationType"));
                OptimusCounterPartyCreateActions.createCP_CountryOfIncorporation(dataMap.get("CountryofIncorporation"));
                OptimusCounterPartyCreateActions.createCP_StateOfIncorporation(dataMap.get("StateofIncorporation"));
////                OptimusCounterPartyCreateActions.createCP_OperatingAddress(dataMap.get("OperatingAddress"));
////                OptimusCounterPartyCreateActions.createCP_CountryOfOperation(dataMap.get("CountryofOperation"));
////                OptimusCounterPartyCreateActions.createCP_OnboardingMode(dataMap.get("OnboardingMode"));
////                OptimusCounterPartyCreateActions.createCP_PrimaryBusinessActivity(dataMap.get("PrimaryBusinessActivity"));
                OptimusCounterPartyCreateActions.waitfor5seconds();
                OptimusCounterPartyCreateActions.createCP_PrimaryBusinessActivityRemarks(dataMap.get("PrimaryBusinessActivityRemarks"));
                OptimusCounterPartyCreateActions.createCP_CorporateWebsite(dataMap.get("CorporateWebsite"));
                OptimusCounterPartyCreateActions.createCP_GSTRegisteredToggle();
                OptimusCounterPartyCreateActions.createCP_FinancialInstitutionToggle();
                OptimusCounterPartyCreateActions.createCP_PaymentServiceProviderToggle();
                OptimusCounterPartyCreateActions.waitfor3seconds();
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
                OptimusCounterPartyCreateActions.waitfor3seconds();
                OptimusCounterPartyCreateActions.createCP_ClientTierRemarks(dataMap.get("ClientTierRemarks"));
                OptimusCounterPartyCreateActions.createCP_RiskScore(dataMap.get("RiskScore"));
                OptimusCounterPartyCreateActions.waitfor3seconds();
                OptimusCounterPartyCreateActions.createCP_RiskScoreRemarks(dataMap.get("RiskScoreRemarks"));
                OptimusCounterPartyCreateActions.createCP_ExecutionFeeRate(dataMap.get("ExecutionFeeRate"));
                OptimusCounterPartyCreateActions.createCP_ReferralPersonInternal(dataMap.get("ReferralPersonInternal"));
                OptimusCounterPartyCreateActions.waitfor3seconds();
                OptimusCounterPartyCreateActions.createCP_ReferralPersonExternal(dataMap.get("ReferralPersonExternal"));
                OptimusCounterPartyCreateActions.createCP_ReferralExternalRebate(dataMap.get("ReferralExternalRebate"));
                OptimusCounterPartyCreateActions.createCP_FaceToFaceVerificationStatus(dataMap.get("FacetoFaceVerificationStatus"));
                OptimusCounterPartyCreateActions.createCP_FaceToFaceVerificationRemarks(dataMap.get("FacetoFaceVerificationRemarks"));
                OptimusCounterPartyCreateActions.waitfor3seconds();
                OptimusCounterPartyCreateActions.createCP_VouchedStatus(dataMap.get("VouchedStatus"));
                OptimusCounterPartyCreateActions.createCP_VouchedByPerson(dataMap.get("VouchedbyPerson"));
                OptimusCounterPartyCreateActions.createCP_VouchedRemarks(dataMap.get("VouchedRemarks"));
                OptimusCounterPartyCreateActions.waitfor3seconds();
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

    @And("Open CounterParties side tab")
    public void openCounterPartiesSideTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyCreateActions.openCounterPartySubTab();
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

    @And("Search for CounterParty Results in List")
    public void searchForCounterPartyResultsinList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyCreateActions.searchCounterParty(nicknameInt);
                OptimusCounterPartyCreateActions.checkCounterPart_FirstResultListLoad();
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

    @And("Click on Edit Link in Search Results to Load CounterParty Details")
    public void clickOnEditLinkInSearchResultsToLoadCounterPartyDetails() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyUpdateActions.clickEditLinkinSearchResult();
                OptimusCounterPartyUpdateActions.waitForCounterPartyUpdatePageLoad();
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

    @And("Update Mandatory fields values of existing Counter Party")
    public void updateMandatoryFieldsValuesOfExistingCounterParty() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//Mandatory Fields Entry
                nicknameInt = dataMap.get("NicknameInternal") + KeywordUtil.generateRandomNumber200to500();
                OptimusCounterPartyUpdateActions.updateCP_SalesForceId(dataMap.get("SalesForceID"));
                OptimusCounterPartyUpdateActions.updateCP_NicknameInternal(nicknameInt);
//                nicknameInt = OptimusCounterPartyUpdateActions.getUpdatedCP_NicknameInternal();
                OptimusCounterPartyUpdateActions.updateCP_TIN1(dataMap.get("TIN1"));
                OptimusCounterPartyUpdateActions.updateCP_ClientType(dataMap.get("ClientType"));
                OptimusCounterPartyUpdateActions.updateCP_EntityType(dataMap.get("EntityType"));
                OptimusCounterPartyUpdateActions.updateCP_RegisteredAddress(dataMap.get("RegisteredAddress"));
                OptimusCounterPartyUpdateActions.updateCP_AuthorizedPersonEmail(dataMap.get("AuthorizedPersonEmail"));

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

    @And("Approve the CounterParty Update Task")
    public void approveTheCounterPartyUpdateTask() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//Approve All tasks
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

    @And("Update Optional Fields values of existing Counter Party")
    public void updateOptionalFieldsValuesOfExistingCounterParty() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//Optional Fields Entry
                OptimusCounterPartyUpdateActions.waitfor2seconds();
                OptimusCounterPartyUpdateActions.updateCP_NitroClientID(dataMap.get("NitroClientID") + KeywordUtil.generateRandomNumber200to500());
                OptimusCounterPartyUpdateActions.updateCP_ElwoodID(dataMap.get("ElwoodID"));
                OptimusCounterPartyUpdateActions.updateCP_NicknameExternal(dataMap.get("NicknameExternal"));
                OptimusCounterPartyUpdateActions.updateCP_ParentAccount(dataMap.get("ParentAccount"));
//Basic Details
                OptimusCounterPartyUpdateActions.updateCP_FirstName(dataMap.get("FirstName"));
                OptimusCounterPartyUpdateActions.updateCP_LastName(dataMap.get("LastName"));
                OptimusCounterPartyCreateActions.waitfor3seconds();
                OptimusCounterPartyUpdateActions.updateCP_IdentificationExpiryDate(dataMap.get("IdentificationExpiryDate"));
                OptimusCounterPartyUpdateActions.updateCP_Gender(dataMap.get("Gender"));
                OptimusCounterPartyUpdateActions.updateCP_Nationality(dataMap.get("Nationality"));
                OptimusCounterPartyCreateActions.waitfor3seconds();
                OptimusCounterPartyUpdateActions.updateCP_DateOfBirth(dataMap.get("DateofBirth"));
                OptimusCounterPartyUpdateActions.updateCP_Occupation(dataMap.get("Occupation"));
                OptimusCounterPartyUpdateActions.updateCP_CompanyOfEmployment(dataMap.get("CompanyofEmployment"));
                OptimusCounterPartyCreateActions.waitfor3seconds();
                OptimusCounterPartyUpdateActions.updateCP_IndustryOfEmployment(dataMap.get("IndustryofEmployment"));
                OptimusCounterPartyUpdateActions.updateCP_IdentificationIssueDate(dataMap.get("IdentificationIssueDate"));
                //Changed sequence of Identification Expiry date
                OptimusCounterPartyUpdateActions.updateCP_MobileNumber(dataMap.get("MobileNumber"));
                OptimusCounterPartyUpdateActions.updateCP_PEPDeclarationToggle();
                OptimusCounterPartyUpdateActions.updateCP_PEPDeclarationRemarks(dataMap.get("PEPDeclarationRemarks"));
                OptimusCounterPartyUpdateActions.updateCP_Alias(dataMap.get("Alias"));
                OptimusCounterPartyUpdateActions.updateCP_TIN2(dataMap.get("TIN2"));
                OptimusCounterPartyUpdateActions.updateCP_TIN3(dataMap.get("TIN3"));
// Company and Other Information - Optional fields
                OptimusCounterPartyUpdateActions.updateCP_CompanyName(dataMap.get("CompanyName"));
                OptimusCounterPartyUpdateActions.updateCP_FormerRegisteredName(dataMap.get("FormerRegisteredName"));
                OptimusCounterPartyUpdateActions.waitfor2seconds();
                OptimusCounterPartyUpdateActions.updateCP_IdentificationNumber(dataMap.get("IdentificationNumber"));
                OptimusCounterPartyUpdateActions.updateCP_IdentificationType(dataMap.get("IdentificationType"));
                OptimusCounterPartyUpdateActions.updateCP_CountryOfIncorporation(dataMap.get("CountryofIncorporation"));
                OptimusCounterPartyUpdateActions.updateCP_StateOfIncorporation(dataMap.get("StateofIncorporation"));
////                OptimusCounterPartyUpdateActions.updateCP_OperatingAddress(dataMap.get("OperatingAddress"));
////                OptimusCounterPartyUpdateActions.updateCP_CountryOfOperation(dataMap.get("CountryofOperation"));
////                OptimusCounterPartyUpdateActions.updateCP_OnboardingMode(dataMap.get("OnboardingMode"));
////                OptimusCounterPartyUpdateActions.updateCP_PrimaryBusinessActivity(dataMap.get("PrimaryBusinessActivity"));
                OptimusCounterPartyUpdateActions.updateCP_PrimaryBusinessActivityRemarks(dataMap.get("PrimaryBusinessActivityRemarks"));
                OptimusCounterPartyUpdateActions.updateCP_CorporateWebsite(dataMap.get("CorporateWebsite"));
                OptimusCounterPartyUpdateActions.updateCP_GSTRegisteredToggle();
                OptimusCounterPartyUpdateActions.updateCP_FinancialInstitutionToggle();
                OptimusCounterPartyUpdateActions.updateCP_PaymentServiceProviderToggle();
                OptimusCounterPartyUpdateActions.updateCP_SourceOfFunds(dataMap.get("SourceofFunds"));
                OptimusCounterPartyUpdateActions.updateCP_SourceOfFundsRemarks(dataMap.get("SourceofFundsRemarks"));
                OptimusCounterPartyUpdateActions.updateCP_AuthorizedPerson(dataMap.get("AuthorizedPerson"));
                OptimusCounterPartyUpdateActions.updateCP_AuthorizedPersonMobile(dataMap.get("AuthorizedPersonMobile"));
                OptimusCounterPartyUpdateActions.updateCP_BusinessPurposeForRelationship(dataMap.get("BusinessPurposeforRelationship"));
                OptimusCounterPartyUpdateActions.updateCP_AppointmentOthers(dataMap.get("AppointmentOthers"));
//Additional Information - Optional Fields
                OptimusCounterPartyUpdateActions.updateCP_GroupAssociation(dataMap.get("GroupAssociation"));
                OptimusCounterPartyUpdateActions.updateCP_OnboardedDate(dataMap.get("OnboardedDate"));
                OptimusCounterPartyUpdateActions.updateCP_ClientTier(dataMap.get("ClientTier"));
                OptimusCounterPartyUpdateActions.updateCP_KYCRefreshDate(dataMap.get("KYCRefreshDate"));
                OptimusCounterPartyUpdateActions.waitfor2seconds();
                OptimusCounterPartyUpdateActions.updateCP_ClientTierRemarks(dataMap.get("ClientTierRemarks"));
                OptimusCounterPartyUpdateActions.updateCP_RiskScore(dataMap.get("RiskScore"));
                OptimusCounterPartyUpdateActions.waitfor2seconds();
                OptimusCounterPartyUpdateActions.updateCP_RiskScoreRemarks(dataMap.get("RiskScoreRemarks"));
                OptimusCounterPartyUpdateActions.updateCP_ExecutionFeeRate(dataMap.get("ExecutionFeeRate"));
                OptimusCounterPartyUpdateActions.updateCP_ReferralPersonInternal(dataMap.get("ReferralPersonInternal"));
                OptimusCounterPartyUpdateActions.waitfor2seconds();
                OptimusCounterPartyUpdateActions.updateCP_ReferralPersonExternal(dataMap.get("ReferralPersonExternal"));
                OptimusCounterPartyUpdateActions.updateCP_ReferralExternalRebate(dataMap.get("ReferralExternalRebate"));
                OptimusCounterPartyUpdateActions.updateCP_FaceToFaceVerificationStatus(dataMap.get("FacetoFaceVerificationStatus"));
                OptimusCounterPartyUpdateActions.updateCP_FaceToFaceVerificationRemarks(dataMap.get("FacetoFaceVerificationRemarks"));
                OptimusCounterPartyUpdateActions.waitfor2seconds();
                OptimusCounterPartyUpdateActions.updateCP_VouchedStatus(dataMap.get("VouchedStatus"));
                OptimusCounterPartyUpdateActions.updateCP_VouchedByPerson(dataMap.get("VouchedbyPerson"));
                OptimusCounterPartyUpdateActions.updateCP_VouchedRemarks(dataMap.get("VouchedRemarks"));
                OptimusCounterPartyUpdateActions.waitfor2seconds();
                OptimusCounterPartyUpdateActions.updateCP_ManagementRemarks(dataMap.get("ManagementRemarks"));
                OptimusCounterPartyUpdateActions.updateCP_CounterpartyStatus(dataMap.get("CounterpartyStatus"));
                OptimusCounterPartyUpdateActions.updateCP_CounterpartyRemarks(dataMap.get("CounterpartyRemarks"));


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

    @And("Click Update Counter Party Button")
    public void clickUpdateCounterPartyButton() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyUpdateActions.clickUpdateCounterPartyBtn();
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

    @And("Search for CounterParty Results in List by Ref")
    public void searchForCounterPartyResultsInListByRef() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyCreateActions.searchCounterParty(cpRef);
                OptimusCounterPartyCreateActions.checkCounterPart_FirstResultListLoad();
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

    @And("Search for Existing CounterParty Results in List")
    public void searchForExistingCounterPartyResultsInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyCreateActions.searchCounterParty(dataMap.get("SalesForceID"));
                OptimusCounterPartyCreateActions.checkCounterPart_FirstResultListLoad();
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

    @And("Click Delete Counter Party Button and Confirm")
    public void clickDeleteCounterPartyButtonAndConfirm() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusCounterPartyUpdateActions.deleteCP();
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

    @And("Search for CounterParty with Reference")
    public void searchForCounterPartyWithReference() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//Search for CP
                OptimusCounterPartyCreateActions.searchTasks(cpRef);
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

    @Then("verify CounterParty is deleted and Not shown in Search Result")
    public void verifyCounterPartyIsDeletedAndNotShownInSearchResult() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
//Search for CP
                String noData = OptimusCounterPartyUpdateActions.noDataInResultTable();
                Assert.assertEquals(noData, "No Data");
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
