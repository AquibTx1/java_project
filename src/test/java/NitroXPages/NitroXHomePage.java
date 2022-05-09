package NitroXPages;

import org.openqa.selenium.By;

public class NitroXHomePage {

    //Orderbook


    //Account & Instrument
    public static By modeTextField = By.xpath("(//*[@class='ant-col ant-form-item-control'])[1]/child::div[1]//div[@class='ant-select-selector']");
    public static By modeTextbyID = By.id("account_pair_form_mode");
    public static By spotDropdown = By.xpath("(//div[@class='rc-virtual-list-holder-inner'])/div[1]/div");
    public static By FutureDropdown = By.xpath("(//div[@class='rc-virtual-list-holder-inner'])/div[2]/div");
    public static By modeValueAfterSelection = By.xpath("(//*[@class='ant-col ant-form-item-control'])[1]/child::div[1]//div[@class='ant-select-selector']/span[2]");
    public static By price = By.xpath("//input[@id='order_form_price']");
    public static By Quantity = By.xpath("//input[@id='order_form_quantity']");
    public static By Dealrefbutton = By.xpath("//input[@id='order_form_deal_ref']");
    public static By buybtn = By.xpath("//span[contains(text(),'Buy')]");
    public static By sellbtn = By.xpath("//span[contains(text(),'Sell')]");
    public static By accountAndInstrumentLabel = By.xpath("//div[text()='Account & Instrument']");
    public static By tradingaccount = By.id("account_pair_form_accountId");
    public static By tradingAccountSibling = By.xpath("(//span[@class='ant-select-selection-search'])[2]/following-sibling::span[1]");
    public static By inputtradingaccount = By.id("account_pair_form_accountId");
    public static By selecttradingaccount1 = By.xpath("//div[@title='Trader01@Tinyex']");
    public static By selecttradingaccount2 = By.xpath("//div[@title='Trader02@Tinyex']");

    public static By varifyaccount = By.xpath("(//div[@class='ant-select-selector'])[2]/child::span[2]");
    //Balance
    public static By balance = By.xpath("(//*[@class='text-gray-800 text-xs'])[1]");
    public static By Basecurrency = By.id("account_pair_form_base");
    public static By Quotecurrency = By.id("account_pair_form_quote");



    //Position

    //Bots
    
    //Order Form
    public static By inputprice = By.id("order_form_price");

    //input[@id='order_form_price']
}
