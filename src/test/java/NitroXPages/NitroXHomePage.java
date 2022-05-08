package NitroXPages;

import org.openqa.selenium.By;

public class NitroXHomePage {

    public static By modeTextField = By.xpath("(//*[@class='ant-col ant-form-item-control'])[1]/child::div[1]//div[@class='ant-select-selector']");
    //*[@id='account_pair_form']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]
    public static By spotDropdown = By.xpath("(//div[@class='rc-virtual-list-holder-inner'])/div[1]/div");
    //(//div[@class='ant-select-item-option-content'])[1]
    public static By FutureDropdown=By.xpath("(//div[@class='rc-virtual-list-holder-inner'])/div[2]/div");
    public static By getModeTextFieldGeneric = By.xpath("(//*[@class='ant-col ant-form-item-control'])[1]/child::div[1]//div[@class='ant-select-selector']");
    public static By tradingaccount = By.cssSelector("input[id='account_pair_form_quote']");
    public static By Basecurrency = By.cssSelector("input[id='account_pair_form_base']");
    public static By Quotecurrency = By.cssSelector("input[id='account_pair_form_quote']");
    public static By price = By.xpath("//input[@id='order_form_price']");
    //span[contains(text(),'Limit')]
    public static By Quantity = By.xpath("//input[@id='order_form_quantity']");
    public static By Dealrefbutton = By.xpath("//input[@id='order_form_deal_ref']");
    public static By buybtn = By.xpath("//span[contains(text(),'Buy')]");
    public static By sellbtn = By.xpath("//span[contains(text(),'Sell')]");


}
