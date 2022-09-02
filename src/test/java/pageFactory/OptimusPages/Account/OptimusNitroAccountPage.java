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
}
