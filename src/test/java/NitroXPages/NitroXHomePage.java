package NitroXPages;

import org.openqa.selenium.By;

public class NitroXHomePage {

    public static By selectspot=By.xpath("//span[@title='Spot']");

    public static By selectfuture=By.xpath("//div[@title='Futures']/div[1]");
    public static By tradingaccount=By.xpath("//input[@id='account_pair_form_accountId']");
    public static By Basecurrency= By.xpath("//input[@id='account_pair_form_base']");
    public static By Quotecurrency=By.xpath("//input[@id='account_pair_form_quote']");
    public static By price =By.xpath("//input[@id='order_form_price']");
    //span[contains(text(),'Limit')]

    public static By Quantity= By.xpath("//input[@id='order_form_quantity']");
    public static By Dealrefbutton=By.xpath("//input[@id='order_form_deal_ref']");
    public static By buybtn=By.xpath("//span[contains(text(),'Buy')]");
    public static By sellbtn= By.xpath("//span[contains(text(),'Sell')]");


}
