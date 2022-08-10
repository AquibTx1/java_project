package pageFactory.OptimusPages.Settlement;

import org.openqa.selenium.By;

public class SettlementMainPage {


    public static By settlement_MainTab = By.xpath("//a[text()='Settlement']");

    public static By settlementlink = By.xpath("//a[text()='Settlements']");

    public static By newSettlement = By.xpath("//span[text()='New Settlement']");

    //    Mandatory Fields
    public static By newSettlement_CounterpartyID = By.id("create_settlement_counterparty_id");
    public static By newSettlement_NicknameExternal = By.id("create_settlement_settlement_nickname_external");
    public static By newCounterPartyPage_NicknameExternal = By.id("create_counterparty_nickname_external");
    //    Mandatory Field
    public static By newSettlement_NicknameInternal = By.id("create_settlement_settlement_nickname_internal");

    public static By newSettlement_Type=By.id("create_settlement_settlement_type");

    public static By newSettlement_Currency=By.id("create_settlement_currency");

    public static By newSettlement_Transfermethod=By.id("create_settlement_transfer_method");

    public static By newSettlement_Network=By.id("create_settlement_network");
    public static By newSettlement_Custodian=By.id("create_settlement_custodian");
    public static By newSettlement_BankName=By.id("create_settlement_bank_name");
    public static By newSettlement_BankAddress=By.id("create_settlement_bank_address");
    public static By newSettlement_BankAccountNumber=By.id("create_settlement_bank_account_number");
    public static By newSettlement_WalletAddress=By.id("create_settlement_wallet_address");
    public static By newSettlement_WalletMemo=By.id("create_settlement_wallet_memo");

    public static By newSettlement_purpose=By.id("create_settlement_purpose");
    public static By newSettlement_WhislingMethod=By.id("create_settlement_whitelisting_method");
    public static By newSettlement_WalletRemarks=By.id("create_settlement_wallet_remarks");

    public static By newSettlement_Settlementstatus=By.id("create_settlement_settlement_status");

    public static By newSettlement_createSettlementbtn = By.xpath("//span[text()='Create Settlement']");




}
