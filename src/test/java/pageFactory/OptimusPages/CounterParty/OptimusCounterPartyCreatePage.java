package pageFactory.OptimusPages.CounterParty;

import org.openqa.selenium.By;

public class OptimusCounterPartyCreatePage {

    public static By counterParty_NewCounterPartyTab = By.cssSelector(".ant-tabs-nav-list .ant-tabs-tab>div#rc-tabs-0-tab-item_1");

    public static By newCounterPartyPage_Ref = By.cssSelector("#create_counterparty_counterparty_ref");
    public static By newCounterPartyPage_NitroClientID = By.cssSelector("#create_counterparty_nitro_client_id");
//    Mandatory Field
    public static By newCounterPartyPage_SalesForceID = By.id("create_counterparty_salesforce_id");
    public static By newCounterPartyPage_ElwoodID = By.id("create_counterparty_elwood_id");
    public static By newCounterPartyPage_NicknameExternal = By.id("create_counterparty_nickname_external");
//    Mandatory Field
    public static By newCounterPartyPage_NicknameInternal = By.id("create_counterparty_nickname_internal");
    public static By newCounterPartyPage_ParentAccount_dropdown = By.id("create_counterparty_parent_account");
    public static By newCounterPartyPage_ParentAccountOption = By.xpath("");

    //Basic Information Details
    public static By newCounterPartyPage_FirstName = By.id("create_counterparty_first_name");
    public static By newCounterPartyPage_LastName = By.id("create_counterparty_last_name");
    public static By newCounterPartyPage_Gender = By.id("create_counterparty_gender");
    public static By newCounterPartyPage_Nationality = By.id("create_counterparty_nationality");
    public static By newCounterPartyPage_DateOfBirth = By.id("moment_of_birth");
    public static By newCounterPartyPage_Occupation = By.id("create_counterparty_occupation");
    public static By newCounterPartyPage_OccupationOption = By.xpath("");
    public static By newCounterPartyPage_CompanyOfEmployment = By.id("create_counterparty_company_of_employment");
    public static By newCounterPartyPage_IndustryOfEmployement = By.id("create_counterparty_industry_of_employment");
    public static By newCounterPartyPage_IndustryOfEmployementOptions = By.xpath("");
    public static By newCounterPartyPage_IdentificationIssueDate = By.id("create_counterparty_identification_issue_moment");
    public static By newCounterPartyPage_IdentificationExpiryDate = By.id("create_counterparty_identification_expiry_moment");
    public static By newCounterPartyPage_MobileNumber = By.id("create_counterparty_mobile_number");
    public static By newCounterPartyPage_PEPDeclaration = By.xpath("//button[@id='create_counterparty_pep_declaration']/span/div");
    public static By newCounterPartyPage_PEPDeclarationRemarks = By.id("create_counterparty_pep_declaration_remarks");
    public static By newCounterPartyPage_Alias = By.id("create_counterparty_alias");
//    Mandatory Field
    public static By newCounterPartyPage_Tin1 = By.id("create_counterparty_tin_1");
    public static By newCounterPartyPage_Tin2 = By.id("create_counterparty_tin_2");
    public static By newCounterPartyPage_Tin3 = By.id("create_counterparty_tin_3");

    //Company and Other Information
    public static By newCounterPartyPage_CompanyName = By.id("create_counterparty_company_name");
    public static By newCounterPartyPage_FormerRegisteredName = By.id("create_counterparty_former_registered_name");
//    Mandatory Field
    public static By newCounterPartyPage_ClientType = By.id("create_counterparty_client_type");
    public static By newCounterPartyPage_ClientTypeOptions = By.id("");
//    Mandatory Field
    public static By newCounterPartyPage_EntityType = By.id("create_counterparty_entity_type");
    public static By newCounterPartyPage_EntityTypeOptions = By.id("");
    public static By newCounterPartyPage_IdentificationNumber = By.id("create_counterparty_identification_number");
    public static By newCounterPartyPage_IdentificationType = By.id("create_counterparty_identification_type");
    public static By newCounterPartyPage_IdentificationTypeOptions = By.id("");
//    Mandatory Field
    public static By newCounterPartyPage_RegisteredAddress = By.id("create_counterparty_registered_address");
    public static By newCounterPartyPage_CountryOfIncorporation = By.id("create_counterparty_country_of_incorporation");
    public static By newCounterPartyPage_CountryOfIncorporationOptions = By.id("");
    public static By newCounterPartyPage_StateOfIncorporation = By.id("create_counterparty_state_of_incorporation");
    public static By newCounterPartyPage_StateOfIncorporationOptions = By.id("");
    public static By newCounterPartyPage_OperatingAddress = By.id("create_counterparty_operating_address");
    public static By newCounterPartyPage_CountryOfOperation = By.id("create_counterparty_country_of_operation");
    public static By newCounterPartyPage_CountryOfOperationOptions = By.id("");
    public static By newCounterPartyPage_OnboardingMode = By.id("create_counterparty_onboarding_mode");
    public static By newCounterPartyPage_OnboardingModeOptions = By.id("");
    public static By newCounterPartyPage_PrimaryBusinessActivity = By.id("create_counterparty_primary_business_activity");
    public static By newCounterPartyPage_PrimaryBusinessActivityOptions = By.id("");
    public static By newCounterPartyPage_PrimaryBusinessActivityRemarks = By.id("create_counterparty_primary_business_activity_remarks");
    public static By newCounterPartyPage_CorporateWebsite = By.id("create_counterparty_corporate_website");
    public static By newCounterPartyPage_GSTRegistered = By.xpath("//button[@id='create_counterparty_gst_registered']/span/div");
    public static By newCounterPartyPage_FinancialInstitution = By.xpath("//button[@id='create_counterparty_financial_institution']/span/div");
    public static By newCounterPartyPage_PaymentServiceProvider = By.xpath("//button[@id='create_counterparty_payment_service_provider']/span/div");
    public static By newCounterPartyPage_SourceOfFunds = By.id("create_counterparty_source_of_funds");
    public static By newCounterPartyPage_SourceOfFundsOptions = By.id("");
    public static By newCounterPartyPage_SourceOfFundsRemarks = By.id("create_counterparty_source_of_funds_remarks");
    public static By newCounterPartyPage_AuthorizedPerson = By.id("create_counterparty_authorized_person");
    public static By newCounterPartyPage_AuthorizedPersonMobile = By.id("create_counterparty_authorized_person_mobile");
//    Mandatory Field
    public static By newCounterPartyPage_AuthorizedPersonEmail = By.id("create_counterparty_authorized_person_email");
    public static By newCounterPartyPage_BusinessPurposeForRelationship = By.id("create_counterparty_business_purpose_for_relationship");
    public static By newCounterPartyPage_AppointmentOthers = By.id("create_counterparty_appointment_others");

//Additional Information
    public static By newCounterPartyPage_GroupAssociation = By.id("create_counterparty_group_association");
    public static By newCounterPartyPage_OnboardedDate = By.id("create_counterparty_onboarded_moment");
    public static By newCounterPartyPage_ClientTier = By.id("create_counterparty_client_tier");
    public static By newCounterPartyPage_ClientTierOptions = By.id("");
    public static By newCounterPartyPage_KYCRefreshDate = By.id("create_counterparty_kyc_refreshed_moment");
    public static By newCounterPartyPage_ClientTierRemarks = By.id("create_counterparty_client_tier_remarks");
    public static By newCounterPartyPage_RiskScore = By.id("create_counterparty_risk_score");
    public static By newCounterPartyPage_RiskScoreOptions = By.id("");
    public static By newCounterPartyPage_RiskScoreRemarks = By.id("create_counterparty_risk_score_remarks");
    public static By newCounterPartyPage_ExecutionFeeRate = By.id("create_counterparty_execution_fee_rate");
    public static By newCounterPartyPage_ReferralPersonInternal = By.id("create_counterparty_referral_person_id");
    public static By newCounterPartyPage_ReferralPersonInternalOptions = By.id("");
    public static By newCounterPartyPage_ReferralPersonExternal = By.id("create_counterparty_referral_person_external");
    public static By newCounterPartyPage_ReferralExternalRebate = By.id("create_counterparty_referral_external_rebate");
    public static By newCounterPartyPage_FaceVerificationStatus = By.id("create_counterparty_face_to_face_verification_status");
    public static By newCounterPartyPage_FaceVerificationStatusOptions = By.id("");
    public static By newCounterPartyPage_FaceVerificationRemarks = By.id("create_counterparty_face_to_face_verification_remarks");
    public static By newCounterPartyPage_VouchedStatus = By.id("create_counterparty_vouched_status");
    public static By newCounterPartyPage_VouchedStatusOptions = By.id("");
    public static By newCounterPartyPage_VouchedByPerson = By.id("create_counterparty_vouched_by_person_id");
    public static By newCounterPartyPage_VouchedByPersonOptions = By.id("");
    public static By newCounterPartyPage_VouchedRemarks = By.id("create_counterparty_vouched_remarks");
    public static By newCounterPartyPage_ManagementRemarks = By.id("create_counterparty_management_remarks");
    public static By newCounterPartyPage_CounterpartyStatus = By.id("create_counterparty_counterparty_status");
    public static By newCounterPartyPage_CounterpartyStatusOptions = By.id("");
    public static By newCounterPartyPage_CounterpartyRemarks = By.id("create_counterparty_counterparty_remarks");

//Operation
    public static By newCounterPartyPage_CreateCounterpartyBtn = By.xpath("//button[@type='submit']");
    public static By newCounterPartyPage_ResetFormBtn = By.xpath("//button[@type='button' and @class='ant-btn ant-btn-block']");


}
