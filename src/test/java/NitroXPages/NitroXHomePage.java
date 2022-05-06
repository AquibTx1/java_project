package NitroXPages;

import org.openqa.selenium.By;

public class NitroXHomePage {

    public static By modeTextField = By.id("account_pair_form_mode");
    public static By spotDropdown = By.xpath("//div[text()='Spot']");
    public static By getModeTextFieldGeneric = By.xpath("//div[@class='ant-select ant-select-single ant-select-show-arrow ant-select-open ant-select-show-search']/div[@class='ant-select-selector']/span[@Class='ant-select-selection-item']");

    public static By selectfuture = By.xpath("//div[@title='Futures']/div[1]");
    public static By tradingaccount = By.xpath("//input[@id='account_pair_form_accountId']");
    public static By Basecurrency = By.xpath("//input[@id='account_pair_form_base']");
    public static By Quotecurrency = By.xpath("//input[@id='account_pair_form_quote']");
    public static By price = By.xpath("//input[@id='order_form_price']");
    //span[contains(text(),'Limit')]

    public static By Quantity = By.xpath("//input[@id='order_form_quantity']");
    public static By Dealrefbutton = By.xpath("//input[@id='order_form_deal_ref']");
    public static By buybtn = By.xpath("//span[contains(text(),'Buy')]");
    public static By sellbtn = By.xpath("//span[contains(text(),'Sell')]");


}
