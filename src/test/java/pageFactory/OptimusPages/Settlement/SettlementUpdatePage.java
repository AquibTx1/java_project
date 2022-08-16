package pageFactory.OptimusPages.Settlement;

import org.openqa.selenium.By;

public class SettlementUpdatePage {

    public static By settlement_MainTab = By.xpath("//a[text()='Settlement']");
    public static By logoutbtn_settlement = By.xpath("//*[@id='root']/section/header/div/ul/li[18]");
    public static By updatedsettlement_NicknameExternal = By.id("update_settlement_settlement_nickname_external");
    //    Mandatory Field
    public static By updatedsettlement_NicknameInternal = By.id("update_settlement_settlement_nickname_internal");
    public static By updatedsettlement_BankName = By.id("update_settlement_bank_name");

    public static By updatedsettlement_Custodian = By.id("update_settlement_custodian");

    public static By updatedsettlement_BankAccountNumber = By.id("update_settlement_bank_account_number");

    public static By updatedsettlement_BankAddress = By.id("update_settlement_bank_address");

    public static By updatedsettlement_BankBeneficiaryName=By.id("update_settlement_bank_beneficiary_name");
    public static By updatedsettlement_WalletAddress=By.id("update_settlement_wallet_address");
    public static By updatedsettlement_WalletMemo=By.id("update_settlement_wallet_memo");
    public static By updatedsettlement_purpose=By.id("update_settlement_purpose");
    public static By updatedsettlement_WhislingMethod=By.id("update_settlement_whitelisting_method");
    public static By updatedsettlement_WalletRemarks=By.id("update_settlement_wallet_remarks");
    public static By updatedsettlement_Settlementstatus=By.id("update_settlement_settlement_status");
    public static By newSettlement_updatebtn=By.xpath("//span[text()='Update Settlement']");



}
