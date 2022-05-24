package modules.NitroXActions;

import org.openqa.selenium.By;
import org.testng.Assert;
import pageFactory.NitroXPages.NitroXBuySellFuturePage;
import pageFactory.NitroXPages.NitroXHomePage;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

import java.util.HashMap;

import static utilities.KeywordUtil.*;

public class NitroXBuySellFutureAction {



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
        //click(NitroXBuySellFuturePage.instrumentype, "Instrument Currency text field clicked.");
        //inputText(NitroXBuySellFuturePage.instrumentype, dataMap.get("Instrument"), "Instrument selected");
        //pressEnter(NitroXBuySellFuturePage.instrumentype);

//        click(NitroXBuySellFuturePage.instrumentype, "Instrument Currency text field clicked");
//        //waitForVisible(By.xpath("//input[@id='" + dataMap.get("Instrument") + "']"));
//        KeywordUtil.click(By.xpath("//input[@id='" + dataMap.get("Instrument") + "']"), "Instrument Currency seleced");
    }
    catch (Throwable e)
    {
        GlobalUtil.e = e;
        e.printStackTrace();
        GlobalUtil.errorMsg = e.getMessage();
        Assert.fail(e.getMessage());
    }
    }
}
