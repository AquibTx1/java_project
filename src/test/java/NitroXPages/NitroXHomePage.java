package NitroXPages;

import org.openqa.selenium.By;

public class NitroXHomePage {

    public static By selectMode=By.xpath("//span[contains(text(),'Spot')]");
    public static By tradingaccount=By.xpath("//input[@id='account_pair_form_accountId']");
    public static By Basecurrency= By.xpath("//input[@id='account_pair_form_base']");
    public static By Quotecurrency=By.xpath("//input[@id='account_pair_form_quote']");
    public static By price =By.xpath("//input[@id='order_form_price']");
    public static By Quantity= By.xpath("//input[@id='order_form_quantity']");
    public static By Dealrefbutton=By.xpath("//input[@id='order_form_deal_ref']");
    public static By buybtn=By.xpath("");

}
