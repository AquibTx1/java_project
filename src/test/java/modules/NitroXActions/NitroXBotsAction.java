package modules.NitroXActions;

import pageFactory.NitroXPages.NitroXBotsPage;
import org.openqa.selenium.By;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;

import static utilities.KeywordUtil.*;

public class NitroXBotsAction {

    static Class thisClass = NitroXBotsAction.class;
    public static String getTotal, firstbotid,firsttradingAccount,trrigervalue,tvalue;
   public static int totalfiltered = 0;

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
        pressEnter(NitroXBotsPage.method);
    }

    public static void inputBotQuantity(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.botquanity,"Clicked into the Bot Quantity");
        KeywordUtil.pressBackSpace(NitroXBotsPage.botquanity);
        KeywordUtil.inputText(NitroXBotsPage.botquanity, dataMap.get("Bot Quantity"), "Bot Quantity value entered ");
        //pressEnter(NitroXBotsPage.botquanity);
    }

    public static void inputOrderDirection(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.orderdirection);
        delay(2000);
        KeywordUtil.inputText(NitroXBotsPage.orderdirection, dataMap.get("Order Direction"), "BUY or Sell Order field selected ");
        pressEnter(NitroXBotsPage.orderdirection);

    }

    public static void inputMinTime(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.mintimebreak,"Min Time Values Click");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.mintimebreak);
        KeywordUtil.inputText(NitroXBotsPage.mintimebreak, dataMap.get("Min Time Break"), "Min Time values selected");
    }

    public static void inputMaxTime(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.maxtimebreak,"Max Time Values Click");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.maxtimebreak);
        KeywordUtil.inputText(NitroXBotsPage.maxtimebreak, dataMap.get("Max Time Break"), "Max Time  selected ");
    }

    public static void inputOrderAmount(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.orderamount,"Ordered Amount Entered");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.orderamount);
        KeywordUtil.inputText(NitroXBotsPage.orderamount, dataMap.get("Order Amount"), "Amount vale entered ");
    }

    public static void inputMinPrice(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.minprice,"Min Price  Values Click");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.minprice);
        KeywordUtil.inputText(NitroXBotsPage.minprice, dataMap.get("Min Price"), "Min Amount value entered ");
    }

    public static void inputMaxPrice(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.maxprice,"Max Price Values Click");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.maxprice);
        KeywordUtil.inputText(NitroXBotsPage.maxprice, dataMap.get("Max Price"), "Max Amount value entered ");
    }

    public static void inputOrderType(HashMap<String,String>dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.ordertype, dataMap.get("Order Type"), "Order Type selected ");
        pressEnter(NitroXBotsPage.ordertype);
    }

    public static void inputDealRef(HashMap<String,String> dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXBotsPage.dealref, dataMap.get("Deal Ref"), "Deal Ref. entered ");
    }

    public static void clickSubmit() throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.submitbtn,  "Bot Exec Submit Button Clicked");
    }

    public static void closeBot() throws Exception
    {
        KeywordUtil.click(NitroXBotsPage.closebtn,  "Bot Exec close Button Clicked");
    }

    public static void selecttotalBots() throws Exception
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

    public static void getBotSubmitSuccessMsg() throws Exception
    {
        waitForVisible(NitroXBotsPage.botsuccessMsg);
        LogUtil.infoLog(thisClass, "Bot successfully Submitted message displayed.");

    }
    public static String getBotStartTime() throws Exception
    {
        waitForVisible(NitroXBotsPage.starttime);
        String time=getElementText(By.xpath("//span[text()='Detailed Bots ETH/USDT' or text()='Detailed Bots BTC/USDT']/following::table[1]/tbody/tr[1]/td[7]"));
        System.out.println(time);
        return time;
    }

    public static int getTotalFilteredBots()
    {
        String getTotal=getElementText(By.xpath("//div[text()='Total (Filtered)']/following-sibling::*/span/span"));
        totalfiltered= Integer.parseInt(getTotal);
        return  totalfiltered;
    }
    public static int getBotafterBuyorSell(){
        getTotal=getElementText(By.xpath("//div[text()='Total (Filtered)']/following-sibling::*/span/span"));
        return  Integer.parseInt(getTotal);
    }
    public static void sortStartTime() throws InterruptedException {
        KeywordUtil.click(NitroXBotsPage.clickstarttime,"Sorted Based on Start Time");
        delay(2000);
        KeywordUtil.click(NitroXBotsPage.clickstarttime,"Sorted Based on Start Time");
        LogUtil.infoLog(thisClass, "sorted the Start Time to get Latest Bot Created");
    }
    public static void inputTrigerCondtion()
    {
        trrigervalue=KeywordUtil.generateRandomNumber();
        KeywordUtil.inputText(NitroXBotsPage.trrigercond,trrigervalue,"Entered Trigger ");
        LogUtil.infoLog(thisClass, "Entered the Triggered");
    }
    public static void selectLatestBotName()
    {
        KeywordUtil.click(NitroXBotsPage.botName,  "Total Filtered Bots  Clicked");
        LogUtil.infoLog(thisClass, "Clicked the Latest Bot Created");
    }
    public static void selectConfig()
    {

        KeywordUtil.click(NitroXBotsPage.config,  "Total Filtered Bots  Clicked");
        LogUtil.infoLog(thisClass, "Clicked the config");
        //waitForVisible(NitroXBotsPage.trigger);
    }
    public static String getTrigerConditionvalue() {

        tvalue= KeywordUtil.getElementText(NitroXBotsPage.trrigger);
        LogUtil.infoLog(thisClass, "Trigger value is" + tvalue);
        return tvalue;
    }
}
