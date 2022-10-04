package pageFactory.OptimusPages.Account;

import org.openqa.selenium.By;

public class OptimusAccountCreatePage {

    public static By account_AccountID = By.xpath("//input[@placeholder='account_id']");
    public static By account_MainAccountID = By.xpath("//input[@placeholder='main_account_id']");
    public static By account_AccountSource = By.id("create_account_account_source");
    public static By account_AccountSource_update = By.id("update_account_account_source");
    public static String account_AccountSource_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By account_Exchange = By.xpath("//input[@placeholder='exchange']");
    public static By account_AccountType = By.id("create_account_account_type");
    public static By account_AccountType_update = By.id("update_account_account_type");
    public static String account_AccountType_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By account_AccountName = By.xpath("//input[@placeholder='account_name']");
    public static By account_AccountLogin = By.xpath("//input[@placeholder='account_login']");
    public static By account_Function = By.id("create_account_function");
    public static By account_Function_update = By.id("update_account_function");
    public static String account_Function_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";

    public static By account_Permission = By.id("create_account_permission");
    public static By account_Permission_update = By.id("update_account_permission");
    public static String account_Permission_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";

    public static By account_Owner = By.xpath("//input[@placeholder='owner']");
    public static By account_Entity = By.id("create_account_entity");
    public static By account_Entity_update = By.id("update_account_entity");
    public static String account_Entity_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";

    public static By account_WalletController = By.id("create_account_wallet_controllers");
    public static By account_WalletController_update = By.id("update_account_wallet_controllers");
    public static String account_WalletController_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
//Address
    public static By account_Channel1 = By.xpath("//input[@placeholder='addresses:channel_1']");
    public static By account_Address1 = By.xpath("//input[@placeholder='addresses:address_1']");
    public static By account_Memo1 = By.xpath("//input[@placeholder='addresses:memo_1']");
    public static By account_Channel2 = By.xpath("//input[@placeholder='addresses:channel_2']");
    public static By account_Address2 = By.xpath("//input[@placeholder='addresses:address_2']");
    public static By account_Memo2 = By.xpath("//input[@placeholder='addresses:memo_2']");
    public static By account_Address_minus_btn = By.xpath("//button/span[@aria-label='minus-circle']");
    public static By account_Address_plus_btn = By.xpath("//button/span[@aria-label='plus-circle']");
//Trading Operation
    public static By account_PortfolioNumber = By.id("create_account_portfolio_number");
    public static By account_PortfolioNumber_update = By.id("update_account_portfolio_number");
    public static String account_PortfolioNumber_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";

    public static By account_PortfolioName = By.xpath("//input[@placeholder='portfolio_name']");
    public static By account_PortfolioEntity = By.xpath("//input[@placeholder='portfolio_entity']");
    public static By account_CounterpartyRef = By.id("create_account_counterparty_ref");
    public static By account_CounterpartyRef_update = By.id("update_account_counterparty_ref");
    public static String account_CounterpartyRef_Options = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";

    public static By account_CounterpartyName = By.xpath("//input[@placeholder='counterparty_name']");
    public static By account_Comment = By.xpath("//textarea[@placeholder='comment']");
//    Actions
    public static By account_Create_btn = By.xpath("//button[@type='submit']");
    public static By account_Delete_btn = By.xpath("//button/span[contains(text(),'Delete')]");


}
