package modules.OptimusActions;

import modules.XAlphaActions.XAlphaDealEnquiryActions;
import org.openqa.selenium.By;
import pageFactory.NitroXPages.NitroXBuySellFuturePage;
import pageFactory.OptimusPages.Settlement.SettlementMainPage;
import pageFactory.XAlphaPages.XAlphaDealEnquiryPage;
import pageFactory.XAlphaPages.XAlphaDealInputPage;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;

public class OptimusSettlementActions extends KeywordUtil
{

    static Class thisClass = OptimusSettlementActions.class;


    public static void clickSettlement() {
        click(SettlementMainPage.settlement_MainTab, "Click Settlement tab");
    }

    public static void clickSettlementLink() {
        click(SettlementMainPage.settlementlink, "Click Settlement tab");
    }

    public static void choosenewSettlement() {
        click(SettlementMainPage.newSettlement, "Click Settlement tab");
    }
    public static void newSettlement_CounterParty(String CounterPartyID) {
        inputText(SettlementMainPage.newSettlement_CounterpartyID, CounterPartyID, "Select Counterparty ID=" + CounterPartyID);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='"+CounterPartyID+"']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='"+CounterPartyID+"']"), "CounterPartyID selected");
    }
    public static void newSettlement_ExternalNickName(String exnickname) {
        inputText(SettlementMainPage.newSettlement_NicknameExternal, exnickname, "Nickname External=" + exnickname);
    }
    public static void newSettlement_InternalNickName(String innickname) {
        inputText(SettlementMainPage.newSettlement_NicknameInternal, innickname, "Nickname External=" + innickname);
    }


    public static void chooseSettlementType(String s) {
        inputText(SettlementMainPage.newSettlement_Type, s, "Settlement Type=" + s);
        pressEnter(SettlementMainPage.newSettlement_Type);
    }

    public static void chooseCurrency(String currency) {
        inputText(SettlementMainPage.newSettlement_Currency, currency, "Currency =" + currency);
        pressEnter(SettlementMainPage.newSettlement_Currency);
    }

    public static void chooseTransferMethod(String transfer_method) {
        inputText(SettlementMainPage.newSettlement_Transfermethod, transfer_method, "Transfer Method=" + transfer_method);
        pressEnter(SettlementMainPage.newSettlement_Transfermethod);
    }

    public static void chooseNetwork(String network) {
        inputText(SettlementMainPage.newSettlement_Network, network, "Network Type is=" + network);
        pressEnter(SettlementMainPage.newSettlement_Network);
    }

    public static void chooseCustodian(String custodian) {
    }

    public static void inputTradingAccount(HashMap<String, String> dataMap) {
        click(NitroXBuySellFuturePage.tradingaccount, "Trading Account text field clicked.");
        inputText(NitroXBuySellFuturePage.inputtradingaccount, dataMap.get("TradingAccount"), dataMap.get("TradingAccount") + " : Trading account");
        pressEnter(NitroXBuySellFuturePage.inputtradingaccount);
    }
    public static void chooseBankName(HashMap<String, String> dataMap) {
        click(SettlementMainPage.newSettlement_BankName, "field clicked.");
        inputText(SettlementMainPage.newSettlement_BankName, dataMap.get("Bank Name"), dataMap.get("Bank Name") + " : Bank account");
        pressEnter(SettlementMainPage.newSettlement_BankName);
    }

    public static void chooseAddress(String bankaddress) {
        inputText(SettlementMainPage.newSettlement_BankAddress, bankaddress, "Nickname External=" + bankaddress);
    }

    public static void enterBankAccountNumber(String accountnumber) {
        inputText(SettlementMainPage.newSettlement_BankAccountNumber, accountnumber, "Nickname External=" + accountnumber);
    }

    public static void chooseBankSwiftCode(String swiftcode) {
    }

    public static void chooseBankBeneficiaryName(String name) {
    }

    public static void chooseBankBeneficiaryaddress(String address) {
    }
}
