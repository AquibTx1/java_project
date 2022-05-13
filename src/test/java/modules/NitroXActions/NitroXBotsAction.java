package modules.NitroXActions;

import NitroXPages.NitroXBotsPage;
import NitroXPages.NitroXHomePage;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;

import static utilities.KeywordUtil.pressEnter;
import static utilities.KeywordUtil.waitForVisible;

public class NitroXBotsAction {

    static Class thisClass = NitroXBotsAction.class;
    static String firstbotid,firsttradingAccount;


    public static void clickStart() throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.startbtn,  "Start Button Clicked");
    }

    public static void inputService(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.service, dataMap.get("Service"), "Service value entered ");
        pressEnter(NitroXBotsPage.service);
    }

    public static void inputMethod(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.method, dataMap.get("Method"), "Method of bot value entered ");
    }

    public static void inputBotQuantity(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.botquanity, dataMap.get("Bot Quantity"), "Bot Quantity value entered ");
    }

    public static void inputOrderDirection(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.orderdirection, dataMap.get("Order Direction"), "BUY or Sell Order field selected ");
    }

    public static void inputMinTime(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.mintimebreak, dataMap.get("Min Time Break"), "Min Time values selected");
    }

    public static void inputMaxTime(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.maxtimebreak, dataMap.get("Max Time Break"), "Max Time  selected ");
    }

    public static void inputQuantity(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.orderamount, dataMap.get("Order Amount"), "Amount vale entered ");
    }

    public static void inputMinPrice(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.minprice, dataMap.get("Min Price"), "Min Amount value entered ");
    }

    public static void inputMaxPrice(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.maxprice, dataMap.get("Max Price"), "Max Amount value entered ");
    }

    public static void inputOrderType(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.ordertype, dataMap.get("Order Type"), "Order Type selected ");
    }

    public static void inputDealRef(HashMap<String,String> dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.dealref, dataMap.get("Deal Ref"), "Deal Ref. entered ");
    }

    public static void clickSubmit(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.submitbtn,  "Bot Exec Submit Button Clicked");
    }

    public static void closeBot() throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.closebtn,  "Bot Exec close Button Clicked");
    }

    public static void getTotalBots() throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.totalfilered,  "Total Filtered Bots  Clicked");
    }

    public static void getDetailedBots()
    {
        KeywordUtil.switchToFrame("babda");
    }

    public static String getBotId() throws Exception
    {
        waitForVisible(NitroXBotsPage.botid);
        firstbotid = KeywordUtil.getElementText(NitroXBotsPage.botid);
        LogUtil.infoLog(thisClass, "BOT  Id Is" + firstbotid);
        return firstbotid;
    }

    public static String getName() throws Exception
    {
        waitForVisible(NitroXBotsPage.botName);
        firsttradingAccount = KeywordUtil.getElementText(NitroXBotsPage.botName);
        LogUtil.infoLog(thisClass, "Trader  Name Is" + firsttradingAccount);
        return firsttradingAccount;
    }

    public static void waitforBotWindow() throws Exception
    {
        waitForVisible(NitroXBotsPage.startnewbot);
    }

}
