package pageFactory.OptimusPages.Settlement;

import org.openqa.selenium.By;

public class SettlementMainPage {

    public static By settlement_MainTab = By.xpath("//a[text()='Settlement']");
    public static By logoutbtn_settlement = By.xpath("//*[@id='root']/section/header/div/ul/li[18]");

    public static By adminTab = By.xpath("//a[text()='Auth Admin']");
    public static By newSettlement_Tasks = By.xpath("//span[text()='Tasks']");
    public static By newSettlement_Checkbox = By.xpath("(//div[@class='_workflow_task_1l3ie_1']//following::label)[1]");
    public static By newSettlement_selectAll = By.xpath("//span[text()='Select All Applicable']");
    public static By newSettlement_createsettlementlabel = By.xpath("//span[text()='Create Settlement']");
    public static By yesbtn = By.xpath("//button[@type='button']/span[text()='Yes']");
    public static By newSettlement_Approve = By.xpath("//span[text()='Approve']");

    public static By newSettlement_edit = By.xpath("(//a[text()='Edit'])[1]");
    public static By newSettlement_inputsearchtext = By.xpath("//input[@placeholder='input search text']");

    public static By newSettlement_ClickSearch = By.xpath("//button[@class='ant-btn ant-btn-icon-only ant-input-search-button']");

    public static By settlementSort = By.xpath("//span[text()='Settlement Ref.']");


    public static By settlementlist = By.xpath(" //span[text()='Settlement Ref.']//following::tr[2]/td[6]");
    public static By settlementlink = By.xpath("//a[text()='Settlements']");
    public static By newSettlement = By.xpath("//span[text()='New Settlement']");
    //    Mandatory Fields
    public static By newSettlement_CounterpartyID = By.id("create_settlement_counterparty_id");
    public static By newSettlement_NicknameExternal = By.id("create_settlement_settlement_nickname_external");

    public static By newSettlement_updatedNicknameExternal = By.id("update_settlement_settlement_nickname_external");

    public static By newCounterPartyPage_NicknameExternal = By.id("create_counterparty_nickname_external");
    //    Mandatory Field
    public static By newSettlement_NicknameInternal = By.id("create_settlement_settlement_nickname_internal");
    public static By newSettlement_updatedNicknameInternal = By.id("update_settlement_settlement_nickname_internal");
    public static By newSettlement_Type=By.id("create_settlement_settlement_type");
    public static By newSettlement_Currency=By.id("create_settlement_currency");
    public static By newSettlement_Transfermethod=By.id("create_settlement_transfer_method");
    public static By newSettlement_Network=By.id("create_settlement_network");
    public static By newSettlement_Custodian=By.id("create_settlement_custodian");
    public static By newSettlement_BankName=By.id("create_settlement_bank_name");
    public static By newSettlement_BankAddress=By.id("create_settlement_bank_address");
    public static By newSettlement_BankBeneficiaryName=By.id("create_settlement_bank_beneficiary_name");
    public static By newSettlement_BankAccountNumber=By.id("create_settlement_bank_account_number");
    public static By newSettlement_WalletAddress=By.id("create_settlement_wallet_address");
    public static By newSettlement_WalletMemo=By.id("create_settlement_wallet_memo");
    public static By newSettlement_purpose=By.id("create_settlement_purpose");
    public static By newSettlement_WhislingMethod=By.id("create_settlement_whitelisting_method");
    public static By newSettlement_WalletRemarks=By.id("create_settlement_wallet_remarks");
    public static By newSettlement_Settlementstatus=By.id("create_settlement_settlement_status");
    public static By newSettlement_createSettlementbtn = By.xpath("//span[text()='Create Settlement']");
    public static By CreateSettlement_SuccessMsg=By.xpath("//div[text()='Success!']");
    public static By newSettlement_updatebtn=By.xpath("//span[text()='Update Settlement']");
    public static By newSettlement_approvelink=By.xpath("//a[text()='Portfolio']");

    public static By newSettlement_nodata=By.xpath("//div[text()='No Data']");

}
