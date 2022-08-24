package modules.OptimusActions;

import modules.XAlphaActions.XAlphaDealEnquiryActions;
import org.openqa.selenium.By;
import pageFactory.OptimusPages.CounterParty.*;
import utilities.KeywordUtil;

public class OptimusCounterPartyCreateActions extends KeywordUtil {

    static Class<OptimusCounterPartyCreateActions> thisClass = OptimusCounterPartyCreateActions.class;

    public static void openCounterPartyMainTab() {
        waitForVisible(OptimusCounterPartyMainPage.counterParty_MainTab);
        click(OptimusCounterPartyMainPage.counterParty_MainTab, "Click Counter Party Main tab");
        waitForVisible(OptimusCounterPartyMainPage.counterPartyMain_WelcomeText);
    }

    public static void openCounterPartySubTab() {
        click(OptimusCounterPartyMainPage.counterPartyMain_Counterparties, "Click CounterParties side tab");
    }

    public static void navigateToCreateCounterPartyPage() throws InterruptedException {
        waitForClickable(OptimusCounterPartyCreatePage.counterParty_NewCounterPartyTab);
        click(OptimusCounterPartyCreatePage.counterParty_NewCounterPartyTab, "Click on Create New Counter Party Sub tab");
        XAlphaDealEnquiryActions.waitForLoadingIconToAppearAndDisappear();
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_Ref);
        waitForClickable(OptimusCounterPartyCreatePage.newCounterPartyPage_SalesForceID);
    }

    public static void waitForCounterPartyCreatePageLoad() {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_NitroClientID);
    }
//    public static void validateCounterPartyRefData() {  }

    //Mandatory fields actions
    public static void createCP_SalesForceId(String SalesForceId) throws InterruptedException {
        waitForClickable(OptimusCounterPartyCreatePage.newCounterPartyPage_SalesForceID);
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
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_ClientTypeOptions, ClientType)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_ClientTypeOptions, ClientType)), "Choose Client Type from dropdown options");
    }

    public static void createCP_EntityType(String EntityType) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_EntityType, EntityType, "Select Entity type=" + EntityType);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_EntityTypeOptions, EntityType)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_EntityTypeOptions, EntityType)), "Choose Entity Type from dropdown options");
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
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ParentAccount, ParentAccount, "Select Parent Account=" + ParentAccount);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_ParentAccountOptions, ParentAccount)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_ParentAccountOptions, ParentAccount)), "Choose Parent Account from dropdown options");
    }

    //Basic Details - Optional Fields
    public static void createCP_FirstName(String FirstName) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_FirstName, FirstName, "Enter First name for Create CP");
    }

    public static void createCP_LastName(String LastName) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_LastName, LastName, "Enter Last name for Create CP");
    }

    public static void createCP_Gender(String Gender) {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_Gender);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Gender, Gender, "Enter Gender for Create CP");
    }

    public static void createCP_Nationality(String Nationality) throws InterruptedException {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_Nationality);
        scrollingToElementofAPage(OptimusCounterPartyCreatePage.newCounterPartyPage_Nationality, "Scroll to element Nationality");
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Nationality, Nationality, "Enter Nationality for Create CP");
    }

    public static void createCP_DateOfBirth(String DateOfBirth) {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_DateOfBirth);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_DateOfBirth, "Click Date Of Birth field");
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_DateOfBirth, DateOfBirth, "Enter Date Of Birth for Create CP");
    }

    public static void createCP_Occupation(String Occupation) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Occupation, Occupation, "Select Occupation= " + Occupation);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_OccupationOptions, Occupation)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_OccupationOptions, Occupation)), "Choose Occupation from dropdown options");
    }

    public static void createCP_CompanyOfEmployment(String CompanyOfEmployment) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_CompanyOfEmployment, CompanyOfEmployment, "Enter Company Of Employment for Create CP");
    }

    public static void createCP_IndustryOfEmployment(String IndustryOfEmployment) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_IndustryOfEmployement, IndustryOfEmployment, "Select Industry Of Employment= " + IndustryOfEmployment);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_IndustryOfEmployementOptions, IndustryOfEmployment)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_IndustryOfEmployementOptions, IndustryOfEmployment)), "Choose Industry Of Employment from dropdown options");
    }

    public static void createCP_IdentificationIssueDate(String IdentificationIssueDate) throws InterruptedException {
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationIssueDate, "Click in Identification Issue Date field for Create CP");
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationIssueDate, IdentificationIssueDate, "Enter Identification Issue Date for Create CP");
        pressEnter(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationIssueDate);
//        scrollingToElementofAPage(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationIssueDate_OKBtn, "Scroll to Element");
//        waitForClickable(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationIssueDate_OKBtn);
//        click(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationIssueDate_OKBtn,"Clicking OK to select entered Date");
    }

    public static void createCP_IdentificationExpiryDate(String IdentificationExpiryDate) throws InterruptedException {
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationExpiryDate, "Click Identification Expiry Date for Create CP");
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationExpiryDate, IdentificationExpiryDate, "Enter Identification Expiry Date for Create CP");
        pressEnter(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationExpiryDate);
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
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_Tin2);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Tin2, Tin2, "Enter Tin2 value");
    }

    public static void createCP_TIN3(String Tin3) {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_Tin3);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Tin3, Tin3, "Enter Tin3 value");
    }

    // Company and Other Information - Optional fields
    public static void createCP_CompanyName(String CompanyName) {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_CompanyName);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_CompanyName, CompanyName, "Enter CompanyName value");
    }

    public static void createCP_FormerRegisteredName(String FormerRegisteredName) {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_FormerRegisteredName);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_FormerRegisteredName, FormerRegisteredName, "Enter Former Registered Name value");
    }

    public static void createCP_IdentificationNumber(String IdentificationNumber) {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationNumber);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationNumber, IdentificationNumber, "Enter Identification Number value");
    }

    public static void createCP_IdentificationType(String IdentificationType) throws InterruptedException {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationType, IdentificationType, "Select Identification Type = " + IdentificationType);
//        scrollingToElementofAPage(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationTypeOptions)), "Scroll to Element");
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationTypeOptions, IdentificationType)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationTypeOptions, IdentificationType)), "Choose Identification Type from dropdown options");
    }

    public static void createCP_CountryOfIncorporation(String CountryOfIncorporation) throws InterruptedException {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_CountryOfIncorporation, CountryOfIncorporation, "Select Country Of Incorporation = " + CountryOfIncorporation);
//        scrollingToElementofAPage(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_CountryOfIncorporationOptions)), "Scroll to Element");
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_CountryOfIncorporationOptions, CountryOfIncorporation)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_CountryOfIncorporationOptions, CountryOfIncorporation)), "Choose Country Of Incorporation from dropdown options");
    }

    public static void waitfor3seconds() throws InterruptedException {
        delay(3000);
    }

    public static void waitfor5seconds() throws InterruptedException {
        delay(5000);
    }

    public static void createCP_StateOfIncorporation(String StateOfIncorporation) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_StateOfIncorporation, StateOfIncorporation, "Select State Of Incorporation = " + StateOfIncorporation);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_StateOfIncorporationOptions, StateOfIncorporation)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_StateOfIncorporationOptions, StateOfIncorporation)), "Choose State Of Incorporation from dropdown options");
    }

    public static void createCP_OperatingAddress(String OperatingAddress) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_OperatingAddress, OperatingAddress, "Enter Operating Address");
    }

    public static void createCP_CountryOfOperation(String CountryOfOperation) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_CountryOfOperation, CountryOfOperation, "Select Country Of Operation = " + CountryOfOperation);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_CountryOfOperationOptions, CountryOfOperation)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_CountryOfOperationOptions, CountryOfOperation)), "Choose Country Of Operation from dropdown options");
    }

    public static void createCP_OnboardingMode(String OnboardingMode) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_OnboardingMode, OnboardingMode, "Select Onboarding Mode = " + OnboardingMode);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_OnboardingModeOptions, OnboardingMode)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_OnboardingModeOptions, OnboardingMode)), "Choose Onboarding Mode from dropdown options");
    }

    public static void createCP_PrimaryBusinessActivity(String PrimaryBusinessActivity) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_PrimaryBusinessActivity, PrimaryBusinessActivity, "Select Primary Business Activity  = " + PrimaryBusinessActivity);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_PrimaryBusinessActivityOptions, PrimaryBusinessActivity)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_PrimaryBusinessActivityOptions, PrimaryBusinessActivity)), "Choose Primary Business Activity from dropdown options");
    }

    public static void createCP_PrimaryBusinessActivityRemarks(String PrimaryBusinessActivityRemarks) {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_PrimaryBusinessActivityRemarks);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_PrimaryBusinessActivityRemarks, PrimaryBusinessActivityRemarks, "Enter Primary Business Activity  Remarks ");
    }

    public static void createCP_CorporateWebsite(String CorporateWebsite) {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_CorporateWebsite);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_CorporateWebsite, CorporateWebsite, "Enter Corporate Website");
    }

    public static void createCP_GSTRegisteredToggle() {
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_GSTRegistered, "Toggle GST Registered");
    }

    public static void createCP_FinancialInstitutionToggle() {
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_FinancialInstitution, "Toggle Financial Institution");
    }

    public static void createCP_PaymentServiceProviderToggle() {
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_PaymentServiceProvider, "Toggle Payment Service Provider");
    }

    public static void createCP_SourceOfFunds(String SourceOfFunds) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_SourceOfFunds, SourceOfFunds, "Select Source of Funds  = " + SourceOfFunds);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_SourceOfFundsOptions, SourceOfFunds)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_SourceOfFundsOptions, SourceOfFunds)), "Choose Source Of Funds from dropdown options");
    }

    public static void createCP_SourceOfFundsRemarks(String SourceOfFundsRemarks) {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_SourceOfFundsRemarks);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_SourceOfFundsRemarks, SourceOfFundsRemarks, "Enter Source Of Funds Remarks");
    }

    public static void createCP_AuthorizedPerson(String AuthorizedPerson) {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_AuthorizedPerson);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_AuthorizedPerson, AuthorizedPerson, "Enter AuthorizedPerson");
    }

    public static void createCP_AuthorizedPersonMobile(String AuthorizedPersonMobile) {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_AuthorizedPersonMobile);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_AuthorizedPersonMobile, AuthorizedPersonMobile, "Enter AuthorizedPerson Mobile");
    }

    public static void createCP_BusinessPurposeForRelationship(String BusinessPurposeForRelationship) {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_BusinessPurposeForRelationship);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_BusinessPurposeForRelationship, BusinessPurposeForRelationship, "Enter Business Purpose for Relationship");
    }

    public static void createCP_AppointmentOthers(String AppointmentOthers) {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_AppointmentOthers);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_AppointmentOthers, AppointmentOthers, "Enter Appointment Others");
    }

    //Additional Information - Optional Fields
    public static void createCP_GroupAssociation(String GroupAssociation) {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_GroupAssociation);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_GroupAssociation, GroupAssociation, "Enter Group Association");
    }

    public static void createCP_OnboardedDate(String OnboardedDate) throws InterruptedException {
        delay(2000);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_OnboardedDate, "Enter Onboarded Date");
        pressEnter(OptimusCounterPartyCreatePage.newCounterPartyPage_OnboardedDate);
//        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_OnboardedDate, OnboardedDate, "Enter Onboarded Date");
//        click(OptimusCounterPartyCreatePage.newCounterPartyPage_OnboardedDate_OKBtn,"Clicking OK to select entered Date");
    }

    public static void createCP_ClientTier(String ClientTier) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ClientTier, ClientTier, "Select Client Tier  = " + ClientTier);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_ClientTierOptions, ClientTier)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_ClientTierOptions, ClientTier)), "Choose Client Tier from dropdown options");
    }

    public static void createCP_KYCRefreshDate(String KYCRefreshDate) {
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_KYCRefreshDate, "Click KYC Refresh Date");
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_KYCRefreshDate, KYCRefreshDate, "Enter KYC Refresh Date");
        pressEnter(OptimusCounterPartyCreatePage.newCounterPartyPage_KYCRefreshDate);
//        click(OptimusCounterPartyCreatePage.newCounterPartyPage_KYCRefreshDate_OKBtn,"Clicking OK to select entered Date");
    }

    public static void createCP_ClientTierRemarks(String ClientTierRemarks) throws InterruptedException {
        delay(2000);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ClientTierRemarks, ClientTierRemarks, "Enter Client Tier Remarks");
    }

    public static void createCP_RiskScore(String RiskScore) throws InterruptedException {
        delay(2000);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_RiskScore, RiskScore, "Select Risk Score  = " + RiskScore);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_RiskScoreOptions, RiskScore)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_RiskScoreOptions, RiskScore)), "Choose Risk Score from dropdown options");
    }

    public static void createCP_RiskScoreRemarks(String RiskScoreRemarks) throws InterruptedException {
        delay(2000);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_RiskScoreRemarks, RiskScoreRemarks, "Enter Risk Score Remarks");
    }

    public static void createCP_ExecutionFeeRate(String ExecutionFeeRate) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ExecutionFeeRate, ExecutionFeeRate, "Enter Execution Fee Rate");
    }

    public static void createCP_ReferralPersonInternal(String ReferralPersonInternal) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ReferralPersonInternal, ReferralPersonInternal, "Select Referral Person Internal  = " + ReferralPersonInternal);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_ReferralPersonInternalOptions, ReferralPersonInternal)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_ReferralPersonInternalOptions, ReferralPersonInternal)), "Choose Referral Person Internal from dropdown options");
    }

    public static void createCP_ReferralPersonExternal(String ReferralPersonExternal) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ReferralPersonExternal, ReferralPersonExternal, "Select Referral Person External ");
    }

    public static void createCP_ReferralExternalRebate(String ReferralExternalRebate) {
        waitForClickable(OptimusCounterPartyCreatePage.newCounterPartyPage_ReferralExternalRebate);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ReferralExternalRebate, ReferralExternalRebate, "Select Referral External Rebate ");
    }

    public static void createCP_FaceToFaceVerificationStatus(String FaceToFaceVerificationStatus) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_FaceVerificationStatus, FaceToFaceVerificationStatus, "Select Face to Face Verification Status  = " + FaceToFaceVerificationStatus);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_FaceVerificationStatusOptions, FaceToFaceVerificationStatus)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_FaceVerificationStatusOptions, FaceToFaceVerificationStatus)), "Choose FaceToFace Verification Status from dropdown options");
    }

    public static void createCP_FaceToFaceVerificationRemarks(String FaceToFaceVerificationRemarks) {
        waitForClickable(OptimusCounterPartyCreatePage.newCounterPartyPage_FaceVerificationRemarks);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_FaceVerificationRemarks, FaceToFaceVerificationRemarks, "Select Face To Face Verification Remarks ");
    }

    public static void createCP_VouchedStatus(String VouchedStatus) {
        waitForClickable(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedStatus);
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedStatus, VouchedStatus, "Select Vouched Status  = " + VouchedStatus);
        pressEnter(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedStatus);
//        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedStatusOptions, VouchedStatus)));
//        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedStatusOptions, VouchedStatus)), "Choose Vouched Status from dropdown options");
    }

    public static void createCP_VouchedByPerson(String VouchedByPerson) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedByPerson, VouchedByPerson, "Select Vouched By Person  = " + VouchedByPerson);
        pressEnter(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedByPerson);
//        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedByPersonOptions, VouchedByPerson)));
//        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedByPersonOptions, VouchedByPerson)), "Choose Vouched By Person from dropdown options");
    }

    public static void createCP_VouchedRemarks(String VouchedRemarks) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_VouchedRemarks, VouchedRemarks, "Enter Vouched Remarks ");
    }

    public static void createCP_ManagementRemarks(String ManagementRemarks) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ManagementRemarks, ManagementRemarks, "Enter Management Remarks ");
    }

    public static void createCP_CounterpartyStatus(String CounterpartyStatus) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_CounterpartyStatus, CounterpartyStatus, "Select Counterparty Status  = " + CounterpartyStatus);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_CounterpartyStatusOptions, CounterpartyStatus)));
        click(By.xpath(String.format(OptimusCounterPartyCreatePage.newCounterPartyPage_CounterpartyStatusOptions, CounterpartyStatus)), "Choose Counterparty Status from dropdown options");
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

    public static void waitForSuccessMessage() {
        waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_SuccessMessage);
    }

    public static String getSuccessMessageText() {
        return getElementText(OptimusCounterPartyCreatePage.newCounterPartyPage_SuccessMessage);
    }

    public static void openTasksTab() {
        click(OptimusCounterPartyMainPage.counterPartyMain_Tasks, "Click Tasks tab");
        waitForVisible(OptimusCounterPartyTasksPage.tasks_CounterPartyTab);
    }

    public static void searchTasks(String searchText) {
        click(OptimusCounterPartyTasksPage.tasks_CpSearchBox, "Click Search box");
        inputText(OptimusCounterPartyTasksPage.tasks_CpSearchBox, searchText, "Searching Tasks");
        click(OptimusCounterPartyTasksPage.tasks_CpSearchBtn, "Click Search button");
        waitForVisible(OptimusCounterPartyTasksPage.tasks_CpSearchResult1);
    }

    public static void selectFirstTask() {
        waitForVisible(OptimusCounterPartyTasksPage.tasks_CpSearchResult1);
        click(OptimusCounterPartyTasksPage.tasks_CpSearchResult1_Checkbox, "Click first result check box");
    }

    public static void selectAllTasks() {
        waitForVisible(OptimusCounterPartyTasksPage.tasks_CpSelectAllBtn);
        click(OptimusCounterPartyTasksPage.tasks_CpSelectAllBtn, "Select All tasks on page");
    }

    public static void approveAllSelectedTasks() {
        waitForVisible(OptimusCounterPartyTasksPage.tasks_CpApproveBtn);
        click(OptimusCounterPartyTasksPage.tasks_CpApproveBtn, "Click Approve All button");
        waitForVisible(OptimusCounterPartyTasksPage.tasks_CpApprovePopUp);
        click(OptimusCounterPartyTasksPage.tasks_CpApproveAll_YesBtn, "Approve all Click yes button");
    }

    public static void verifySuccessMessage() {
        waitForVisible(OptimusCounterPartyTasksPage.tasks_SuccessMessage);
    }

    public static String getSuccessMessage() {
        return getElementText(OptimusCounterPartyTasksPage.tasks_SuccessMessage);
    }

    public static void openListTab() {
        click(OptimusCounterPartyListPage.counterParties_ListTab, "Click List tab");
    }

    public static void searchCounterParty(String nickName) throws InterruptedException {
        waitForVisible(OptimusCounterPartyListPage.counterPartyList_SearchBox);
        waitForClickable(OptimusCounterPartyListPage.counterPartyList_SearchBox);
        inputText(OptimusCounterPartyListPage.counterPartyList_SearchBox, nickName, "Enter Search Criteria");
        click(OptimusCounterPartyListPage.counterPartyList_SearchBtn, "Click Search button");
    }

    public static void checkCounterPart_FirstResultListLoad() {
        waitForVisible(OptimusCounterPartyListPage.counterPartyList_NickNameInternal1);
    }

    public static String getNickNameFromList() {
        waitForVisible(OptimusCounterPartyListPage.counterPartyList_NickNameInternal1);
        return getElementText(OptimusCounterPartyListPage.counterPartyList_NickNameInternal1);
    }

    public static void waitRelatedPartySearchResultLoad() {
        waitForVisible(OptimusCounterPartyListPage.relatedPartyList_FirstName);
    }
    public static String getRelatedFistNameInList() {
        return getElementText(OptimusCounterPartyListPage.relatedPartyList_FirstName);
    }
}