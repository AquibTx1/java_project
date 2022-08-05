package pageFactory.OptimusPages.CounterParty;

import org.openqa.selenium.By;

public class OptimusCounterPartyListPage {

    //Counter Party List Locators
    public static By counterParties_ListTab = By.cssSelector("#rc-tabs-1-tab-item_0");
    public static By counterPartyList_SearchBox = By.cssSelector(".ant-input[type='text']");
    public static By counterPartyList_SearchBtn = By.cssSelector(".ant-btn.ant-btn-icon-only.ant-input-search-button");
    public static By counterPartyList_RefreshBtn = By.cssSelector(".ant-btn.ant-btn-icon-only > span[aria-label='reload']");
    public static By counterPartyList_DownloadBtn = By.xpath("//button[@class='ant-btn']/span[contains(text(), 'Download CSV')]");

    //Search Result Table Locators
    public static By counterPartyList_EditLink = By.xpath("//tbody/tr[2]/td[2]/div[1]/a[1]");


}
