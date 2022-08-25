package modules.OptimusActions;

import org.openqa.selenium.By;
import pageFactory.OptimusPages.CounterParty.*;
import utilities.KeywordUtil;

public class OptimusRelatedCounterPartyActions extends KeywordUtil {

    static Class<OptimusRelatedCounterPartyActions> thisClass = OptimusRelatedCounterPartyActions.class;

    public static void openRelatedPartyListTab() {
        click(OptimusCounterPartyMainPage.relatedParties_ListTab, "Click Related Parties List tab");
    }

    public static String getRelatedPartyRefFromDetailsPage() {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_RelatedPartyRef);
        return getElementValueWithVisibility(OptimusRelatedPartyCreatePage.relatedParty_RelatedPartyRef);
    }

    public static void relatedCounterPartyRef(String cpRef) {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_Counterparty);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_Counterparty, cpRef, "Select Counterparty ref  = " + cpRef);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_CounterpartyOptions, cpRef)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_CounterpartyOptions, cpRef)), "Choose Counterparty Ref from dropdown options");
    }

    public static void relatedCounterPartyRef_Update(String cpRef) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.updateRelatedParty_Counterparty);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.updateRelatedParty_Counterparty);
        inputText(OptimusRelatedPartyCreatePage.updateRelatedParty_Counterparty, cpRef, "Select Counterparty ref  = " + cpRef);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_CounterpartyOptions, cpRef)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_CounterpartyOptions, cpRef)), "Choose Counterparty Ref from dropdown options");
    }
//Basic Information
    public static void relatedParty_FirstName(String fname) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_FirstName);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_FirstName);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_FirstName, fname, "Enter First name");
    }

    public static void relatedParty_LastName(String lname) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_LastName);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_LastName);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_LastName, lname, "Enter First name");
    }

    public static void relatedParty_Gender(String gender) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_Gender);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_Gender);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_Gender, gender, "Enter Gender ");
    }
    public static void relatedParty_Nationality(String nation) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_Nationality);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_Nationality);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_Nationality, nation, "Enter Nationality ");
    }

    public static void relatedParty_DateOfBirth(String DateOfBirth) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_DateOfBirth);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_DateOfBirth);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_DateOfBirth, DateOfBirth, "Enter Date Of Birth ");
    }

    public static void relatedParty_IdentificationIssueDate(String IdentificationIssueDate) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_IdentificationIssueDate);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_IdentificationIssueDate);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_IdentificationIssueDate, IdentificationIssueDate, "Enter Identification Issue Date ");
        pressEnter(OptimusRelatedPartyCreatePage.relatedParty_IdentificationIssueDate);
    }

    public static void relatedParty_IdentificationExpiryDate(String IdentificationExpiryDate) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_IdentificationExpiryDate);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_IdentificationExpiryDate);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_IdentificationExpiryDate, IdentificationExpiryDate, "Enter Identification Expiry Date ");
        pressEnter(OptimusRelatedPartyCreatePage.relatedParty_IdentificationExpiryDate);
    }

    public static void relatedParty_Mobile(String mobile) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_MobileNumber);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_MobileNumber);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_MobileNumber, mobile, "Enter Mobile number ");
    }

    public static void relatedParty_Email(String email) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_EmailAddress);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_EmailAddress);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_EmailAddress, email, "Enter Email ");
    }

    public static void relatedParty_SourceOfFunds(String sourceOfFunds) {
        inputText(OptimusRelatedPartyCreatePage.relatedParty_SourceOfFunds, sourceOfFunds, "Select source Of Funds   = " + sourceOfFunds);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_SourceOfFundsOptions, sourceOfFunds)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_SourceOfFundsOptions, sourceOfFunds)), "Choose source Of Funds from dropdown options");
    }

    public static void relatedParty_SourceOfFunds_Update(String sourceOfFunds) throws InterruptedException {
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.updateRelatedParty_SourceOfFunds);
        inputText(OptimusRelatedPartyCreatePage.updateRelatedParty_SourceOfFunds, sourceOfFunds, "Select source Of Funds   = " + sourceOfFunds);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_SourceOfFundsOptions, sourceOfFunds)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_SourceOfFundsOptions, sourceOfFunds)), "Choose source Of Funds from dropdown options");
    }

    public static void relatedParty_SourceOfFundsRemarks(String sourceOfFundsRemarks) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_SourceOfFundsRemarks);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_SourceOfFundsRemarks);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_SourceOfFundsRemarks, sourceOfFundsRemarks, "Enter Source Of Funds Remarks ");
    }

    public static void relatedParty_PEP() throws InterruptedException {
        click(OptimusRelatedPartyCreatePage.relatedParty_PEP, "Enter Source Of Funds Remarks ");
    }

    public static void relatedParty_PEP_Update() throws InterruptedException {
        click(OptimusRelatedPartyCreatePage.updateRelatedParty_PEP, "Enter Source Of Funds Remarks ");
    }

    public static void relatedParty_UltimateShareholding(String ultimateShareholding) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_UltimateShareholding);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_UltimateShareholding);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_UltimateShareholding, ultimateShareholding, "Enter Ultimate Shareholding ");
    }
    public static void relatedParty_SourceOfWealth(String sourceOfWealth) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_SourceOfWealth);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_SourceOfWealth, sourceOfWealth, "Select source Of wealth   = " + sourceOfWealth);
        pressEnter(OptimusRelatedPartyCreatePage.relatedParty_SourceOfWealth);
   }
    public static void relatedParty_SourceOfWealth_Update(String sourceOfWealth) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.updateRelatedParty_SourceOfWealth);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.updateRelatedParty_SourceOfWealth);
        inputText(OptimusRelatedPartyCreatePage.updateRelatedParty_SourceOfWealth, sourceOfWealth, "Select source Of Wealth   = " + sourceOfWealth);
        pressEnter(OptimusRelatedPartyCreatePage.updateRelatedParty_SourceOfWealth);
    }
    public static void relatedParty_SourceOfWealthRemarks(String sourceOfWealth) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_SourceOfWealthRemarks);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_SourceOfWealthRemarks);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_SourceOfWealthRemarks, sourceOfWealth, "Enter source Of Wealth Remarks ");
    }

    public static void relatedParty_Appointment(String appointment) throws InterruptedException {
        inputText(OptimusRelatedPartyCreatePage.relatedParty_Appointment, appointment, "Select appointment   = " + appointment);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_AppointmentOptions, appointment)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_AppointmentOptions, appointment)), "Choose appointment from dropdown options");
    }

    public static void relatedParty_Appointment_Update(String appointment) throws InterruptedException {
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.updateRelatedParty_Appointment);
        inputText(OptimusRelatedPartyCreatePage.updateRelatedParty_Appointment, appointment, "Select appointment   = " + appointment);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_AppointmentOptions, appointment)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_AppointmentOptions, appointment)), "Choose appointment from dropdown options");
    }

    public static void relatedParty_AppointmentAppointDate(String appointmentAppointDate) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_AppointmentAppointDate);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_AppointmentAppointDate);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_AppointmentAppointDate, appointmentAppointDate, "Enter Appointment Appoint Date ");
        pressEnter(OptimusRelatedPartyCreatePage.relatedParty_AppointmentAppointDate);
    }

    public static void relatedParty_AppointmentResignDate(String appointmentResignDate) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_AppointmentResignDate);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_AppointmentResignDate);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_AppointmentResignDate, appointmentResignDate, "Enter Appointment Resign Date ");
        pressEnter(OptimusRelatedPartyCreatePage.relatedParty_AppointmentResignDate);
    }

    public static void relatedParty_Alias(String alias) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_Alias);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_Alias);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_Alias, alias, "Enter Alias ");
    }

//    Company and Other Information
    public static void relatedParty_CompanyName(String companyName) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_CompanyName);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_CompanyName);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_CompanyName, companyName, "Enter company Name ");
    }

    public static void relatedParty_FormerRegisteredName(String formerRegisteredName) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_FormerRegisteredName);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_FormerRegisteredName);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_FormerRegisteredName, formerRegisteredName, "Enter Former Registered Name ");
    }

    public static void relatedParty_ClientType(String clientType) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_ClientType);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_ClientType, clientType, "Select client Type   = " + clientType);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_ClientTypeOptions, clientType)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_ClientTypeOptions, clientType)), "Choose client Type from dropdown options");
    }

    public static void relatedParty_ClientType_Update(String clientType) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.updateRelatedParty_ClientType);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.updateRelatedParty_ClientType);
        inputText(OptimusRelatedPartyCreatePage.updateRelatedParty_ClientType, clientType, "Select client Type   = " + clientType);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_ClientTypeOptions, clientType)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_ClientTypeOptions, clientType)), "Choose client Type from dropdown options");
    }

    public static void relatedParty_EntityType(String entityType) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_EntityType);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_EntityType, entityType, "Select Entity Type   = " + entityType);
        pressEnter(OptimusRelatedPartyCreatePage.relatedParty_EntityType);
    }

    public static void relatedParty_EntityType_Update(String entityType) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.updateRelatedParty_EntityType);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.updateRelatedParty_EntityType);
        inputText(OptimusRelatedPartyCreatePage.updateRelatedParty_EntityType, entityType, "Select Entity Type   = " + entityType);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_EntityTypeOptions, entityType)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_EntityTypeOptions, entityType)), "Choose entity Type from dropdown options");
    }

    public static void relatedParty_IdentificationNumber(String identificationNumber) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_IdentificationNumber);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_IdentificationNumber);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_IdentificationNumber, identificationNumber, "Enter Identification Number ");
    }

    public static void relatedParty_IdentificationType(String identificationType) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_IdentificationType);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_IdentificationType, identificationType, "Select identification Type   = " + identificationType);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_IdentificationTypeOptions, identificationType)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_IdentificationTypeOptions, identificationType)), "Choose identification Type from dropdown options");
    }

    public static void relatedParty_IdentificationType_Update(String identificationType) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.updateRelatedParty_IdentificationType);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.updateRelatedParty_IdentificationType);
        inputText(OptimusRelatedPartyCreatePage.updateRelatedParty_IdentificationType, identificationType, "Select identification Type   = " + identificationType);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_IdentificationTypeOptions, identificationType)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_IdentificationTypeOptions, identificationType)), "Choose identification Type from dropdown options");
    }

    public static void relatedParty_RegisteredAddress(String registeredAddress) throws InterruptedException {
        delay(2000);
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_RegisteredAddress);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_RegisteredAddress);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_RegisteredAddress, registeredAddress, "Enter registered Address ");
    }

    public static void relatedParty_CountryOfIncorporation(String countryOfIncorporation) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_CountryOfIncorporation);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_CountryOfIncorporation, countryOfIncorporation, "Select country Of Incorporation   = " + countryOfIncorporation);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_CountryOfIncorporationOptions, countryOfIncorporation)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_CountryOfIncorporationOptions, countryOfIncorporation)), "Choose country Of Incorporation from dropdown options");
    }

    public static void relatedParty_CountryOfIncorporation_Update(String countryOfIncorporation) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.updateRelatedParty_CountryOfIncorporation);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.updateRelatedParty_CountryOfIncorporation);
        inputText(OptimusRelatedPartyCreatePage.updateRelatedParty_CountryOfIncorporation, countryOfIncorporation, "Select Country Of Incorporation Options = " + countryOfIncorporation);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_CountryOfIncorporationOptions, countryOfIncorporation)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_CountryOfIncorporationOptions, countryOfIncorporation)), "Choose Country Of Incorporation Options from dropdown options");
    }


    public static void relatedParty_StateOfIncorporation(String stateOfIncorporation) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_StateOfIncorporation);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_StateOfIncorporation, stateOfIncorporation, "Select State Of Incorporation   = " + stateOfIncorporation);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_StateOfIncorporationOptions, stateOfIncorporation)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_StateOfIncorporationOptions, stateOfIncorporation)), "Choose State Of Incorporation from dropdown options");
    }

    public static void relatedParty_StateOfIncorporation_Update(String stateOfIncorporation) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.updateRelatedParty_StateOfIncorporation);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.updateRelatedParty_StateOfIncorporation);
        inputText(OptimusRelatedPartyCreatePage.updateRelatedParty_StateOfIncorporation, stateOfIncorporation, "Select State Of Incorporation Options = " + stateOfIncorporation);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_StateOfIncorporationOptions, stateOfIncorporation)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_StateOfIncorporationOptions, stateOfIncorporation)), "Choose State Of Incorporation Options from dropdown options");
    }

    public static void relatedParty_OperationAddress(String operationAddress) throws InterruptedException {
        delay(2000);
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_OperationAddress);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_OperationAddress);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_OperationAddress, operationAddress, "Enter operation Address ");
    }

    public static void relatedParty_CountryOfOperation(String countryOfOperation) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_CountryOfOperation);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_CountryOfOperation, countryOfOperation, "Select Country Of Operation   = " + countryOfOperation);
        pressEnter(OptimusRelatedPartyCreatePage.relatedParty_CountryOfOperation);
    }

    public static void relatedParty_CountryOfOperation_Update(String countryOfOperation) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.updateRelatedParty_CountryOfOperation);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.updateRelatedParty_CountryOfOperation);
        inputText(OptimusRelatedPartyCreatePage.updateRelatedParty_CountryOfOperation, countryOfOperation, "Select country Of Operation Options = " + countryOfOperation);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_CountryOfOperationOptions, countryOfOperation)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_CountryOfOperationOptions, countryOfOperation)), "Choose country Of Operation Options from dropdown options");
    }

    public static void relatedParty_OnboardingMode(String onboardingMode) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_OnboardingMode);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_OnboardingMode, onboardingMode, "Select onboarding Mode   = " + onboardingMode);
        pressEnter(OptimusRelatedPartyCreatePage.relatedParty_OnboardingMode);
   }

    public static void relatedParty_OnboardingMode_Update(String onboardingMode) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.updateRelatedParty_OnboardingMode);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.updateRelatedParty_OnboardingMode);
        inputText(OptimusRelatedPartyCreatePage.updateRelatedParty_OnboardingMode, onboardingMode, "Select onboarding Mode Options = " + onboardingMode);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_OnboardingModeOptions, onboardingMode)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_OnboardingModeOptions, onboardingMode)), "Choose onboarding Mode Options from dropdown options");
    }
    public static void relatedParty_PrimaryBusinessActivity(String primaryBusinessActivity) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_PrimaryBusinessActivity);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_PrimaryBusinessActivity, primaryBusinessActivity, "Select Primary Business Activity   = " + primaryBusinessActivity);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_PrimaryBusinessActivityOptions, primaryBusinessActivity)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_PrimaryBusinessActivityOptions, primaryBusinessActivity)), "Choose Primary Business Activity  from dropdown options");
    }

    public static void relatedParty_PrimaryBusinessActivity_Update(String primaryBusinessActivity) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.updateRelatedParty_PrimaryBusinessActivity);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.updateRelatedParty_PrimaryBusinessActivity);
        inputText(OptimusRelatedPartyCreatePage.updateRelatedParty_PrimaryBusinessActivity, primaryBusinessActivity, "Select Primary Business Activity Options = " + primaryBusinessActivity);
        waitForPresent(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_PrimaryBusinessActivityOptions, primaryBusinessActivity)));
        click(By.xpath(String.format(OptimusRelatedPartyCreatePage.relatedParty_PrimaryBusinessActivityOptions, primaryBusinessActivity)), "Choose Primary Business Activity Options from dropdown options");
    }

    public static void relatedParty_PrimaryBusinessActivityRemarks(String primaryBusinessActivityRemarks) throws InterruptedException {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_PrimaryBusinessActivityRemarks);
        clearInputUsingKeys(OptimusRelatedPartyCreatePage.relatedParty_PrimaryBusinessActivityRemarks);
        inputText(OptimusRelatedPartyCreatePage.relatedParty_PrimaryBusinessActivityRemarks, primaryBusinessActivityRemarks, "Enter primary Business Activity Remarks ");
    }

    public static void clickCreateRelatedPartyBtn() {
        waitForClickable(OptimusRelatedPartyCreatePage.relatedParty_CreateBtn);
        click(OptimusRelatedPartyCreatePage.relatedParty_CreateBtn, "Click Create button");
    }
    public static void clickDeleteRelatedPartyBtn() {
        waitForClickable(OptimusRelatedPartyCreatePage.updateRelatedParty_DeleteBtn);
        click(OptimusRelatedPartyCreatePage.updateRelatedParty_DeleteBtn, "Click Delete button");
        waitForVisible(OptimusCounterPartyUpdatePage.updateCounterPartyPage_DeleteCounterParty_YesBtn);
        click(OptimusCounterPartyUpdatePage.updateCounterPartyPage_DeleteCounterParty_YesBtn, "Click Yes to Confirm Delete");

    }
    public static void verifyEditLinkinRelatedPartySearchResult() throws InterruptedException {
        waitForVisible(OptimusCounterPartyListPage.relatedPartyList_EditLink);
    }
    public static void clickEditLinkinRelatedPartySearchResult() throws InterruptedException {
        waitForVisible(OptimusCounterPartyListPage.relatedPartyList_EditLink);
        click(OptimusCounterPartyListPage.relatedPartyList_EditLink, "Click Related Party Edit Link");
        delay(3000);
    }
    public static String getLastNameinRPList() {
        return getElementText(OptimusCounterPartyListPage.relatedPartyList_LastName);
    }
    public static void verifyFirstNameinListContains() {
        verifyTextContains(OptimusCounterPartyListPage.relatedPartyList_FirstName, "Fname TXA", "First Name in search result list Text contains Fname TXA");
    }
    public static void verifyLastNameinListContains() {
        verifyTextContains(OptimusCounterPartyListPage.relatedPartyList_LastName, "TXA", "First Name in search result list Text contains Fname TXA");
    }
}