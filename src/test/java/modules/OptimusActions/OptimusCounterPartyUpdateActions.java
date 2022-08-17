package modules.OptimusActions;

import org.openqa.selenium.By;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyUpdatePage;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyListPage;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyMainPage;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyTasksPage;
import utilities.KeywordUtil;

public class OptimusCounterPartyUpdateActions extends KeywordUtil {

    static Class<OptimusCounterPartyUpdateActions> thisClass = OptimusCounterPartyUpdateActions.class;

    public static void openCounterPartyMainTab() {
        waitForVisible(OptimusCounterPartyMainPage.counterParty_MainTab);
        click(OptimusCounterPartyMainPage.counterParty_MainTab, "Click Counter Party Main tab");
        waitForVisible(OptimusCounterPartyMainPage.counterPartyMain_WelcomeText);
    }

    public static void openCounterPartySubTab() {
        click(OptimusCounterPartyMainPage.counterPartyMain_Counterparties, "Click on CounterParties Side Panel");
    }

    public static String getCPRef() {
        return getElementValueWithVisibility(OptimusCounterPartyUpdatePage.updateCounterPartyPage_cpRef);
    }

    public static void clickEditLinkinSearchResult() throws InterruptedException {
        waitForVisible(OptimusCounterPartyListPage.counterPartyList_EditLink);
        click(OptimusCounterPartyListPage.counterPartyList_EditLink, "CounterParty Edit Link");
    }

    public static void waitForCounterPartyUpdatePageLoad() {
        waitForVisible(OptimusCounterPartyUpdatePage.updateCounterPartyPage_cpRef);
    }
//    public static void validateCounterPartyRefData() {  }

    public static void updateCP_SalesForceId(String SalesForceId) throws InterruptedException {
        waitForClickable(OptimusCounterPartyUpdatePage.updateCounterPartyPage_SalesForceID);
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_SalesForceID, SalesForceId, "Enter Sales Force ID");
    }

    public static void updateCP_NicknameInternal(String NicknameInternal) throws InterruptedException {
        clearInputUsingKeys(OptimusCounterPartyUpdatePage.updateCounterPartyPage_NicknameInternal);
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_NicknameInternal, NicknameInternal, "Enter Nickname Internal");
    }

    public static void updateCP_TIN1(String Tin1) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_Tin1, Tin1, "Enter Tin1 value");
    }

    public static void updateCP_ClientType(String ClientType) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ClientType, ClientType, "Select Client type=" + ClientType);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ClientTypeOptions, ClientType)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ClientTypeOptions, ClientType)), "Choose Client Type from dropdown options");
    }

    public static void updateCP_EntityType(String EntityType) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_EntityType, EntityType, "Select Entity type=" + EntityType);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_EntityTypeOptions, EntityType)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_EntityTypeOptions, EntityType)), "Choose Entity Type from dropdown options");
    }

    public static void updateCP_RegisteredAddress(String RegisteredAddress) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_RegisteredAddress, RegisteredAddress, "Enter Registered Address");
    }

    public static void updateCP_AuthorizedPersonEmail(String AuthorizedPersonEmail) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_AuthorizedPersonEmail, AuthorizedPersonEmail, "Enter Authorized Person Email");
    }

    //Optional fields actions
    public static void updateCP_NitroClientID(String NitroClientID) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_NitroClientID, NitroClientID, "Enter NitroClient ID");
    }

    public static void updateCP_ElwoodID(String ElwoodID) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ElwoodID, ElwoodID, "Enter Elwood ID");
    }

    public static void updateCP_NicknameExternal(String NicknameExternal) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_NicknameExternal, NicknameExternal, "Enter Nickname External");
    }

    public static void updateCP_ParentAccount(String ParentAccount) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ParentAccount_dropdown, ParentAccount, "Select Parent Account=" + ParentAccount);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ParentAccountOption, ParentAccount)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ParentAccountOption, ParentAccount)), "Choose Parent Account from dropdown options");
    }

    //Basic Details - Optional Fields
    public static void updateCP_FirstName(String FirstName) throws InterruptedException {
        waitfor2seconds();
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_FirstName, FirstName, "Enter First name for Update CP");
    }

    public static void updateCP_LastName(String LastName) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_LastName, LastName, "Enter Last name for Update CP");
    }

    public static void updateCP_Gender(String Gender) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_Gender, Gender, "Enter Gender for Update CP");
    }

    public static void updateCP_Nationality(String Nationality) throws InterruptedException {
        waitfor2seconds();
        scrollingToElementofAPage(OptimusCounterPartyUpdatePage.updateCounterPartyPage_Nationality, "Scroll to element Nationality");
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_Nationality, Nationality, "Enter Nationality for Update CP");
    }

    public static void updateCP_DateOfBirth(String DateOfBirth) {
        click(OptimusCounterPartyUpdatePage.updateCounterPartyPage_DateOfBirth, "Click Date Of Birth field");
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_DateOfBirth, DateOfBirth, "Enter Date Of Birth for Update CP");
    }

    public static void updateCP_Occupation(String Occupation) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_Occupation, Occupation, "Select Occupation= " + Occupation);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_OccupationOption, Occupation)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_OccupationOption, Occupation)), "Choose Occupation from dropdown options");
    }

    public static void updateCP_CompanyOfEmployment(String CompanyOfEmployment) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_CompanyOfEmployment, CompanyOfEmployment, "Enter Company Of Employment for Update CP");
    }

    public static void updateCP_IndustryOfEmployment(String IndustryOfEmployment) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IndustryOfEmployement, IndustryOfEmployment, "Select Industry Of Employment= " + IndustryOfEmployment);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IndustryOfEmployementOptions, IndustryOfEmployment)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IndustryOfEmployementOptions, IndustryOfEmployment)), "Choose Industry Of Employment from dropdown options");
    }

    public static void updateCP_IdentificationIssueDate(String IdentificationIssueDate) throws InterruptedException {
        click(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationIssueDate, "Click in Identification Issue Date field for Update CP");
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationIssueDate, IdentificationIssueDate, "Enter Identification Issue Date for Update CP");
        pressEnter(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationIssueDate);
//        scrollingToElementofAPage(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationIssueDate_OKBtn, "Scroll to Element");
//        waitForClickable(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationIssueDate_OKBtn);
//        click(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationIssueDate_OKBtn,"Clicking OK to select entered Date");
    }

    public static void updateCP_IdentificationExpiryDate(String IdentificationExpiryDate) throws InterruptedException {
        click(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationExpiryDate, "Click Identification Expiry Date for Update CP");
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationExpiryDate, IdentificationExpiryDate, "Enter Identification Expiry Date for Update CP");
        pressEnter(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationExpiryDate);
//        scrollingToElementofAPage(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationExpiryDate_OKBtn, "Scroll to Element");
//        waitForClickable(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationExpiryDate_NowBtn);
//        clickJS(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationExpiryDate_OKBtn,"Clicking NOW to select entered Date");
    }

    public static void updateCP_MobileNumber(String MobileNumber) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_MobileNumber, MobileNumber, "Enter MobileNumber for Update CP");
    }

    public static void updateCP_PEPDeclarationToggle() {
        click(OptimusCounterPartyUpdatePage.updateCounterPartyPage_PEPDeclaration, "Toggle PEP Declaration");
    }

    public static void updateCP_PEPDeclarationRemarks(String PEPDeclarationRemarks) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_PEPDeclarationRemarks, PEPDeclarationRemarks, "Enter PEP Declaration Remarks for Update CP");
    }

    public static void updateCP_Alias(String Alias) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_Alias, Alias, "Enter Alias for Update CP");
    }

    public static void updateCP_TIN2(String Tin2) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_Tin2, Tin2, "Enter Tin2 value");
    }

    public static void updateCP_TIN3(String Tin3) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_Tin3, Tin3, "Enter Tin3 value");
    }

    // Company and Other Information - Optional fields
    public static void updateCP_CompanyName(String CompanyName) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_CompanyName, CompanyName, "Enter CompanyName value");
    }

    public static void updateCP_FormerRegisteredName(String FormerRegisteredName) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_FormerRegisteredName, FormerRegisteredName, "Enter Former Registered Name value");
    }

    public static void updateCP_IdentificationNumber(String IdentificationNumber) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationNumber, IdentificationNumber, "Enter Identification Number value");
    }

    public static void updateCP_IdentificationType(String IdentificationType) throws InterruptedException {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationType, IdentificationType, "Select Identification Type = " + IdentificationType);
//        scrollingToElementofAPage(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationTypeOptions)), "Scroll to Element");
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationTypeOptions, IdentificationType)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_IdentificationTypeOptions, IdentificationType)), "Choose Identification Type from dropdown options");
    }

    public static void updateCP_CountryOfIncorporation(String CountryOfIncorporation) throws InterruptedException {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_CountryOfIncorporation, CountryOfIncorporation, "Select Country Of Incorporation = " + CountryOfIncorporation);
//        scrollingToElementofAPage(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_CountryOfIncorporationOptions)), "Scroll to Element");
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_CountryOfIncorporationOptions, CountryOfIncorporation)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_CountryOfIncorporationOptions, CountryOfIncorporation)), "Choose Country Of Incorporation from dropdown options");
    }

    public static void waitfor2seconds() throws InterruptedException {
        delay(2000);
    }

    public static void updateCP_StateOfIncorporation(String StateOfIncorporation) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_StateOfIncorporation, StateOfIncorporation, "Select State Of Incorporation = " + StateOfIncorporation);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_StateOfIncorporationOptions, StateOfIncorporation)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_StateOfIncorporationOptions, StateOfIncorporation)), "Choose State Of Incorporation from dropdown options");
    }

    public static void updateCP_OperatingAddress(String OperatingAddress) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_OperatingAddress, OperatingAddress, "Enter Operating Address");
    }

    public static void updateCP_CountryOfOperation(String CountryOfOperation) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_CountryOfOperation, CountryOfOperation, "Select Country Of Operation = " + CountryOfOperation);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_CountryOfOperationOptions, CountryOfOperation)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_CountryOfOperationOptions, CountryOfOperation)), "Choose Country Of Operation from dropdown options");
    }

    public static void updateCP_OnboardingMode(String OnboardingMode) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_OnboardingMode, OnboardingMode, "Select Onboarding Mode = " + OnboardingMode);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_OnboardingModeOptions, OnboardingMode)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_OnboardingModeOptions, OnboardingMode)), "Choose Onboarding Mode from dropdown options");
    }

    public static void updateCP_PrimaryBusinessActivity(String PrimaryBusinessActivity) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_PrimaryBusinessActivity, PrimaryBusinessActivity, "Select Primary Business Activity  = " + PrimaryBusinessActivity);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_PrimaryBusinessActivityOptions, PrimaryBusinessActivity)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_PrimaryBusinessActivityOptions, PrimaryBusinessActivity)), "Choose Primary Business Activity from dropdown options");
    }

    public static void updateCP_PrimaryBusinessActivityRemarks(String PrimaryBusinessActivityRemarks) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_PrimaryBusinessActivityRemarks, PrimaryBusinessActivityRemarks, "Enter Primary Business Activity  Remarks ");
    }

    public static void updateCP_CorporateWebsite(String CorporateWebsite) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_CorporateWebsite, CorporateWebsite, "Enter Corporate Website");
    }

    public static void updateCP_GSTRegisteredToggle() {
        click(OptimusCounterPartyUpdatePage.updateCounterPartyPage_GSTRegistered, "Toggle GST Registered");
    }

    public static void updateCP_FinancialInstitutionToggle() {
        click(OptimusCounterPartyUpdatePage.updateCounterPartyPage_FinancialInstitution, "Toggle Financial Institution");
    }

    public static void updateCP_PaymentServiceProviderToggle() {
        click(OptimusCounterPartyUpdatePage.updateCounterPartyPage_PaymentServiceProvider, "Toggle Payment Service Provider");
    }

    public static void updateCP_SourceOfFunds(String SourceOfFunds) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_SourceOfFunds, SourceOfFunds, "Select Source of Funds  = " + SourceOfFunds);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_SourceOfFundsOptions, SourceOfFunds)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_SourceOfFundsOptions, SourceOfFunds)), "Choose Source Of Funds from dropdown options");
    }

    public static void updateCP_SourceOfFundsRemarks(String SourceOfFundsRemarks) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_SourceOfFundsRemarks, SourceOfFundsRemarks, "Enter Source Of Funds Remarks");
    }

    public static void updateCP_AuthorizedPerson(String AuthorizedPerson) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_AuthorizedPerson, AuthorizedPerson, "Enter AuthorizedPerson");
    }

    public static void updateCP_AuthorizedPersonMobile(String AuthorizedPersonMobile) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_AuthorizedPersonMobile, AuthorizedPersonMobile, "Enter AuthorizedPerson Mobile");
    }

    public static void updateCP_BusinessPurposeForRelationship(String BusinessPurposeForRelationship) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_BusinessPurposeForRelationship, BusinessPurposeForRelationship, "Enter Business Purpose for Relationship");
    }

    public static void updateCP_AppointmentOthers(String AppointmentOthers) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_AppointmentOthers, AppointmentOthers, "Enter Appointment Others");
    }

    //Additional Information - Optional Fields
    public static void updateCP_GroupAssociation(String GroupAssociation) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_GroupAssociation, GroupAssociation, "Enter Group Association");
    }

    public static void updateCP_OnboardedDate(String OnboardedDate) throws InterruptedException {
        delay(2000);
        click(OptimusCounterPartyUpdatePage.updateCounterPartyPage_OnboardedDate, "Enter Onboarded Date");
        pressEnter(OptimusCounterPartyUpdatePage.updateCounterPartyPage_OnboardedDate);
//        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_OnboardedDate, OnboardedDate, "Enter Onboarded Date");
//        click(OptimusCounterPartyUpdatePage.updateCounterPartyPage_OnboardedDate_OKBtn,"Clicking OK to select entered Date");
    }

    public static void updateCP_ClientTier(String ClientTier) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ClientTier, ClientTier, "Select Client Tier  = " + ClientTier);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ClientTierOptions, ClientTier)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ClientTierOptions, ClientTier)), "Choose Client Tier from dropdown options");
    }

    public static void updateCP_KYCRefreshDate(String KYCRefreshDate) {
        click(OptimusCounterPartyUpdatePage.updateCounterPartyPage_KYCRefreshDate, "Click KYC Refresh Date");
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_KYCRefreshDate, KYCRefreshDate, "Enter KYC Refresh Date");
        pressEnter(OptimusCounterPartyUpdatePage.updateCounterPartyPage_KYCRefreshDate);
//        click(OptimusCounterPartyUpdatePage.updateCounterPartyPage_KYCRefreshDate_OKBtn,"Clicking OK to select entered Date");
    }

    public static void updateCP_ClientTierRemarks(String ClientTierRemarks) throws InterruptedException {
        delay(2000);
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ClientTierRemarks, ClientTierRemarks, "Enter Client Tier Remarks");
    }

    public static void updateCP_RiskScore(String RiskScore) throws InterruptedException {
        delay(2000);
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_RiskScore, RiskScore, "Select Risk Score  = " + RiskScore);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_RiskScoreOptions, RiskScore)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_RiskScoreOptions, RiskScore)), "Choose Risk Score from dropdown options");
    }

    public static void updateCP_RiskScoreRemarks(String RiskScoreRemarks) throws InterruptedException {
        delay(2000);
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_RiskScoreRemarks, RiskScoreRemarks, "Enter Risk Score Remarks");
    }

    public static void updateCP_ExecutionFeeRate(String ExecutionFeeRate) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ExecutionFeeRate, ExecutionFeeRate, "Enter Execution Fee Rate");
    }

    public static void updateCP_ReferralPersonInternal(String ReferralPersonInternal) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ReferralPersonInternal, ReferralPersonInternal, "Select Referral Person Internal  = " + ReferralPersonInternal);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ReferralPersonInternalOptions, ReferralPersonInternal)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ReferralPersonInternalOptions, ReferralPersonInternal)), "Choose Referral Person Internal from dropdown options");
    }

    public static void updateCP_ReferralPersonExternal(String ReferralPersonExternal) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ReferralPersonExternal, ReferralPersonExternal, "Select Referral Person External ");
    }

    public static void updateCP_ReferralExternalRebate(String ReferralExternalRebate) {
        waitForClickable(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ReferralExternalRebate);
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ReferralExternalRebate, ReferralExternalRebate, "Select Referral External Rebate ");
    }

    public static void updateCP_FaceToFaceVerificationStatus(String FaceToFaceVerificationStatus) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_FaceVerificationStatus, FaceToFaceVerificationStatus, "Select Face to Face Verification Status  = " + FaceToFaceVerificationStatus);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_FaceVerificationStatusOptions, FaceToFaceVerificationStatus)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_FaceVerificationStatusOptions, FaceToFaceVerificationStatus)), "Choose FaceToFace Verification Status from dropdown options");
    }

    public static void updateCP_FaceToFaceVerificationRemarks(String FaceToFaceVerificationRemarks) {
        waitForClickable(OptimusCounterPartyUpdatePage.updateCounterPartyPage_FaceVerificationRemarks);
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_FaceVerificationRemarks, FaceToFaceVerificationRemarks, "Select Face To Face Verification Remarks ");
    }

    public static void updateCP_VouchedStatus(String VouchedStatus) {
        waitForClickable(OptimusCounterPartyUpdatePage.updateCounterPartyPage_VouchedStatus);
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_VouchedStatus, VouchedStatus, "Select Vouched Status  = " + VouchedStatus);
        pressEnter(OptimusCounterPartyUpdatePage.updateCounterPartyPage_VouchedStatus);
//        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_VouchedStatusOptions, VouchedStatus)));
//        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_VouchedStatusOptions, VouchedStatus)), "Choose Vouched Status from dropdown options");
    }

    public static void updateCP_VouchedByPerson(String VouchedByPerson) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_VouchedByPerson, VouchedByPerson, "Select Vouched By Person  = " + VouchedByPerson);
        pressEnter(OptimusCounterPartyUpdatePage.updateCounterPartyPage_VouchedByPerson);
//        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_VouchedByPersonOptions, VouchedByPerson)));
//        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_VouchedByPersonOptions, VouchedByPerson)), "Choose Vouched By Person from dropdown options");
    }

    public static void updateCP_VouchedRemarks(String VouchedRemarks) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_VouchedRemarks, VouchedRemarks, "Enter Vouched Remarks ");
    }

    public static void updateCP_ManagementRemarks(String ManagementRemarks) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ManagementRemarks, ManagementRemarks, "Enter Management Remarks ");
    }

    public static void updateCP_CounterpartyStatus(String CounterpartyStatus) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_CounterpartyStatus, CounterpartyStatus, "Select Counterparty Status  = " + CounterpartyStatus);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_CounterpartyStatusOptions, CounterpartyStatus)));
        click(By.xpath(String.format(OptimusCounterPartyUpdatePage.updateCounterPartyPage_CounterpartyStatusOptions, CounterpartyStatus)), "Choose Counterparty Status from dropdown options");
    }

    public static void updateCP_CounterpartyRemarks(String CounterpartyRemarks) {
        inputText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_CounterpartyRemarks, CounterpartyRemarks, "Enter Counterparty Remarks ");
    }

    //Operations Buttons Clicks
    public static void clickUpdateCounterPartyBtn() {
        click(OptimusCounterPartyUpdatePage.updateCounterPartyPage_updateCounterpartyBtn, "Click Update Counterparty button");
    }

    public static void clickResetCounterPartyFormBtn() {
        click(OptimusCounterPartyUpdatePage.updateCounterPartyPage_ResetFormBtn, "Click Reset Form button");
    }

/*    public static void waitForSuccessMessage() {
        waitForVisible(OptimusCounterPartyUpdatePage.updateCounterPartyPage_SuccessMessage);
    }

    public static String getSuccessMessageText() {
        return getElementText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_SuccessMessage);
    }*/

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
        click(OptimusCounterPartyMainPage.counterPartyMain_Counterparties, "Click CounterParties side tab");
        click(OptimusCounterPartyListPage.counterParties_ListTab, "Click List tab");
    }

    public static void searchCounterParty(String nickName) {
        waitForVisible(OptimusCounterPartyListPage.counterPartyList_SearchBox);
        click(OptimusCounterPartyListPage.counterPartyList_RefreshBtn, "Click reset Search button");
        click(OptimusCounterPartyListPage.counterPartyList_SearchBox, "Clicking inside search box");
        inputText(OptimusCounterPartyListPage.counterPartyList_SearchBox, nickName, "Enter Seaarch Criteria");
        click(OptimusCounterPartyListPage.counterPartyList_SearchBtn, "Click Search button");
    }

    public static void checkCounterPart_FirstResultListLoad() {
        waitForVisible(OptimusCounterPartyListPage.counterPartyList_NickNameInternal1);
    }

    public static String getNickNameFromList() {
        waitForVisible(OptimusCounterPartyListPage.counterPartyList_NickNameInternal1);
        return getElementText(OptimusCounterPartyListPage.counterPartyList_NickNameInternal1);
    }

    public static String getUpdatedCP_NicknameInternal() {
        return getElementText(OptimusCounterPartyUpdatePage.updateCounterPartyPage_NicknameInternal);
    }
}
