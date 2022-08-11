package modules.OptimusActions;

import com.atlassian.jira.rest.client.api.domain.LoginInfo;
import groovy.transform.builder.InitializerStrategy;
import modules.NitroXActions.NitroXHome;
import modules.XAlphaActions.XAlphaDealEnquiryActions;
import org.openqa.selenium.By;
import pageFactory.NitroXPages.NitroXBotsPage;
import pageFactory.NitroXPages.NitroXBuySellFuturePage;
import pageFactory.NitroXPages.NitroXHomePage;
import pageFactory.OptimusPages.Settlement.SettlementMainPage;
import pageFactory.XAlphaPages.XAlphaDealEnquiryPage;
import pageFactory.XAlphaPages.XAlphaDealInputPage;
import pageFactory.XAlphaPages.XAlphaDealProcessingPage;
import pageFactory.XAlphaPages.XAlphaLoginPage;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;

public class OptimusSettlementActions extends KeywordUtil {

    static Class thisClass = OptimusSettlementActions.class;

    static String name;
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
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + CounterPartyID + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + CounterPartyID + "']"), "CounterPartyID selected");
    }

    public static void newSettlement_ExternalNickName(String exnickname) {
        inputText(SettlementMainPage.newSettlement_NicknameExternal, exnickname, "Nickname External=" + exnickname);
    }

    public static void newSettlement_InternalNickName(String innickname) {
        inputText(SettlementMainPage.newSettlement_NicknameInternal, innickname, "Nickname External=" + innickname);
    }

    public static String getSettlement_Nickname_Internal() {
        name = getElementText(SettlementMainPage.newSettlement_NicknameInternal);
        LogUtil.infoLog(SettlementMainPage.class, "Nick Name is =" + name);
        return name;
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
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + transfer_method + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + transfer_method + "']"), "Transfer_Method selected");
    }

    public static void chooseNetwork(String network) {
        inputText(SettlementMainPage.newSettlement_Network, network, "Network Type is=" + network);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + network + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + network + "']"), "Network selected");
    }

    public static void chooseCustodian(String custodian) {
        inputText(SettlementMainPage.newSettlement_Custodian, custodian, "Network Type is=" + custodian);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + custodian + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + custodian + "']"), "Custodian selected");
    }

    public static void chooseBankName(String bankname) {
        inputText(SettlementMainPage.newSettlement_BankName, bankname, "Selected the Bank =" + bankname);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + bankname + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + bankname + "']"), "Bank Name selected");
    }

    public static void chooseAddress(String bankaddress) {
        inputText(SettlementMainPage.newSettlement_BankAddress, bankaddress, "Bank address =" + bankaddress);
    }

    public static void enterBankAccountNumber(String accountnumber) {
        inputText(SettlementMainPage.newSettlement_BankAccountNumber, accountnumber, "Account number =" + accountnumber);
    }

    public static void chooseBankSwiftCode(String swiftcode) {
    }

    public static void chooseBankBeneficiaryName(String name) {
        inputText(SettlementMainPage.newSettlement_BankBeneficiaryName, name, "Beneficiary Name =" + name);
    }

    public static void chooseBankBeneficiaryaddress(String address) {
        inputText(SettlementMainPage.newSettlement_BankAddress, address, "Bank address =" + address);
    }

    public static void chooseWalletAddress(String wallet_address) {
        inputText(SettlementMainPage.newSettlement_WalletAddress, wallet_address, "Wallet address =" + wallet_address);
    }

    public static void chooseWalleMemo(String wallet_memo) {
        inputText(SettlementMainPage.newSettlement_WalletMemo, wallet_memo, "Wallet address =" + wallet_memo);
    }

    public static void choosePurpose(String purpose) {
        inputText(SettlementMainPage.newSettlement_purpose, purpose, " Purpose =" + purpose);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + purpose + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + purpose + "']"), "Purpose selected");
    }

    public static void clickCreateSettlement() {
        KeywordUtil.click(SettlementMainPage.newSettlement_createSettlementbtn, "Create Settlement Clicked");
    }

    public static void waitForSuccessMsgToAppear() {
        waitForPresent(SettlementMainPage.CreateSettlement_SuccessMsg);
    }

    public static void waitForSuccessMsgToDisappear() {
        waitForInVisibile(SettlementMainPage.CreateSettlement_SuccessMsg);
    }

    public static void logoutFromOptimus() throws InterruptedException {
        click(SettlementMainPage.logoutbtn, "Logout from Optimus app");
    }

    public static void clickTaskslink() {
        click(SettlementMainPage.newSettlement_Tasks, "Clicked the Task Link");
    }

    public static void selectSettlementCheckbox() throws InterruptedException {
        click(SettlementMainPage.newSettlement_Checkbox, "Clicked the Checkbox");
    }

    public static void selectAllSettlementbtn() {
        click(SettlementMainPage.newSettlement_selectAll, "Clicked the select btn");
    }

    public static void selectApprovebtn() {
        click(SettlementMainPage.newSettlement_Approve, "Clicked the approve");
        waitForVisible(SettlementMainPage.yesbtn);
        click(SettlementMainPage.yesbtn, "Click yes button to confirm approve");
    }


    public static void inputNickname(String nickname) {
        System.out.println("name is =" + nickname);
        inputText(SettlementMainPage.newSettlement_inputsearchtext, nickname, "Input the name =" + nickname);
        click(SettlementMainPage.newSettlement_ClickSearch,"Search Button clicked");
    }

    public static void sortSettlementRef() throws InterruptedException {
        KeywordUtil.click(SettlementMainPage.settlementSort,"Sorted Based on Start Time");
        delay(2000);
        KeywordUtil.click(SettlementMainPage.settlementSort,"Sorted Based on Start Time");
        LogUtil.infoLog(thisClass, "sorted the Start Time to get latest Record");
    }
    public static String getNameSettlementList()
    {
        String name=getElementText(By.xpath("//span[text()='Settlement Ref.']//following::tr[2]/td[6]"));
        LogUtil.infoLog(thisClass,"name is ="+name);
        return  name;
    }

    public static void clickLogout() {
        click(SettlementMainPage.logoutbtn,"Logout Clicked");
    }

    public static void refreshPage() {

        KeywordUtil.pageRefresh();
    }

}
