package modules.OptimusActions;

import pageFactory.OptimusPages.CounterParty.*;
import utilities.KeywordUtil;

public class OptimusCounterPartyCreateActions extends KeywordUtil {

    static Class thisClass = OptimusCounterPartyCreateActions.class;

    public static void navigateToCreateCounterPartyPage() {
        click(OptimusCounterPartyMainPage.counterParty_MainTab, "Click Counter Party Main tab");
        waitForVisible(OptimusCounterPartyMainPage.counterPartyMain_WelcomeText);
        click(OptimusCounterPartyMainPage.counterPartyMain_Counterparties, "Click on CounterParties Side Panel");
        waitForClickable(OptimusCounterPartyCreatePage.counterParty_NewCounterPartyTab);
        click(OptimusCounterPartyCreatePage.counterParty_NewCounterPartyTab, "Click on Create New Counter Party Sub tab");
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_Ref);
    }
    public static void waitForCounterPartyCreatePageLoad() {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_NitroClientID);
    }
//    public static void validateCounterPartyRefData() {  }


//Mandatory fields actions
    public static void createCP_SalesForceId(String SalesForceId) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_SalesForceID, SalesForceId, "Enter Sales Force ID");
    }

    public static void createCP_NicknameInternal(String NicknameInternal) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_NicknameInternal, NicknameInternal, "Enter Nickname Internal");
    }

    public static void createCP_TIN1(String Tin1) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Tin1, Tin1, "Enter Tin1 value");
    }

    public static void createCP_ClientType(String ClientType) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ClientType, ClientType, "Select Client type=" + ClientType);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_ClientTypeOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_ClientTypeOptions, "Choose Client Type from dropdown options");
    }

    public static void createCP_EntityType(String EntityType) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_EntityType, EntityType, "Select Entity type=" + EntityType);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_EntityTypeOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_EntityTypeOptions, "Choose Entity Type from dropdown options");
    }

    public static void createCP_RegisteredAddress(String RegisteredAddress) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_RegisteredAddress, RegisteredAddress, "Enter Registered Address");
    }

    public static void createCP_AuthorizedPersonEmail(String AuthorizedPersonEmail) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_AuthorizedPersonEmail, AuthorizedPersonEmail, "Enter Authorized Person Email");
    }

//Optional fields actions
    public static void createCP_NitroClientID(String NitroClientID) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_NitroClientID, NitroClientID, "Enter NitroClient ID");
    }

    public static void createCP_ElwoodID(String ElwoodID) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ElwoodID, ElwoodID, "Enter Elwood ID");
    }

    public static void createCP_NicknameExternal(String NicknameExternal) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_NicknameExternal, NicknameExternal, "Enter Nickname External");
    }

    public static void createCP_ParentAccount(String ParentAccount) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ParentAccount_dropdown, ParentAccount, "Select Parent Account=" + ParentAccount);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_ParentAccountOption);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_ParentAccountOption, "Choose Parent Account from dropdown options");
    }

//Basic Details - Optional Fields
    public static void createCP_FirstName(String FirstName) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_FirstName, FirstName, "Enter First name for Create CP");
    }

    public static void createCP_LastName(String LastName) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_LastName, LastName, "Enter Last name for Create CP");
    }

    public static void createCP_Gender(String Gender) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Gender, Gender, "Enter Gender for Create CP");
    }

    public static void createCP_Nationality(String Nationality) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Nationality, Nationality, "Enter Nationality for Create CP");
    }

    public static void createCP_DateOfBirth(String DateOfBirth) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_DateOfBirth, DateOfBirth, "Enter Date Of Birth for Create CP");
    }

    public static void createCP_Occupation(String Occupation) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Occupation, Occupation, "Select Occupation= " + Occupation);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_OccupationOption);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_OccupationOption, "Choose Occupation from dropdown options");
    }

    public static void createCP_CompanyOfEmployment(String CompanyOfEmployment) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_CompanyOfEmployment, CompanyOfEmployment, "Enter Company Of Employment for Create CP");
    }

    public static void createCP_IndustryOfEmployment(String IndustryOfEmployment) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_IndustryOfEmployement, IndustryOfEmployment, "Select Industry Of Employment= " + IndustryOfEmployment);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_IndustryOfEmployementOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_IndustryOfEmployementOptions, "Choose Industry Of Employment from dropdown options");
    }

    public static void createCP_IdentificationIssueDate(String IdentificationIssueDate) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationIssueDate, IdentificationIssueDate, "Enter Identification Issue Date for Create CP");
    }

    public static void createCP_IdentificationExpiryDate(String IdentificationExpiryDate) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationExpiryDate, IdentificationExpiryDate, "Enter Identification Expiry Date for Create CP");
    }

    public static void createCP_MobileNumber(String MobileNumber) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_MobileNumber, MobileNumber, "Enter MobileNumber for Create CP");
    }

    public static void createCP_PEPDeclarationToggle() {
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_PEPDeclaration, "Toggle PEP Declaration");
    }

    public static void createCP_PEPDeclarationRemarks(String PEPDeclarationRemarks) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_PEPDeclarationRemarks, PEPDeclarationRemarks, "Enter PEP Declaration Remarks for Create CP");
    }

    public static void createCP_Alias(String Alias) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Alias, Alias, "Enter Alias for Create CP");
    }

    public static void createCP_TIN2(String Tin2) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Tin2, Tin2, "Enter Tin2 value");
    }

    public static void createCP_TIN3(String Tin3) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Tin3, Tin3, "Enter Tin3 value");
    }

// Company and Other Information - Optional fields
    public static void createCP_CompanyName(String CompanyName) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_CompanyName, CompanyName, "Enter CompanyName value");
    }

    public static void createCP_FormerRegisteredName(String FormerRegisteredName) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_FormerRegisteredName, FormerRegisteredName, "Enter Former Registered Name value");
    }

    public static void createCP_IdentificationNumber(String IdentificationNumber) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationNumber, IdentificationNumber, "Enter Identification Number value");
    }

    public static void createCP_IdentificationType(String IdentificationType) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationType, IdentificationType, "Select Identification Type = " + IdentificationType);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationTypeOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationTypeOptions, "Choose Identification Type from dropdown options");
    }

    public static void createCP_CountryOfIncorporation(String CountryOfIncorporation) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_CountryOfIncorporation, CountryOfIncorporation, "Select Country Of Incorporation = " + CountryOfIncorporation);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_CountryOfIncorporationOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_CountryOfIncorporationOptions, "Choose Country Of Incorporation from dropdown options");
    }

    public static void createCP_StateOfIncorporation(String StateOfIncorporation) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_StateOfIncorporation, StateOfIncorporation, "Select State Of Incorporation = " + StateOfIncorporation);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_StateOfIncorporationOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_StateOfIncorporationOptions, "Choose state Of Incorporation from dropdown options");
    }

    public static void createCP_OperatingAddress(String OperatingAddress) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_OperatingAddress, OperatingAddress, "Enter Operating Address");
    }

    public static void createCP_CountryOfOperation(String CountryOfOperation) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_CountryOfOperation, CountryOfOperation, "Select Country Of Operation = " + CountryOfOperation);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_CountryOfOperationOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_CountryOfOperationOptions, "Choose Country Of Operation from dropdown options");
    }

    public static void createCP_OnboardingMode(String OnboardingMode) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_OnboardingMode, OnboardingMode, "Select Onboarding Mode = " + OnboardingMode);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_OnboardingModeOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_OnboardingModeOptions, "Choose Onboarding Mode from dropdown options");
    }

    public static void createCP_PrimaryBusinessActivity(String PrimaryBusinessActivity) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_PrimaryBusinessActivity, PrimaryBusinessActivity, "Select Primary Business Activity  = " + PrimaryBusinessActivity);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_PrimaryBusinessActivityOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_PrimaryBusinessActivityOptions, "Choose Onboarding Mode from dropdown options");
    }

    public static void createCP_PrimaryBusinessActivityRemarks(String PrimaryBusinessActivityRemarks) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_PrimaryBusinessActivityRemarks, PrimaryBusinessActivityRemarks, "Enter Primary Business Activity  Remarks ");
    }

    public static void createCP_CorporateWebsite(String CorporateWebsite) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_PrimaryBusinessActivityRemarks, CorporateWebsite, "Enter Corporate Website");
    }

    public static void createCP_GSTRegisteredToggle() {
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_GSTRegistered, "Toggle GST Registered");
    }

    public static void createCP_FinancialInstitutionToggle() {
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_FinancialInstitution, "Toggle Financial Institution");
    }

    public static void createCP_PaymentServiceProviderToggle() {
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_GSTRegistered, "Toggle Payment Service Provider");
    }

    public static void createCP_SourceOfFunds(String SourceOfFunds) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_SourceOfFunds, SourceOfFunds, "Select Source of Funds  = " + SourceOfFunds);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_SourceOfFundsOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_SourceOfFundsOptions, "Choose Source of Funds from dropdown options");
    }

    public static void createCP_SourceOfFundsRemarks(String SourceOfFundsRemarks) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_SourceOfFundsRemarks, SourceOfFundsRemarks, "Enter Source Of Funds Remarks");
    }

    public static void createCP_AuthorizedPerson(String AuthorizedPerson) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_AuthorizedPerson, AuthorizedPerson, "Enter AuthorizedPerson");
    }

    public static void createCP_AuthorizedPersonMobile(String AuthorizedPersonMobile) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_AuthorizedPersonMobile, AuthorizedPersonMobile, "Enter AuthorizedPerson Mobile");
    }

    public static void createCP_BusinessPurposeForRelationship(String BusinessPurposeForRelationship) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_BusinessPurposeForRelationship, BusinessPurposeForRelationship, "Enter Business Purpose for Relationship");
    }

    public static void createCP_AppointmentOthers(String AppointmentOthers) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_AppointmentOthers, AppointmentOthers, "Enter Appointment (Others) ");
    }

//Additional Information - Optional Fields
    public static void createCP_GroupAssociation(String GroupAssociation) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_GroupAssociation, GroupAssociation, "Enter Group Association");
    }

    public static void createCP_OnboardedDate(String OnboardedDate) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_OnboardedDate, OnboardedDate, "Enter Onboarded Date");
    }

    public static void createCP_ClientTier(String ClientTier) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ClientTier, ClientTier, "Select Client Tier  = " + ClientTier);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_ClientTierOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_ClientTierOptions, "Choose Client Tier from dropdown options");
    }

    public static void createCP_KYCRefreshDate(String KYCRefreshDate) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_KYCRefreshDate, KYCRefreshDate, "Enter KYC Refresh Date");
    }

    public static void createCP_ClientTierRemarks(String ClientTierRemarks) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ClientTierRemarks, ClientTierRemarks, "Enter Client Tier Remarks");
    }

    public static void createCP_RiskScore(String RiskScore) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_RiskScore, RiskScore, "Select Risk Score  = " + RiskScore);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_RiskScoreOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_RiskScoreOptions, "Choose Risk Score from dropdown options");
    }

    public static void createCP_RiskScoreRemarks(String RiskScoreRemarks) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_RiskScoreRemarks, RiskScoreRemarks, "Enter Risk Score Remarks");
    }

    public static void createCP_ExecutionFeeRate(String ExecutionFeeRate) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ExecutionFeeRate, ExecutionFeeRate, "Enter Execution Fee Rate");
    }

    public static void createCP_ReferralPersonInternal(String ReferralPersonInternal) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ReferralPersonInternal, ReferralPersonInternal, "Select Referral Person (Internal)  = " + ReferralPersonInternal);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_ReferralPersonInternalOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_ReferralPersonInternalOptions, "Choose Referral Person (Internal) from dropdown options");
    }

    public static void createCP_ReferralPersonExternal(String ReferralPersonExternal) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ReferralPersonExternal, ReferralPersonExternal, "Select Referral Person External ");
    }

    public static void createCP_ReferralExternalRebate(String ReferralExternalRebate) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ReferralExternalRebate, ReferralExternalRebate, "Select Referral External Rebate ");
    }

    public static void createCP_FaceToFaceVerificationStatus(String FaceToFaceVerificationStatus) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_FaceVerificationStatus, FaceToFaceVerificationStatus, "Select Face to Face Verification Status  = " + FaceToFaceVerificationStatus);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_FaceVerificationStatusOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_FaceVerificationStatusOptions, "Choose Face to Face Verification Status from dropdown options");
    }

    public static void createCP_FaceToFaceVerificationRemarks(String FaceToFaceVerificationRemarks) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_FaceVerificationRemarks, FaceToFaceVerificationRemarks, "Select Face To Face Verification Remarks ");
    }

    public static void createCP_VouchedStatus(String VouchedStatus) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedStatus, VouchedStatus, "Select Vouched Status  = " + VouchedStatus);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedStatusOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedStatusOptions, "Choose Vouched Status from dropdown options");
    }

    public static void createCP_VouchedByPerson(String VouchedByPerson) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedByPerson, VouchedByPerson, "Select Vouched By Person  = " + VouchedByPerson);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedByPersonOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedByPersonOptions, "Choose Vouched by Person from dropdown options");
    }

    public static void createCP_VouchedRemarks(String VouchedRemarks) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedRemarks, VouchedRemarks, "Enter Vouched Remarks ");
    }

    public static void createCP_ManagementRemarks(String ManagementRemarks) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ManagementRemarks, ManagementRemarks, "Enter Management Remarks ");
    }

    public static void createCP_CounterpartyStatus(String CounterpartyStatus) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_CounterpartyStatus, CounterpartyStatus, "Select Counterparty Status  = " + CounterpartyStatus);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_CounterpartyStatusOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_CounterpartyStatusOptions, "Choose Counterparty Status from dropdown options");
    }

    public static void createCP_CounterpartyRemarks(String CounterpartyRemarks) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_CounterpartyRemarks, CounterpartyRemarks, "Enter Counterparty Remarks ");
    }

//Operations Buttons Clicks
    public static void clickCreateCounterPartyBtn() {
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_CreateCounterpartyBtn, "Click Create Counterparty button");
    }

    public static void clickResetCounterPartyFormBtn() {
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_ResetFormBtn, "Click Reset Form button");
    }

}
