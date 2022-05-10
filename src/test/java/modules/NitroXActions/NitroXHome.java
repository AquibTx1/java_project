package modules.NitroXActions;

import NitroXPages.NitroXHomePage;
import org.testng.Assert;
import utilities.KeywordUtil;

import java.util.HashMap;

import static utilities.KeywordUtil.getElementText;
import static utilities.KeywordUtil.waitForVisible;

public class NitroXHome {

    public static void selectmode(HashMap<String,String> dataMap) throws Exception
    {
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
    public static void inputMode(HashMap<String, String> dataMap) throws Exception
    {
        waitForVisible(NitroXHomePage.modeTextbyID);
        KeywordUtil.inputText(NitroXHomePage.modeTextbyID, dataMap.get("Mode"), "Mode value entered using send keys.");
        KeywordUtil.pressEnter(NitroXHomePage.modeTextbyID);
    }

    public static void selectTradingAccount(HashMap<String, String> dataMap) throws Exception
    {
        KeywordUtil.click(NitroXHomePage.tradingaccount, "Trading Account text field clicked.");
        waitForVisible(NitroXHomePage.selecttradingaccount1);
        if (dataMap.get("TradingAccount").equalsIgnoreCase("Trader01@Tinyex")) {
            KeywordUtil.click(NitroXHomePage.selecttradingaccount1, "First Trading Account selected from dropdown.");
        } else if (dataMap.get("TradingAccount").equalsIgnoreCase("Trader02@Tinyex"))
        {
            KeywordUtil.click(NitroXHomePage.selecttradingaccount2, "Second Trading Account selected from dropdown");
        }
    }

    public static void inputTradingAccount(HashMap<String, String> dataMap) throws Exception
    {
        KeywordUtil.click(NitroXHomePage.tradingaccount, "Trading Account text field clicked.");
        KeywordUtil.inputText(NitroXHomePage.inputtradingaccount, dataMap.get("TradingAccount"), "Enter the Account detail");
        KeywordUtil.pressEnter(NitroXHomePage.inputtradingaccount);
    }
    public static void selectBaseCurrency(HashMap<String, String> dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXHomePage.Basecurrency,dataMap.get("Base"),"Enter The Base Currency");
    }

    public static void selectQuoteCurrency(HashMap<String, String> dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXHomePage.Quotecurrency,dataMap.get("Quote"),"Enter The Quote Currency");
    }

    public String getBaseCurreny()
    {
        String BaseCurrency=getElementText(NitroXHomePage.Basecurrency);
        return  BaseCurrency;
    }
    public String getQuoteCurrency()
    {

        String QuoteCurrency=getElementText(NitroXHomePage.Quotecurrency);
        return  QuoteCurrency;
    }
}
