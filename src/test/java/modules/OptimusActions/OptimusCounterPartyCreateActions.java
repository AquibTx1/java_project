package modules.OptimusActions;

import modules.XAlphaActions.XAlphaLoginActions;
import org.openqa.selenium.By;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyCreatePage;
import pageFactory.XAlphaPages.XAlphaDealInputPage;
import utilities.KeywordUtil;

public class OptimusCounterPartyCreateActions extends KeywordUtil {

    static Class thisClass = OptimusCounterPartyCreateActions.class;

    public static void waitForCounterPartyCreatePageLoad()  { waitForVisible(OptimusCounterPartyCreatePage.newCounterPartyPage_NitroClientID); }
//    public static void validateCounterPartyRefData() {  }


//Mandatory fields actions
    public static void createCP_SalesForceId(String SalesForceId)  {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_SalesForceID, SalesForceId, "Enter Sales Force ID"  );
    }
    public static void createCP_NicknameInternal(String NicknameInternal) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_NicknameInternal, NicknameInternal, "Enter Nickname Internal"  );
    }
    public static void createCP_TIN1(String Tin1) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Tin1, Tin1, "Enter Tin1 value"  );
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
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_RegisteredAddress, RegisteredAddress, "Enter Registered Address"  );
    }
    public static void createCP_AuthorizedPersonEmail(String AuthorizedPersonEmail) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_AuthorizedPersonEmail, AuthorizedPersonEmail, "Enter Authorized Person Email"  );
    }

//Optional fields actions
    public static void createCP_NitroClientID(String NitroClientID) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_NitroClientID, NitroClientID, "Enter NitroClient ID"  );
    }
    public static void createCP_ElwoodID(String ElwoodID) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ElwoodID, ElwoodID, "Enter Elwood ID"  );
    }
    public static void createCP_NicknameExternal(String NicknameExternal) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_NicknameExternal, NicknameExternal, "Enter Nickname External"  );
    }
    public static void createCP_ParentAccount(String ParentAccount) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_ParentAccount_dropdown, ParentAccount, "Select Parent Account=" + ParentAccount);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_ParentAccountOption);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_ParentAccountOption, "Choose Parent Account from dropdown options");
    }

//Basic Details - Optional Fields
    public static void createCP_FirstName(String FirstName) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_FirstName,FirstName,"Enter First name for Create CP");
    }
    public static void createCP_LastName(String LastName) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_LastName,LastName,"Enter Last name for Create CP");
    }
    public static void createCP_Gender(String Gender) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Gender,Gender,"Enter Gender for Create CP");
    }
    public static void createCP_Nationality(String Nationality) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Nationality, Nationality,"Enter Nationality for Create CP");
    }
    public static void createCP_DateOfBirth(String DateOfBirth) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_DateOfBirth, DateOfBirth,"Enter Date Of Birth for Create CP");
    }
    public static void createCP_Occupation(String Occupation) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Occupation, Occupation, "Select Occupation= " + Occupation);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_OccupationOption);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_OccupationOption, "Choose Occupation from dropdown options");
    }
    public static void createCP_CompanyOfEmployment(String CompanyOfEmployment) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_CompanyOfEmployment, CompanyOfEmployment,"Enter CompanyOfEmployment for Create CP");
    }
    public static void createCP_IndustryOfEmployment(String IndustryOfEmployment) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_IndustryOfEmployement, IndustryOfEmployment, "Select Industry Of Employment= " + IndustryOfEmployment);
        waitForPresent(OptimusCounterPartyCreatePage.newCounterPartyPage_IndustryOfEmployementOptions);
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_IndustryOfEmployementOptions, "Choose Industry Of Employment from dropdown options");
    }
    public static void createCP_IdentificationIssueDate(String IdentificationIssueDate) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationIssueDate, IdentificationIssueDate,"Enter Identification Issue Date for Create CP");
    }
    public static void createCP_IdentificationExpiryDate(String IdentificationExpiryDate) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationExpiryDate, IdentificationExpiryDate,"Enter Identification Expiry Date for Create CP");
    }
    public static void createCP_MobileNumber(String MobileNumber) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_MobileNumber, MobileNumber,"Enter MobileNumber for Create CP");
    }

    public static void createCP_PEPDeclarationToggle() {
        click(OptimusCounterPartyCreatePage.newCounterPartyPage_PEPDeclaration,"Toggle PEP Declaration");
    }
    public static void createCP_PEPDeclarationRemarks(String PEPDeclarationRemarks) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_PEPDeclarationRemarks, PEPDeclarationRemarks,"Enter PEP Declaration Remarks for Create CP");
    }
    public static void createCP_Alias(String Alias) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Alias, Alias,"Enter Alias for Create CP");
    }
    public static void createCP_TIN2(String Tin2) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Tin2, Tin2, "Enter Tin2 value"  );
    }
    public static void createCP_TIN3(String Tin3) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_Tin3, Tin3, "Enter Tin3 value"  );
    }

// Company and Other Information - Optional fields
public static void createCP_CompanyName(String CompanyName) {
    inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_CompanyName, CompanyName, "Enter CompanyName value"  );
}
    public static void createCP_FormerRegisteredName(String FormerRegisteredName) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_FormerRegisteredName, FormerRegisteredName, "Enter Former Registered Name value"  );
    }
    public static void createCP_IdentificationNumber(String IdentificationNumber) {
        inputText(OptimusCounterPartyCreatePage.newCounterPartyPage_IdentificationNumber, IdentificationNumber, "Enter Identification Number value"  );
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











    //operations Buttons Clicks
    public static void clickCreateCounterPartyBtn() { click(OptimusCounterPartyCreatePage.newCounterPartyPage_CreateCounterpartyBtn, "Click Create Counterparty button"); }
    public static void clickResetCounterPartyFormBtn() { click(OptimusCounterPartyCreatePage.newCounterPartyPage_ResetFormBtn, "Click Reset Form button"); }





}
