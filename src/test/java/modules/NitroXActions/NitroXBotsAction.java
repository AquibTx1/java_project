package modules.NitroXActions;

import pageFactory.NitroXPages.NitroXBotsPage;
import org.openqa.selenium.By;
import pageFactory.NitroXPages.NitroXHomePage;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;

import static utilities.KeywordUtil.*;

public class NitroXBotsAction {

    static Class thisClass = NitroXBotsAction.class;
    public static String getTotal, firstbotid,firsttradingAccount,trrigervalue,tvalue,dealref;
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
        LogUtil.infoLog(thisClass, "Actual Trigger value :" +trrigervalue);
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

    public static void CloseConfigTab()
    {
        KeywordUtil.click(NitroXBotsPage.closeconfigbtn,  " Closed Clicked");
        LogUtil.infoLog(thisClass, "Closed  the config Tab");
    }

    public static void CloseBotDetail() {
        KeywordUtil.click(NitroXBotsPage.closebotdetailbtn,  " BOT Detail Closed");
        LogUtil.infoLog(thisClass, "Closed  the Bot Detail");
    }

    public static void clickDealtOrdersTab()
    {
        click(NitroXBotsPage.DealtOrderTab, "Clicked Dealt Order");
    }

    public static void stopAllBots()  {

        try {
            click(NitroXBotsPage.totalfilered,"Clicked Total Filtered");
            delay(2000);
            waitForVisible(NitroXBotsPage.allbots);
            click(NitroXBotsPage.allbots,"Selected All Bots");
            scrollingToElementofAPage(NitroXBotsPage.stopbots,"Scrolled to Stop All Bots ");
            click(NitroXBotsPage.stopbots,"Stopped all Bots");
            waitForVisible(NitroXBotsPage.nodata);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void stopCurrentBot(){
            try {
                KeywordUtil.pageRefresh();
                click(NitroXBotsPage.totalfilered,"Clicked Total Filtered");
                delay(1000);
                NitroXBotsAction.sortStartTime();
                //NitroXBotsAction.selectLatestBotName();
                click(NitroXBotsPage.currentbot,"Selected Current Bot");
                scrollingToElementofAPage(NitroXBotsPage.stopbots,"Scrolled to Stop All Bots ");
                click(NitroXBotsPage.stopbots,"Stopped the Current  Bot");
                click(NitroXBotsPage.closebtn,"Clicked the Detailed Bot");
            } catch (Throwable e) {
                e.getMessage();
                e.printStackTrace();
            }

    }

    public static double getPrice() {
        waitForVisible(NitroXHomePage.Ordertableprice);
        String lastaskprice = getElementText(By.xpath("(//span[text()='Orderbook ']/following::table[1]/tbody//child::tr)[last()]/td[2]"));
        lastaskprice = lastaskprice.replace(",", "");
        LogUtil.infoLog(thisClass, "Biding price" + lastaskprice);
        return Double.parseDouble(lastaskprice);
    }

    public static double getBidPrice() {
        waitForVisible(By.xpath("//span[text()='Spread:']/following::table[1]/tbody/tr"));
        String firstbidprice = getElementText(By.xpath("(//span[text()='Spread:']/following::table[1]/tbody//child::tr)[1]/td[2]"));
        firstbidprice = firstbidprice.replace(",", "");
        LogUtil.infoLog(thisClass, "Biding price" + firstbidprice);
        return Double.parseDouble(firstbidprice.replace(",",""));
    }

    public static double getDealtOrderPrice()
    {
        String price = getElementText(By.xpath("//span[text()='Recent Dealt Orders']/following::table[01]/tbody[01]/tr[02]/td[03]/span"));
        LogUtil.infoLog(thisClass, "Dealt order price=" + price);
        return Double.parseDouble(price.replace(",", ""));
    }

    public static String getSide()
    {
        String side=getElementText(By.xpath("//span[text()='Recent Dealt Orders']/following::table[01]/tbody[01]/tr[02]/td[02]"));
        LogUtil.infoLog(thisClass, "Side is=" + side);
        return side;
    }


    /*********************************SNIPER BOT********************************************/

    public static void selectSide(HashMap<String,String>dataMap) throws InterruptedException {
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.side);
        delay(1000);
        KeywordUtil.inputText(NitroXBotsPage.side, dataMap.get("Side"), "BUY or Sell Order field selected ");
        pressEnter(NitroXBotsPage.side);
    }

    public static void inputTotalAmount(HashMap<String,String>dataMap) throws InterruptedException {

        KeywordUtil.inputText(NitroXBotsPage.totalamount, dataMap.get("TotalAmount"), "Amount vale entered ");
        //pressEnter(NitroXBotsPage.totalamount);
    }
    public static String getTotalAmount(){
        String amount=getElementText(NitroXBotsPage.totalamount);
        LogUtil.infoLog(thisClass, "Deal Reference in Quantity : " + amount);
        return amount;
    }
    public static String getAmountfromBotDetailSnipper()
    {
        String s_amount=getElementText(NitroXBotsPage.botdetail_snipper);
        LogUtil.infoLog(thisClass, "Deal Reference Amount : " + s_amount);
        return s_amount;

    }
    public static void inputMinPriceforSniper(HashMap<String,String>dataMap) throws InterruptedException {

        KeywordUtil.click(NitroXBotsPage.minprice_sniper,"Min Price  Values Entered");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.minprice_sniper);
        KeywordUtil.inputText(NitroXBotsPage.minprice_sniper, dataMap.get("MinPrice"), "Min Amount value entered ");

    }

    public static void inputMaxPriceforSniper(HashMap<String,String>dataMap) throws InterruptedException {

        KeywordUtil.click(NitroXBotsPage.maxprice_sniper,"Max Price  Values Entered");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.maxprice_sniper);
        KeywordUtil.inputText(NitroXBotsPage.maxprice_sniper, dataMap.get("MaxPrice"), "Max Amount value entered ");
    }

    public static void inputMaxThreshold(HashMap<String,String>dataMap) throws InterruptedException {

        KeywordUtil.click(NitroXBotsPage.maxSlippageThreshold_sniper,"Threshold  Values Entered");
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.maxSlippageThreshold_sniper);
        KeywordUtil.inputText(NitroXBotsPage.maxSlippageThreshold_sniper, dataMap.get("MaxSlippageThreshold"), "Threshold  Values Entered");
    }

    public static String getTrigerConditionvalue_Sniper() {

        String tvalue_sniper = getElementText(NitroXBotsPage.s_trrigger);
        LogUtil.infoLog(thisClass, "Trigger  value in Config Tab : " + tvalue_sniper);
        return tvalue_sniper;
    }
    public static void inputPairBotQuantity(HashMap<String, String> dataMap) {

        try {
            KeywordUtil.clearInputUsingKeys(NitroXBotsPage.quantity);
            KeywordUtil.inputText(NitroXBotsPage.quantity, dataMap.get("Quantity"), "Quantity entered");
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }


    public static void inputSliceSize(HashMap<String, String> dataMap) {

        try {
            KeywordUtil.clearInputUsingKeys(NitroXBotsPage.slicesize);
            KeywordUtil.inputText(NitroXBotsPage.slicesize, dataMap.get("SliceSize"), "SliceSize value entered");
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void selectmode(HashMap<String, String> dataMap) {
        try {
            waitForVisible(NitroXBotsPage.instrumenttype);
            inputText(NitroXBotsPage.instrumenttype,dataMap.get("Mode"),"Mode Selected");
        }
        catch (Throwable ex) {
            throw new RuntimeException(ex);
        }

    }

    public static void inputTradingAccount(HashMap<String, String> dataMap) {
        try {
            click(NitroXBotsPage.accountid, "Trading Account text field clicked.");
            inputText(NitroXBotsPage.accountid, dataMap.get("TradingAccount"), "Trading Account Selected");
            pressEnter(NitroXBotsPage.accountid);
        }
        catch(Throwable ex)
        {
            throw new RuntimeException(ex);
        }
    }

    public static void inputBaseCurrency(HashMap<String, String> dataMap) {

        try {
            click(NitroXBotsPage.basecurrency, "Base text field clicked.");
            inputText(NitroXBotsPage.basecurrency, dataMap.get("Base"), "Base Currency Entered");
        }
        catch(Throwable ex)
        {
            throw new RuntimeException(ex);
        }
    }
    public static void inputQuoteCurrency(HashMap<String, String> dataMap) {

        try {
            click(NitroXBotsPage.quotecurrency, "Quote text field clicked.");
            inputText(NitroXBotsPage.quotecurrency, dataMap.get("Quote"), "Quote Currency Entered");

        }
        catch(Throwable ex)
        {
            throw new RuntimeException(ex);
        }
    }

    public static void selectMainPairTradingSide(HashMap<String,String>dataMap) throws InterruptedException {
        KeywordUtil.clearInputUsingKeys(NitroXBotsPage.side);
        delay(1000);
        KeywordUtil.inputText(NitroXBotsPage.side, dataMap.get("Side"), "BUY or Sell Order field selected ");
        pressEnter(NitroXBotsPage.side);
    }

    public static void selectSubPairSide(HashMap<String, String> dataMap) {

        try {
            KeywordUtil.clearInputUsingKeys(NitroXBotsPage.pairlegSide);
            KeywordUtil.inputText(NitroXBotsPage.pairlegSide, dataMap.get("Side"), "BUY or Sell Order field selected ");
            pressEnter(NitroXBotsPage.pairlegSide);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void inputDuration(HashMap<String, String> dataMap) {
        try {
            KeywordUtil.clearInputUsingKeys(NitroXBotsPage.duration);
            KeywordUtil.inputText(NitroXBotsPage.duration, dataMap.get("Duration"), "Duration of Bot entered");
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

    }
    public static void inputDealRefNumber()
    {
        dealref=KeywordUtil.generateRandomNumber();
        KeywordUtil.inputText(NitroXBotsPage.dealref,dealref,"Entered Deal Ref. ");
        LogUtil.infoLog(thisClass, "Actual Trigger value :" +dealref);
    }

    public static String getDealRef() {

        String dealref = getElementText(NitroXBotsPage.dealrefrow);
        LogUtil.infoLog(thisClass, "Deal Reference in get deal is : " + dealref);
        return dealref;
    }

    public static String getQuantity() {
        String quantity = getElementText(NitroXBotsPage.quantity_twap);
        LogUtil.infoLog(thisClass, "Deal Reference in Quantity : " + quantity);
        return quantity;
    }
    public static void selectSideTwapBot(HashMap<String,String>dataMap) throws InterruptedException {

        KeywordUtil.inputText(NitroXBotsPage.side, dataMap.get("TSIDE"), "BUY or Sell Order field selected ");
        pressEnter(NitroXBotsPage.side);
    }
    public static String getSideTwap()
    {
        String side = getElementText(NitroXBotsPage.side_twap);
        LogUtil.infoLog(thisClass, "Deal Reference in Quantity : " + side);
        return side;
    }
    public static void getFilteredBots() throws InterruptedException {
        String a =(getElementText(By.xpath("//div[text()='Total (Filtered)']/following-sibling::*/span/span")));
        int bots= Integer.parseInt(a);
        if(bots>0)
        {
            NitroXBotsAction.stopAllBots();
            NitroXBotsAction.refreshPage();
            delay(2000);
        }
    }
    public static void validateStatus() {
        try
        {
            int count = 0;
            for (int i = 0; i < 15; i++)
            {
                    count = getDriver().findElements(By.xpath("//span[text()='STRATEGY COMPLETED']")).size();
                    if (count < 1) {
                        KeywordUtil.pageRefresh();
                        delay(2000);
                        NitroXBotsAction.selecttotalBots();
                        NitroXBotsAction.sortStartTime();
                        NitroXBotsAction.selectLatestBotName();
                        delay(3000);
                    }
                    else {
                        break;
                    }
            }
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }
    }
    public static void refreshPage() {

        KeywordUtil.pageRefresh();
    }

    public static void inputTargetAccountPosition(HashMap<String, String> dataMap)
    {

        KeywordUtil.inputText(NitroXBotsPage.targetaccountposition,dataMap.get("TargetAmount"), "Duration of Bot entered");
    }
    public static void getTargetAccountPosition(HashMap<String, String> dataMap)

    {
        String S1 = dataMap.get("Instrument").toString();
        String[] S2 = S1.split(" ");
        String instrument = S2[0].replace("/", "");
        String targetaccount= getElementText(By.xpath("//span[text()='Balance']/following::table[1]/tbody/tr/td[starts-with(text(),'"+instrument+"')]/following-sibling::td[1]"));
        targetaccount = targetaccount.replace(",", "");
        double amount = Double.parseDouble(targetaccount) + 300;
        LogUtil.infoLog(thisClass, "Asset  Amount" + amount);
        dataMap.put("TargetAmount",String.valueOf(amount));
    }


}
