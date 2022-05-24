package modules.NitroXActions;

import org.openqa.selenium.By;
import org.testng.Assert;
import pageFactory.NitroXPages.NitroXBuySellFuturePage;
import pageFactory.NitroXPages.NitroXHomePage;
import utilities.GlobalUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;

import static utilities.KeywordUtil.*;

public class NitroXBuySellFutureAction {



    static Class thisClass = NitroXBuySellFutureAction.class;
    public static String lastaskprice;



    public static void selectmode(HashMap<String, String> dataMap) {

        waitForVisible(NitroXBuySellFuturePage.modeTextbyID);
        inputText(NitroXBuySellFuturePage.modeTextbyID, dataMap.get("Mode"), "Mode value entered.");
        pressEnter(NitroXBuySellFuturePage.modeTextbyID);
    }

    public static void inputTradingAccount(HashMap<String, String> dataMap)
    {
        click(NitroXBuySellFuturePage.tradingaccount, "Trading Account text field clicked.");
        inputText(NitroXBuySellFuturePage.inputtradingaccount, dataMap.get("TradingAccount"), dataMap.get("TradingAccount") + " : Trading account");
        pressEnter(NitroXBuySellFuturePage.inputtradingaccount);
    }

    public static void ClickBuyButton() {
        KeywordUtil.click(NitroXBuySellFuturePage.Buybtn, "Buy order Clicked");
    }


    public static void inputInstrument(HashMap<String, String> dataMap) {
    try
    {
        click(NitroXBuySellFuturePage.instrumentype, "Instrument Currency text field clicked.");
        inputText(NitroXBuySellFuturePage.instrumentype, dataMap.get("Instrument"), "Instrument selected");
        click(By.xpath("//div[text()='"+dataMap.get("Instrument")+"']"),"Entered");

    }
    catch (Throwable e)
    {
        GlobalUtil.e = e;
        e.printStackTrace();
        GlobalUtil.errorMsg = e.getMessage();
        Assert.fail(e.getMessage());
    }
    }

    public static void inputPositionMode(HashMap<String, String> dataMap)
    {

        inputText(NitroXBuySellFuturePage.positionmode, dataMap.get("Position"), dataMap.get("Position") + " : Position Mode");
        try {
            scrollingToElementofAPage(NitroXBuySellFuturePage.positionmode,"Scrolled to element");
            pressEnter(NitroXBuySellFuturePage.positionmode);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        //click(By.xpath("//span[text()='"+dataMap.get("Position")+"']"),"Entered");

    }

    public static void inputLeverage(HashMap<String, String> dataMap) {

        inputText(NitroXBuySellFuturePage.leverage, dataMap.get("Leverage"), dataMap.get("Leverage") + " : Leverage Mode");
        //click(By.xpath("//div[text()='"+dataMap.get("Leverage")+"']"),"Entered the Leverage Type");
        pressEnter(NitroXBuySellFuturePage.leverage);
    }

    public static void selectMarginType(HashMap<String, String> dataMap)
    {
        inputText(NitroXBuySellFuturePage.margintype, dataMap.get("Margin Type"), dataMap.get("Margin Type") + " : Margin Type");
        pressEnter(NitroXBuySellFuturePage.margintype);
        //click(By.xpath("//div[text()='"+dataMap.get("Margin Type")+"']"),"Entered the Margin");
    }


    public static String getLowestAskPrice() {
        waitForVisible(NitroXHomePage.Ordertableprice);
        lastaskprice = getElementText(By.xpath("(//span[text()='Orderbook ']/following::table[1]/tbody//child::tr)[last()]/td[2]"));
        lastaskprice = lastaskprice.replace(",", "");
        double a = Double.parseDouble(lastaskprice) - 10.00;
        LogUtil.infoLog(thisClass, "Biding price" + a);
        System.out.println(a);
        return String.valueOf(a);
    }

    public static void InputOpenOrderAskPrice() {
        KeywordUtil.inputText(NitroXHomePage.price, getLowestAskPrice(), "Entered the Open Bid Price");
    }

    public static void clickOpenState() {

        click(NitroXBuySellFuturePage.openOrderTab,"clicked the Open Order");
    }


}