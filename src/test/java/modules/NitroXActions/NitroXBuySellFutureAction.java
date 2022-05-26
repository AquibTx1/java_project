package modules.NitroXActions;

import org.openqa.selenium.By;
import org.testng.Assert;
import pageFactory.NitroXPages.NitroXBotsPage;
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
        try {
            scrollingToElementofAPage(NitroXBuySellFuturePage.positionmode,"Scrolled to element");
            inputText(NitroXBuySellFuturePage.positionmode, dataMap.get("Position"), dataMap.get("Position") + " : Position Mode");
            pressEnter(NitroXBuySellFuturePage.positionmode);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        //click(By.xpath("//span[text()='"+dataMap.get("Position")+"']"),"Entered");
    }

    public static void inputLeverage(HashMap<String, String> dataMap) {
        try {
            inputText(NitroXBuySellFuturePage.leverage, dataMap.get("Leverage"), "Leaverage Selected");
            delay(2000);
            click(By.xpath("//div[text()='x"+dataMap.get("Leverage")+"']"),"Entered");
            //click(By.xpath("//div[text()='"+dataMap.get("Leverage")+"']"),"Entered the Leverage Type");
        }
        catch (Throwable e)
        {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    public static void selectMarginType(HashMap<String, String> dataMap)
    {
        try {
            inputText(NitroXBuySellFuturePage.margintype, dataMap.get("Margin Type"), dataMap.get("Margin Type") + " : Margin Type");
            pressEnter(NitroXBuySellFuturePage.margintype);
            //click(By.xpath("//div[text()='"+dataMap.get("Margin Type")+"']"),"Entered the Margin");}
        }
        catch (Throwable e)
        {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    public static String getLowestAskPrice()
    {
        waitForVisible(NitroXHomePage.Ordertableprice);
        lastaskprice = getElementText(By.xpath("(//span[text()='Orderbook ']/following::table[1]/tbody//child::tr)[last()]/td[2]"));
        lastaskprice = lastaskprice.replace(",", "");
        double a = Double.parseDouble(lastaskprice) - 10.00;
        LogUtil.infoLog(thisClass, "Ask price" + a);
        return String.valueOf(a);
    }

    public static void InputOpenOrderAskPrice() {
        KeywordUtil.inputText(NitroXHomePage.price, getLowestAskPrice(), "Entered the Open Bid Price");
    }
    public static void clickOpenState()
    {
        try {
            click(NitroXBuySellFuturePage.openOrderTab, "clicked the Open Order");
            LogUtil.infoLog(thisClass, "Cancelled The Buy Order");
        }
           catch (Throwable e)
        {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    public static void cancelFirstBuyOrderforFutureMode()
    {
        try {
            click(NitroXBuySellFuturePage.cancelFirstBuyOrder, "Cancel very first buy order");
            LogUtil.infoLog(thisClass, "Cancelled The Buy Order");
        }
        catch (Throwable e)
        {
            GlobalUtil.e = e;
            e.printStackTrace();
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    public static void clickDealtOrdersTab()
    {
        click(NitroXBotsPage.DealtOrderTab, "Clicked Dealt Order");
    }
    public static double getQuantityofNthDealtOrder(int orderNumber) {
        orderNumber += 1;
        String quantity = getElementText(By.xpath("//span[text()='Recent Dealt Orders']/following::table[01]/tbody[01]/tr[" + orderNumber + "]/td[05]/span"));
        LogUtil.infoLog(thisClass, "Dealt order quantity=" + quantity);
        return Double.parseDouble(quantity);
    }
    public static void validateInstrument(HashMap<String, String> dataMap) throws InterruptedException {

        int s = getDriver().findElements(By.xpath("//th[text()='Symbol']/../../following-sibling::tbody/tr")).size();
        String S1=dataMap.get("Instrument").toString();
        String[] S2= S1.split(" ");
        String S3=	S2[0].replace("/", "");

        boolean flag=false;
        for(int i=1;i<=s;i++)
        {
           String value= getDriver().findElement(By.xpath("//th[text()='Symbol']/../../following-sibling::tbody/tr["+i+"]/td[1]")).getText();
            if(value.equals(S3))
            {
                flag=true;
                click(By.xpath("//th[text()='Symbol']/../../following-sibling::tbody/tr["+i+"]/td[12]//span[text()='Market']"),"Clicked The Postion");
                delay(60000);
            }
            break;
        }
    }

}
