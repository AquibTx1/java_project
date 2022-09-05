package pageFactory.OptimusPages.Account;

import org.openqa.selenium.By;

public class OptimusNitroAccountPage {
    public static By nitroAccount_CreateNew_ListBtn = By.xpath("//button[@type='button']/span[contains(text(), 'Create New Account')]");
    public static By nitroAccount_Create_ModalWindow = By.cssSelector(".ant-modal-content");
    public static By nitroAccount_AccountName = By.xpath("//input[@placeholder='account_name']");
    public static By nitroAccount_Exchange = By.id("createAccount_exchange_id");
    public static String nitroAccount_Exchange_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By nitroAccount_APIAccess = By.xpath("//textarea[@placeholder='api_access']");
    public static By nitroAccount_APISecret = By.xpath("//textarea[@placeholder='api_secret']");
    public static By nitroAccount_AccountType = By.id("createAccount_acc_group");
    public static String nitroAccount_AccountType_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By nitroAccount_Create_FormBtn = By.xpath("//button[@type='submit']");
    public static By nitroAccount_Edit_ListBtn = By.xpath("//button[@type='button']/span[@aria-label='edit']");
    public static By nitroAccount_IPBindingBtn = By.xpath("//tbody/tr[2]/td/div/button[@type='button']/span[@aria-label='desktop']");
    public static By nitroAccount_AddExternal_IPBinging_Search = By.xpath("//input[@type='search'][@class='ant-select-selection-search-input']");
    public static By nitroAccount_IPBinding_List = By.cssSelector(".ant-modal-body .ant-spin-container > ul > li:nth-child(1) > span:nth-child(2)");
    public static By nitroAccount_AccountName_List = By.xpath("//tbody/tr[2]/td[2]");
    public static By nitroAccount_Modalwindow_Close = By.className("ant-modal-close-x");
    public static By nitroAccount_ModalWindow_IP_ClearBtn = By.xpath("//button[@type='button']/span[contains(text(),'Clear')]");
    public static By nitroAccount_UnlockSwitch_List =By.xpath("//thead/tr/th/button[@role='switch']");
    public static By nitroAccount_RunBroker_btn_List = By.xpath("//tbody/tr[2]/td[6]/div/button/span[contains(text(),'Broker')]");
    public static By nitroAccount_RunBalanceListener_btn_List = By.xpath("//tbody/tr[2]/td/div/button/span[contains(text(),'Balance')]");
    public static By nitroAccount_RunOrderListener_btn_List = By.xpath("//tbody/tr[2]/td/div/button/span[contains(text(),'Order')]");

}
