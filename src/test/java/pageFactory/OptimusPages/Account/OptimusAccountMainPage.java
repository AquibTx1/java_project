package pageFactory.OptimusPages.Account;

import org.openqa.selenium.By;

public class OptimusAccountMainPage {

    public static By account_MainTab = By.xpath("//div[@class='optimus_nav']/ul/li/a[contains(text(),'Account')]");
    public static By account_WelcomeText_MainTab = By.cssSelector("._title_q9zok_1");

    public static By account_SideTab = By.xpath("//span[@aria-label='bank']//parent::li");
    public static By account_NitroAccount_SideTab = By.xpath("//span[@aria-label='user']//parent::li");
    public static By account_References_SideTab = By.xpath("//span[@aria-label='setting']//parent::li/span/a[contains(text(),'References')]");
    public static By account_Configurations_SideTab = By.xpath("//span[@aria-label='setting']//parent::li/span/a[contains(text(),'Configurations')]");

    public static By account_CreateNewTab = By.xpath("//div[@aria-controls=\"rc-tabs-0-panel-item_1\"]/span[contains(text(),'New Account')]");
    public static By account_ListTab = By.xpath("//div[@aria-controls='rc-tabs-0-panel-item_0'][contains(text(),'Account List')]");

    public static By account_EditLink_List = By.xpath("//table/tbody/tr[2]/td[2]/div/a[contains(text(),'Edit')]");
    public static By account_AccountID_List = By.xpath("//table/tbody/tr[2]/td[3]");
    public static By account_MainAccountID_List = By.xpath("//table/tbody/tr[2]/td[4]");
    public static By account_AccountName_List = By.xpath("//table/tbody/tr[2]/td[8]");
    public static By account_AccountLogin_List = By.xpath("//table/tbody/tr[2]/td[9]");

}
