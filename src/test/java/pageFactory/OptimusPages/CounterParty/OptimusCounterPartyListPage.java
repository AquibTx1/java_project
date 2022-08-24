package pageFactory.OptimusPages.CounterParty;

import org.openqa.selenium.By;

public class OptimusCounterPartyListPage {
    //Counter Party List Locators
    public static By counterParties_ListTab = By.cssSelector(".ant-tabs-nav-list > .ant-tabs-tab.ant-tabs-tab-active > div#rc-tabs-0-tab-item_0");
    public static By counterPartyList_SearchBox = By.cssSelector("input.ant-input[type='text']");
    public static By counterPartyList_SearchBtn = By.cssSelector(".ant-btn.ant-btn-icon-only.ant-input-search-button");
    public static By counterPartyList_RefreshBtn = By.cssSelector(".ant-btn.ant-btn-icon-only > span[aria-label='reload']");
    public static By counterPartyList_DownloadBtn = By.xpath("//button[@class='ant-btn']/span[contains(text(), 'Download CSV')]");
    //Search Result Table Locators
    public static By counterPartyList_EditLink = By.xpath("//tbody/tr[2]/td[2]/div[1]/a[1]");
    public static By counterPartyList_NickNameInternal1 = By.xpath("//table/tbody/tr[2]/td[5]");
    public static By counterPartyList_NoDataTable = By.cssSelector("table tbody tr td .ant-empty-description");
    public static By counterPartyList_DownloadCSVBtn = By.xpath("//div[@class='ant-table-title']/form/..//div[@class='ant-form-item-control-input-content']/a/button");
    public static By relatedPartyList_FirstName = By.xpath("//table/tbody/tr[2]/td[4]");
}
