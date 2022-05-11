package modules.NitroXActions;

import NitroXPages.NitroXHomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;

import static utilities.KeywordUtil.*;
import static utilities.KeywordUtil.getElementText;
import static utilities.KeywordUtil.waitForVisible;

public class NitroXHome {

    static Class thisClass = NitroXHome.class;

    static String availableCoinBalance, frozenCoinBalance, totalCoinBalance, firstbidprice, lastbidprice, openOrderTime;

    static double quantity;

    public static void selectmode(HashMap<String, String> dataMap) throws Exception {
        waitForVisible(NitroXHomePage.modeTextbyID);
        KeywordUtil.click(NitroXHomePage.modeTextField, "Mode text field clicked.");
        waitForVisible(NitroXHomePage.spotDropdown);
        if (dataMap.get("Mode").equalsIgnoreCase("Spot")) {
            KeywordUtil.click(NitroXHomePage.spotDropdown, "Spot mode selected from dropdown.");
        } else if (dataMap.get("Mode").equalsIgnoreCase("Futures")) {
            KeywordUtil.click(NitroXHomePage.FutureDropdown, "Future mode selected from dropdown.");
        } else {
            Assert.fail("Please provide a valid mode value in .xlsx file");
        }
    }

    public static void inputMode(HashMap<String, String> dataMap) throws Exception {
        waitForVisible(NitroXHomePage.modeTextbyID);
        KeywordUtil.inputText(NitroXHomePage.modeTextbyID, dataMap.get("Mode"), "Mode value entered using send keys.");
        KeywordUtil.pressEnter(NitroXHomePage.modeTextbyID);
    }

    public static void selectTradingAccount(HashMap<String, String> dataMap) throws Exception {
        KeywordUtil.click(NitroXHomePage.tradingaccount, "Trading Account text field clicked.");
        waitForVisible(By.xpath("//div[@title='" + dataMap.get("TradingAccount") + "']"));
        KeywordUtil.click(By.xpath("//div[@title='" + dataMap.get("TradingAccount") + "']"), "First Trading Account selected from dropdown.");
    }


    public static void inputTradingAccount(HashMap<String, String> dataMap) throws Exception {
        KeywordUtil.click(NitroXHomePage.tradingaccount, "Trading Account text field clicked.");
        KeywordUtil.inputText(NitroXHomePage.inputtradingaccount, dataMap.get("TradingAccount"), "Enter the Account detail");
        KeywordUtil.pressEnter(NitroXHomePage.inputtradingaccount);
    }

    public static void selectBaseCurrency(HashMap<String, String> dataMap) throws Exception {
        KeywordUtil.inputText(NitroXHomePage.Basecurrency, dataMap.get("Base"), "Enter The Base Currency");
    }

    public static void selectQuoteCurrency(HashMap<String, String> dataMap) throws Exception {
        KeywordUtil.inputText(NitroXHomePage.Quotecurrency, dataMap.get("Quote"), "Enter The Quote Currency");
    }

    public String getBaseCurreny() {
        return getElementText(NitroXHomePage.Basecurrency);
    }

    public String getQuoteCurrency() {
        return getElementText(NitroXHomePage.Quotecurrency);
    }

    public static String getAvailableBalance(String coin) {
        availableCoinBalance = getElementText(By.xpath("//span[text()='Balance']/following::table[1]/tbody/tr/td[text()='" + coin + "']/following-sibling::td[1]"));
        availableCoinBalance = availableCoinBalance.replace(",", "");
        LogUtil.infoLog(thisClass, coin + " balance=" + availableCoinBalance);
        return availableCoinBalance;
    }

    public static String getFrozenBalance(String coin) {
        frozenCoinBalance = getElementText(By.xpath("//span[text()='Balance']/following::table[1]/tbody/tr/td[text()='" + coin + "']/following-sibling::td[2]"));
        frozenCoinBalance = frozenCoinBalance.replace(",", "");
        LogUtil.infoLog(thisClass, coin + " balance=" + frozenCoinBalance);
        return frozenCoinBalance;
    }

    public static String getTotalBalance(String coin) {
        totalCoinBalance = getElementText(By.xpath("//span[text()='Balance']/following::table[1]/tbody/tr/td[text()='" + coin + "']/following-sibling::td[3]"));
        totalCoinBalance = totalCoinBalance.replace(",", "");
        LogUtil.infoLog(thisClass, coin + " balance=" + totalCoinBalance);
        return totalCoinBalance;
    }

    public static String getbidprice() {
        waitForVisible(NitroXHomePage.orderBookprice);
        firstbidprice = KeywordUtil.getElementText(NitroXHomePage.orderBookprice);
        LogUtil.infoLog(thisClass, "Biding price" + firstbidprice);
        return firstbidprice;
    }

    public static void InputthePrice() {
        KeywordUtil.inputText(NitroXHomePage.price, getbidprice(), "Entered the Price");
        //System.out.println("Price Selected");
    }

    public static void submitorder(HashMap<String, String> dataMap) {
        waitForVisible(NitroXHomePage.orderBookprice);
    }

    public static void InputQuantity(HashMap<String, String> dataMap) {

        quantity = Double.parseDouble(NitroXHome.getAvailableBalance(dataMap.get("Base")));
        quantity += 100.00;
        LogUtil.infoLog(thisClass, "bidding quantity=" + quantity);
        KeywordUtil.inputText(NitroXHomePage.Quantity, Double.toString(quantity), "Price Entered");
//        KeywordUtil.inputText(NitroXHomePage.Quantity,new_data,"Entered the Quantity");

    }

    public static void CreateOrder() {
        KeywordUtil.click(NitroXHomePage.Buybtn, "Buy order Clicked");
    }


    public static String getLowestBidPrice() {
        waitForVisible(NitroXHomePage.Ordertableprice);
        //List<WebElement> Tablerows = new ArrayList<WebElement>();
        lastbidprice = getElementText(By.xpath("(//span[text()='Orderbook ']/following::table[1]/tbody//child::tr)[last()]/td[2]"));
        lastbidprice = lastbidprice.replace(",", "");
        double a = Double.parseDouble(lastbidprice) - 100.00;
        LogUtil.infoLog(thisClass, "Biding price" + a);
        System.out.println(a);
        return String.valueOf(a);
        // lastbidprice = KeywordUtil.getElementText(NitroXHomePage.Ordertableprice);
    }

    public static void InputOpenOrderBidPrice() {
        KeywordUtil.inputText(NitroXHomePage.price, getLowestBidPrice(), "Entered the Open Bid Price");
    }

    public static void InputCustomQuantity(HashMap<String, String> dataMap) {
        KeywordUtil.inputText(NitroXHomePage.Quantity, dataMap.get("Quantity"), "Entered the Qunatity");

    }

    public static void waitForOpenOrdersTable()
    {
        waitForVisible(NitroXHomePage.openOrderTime_first);
    }
    public static String getTimeofNthOpenOrder(int orderNumber) {
        //return time
        orderNumber += 1;
        openOrderTime = getElementText(By.xpath("//span[text()='Recent Open Orders']/following::table[01]/tbody[01]/tr[" + orderNumber + "]/td[01]/span"));
        System.out.println("order number=" + orderNumber + "openOrderTime=" + openOrderTime);
        return openOrderTime;
    }

    public static void cancelNthOpenOrder(int orderNumber) {
        //click cancel button corresponding to order number
        click(By.xpath("//span[text()='Recent Open Orders']/following::table[01]/tbody[01]/tr[" + orderNumber + "]/td[06]/button"), "Click cancel button");
    }

    public static void verifyOrderCancelledBasedOnTime() {
        Assert.assertNotEquals(getTimeofNthOpenOrder(1), openOrderTime);
    }

    public static void getOrderCancelledSuccessMsg() {
        //waitForVisible("locator for success message");
        waitForVisible(NitroXHomePage.orderCancelSuccessMsg);
    }

}
