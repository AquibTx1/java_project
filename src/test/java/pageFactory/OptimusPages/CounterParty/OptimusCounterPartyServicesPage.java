package pageFactory.OptimusPages.CounterParty;

import org.openqa.selenium.By;

public class OptimusCounterPartyServicesPage {
    public static By ServicesCp_CreatePage = By.xpath("//div[@class='ant-tabs-nav-list']/div[2]/div/span");
    public static By servicesCp_ListPage = By.xpath("//div[@class='ant-tabs-nav-list']/div/div[contains(text(),'Service List')]");
    public static By servicesCP_FeeRate_ListPage = By.xpath("//tbody/tr[2]/td[9]");
    public static By servicesCP_ServiceName_ListPage = By.xpath("//tbody/tr[2]/td[6]");
    public static By ServiceCp_Reference = By.xpath("//input[@placeholder='service_ref']");
    public static By ServiceCp_CpRefID = By.id("create_service_counterparty_id");
    public static By ServiceCp_CpRefID_Update = By.id("update_service_counterparty_id");
    public static String ServiceCp_CpRefIDOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    //    Basic Information
    public static By serviceCp_BusinessUnit = By.id("create_service_business_unit");
    public static By serviceCp_BusinessUnit_Update = By.id("update_service_business_unit");
    public static String serviceCp_BusinessUnitOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By serviceCp_ServiceName = By.xpath("//input[@placeholder='service_name']");
    public static By serviceCp_ServiceType = By.id("create_service_service_type");
    public static By serviceCp_ServiceType_Update = By.id("update_service_service_type");
    public static String serviceCp_ServiceTypeOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By serviceCp_ServiceTier = By.id("create_service_service_tier");
    public static By serviceCp_ServiceTier_Update = By.id("update_service_service_tier");
    public static String serviceCp_ServiceTierOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";

    public static By serviceCp_FeeRate = By.xpath("//input[@placeholder='fee_rate']");
    public static By serviceCp_FeeType = By.id("create_service_fee_type");
    public static By serviceCp_FeeType_Update = By.id("update_service_fee_type");
    public static String serviceCp_FeeTypeOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";

    public static By serviceCp_ChargeRate = By.xpath("//input[@placeholder='charge_rate']");
    public static By serviceCp_ChargeType = By.id("create_service_charge_type");
    public static By serviceCp_ChargeType_Update = By.id("update_service_charge_type");
    public static String serviceCp_ChargeTypeOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";

    public static By serviceCp_ServiceEntity = By.id("create_service_service_entity");
    public static By serviceCp_ServiceEntity_Update = By.id("update_service_service_entity");
    public static String serviceCp_ServiceEntityOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";

    public static By serviceCp_ServiceStatus = By.id("create_service_service_status");
    public static By serviceCp_ServiceStatus_Update = By.id("update_service_service_status");
    public static String serviceCp_ServiceStatusOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";

    public static By serviceCp_ServiceSignerName = By.xpath("//input[@placeholder='service_signer_name']");
    public static By serviceCp_ServiceStartDate = By.id("create_service_service_start_moment");
    public static By serviceCp_ServiceStartDate_Update = By.id("update_service_service_start_moment");
    public static By serviceCp_ServiceEndDate = By.id("create_service_service_end_moment");
    public static By serviceCp_ServiceEndDate_Update = By.id("update_service_service_end_moment");
    public static By serviceCp_ServiceContactPerson = By.xpath("//input[@placeholder='service_contact_person']");
    public static By serviceCp_ServiceContactPersonEmail = By.xpath("//input[@placeholder='service_contact_person_email']");
    public static By serviceCp_ServiceContactPersonMobile = By.xpath("//input[@placeholder='service_contact_person_mobile']");
    public static By serviceCp_ExpectedTradingVolume = By.xpath("//input[@placeholder='expected_trading_volume']");

    //Mining Information
    public static By serviceCp_MiningServiceTransferFee = By.xpath("//input[@placeholder='mining_service_transfer_fee']");
    public static By serviceCp_MiningServiceHashrate = By.xpath("//input[@placeholder='mining_service_hashrate']");
    public static By serviceCp_MiningServicePower = By.xpath("//input[@placeholder='mining_service_power']");
    public static By serviceCp_MiningServicePowerCharge = By.xpath("//input[@placeholder='mining_service_power_charge']");

    //Additional Information
    public static By serviceCp_ReferralPerson = By.id("create_service_referral_person_id");
    public static By serviceCp_ReferralPerson_Update = By.id("update_service_referral_person_id");
    public static String serviceCp_ReferralPersonOptions = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";

    public static By serviceCp_ServiceRemarks = By.xpath("//textarea[@placeholder='service_remarks']");
    //    Actions
    public static By serviceCp_CreateBtn = By.xpath("//button[@type='submit']");
    public static By serviceCp_DeleteBtn = By.xpath("//button[@type='button']/span[contains(text(),'Delete Service')]");

}
