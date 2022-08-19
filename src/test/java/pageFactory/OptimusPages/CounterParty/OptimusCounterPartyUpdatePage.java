package pageFactory.OptimusPages.CounterParty;

import org.openqa.selenium.By;

public class OptimusCounterPartyUpdatePage {

    //First Section
    public static By updateCounterPartyPage_cpRef = By.cssSelector("#update_counterparty_counterparty_ref");
    public static By updateCounterPartyPage_NitroClientID = By.cssSelector("#update_counterparty_nitro_client_id");
    //    Mandatory Field
    public static By updateCounterPartyPage_SalesForceID = By.id("update_counterparty_salesforce_id");
    public static By updateCounterPartyPage_ElwoodID = By.id("update_counterparty_elwood_id");
    public static By updateCounterPartyPage_NicknameExternal = By.id("update_counterparty_nickname_external");
    //    Mandatory Field
    public static By updateCounterPartyPage_NicknameInternal = By.id("update_counterparty_nickname_internal");
    public static By updateCounterPartyPage_ParentAccount_dropdown = By.id("update_counterparty_parent_account");
    public static String updateCounterPartyPage_ParentAccountOption = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";

    //Basic Information Details
    public static By updateCounterPartyPage_FirstName = By.id("update_counterparty_first_name");
    public static By updateCounterPartyPage_LastName = By.id("update_counterparty_last_name");
    public static By updateCounterPartyPage_Gender = By.id("update_counterparty_gender");
    public static By updateCounterPartyPage_Nationality = By.id("update_counterparty_nationality");
    public static By updateCounterPartyPage_DateOfBirth = By.id("update_counterparty_moment_of_birth");
    public static By updateCounterPartyPage_Occupation = By.id("update_counterparty_occupation");
    public static String updateCounterPartyPage_OccupationOption = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_CompanyOfEmployment = By.id("update_counterparty_company_of_employment");
    public static By updateCounterPartyPage_IndustryOfEmployement = By.id("update_counterparty_industry_of_employment");
    public static String updateCounterPartyPage_IndustryOfEmployementOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_IdentificationIssueDate = By.id("update_counterparty_identification_issue_moment");
    public static By updateCounterPartyPage_IdentificationIssueDate_OKBtn = By.xpath("//div[@class='ant-picker-footer']/ul/li[@class='ant-picker-ok']/button");
    public static By updateCounterPartyPage_IdentificationIssueDate_NowBtn = By.xpath("//div[@class='ant-picker-footer']/ul/li[@class='ant-picker-now']/a[@class='ant-picker-now-btn']");
    public static By updateCounterPartyPage_IdentificationExpiryDate = By.id("update_counterparty_identification_expiry_moment");
    public static By updateCounterPartyPage_IdentificationExpiryDate_OKBtn = By.cssSelector("div.ant-picker-panel div.ant-picker-footer > ul li.ant-picker-ok > button");
    public static By updateCounterPartyPage_IdentificationExpiryDate_NowBtn = By.xpath("//div[@class='ant-picker-footer']/ul/li[@class='ant-picker-now']/a[@class='ant-picker-now-btn']");
    public static By updateCounterPartyPage_MobileNumber = By.id("update_counterparty_mobile_number");
    public static By updateCounterPartyPage_PEPDeclaration = By.id("update_counterparty_pep_declaration");
    public static By updateCounterPartyPage_PEPDeclarationRemarks = By.id("update_counterparty_pep_declaration_remarks");
    public static By updateCounterPartyPage_Alias = By.id("update_counterparty_alias");
    //    Mandatory Field
    public static By updateCounterPartyPage_Tin1 = By.id("update_counterparty_tin_1");
    public static By updateCounterPartyPage_Tin2 = By.id("update_counterparty_tin_2");
    public static By updateCounterPartyPage_Tin3 = By.id("update_counterparty_tin_3");

    //Company and Other Information
    public static By updateCounterPartyPage_CompanyName = By.id("update_counterparty_company_name");
    public static By updateCounterPartyPage_FormerRegisteredName = By.id("update_counterparty_former_registered_name");
    //    Mandatory Field
    public static By updateCounterPartyPage_ClientType = By.id("update_counterparty_client_type");
    public static String updateCounterPartyPage_ClientTypeOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    //    Mandatory Field
    public static By updateCounterPartyPage_EntityType = By.id("update_counterparty_entity_type");
    public static String updateCounterPartyPage_EntityTypeOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_IdentificationNumber = By.id("update_counterparty_identification_number");
    public static By updateCounterPartyPage_IdentificationType = By.id("update_counterparty_identification_type");
    public static String updateCounterPartyPage_IdentificationTypeOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_RegisteredAddress = By.id("update_counterparty_registered_address");
    public static By updateCounterPartyPage_CountryOfIncorporation = By.id("update_counterparty_country_of_incorporation");
    public static String updateCounterPartyPage_CountryOfIncorporationOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_StateOfIncorporation = By.id("update_counterparty_state_of_incorporation");
    public static String updateCounterPartyPage_StateOfIncorporationOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_OperatingAddress = By.id("update_counterparty_operating_address");
    public static By updateCounterPartyPage_CountryOfOperation = By.id("update_counterparty_country_of_operation");
    public static String updateCounterPartyPage_CountryOfOperationOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_OnboardingMode = By.id("update_counterparty_onboarding_mode");
    public static String updateCounterPartyPage_OnboardingModeOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_PrimaryBusinessActivity = By.id("update_counterparty_primary_business_activity");
    public static String updateCounterPartyPage_PrimaryBusinessActivityOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_PrimaryBusinessActivityRemarks = By.id("update_counterparty_primary_business_activity_remarks");
    public static By updateCounterPartyPage_CorporateWebsite = By.id("update_counterparty_corporate_website");
    public static By updateCounterPartyPage_GSTRegistered = By.id("update_counterparty_gst_registered");
    public static By updateCounterPartyPage_FinancialInstitution = By.id("update_counterparty_financial_institution");
    public static By updateCounterPartyPage_PaymentServiceProvider = By.id("update_counterparty_payment_service_provider");
    public static By updateCounterPartyPage_SourceOfFunds = By.id("update_counterparty_source_of_funds");
    public static String updateCounterPartyPage_SourceOfFundsOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_SourceOfFundsRemarks = By.id("update_counterparty_source_of_funds_remarks");
    public static By updateCounterPartyPage_AuthorizedPerson = By.id("update_counterparty_authorized_person");
    public static By updateCounterPartyPage_AuthorizedPersonMobile = By.id("update_counterparty_authorized_person_mobile");
    public static By updateCounterPartyPage_AuthorizedPersonEmail = By.id("update_counterparty_authorized_person_email");
    public static By updateCounterPartyPage_BusinessPurposeForRelationship = By.id("update_counterparty_business_purpose_for_relationship");
    public static By updateCounterPartyPage_AppointmentOthers = By.id("update_counterparty_appointment_others");

    //Additional Information
    public static By updateCounterPartyPage_GroupAssociation = By.id("update_counterparty_group_association");
    public static By updateCounterPartyPage_OnboardedDate = By.id("update_counterparty_onboarded_moment");
    public static By updateCounterPartyPage_ClientTier = By.id("update_counterparty_client_tier");
    public static String updateCounterPartyPage_ClientTierOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_KYCRefreshDate = By.id("update_counterparty_kyc_refreshed_moment");
    public static By updateCounterPartyPage_ClientTierRemarks = By.id("update_counterparty_client_tier_remarks");
    public static By updateCounterPartyPage_RiskScore = By.id("update_counterparty_risk_score");
    public static String updateCounterPartyPage_RiskScoreOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_RiskScoreRemarks = By.id("update_counterparty_risk_score_remarks");
    public static By updateCounterPartyPage_ExecutionFeeRate = By.id("update_counterparty_execution_fee_rate");
    public static By updateCounterPartyPage_ReferralPersonInternal = By.id("update_counterparty_referral_person_id");
    public static String updateCounterPartyPage_ReferralPersonInternalOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_ReferralPersonExternal = By.id("update_counterparty_referral_person_external");
    public static By updateCounterPartyPage_ReferralExternalRebate = By.id("update_counterparty_referral_external_rebate");
    public static By updateCounterPartyPage_FaceVerificationStatus = By.id("update_counterparty_face_to_face_verification_status");
    public static String updateCounterPartyPage_FaceVerificationStatusOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_FaceVerificationRemarks = By.id("update_counterparty_face_to_face_verification_remarks");
    public static By updateCounterPartyPage_VouchedStatus = By.id("update_counterparty_vouched_status");
    public static String updateCounterPartyPage_VouchedStatusOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_VouchedByPerson = By.id("update_counterparty_vouched_by_person_id");
    public static String updateCounterPartyPage_VouchedByPersonOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_VouchedRemarks = By.id("update_counterparty_vouched_remarks");
    public static By updateCounterPartyPage_ManagementRemarks = By.id("update_counterparty_management_remarks");
    public static By updateCounterPartyPage_CounterpartyStatus = By.id("update_counterparty_counterparty_status");
    public static String updateCounterPartyPage_CounterpartyStatusOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By updateCounterPartyPage_CounterpartyRemarks = By.id("update_counterparty_counterparty_remarks");

    //Operations
    public static By updateCounterPartyPage_updateCounterpartyBtn = By.xpath("//button[@type='submit']");
    //Reset Button -- button[@type='button']/span[contains(text(),'Reset Form')]
    public static By updateCounterPartyPage_ResetFormBtn = By.xpath("//button[@type='button' and @class='ant-btn ant-btn-block']");
    public static By updateCounterPartyPage_DeleteCounterPartyBtn = By.xpath("//button[@type='button' and @class='ant-btn ant-btn-danger ant-btn-block']//span[contains(text(),'Delete Counterparty')]");
    public static By updateCounterPartyPage_DeleteCounterParty_YesBtn = By.xpath("//div[@class='ant-popover-inner-content']/div[@class='ant-popover-buttons']/button[2]");
    public static By updateCounterPartyPage_DeleteCounterParty_NoBtn = By.xpath("//div[@class='ant-popover-inner-content']/div[@class='ant-popover-buttons']/button[1]");


}
