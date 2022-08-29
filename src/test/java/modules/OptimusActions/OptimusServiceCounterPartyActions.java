package modules.OptimusActions;

import org.openqa.selenium.By;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyMainPage;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyServicesPage;
import pageFactory.OptimusPages.CounterParty.OptimusRelatedPartyCreatePage;

import static utilities.KeywordUtil.*;

public class OptimusServiceCounterPartyActions {

    static Class<OptimusServiceCounterPartyActions> thisClass = OptimusServiceCounterPartyActions.class;

    public static void clickMainServiceTab() {
        waitForClickable(OptimusCounterPartyMainPage.counterPartyMain_Services);
        click(OptimusCounterPartyMainPage.counterPartyMain_Services, "Click Main Services tab in side panel");
    }

    public static void clickServicesCreateTab() {
        waitForClickable(OptimusCounterPartyServicesPage.ServicesCp_CreatePage);
        click(OptimusCounterPartyServicesPage.ServicesCp_CreatePage, "Click Create New Service tab");
        waitForVisible(OptimusCounterPartyServicesPage.ServiceCp_Reference);
        waitForClickable(OptimusCounterPartyServicesPage.ServiceCp_CpRefID);
    }

    public static void clickServicesListTab() {
        waitForClickable(OptimusCounterPartyServicesPage.servicesCp_ListPage);
        click(OptimusCounterPartyServicesPage.servicesCp_ListPage, "Click Service List tab");
    }

    public static String getFeeRateFromResultList() {
        waitForVisible((OptimusCounterPartyServicesPage.servicesCP_FeeRate_ListPage));
        return getElementText(OptimusCounterPartyServicesPage.servicesCP_FeeRate_ListPage);
    }

    public static String getServiceNameFromResultList() {
        waitForVisible((OptimusCounterPartyServicesPage.servicesCP_ServiceName_ListPage));
        return getElementText(OptimusCounterPartyServicesPage.servicesCP_ServiceName_ListPage);
    }

    public static String service_GetServiceReferenceID() {
        waitForVisible(OptimusCounterPartyServicesPage.ServiceCp_Reference);
        return getElementValueWithVisibility(OptimusCounterPartyServicesPage.ServiceCp_Reference);
    }


    public static void service_CounterpartyID(String counterpartyID) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.ServiceCp_CpRefID);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.ServiceCp_CpRefID);
        inputText(OptimusCounterPartyServicesPage.ServiceCp_CpRefID, counterpartyID, "Select counterparty ID  = " + counterpartyID);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.ServiceCp_CpRefIDOptions, counterpartyID)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.ServiceCp_CpRefIDOptions, counterpartyID)), "Choose counterparty ID from dropdown options");
    }

    public static void service_CounterpartyID_Update(String counterpartyID) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.ServiceCp_CpRefID_Update);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.ServiceCp_CpRefID_Update);
        inputText(OptimusCounterPartyServicesPage.ServiceCp_CpRefID_Update, counterpartyID, "Select counterparty ID  = " + counterpartyID);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.ServiceCp_CpRefIDOptions, counterpartyID)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.ServiceCp_CpRefIDOptions, counterpartyID)), "Choose counterparty ID from dropdown options");
    }

    public static void service_BusinessUnit(String businessUnit) throws InterruptedException  {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_BusinessUnit);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_BusinessUnit);
        inputText(OptimusCounterPartyServicesPage.serviceCp_BusinessUnit, businessUnit, "Select businessUnit  = " + businessUnit);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_BusinessUnitOptions, businessUnit)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_BusinessUnitOptions, businessUnit)), "Choose businessUnit from dropdown options");
    }

    public static void service_BusinessUnit_Update(String businessUnit) throws InterruptedException  {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_BusinessUnit_Update);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_BusinessUnit_Update);
        inputText(OptimusCounterPartyServicesPage.serviceCp_BusinessUnit_Update, businessUnit, "Select counterparty ID  = " + businessUnit);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_BusinessUnitOptions, businessUnit)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_BusinessUnitOptions, businessUnit)), "Choose businessUnit from dropdown options");
    }

    public static void service_ServiceName(String serviceName) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceName);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceName);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceName, serviceName, "Enter serviceName ");
    }

    public static void service_ServiceType(String serviceType) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceType);
        delay(2000);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceType);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceType, serviceType, "Select serviceType  = " + serviceType);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceTypeOptions, serviceType)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceTypeOptions, serviceType)), "Choose serviceType from dropdown options");
    }

    public static void service_ServiceType_Update(String serviceType) throws InterruptedException  {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceType_Update);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceType_Update);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceType_Update, serviceType, "Select serviceType   = " + serviceType);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceTypeOptions, serviceType)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceTypeOptions, serviceType)), "Choose serviceType from dropdown options");
    }

    public static void serviceCp_ServiceTier(String serviceTier) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceTier);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceTier);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceTier, serviceTier, "Select ServiceTier  = " + serviceTier);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceTierOptions, serviceTier)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceTierOptions, serviceTier)), "Choose ServiceTier from dropdown options");
    }

    public static void serviceCp_ServiceTier_Update(String serviceTier) throws InterruptedException  {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceTier_Update);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceTier_Update);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceTier_Update, serviceTier, "Select ServiceTier   = " + serviceTier);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceTierOptions, serviceTier)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceTierOptions, serviceTier)), "Choose ServiceTier from dropdown options");
    }

    public static void serviceCp_FeeRate(String feeRate) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_FeeRate);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_FeeRate);
        inputText(OptimusCounterPartyServicesPage.serviceCp_FeeRate, feeRate, "Enter fee Rate ");
    }

    public static void serviceCp_FeeType(String feeType) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_FeeType);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_FeeType);
        inputText(OptimusCounterPartyServicesPage.serviceCp_FeeType, feeType, "Select fee Type  = " + feeType);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_FeeTypeOptions, feeType)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_FeeTypeOptions, feeType)), "Choose fee Type from dropdown options");
    }

    public static void serviceCp_FeeType_Update(String serviceTier) throws InterruptedException  {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_FeeType_Update);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_FeeType_Update);
        inputText(OptimusCounterPartyServicesPage.serviceCp_FeeType_Update, serviceTier, "Select fee Type  = " + serviceTier);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_FeeTypeOptions, serviceTier)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_FeeTypeOptions, serviceTier)), "Choose fee Type from dropdown options");
    }

    public static void serviceCp_ChargeRate(String chargeRate) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ChargeRate);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ChargeRate);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ChargeRate, chargeRate, "Enter ChargeRate ");
    }

    public static void serviceCp_ChargeType(String chargeType) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ChargeType);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ChargeType);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ChargeType, chargeType, "Select chargeType  = " + chargeType);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ChargeTypeOptions, chargeType)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ChargeTypeOptions, chargeType)), "Choose chargeType from dropdown options");
    }

    public static void serviceCp_ChargeType_Update(String chargeType) throws InterruptedException  {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ChargeType_Update);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ChargeType_Update);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ChargeType_Update, chargeType, "Select chargeType  = " + chargeType);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ChargeTypeOptions, chargeType)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ChargeTypeOptions, chargeType)), "Choose chargeType from dropdown options");
    }

    public static void serviceCp_ServiceEntity(String serviceEntity) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceEntity);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceEntity);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceEntity, serviceEntity, "Select serviceEntity  = " + serviceEntity);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceEntityOptions, serviceEntity)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceEntityOptions, serviceEntity)), "Choose serviceEntity from dropdown options");
    }

    public static void serviceCp_ServiceEntity_Update(String serviceEntity) throws InterruptedException  {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceEntity_Update);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceEntity_Update);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceEntity_Update, serviceEntity, "Select serviceEntity  = " + serviceEntity);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceEntityOptions, serviceEntity)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceEntityOptions, serviceEntity)), "Choose serviceEntity from dropdown options");
    }

    public static void serviceCp_ServiceStatus(String serviceEntity) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceStatus);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceStatus);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceStatus, serviceEntity, "Select serviceEntity  = " + serviceEntity);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceStatusOptions, serviceEntity)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceStatusOptions, serviceEntity)), "Choose serviceEntity from dropdown options");
    }

    public static void serviceCp_ServiceStatus_Update(String serviceEntity) throws InterruptedException  {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceStatus_Update);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceStatus_Update);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceStatus_Update, serviceEntity, "Select serviceEntity  = " + serviceEntity);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceStatusOptions, serviceEntity)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ServiceStatusOptions, serviceEntity)), "Choose serviceEntity from dropdown options");
    }

    public static void serviceCp_ServiceSignerName(String signerName) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceSignerName);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceSignerName);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceSignerName, signerName, "Enter signer Name ");
    }

    public static void serviceCp_ServiceStartDate(String serviceStartDate) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceStartDate);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceStartDate);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceStartDate, serviceStartDate, "Enter serviceStartDate ");
        pressEnter(OptimusCounterPartyServicesPage.serviceCp_ServiceStartDate);
    }

    public static void serviceCp_ServiceStartDate_Update(String serviceStartDate) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceStartDate_Update);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceStartDate_Update);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceStartDate_Update, serviceStartDate, "Enter serviceStartDate ");
        pressEnter(OptimusCounterPartyServicesPage.serviceCp_ServiceStartDate_Update);
    }

    public static void serviceCp_ServiceEndDate(String serviceEndDate) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceEndDate);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceEndDate);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceEndDate, serviceEndDate, "Enter serviceEndDate ");
        pressEnter(OptimusCounterPartyServicesPage.serviceCp_ServiceEndDate);
    }

    public static void serviceCp_ServiceEndDate_Update(String serviceEndDate) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceEndDate_Update);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceEndDate_Update);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceEndDate_Update, serviceEndDate, "Enter serviceEndDate ");
        pressEnter(OptimusCounterPartyServicesPage.serviceCp_ServiceEndDate_Update);
    }

    public static void serviceCp_ServiceContactPerson(String serviceContactPerson) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceContactPerson);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceContactPerson);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceContactPerson, serviceContactPerson, "Enter serviceContactPerson ");
    }

    public static void serviceCp_ServiceContactPersonEmail(String serviceContactPersonEmail) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceContactPersonEmail);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceContactPersonEmail);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceContactPersonEmail, serviceContactPersonEmail, "Enter serviceContactPersonEmail ");
    }

    public static void serviceCp_ServiceContactPersonMobile(String serviceContactPersonMobile) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceContactPersonMobile);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceContactPersonMobile);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceContactPersonMobile, serviceContactPersonMobile, "Enter serviceContactPersonMobile ");
    }

    public static void serviceCp_ExpectedTradingVolume(String expectedTradingVolume) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ExpectedTradingVolume);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ExpectedTradingVolume);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ExpectedTradingVolume, expectedTradingVolume, "Enter expectedTradingVolume ");
    }

    public static void serviceCp_MiningServiceTransferFee(String miningServiceTransferFee) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_MiningServiceTransferFee);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_MiningServiceTransferFee);
        inputText(OptimusCounterPartyServicesPage.serviceCp_MiningServiceTransferFee, miningServiceTransferFee, "Enter miningServiceTransferFee ");
    }

    public static void serviceCp_MiningServiceHashrate(String miningServiceHashrate) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_MiningServiceHashrate);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_MiningServiceHashrate);
        inputText(OptimusCounterPartyServicesPage.serviceCp_MiningServiceHashrate, miningServiceHashrate, "Enter miningService Hashrate ");
    }

    public static void serviceCp_MiningServicePower(String miningServicePower) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_MiningServicePower);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_MiningServicePower);
        inputText(OptimusCounterPartyServicesPage.serviceCp_MiningServicePower, miningServicePower, "Enter miningService Power");
    }

    public static void serviceCp_MiningServicePowerCharge(String miningServicePowerCharge) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_MiningServicePowerCharge);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_MiningServicePowerCharge);
        inputText(OptimusCounterPartyServicesPage.serviceCp_MiningServicePowerCharge, miningServicePowerCharge, "Enter mining ServicePower Charge");
    }


    public static void serviceCp_ReferralPerson(String referralPerson) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ReferralPerson);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ReferralPerson);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ReferralPerson, referralPerson, "Select referralPerson  = " + referralPerson);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ReferralPersonOptions, referralPerson)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ReferralPersonOptions, referralPerson)), "Choose referralPerson from dropdown options");
    }

    public static void serviceCp_ReferralPerson_Update(String referralPerson) throws InterruptedException  {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ReferralPerson_Update);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ReferralPerson_Update);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ReferralPerson_Update, referralPerson, "Select serviceEntity  = " + referralPerson);
        waitForPresent(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ReferralPersonOptions, referralPerson)));
        click(By.xpath(String.format(OptimusCounterPartyServicesPage.serviceCp_ReferralPersonOptions, referralPerson)), "Choose referralPerson from dropdown options");
    }

    public static void serviceCp_ServiceRemarks(String serviceRemarks) throws InterruptedException {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_ServiceRemarks);
        clearInputUsingKeys(OptimusCounterPartyServicesPage.serviceCp_ServiceRemarks);
        inputText(OptimusCounterPartyServicesPage.serviceCp_ServiceRemarks, serviceRemarks, "Enter ServiceRemarks");
    }

    public static void clickCreateBtn() {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_CreateBtn);
        click(OptimusCounterPartyServicesPage.serviceCp_CreateBtn, "Click service Create Btn");
    }

    public static void clickDeleteBtn() {
        waitForClickable(OptimusCounterPartyServicesPage.serviceCp_DeleteBtn);
        click(OptimusCounterPartyServicesPage.serviceCp_DeleteBtn, "Click service delete Btn");
    }

}
