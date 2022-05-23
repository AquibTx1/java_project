package modules.XAlphaActions;

import org.openqa.selenium.By;
import pageFactory.XAlphaPages.XAlphaDealEnquiryPage;
import pageFactory.XAlphaPages.XAlphaDealsPage;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;

public class XAlphaDealActions extends KeywordUtil {

    static Class thisClass = XAlphaLoginActions.class;

    public static void clickXAlphaHeader() {
        click(XAlphaDealsPage.xAlphaHeader, "Click X-Alpha Tab");
    }

    public static void waitForDealInputTab() {
        waitForVisible(XAlphaDealsPage.dealInputTab);
    }

    public static void clickDealInputTab() {
        click(XAlphaDealsPage.dealInputTab, "Click deal input tab");
    }

    public static void waitFordealInput_navbar() {
        waitForVisible(XAlphaDealsPage.dealInput_navbar);
    }

    public static void clickFXSpotTab() {
        click(XAlphaDealsPage.dealInput_FXSpot, "Click FX Spot tab");
    }

    public static void dealInput_direction_click() {
        click(XAlphaDealsPage.dealInput_direction, "Click FX Spot tab");
    }

    public static void dealInput_direction(HashMap<String, String> dataMap) {
        inputText(XAlphaDealsPage.dealInput_direction, dataMap.get("Direction").toLowerCase(), "Select deal input direction");
        pressEnter(XAlphaDealsPage.dealInput_direction);
    }

    public static void dealInput_BaseAssetAmount(HashMap<String, String> dataMap) {
        inputText(XAlphaDealsPage.dealInput_BaseAssetAmount, dataMap.get("BaseAssetAmount"), "Select deal input base asset amount");
    }

    public static void dealInput_BaseAsset(HashMap<String, String> dataMap) {
        inputText(XAlphaDealsPage.dealInput_BaseAsset, dataMap.get("BaseAsset"), "Select deal input base asset");
        pressEnter(XAlphaDealsPage.dealInput_BaseAsset);
    }

    public static void dealInput_QuoteAsset(HashMap<String, String> dataMap) {
        inputText(XAlphaDealsPage.dealInput_QuoteAsset, dataMap.get("QuoteAsset"), "Select deal input Quote Asset");
        pressEnter(XAlphaDealsPage.dealInput_QuoteAsset);
    }

    public static String get_dealInput_ReferencePrice() throws InterruptedException {
        delay(1000);
        String referencePrice = getElementValueWithVisibility(XAlphaDealsPage.dealInput_ReferencePrice);
        LogUtil.infoLog(XAlphaDealActions.class, "Reference price=" + referencePrice);
        return referencePrice;
    }

    public static void dealInput_UnitPrice(String arg0) {
        inputText(XAlphaDealsPage.dealInput_UnitPrice, arg0, "Select deal input unit price");
    }

    public static String get_dealInput_UnitPrice() {
        String dealInput_UnitPrice;
        dealInput_UnitPrice = getElementValue(XAlphaDealsPage.dealInput_UnitPrice);
        LogUtil.infoLog(XAlphaDealActions.class, "dealInput_UnitPrice" + dealInput_UnitPrice);
        return dealInput_UnitPrice;
    }

    public static String get_dealInput_QuoteAssetAmount() {
        String dealInput_QuoteAssetAmount;
        dealInput_QuoteAssetAmount = getElementValue(XAlphaDealsPage.dealInput_QuoteAssetAmount);
        LogUtil.infoLog(XAlphaDealActions.class, "dealInput_QuoteAssetAmount" + dealInput_QuoteAssetAmount);
        return dealInput_QuoteAssetAmount;
    }

    public static void dealInput_FeeAsset(HashMap<String, String> dataMap) {
        inputText(XAlphaDealsPage.dealInput_FeeAsset, dataMap.get("FeeAsset"), "Select deal input Fee Asset");
        pressEnter(XAlphaDealsPage.dealInput_FeeAsset);
    }

    public static void dealInput_FeeAmount(HashMap<String, String> dataMap) throws InterruptedException {
        clearInputUsingKeys(XAlphaDealsPage.dealInput_FeeAmount);
        inputText(XAlphaDealsPage.dealInput_FeeAmount, dataMap.get("FeeAmount"), "Select deal input Fee Amount");
    }

    public static String get_dealInput_FeeAmount() throws InterruptedException {
        delay(1000);
        String feeAmount = getElementValueWithVisibility(XAlphaDealsPage.dealInput_FeeAmount);
        LogUtil.infoLog(XAlphaDealActions.class, "Fee Amount=" + feeAmount);
        return feeAmount;
    }

    public static void dealInput_CounterpartyName(HashMap<String, String> dataMap) {
        inputText(XAlphaDealsPage.dealInput_CounterpartyName, dataMap.get("CounterpartyName"), "Select deal input Counterparty Name");
        pressEnter(XAlphaDealsPage.dealInput_CounterpartyName);
    }

    public static void dealInput_PortfolioNumber(HashMap<String, String> dataMap) {
        inputText(XAlphaDealsPage.dealInput_PortfolioNumber, dataMap.get("PortfolioNumber"), "Select deal input Portfolio Number");
        pressEnter(XAlphaDealsPage.dealInput_PortfolioNumber);
    }

    public static void dealInput_ProcessingStatus(HashMap<String, String> dataMap) throws InterruptedException {
        String processingStatus = dataMap.get("ProcessingStatus").toLowerCase();
        inputText(XAlphaDealsPage.dealInput_ProcessingStatus, processingStatus, "Select deal input ProcessingStatus");
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + processingStatus + "']"));
        click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + processingStatus + "']"), "processingStatus=" + processingStatus);
    }

    public static void dealInput_CreateBtn() {
        click(XAlphaDealsPage.dealInput_CreateBtn, "Click deal input Create Button");
    }

    public static String dealInput_SubmitMessage() {
        String msg = getElementText(XAlphaDealsPage.dealInput_validationMsg);
        LogUtil.infoLog(thisClass, "deal message=" + msg);
        return msg;
    }

}
