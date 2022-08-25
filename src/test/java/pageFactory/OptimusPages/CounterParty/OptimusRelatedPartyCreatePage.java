package pageFactory.OptimusPages.CounterParty;

import org.openqa.selenium.By;

public class OptimusRelatedPartyCreatePage {
    public static By relatedParty_Page = By.cssSelector("div#rc-tabs-1-tab-item_1.ant-tabs-tab-btn");
    public static By relatedParty_RelatedPartyRef = By.xpath("//input[@placeholder='related_party_ref']");
    public static By relatedParty_Counterparty = By.id("create_related_party_counterparty_id");
    public static By updateRelatedParty_Counterparty = By.id("update_related_party_counterparty_id");
    public static String relatedParty_CounterpartyOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    //Basic Information
    public static By relatedParty_FirstName = By.xpath("//input[@placeholder='first_name']");
    public static By relatedParty_LastName = By.xpath("//input[@placeholder='last_name']");
    public static By relatedParty_Gender = By.xpath("//input[@placeholder='gender']");
    public static By relatedParty_Nationality = By.xpath("//input[@placeholder='nationality']");
    public static By relatedParty_DateOfBirth = By.xpath("//input[@placeholder='moment_of_birth']");
    public static By relatedParty_IdentificationIssueDate = By.xpath("//input[@placeholder='identification_issue_moment']");
    public static By relatedParty_IdentificationExpiryDate = By.xpath("//input[@placeholder='identification_expiry_moment']");
    public static By relatedParty_MobileNumber = By.xpath("//input[@placeholder='mobile_number']");
    public static By relatedParty_EmailAddress = By.xpath("//input[@placeholder='email_address']");
    public static By relatedParty_SourceOfFunds = By.id("create_related_party_source_of_funds");
    public static By updateRelatedParty_SourceOfFunds = By.id("update_related_party_source_of_funds");
    public static String relatedParty_SourceOfFundsOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By relatedParty_SourceOfFundsRemarks = By.xpath("//textarea[@placeholder='source_of_funds_remarks']");
    public static By relatedParty_PEP = By.id("create_related_party_pep_declaration");
    public static By updateRelatedParty_PEP = By.id("update_related_party_pep_declaration");
    public static By relatedParty_UltimateShareholding = By.xpath("//input[@placeholder='shareholding']");
    public static By relatedParty_SourceOfWealth = By.id("create_related_party_source_of_wealth");
    public static By updateRelatedParty_SourceOfWealth = By.id("update_related_party_source_of_wealth");
    public static String relatedParty_SourceOfWealthOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By relatedParty_SourceOfWealthRemarks = By.xpath("//textarea[@placeholder='source_of_wealth_remarks']");
    public static By relatedParty_Appointment = By.id("create_related_party_appointment");
    public static By updateRelatedParty_Appointment = By.id("update_related_party_appointment");
    public static String relatedParty_AppointmentOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By relatedParty_AppointmentAppointDate = By.xpath("//input[@placeholder='appointment_appoint_moment']");
    public static By relatedParty_AppointmentResignDate = By.xpath("//input[@placeholder='appointment_resign_moment']");
    public static By relatedParty_Alias = By.xpath("//input[@placeholder='alias']");
    //Company and Other Information
    public static By relatedParty_CompanyName = By.xpath("//input[@placeholder='company_name']");
    public static By relatedParty_FormerRegisteredName = By.xpath("//input[@placeholder='former_registered_name']");
    public static By relatedParty_ClientType = By.id("create_related_party_client_type");
    public static By updateRelatedParty_ClientType = By.id("update_related_party_client_type");
    public static String relatedParty_ClientTypeOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By relatedParty_EntityType = By.id("create_related_party_entity_type");
    public static By updateRelatedParty_EntityType = By.id("update_related_party_entity_type");
    public static String relatedParty_EntityTypeOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By relatedParty_IdentificationNumber = By.xpath("//input[@placeholder='identification_number']");
    public static By relatedParty_IdentificationType = By.id("create_related_party_identification_type");
    public static By updateRelatedParty_IdentificationType = By.id("update_related_party_identification_type");
    public static String relatedParty_IdentificationTypeOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By relatedParty_RegisteredAddress = By.xpath("//textarea[@placeholder='registered_address']");
    public static By relatedParty_CountryOfIncorporation = By.id("create_related_party_country_of_incorporation");
    public static By updateRelatedParty_CountryOfIncorporation = By.id("update_related_party_country_of_incorporation");
    public static String relatedParty_CountryOfIncorporationOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By relatedParty_StateOfIncorporation = By.id("create_related_party_state_of_incorporation");
    public static By updateRelatedParty_StateOfIncorporation = By.id("update_related_party_state_of_incorporation");
    public static String relatedParty_StateOfIncorporationOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By relatedParty_OperationAddress = By.xpath("//input[@placeholder='operating_address']");
    public static By relatedParty_CountryOfOperation = By.id("create_related_party_country_of_operation");
    public static By updateRelatedParty_CountryOfOperation = By.id("update_related_party_country_of_operation");
    public static String relatedParty_CountryOfOperationOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By relatedParty_OnboardingMode = By.id("create_related_party_onboarding_mode");
    public static By updateRelatedParty_OnboardingMode = By.id("update_related_party_onboarding_mode");
    public static String relatedParty_OnboardingModeOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By relatedParty_PrimaryBusinessActivity = By.id("create_related_party_primary_business_activity");
    public static By updateRelatedParty_PrimaryBusinessActivity = By.id("update_related_party_primary_business_activity");
    public static String relatedParty_PrimaryBusinessActivityOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By relatedParty_PrimaryBusinessActivityRemarks = By.xpath("//textarea[@placeholder='primary_business_activity_remarks']");

    //Actions
    public static By relatedParty_CreateBtn = By.xpath("//button[@type='submit']");
    public static By relatedParty_ResetBtn = By.xpath("//button[@type='button']/span[contains(text(),'Reset')]");
    public static By updateRelatedParty_DeleteBtn = By.cssSelector("button.ant-btn.ant-btn-danger.ant-btn-block");




}
