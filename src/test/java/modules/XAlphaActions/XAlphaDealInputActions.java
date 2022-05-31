package modules.XAlphaActions;

import org.openqa.selenium.By;
import pageFactory.XAlphaPages.XAlphaDealInputPage;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;

public class XAlphaDealInputActions extends KeywordUtil {

    static Class thisClass = XAlphaLoginActions.class;

    public static void clickXAlphaHeader() {
        click(XAlphaDealInputPage.xAlphaHeader, "Click X-Alpha Tab");
    }

    public static void waitForDealInputTab() {
        waitForVisible(XAlphaDealInputPage.dealInputTab);
    }

    public static void clickDealInputTab() {
        click(XAlphaDealInputPage.dealInputTab, "Click deal input tab");
    }

    public static void waitFordealInput_navbar() {
        waitForVisible(XAlphaDealInputPage.dealInput_navbar);
    }

    public static void clickFXSpotTab() {
        click(XAlphaDealInputPage.dealInput_FXSpot, "Click FX Spot tab");
    }

    public static void dealInput_direction_click() {
        click(XAlphaDealInputPage.dealInput_direction, "Click FX Spot tab");
    }

    public static void dealInput_direction(HashMap<String, String> dataMap) {
        inputText(XAlphaDealInputPage.dealInput_direction, dataMap.get("Direction").toLowerCase(), "Select deal input direction");
        pressEnter(XAlphaDealInputPage.dealInput_direction);
    }

    public static String get_dealInput_direction() {
        String direction = getElementText(XAlphaDealInputPage.dealInput_directionText);
        LogUtil.infoLog(thisClass, "deal input direction=" + direction);
        return direction;
    }

    public static void dealInput_BaseAssetAmount(HashMap<String, String> dataMap) {
        inputText(XAlphaDealInputPage.dealInput_BaseAssetAmount, dataMap.get("BaseAssetAmount"), "Select deal input base asset amount");
    }

    public static String get_dealInput_BaseAssetAmount() {
        String BaseAssetAmount = getElementValue(XAlphaDealInputPage.dealInput_BaseAssetAmount);
        LogUtil.infoLog(thisClass, "deal input base asset amount=" + BaseAssetAmount);
        return BaseAssetAmount;
    }

    public static void dealInput_BaseAsset(HashMap<String, String> dataMap) {
        inputText(XAlphaDealInputPage.dealInput_BaseAsset, dataMap.get("BaseAsset"), "Select deal input base asset");
        pressEnter(XAlphaDealInputPage.dealInput_BaseAsset);
    }

    public static String get_dealInput_BaseAsset() {
        String BaseAsset = getElementText(XAlphaDealInputPage.dealInput_BaseAssetText);
        LogUtil.infoLog(thisClass, "deal input BaseAsset=" + BaseAsset);
        return BaseAsset;
    }

    public static void dealInput_QuoteAsset(HashMap<String, String> dataMap) {
        inputText(XAlphaDealInputPage.dealInput_QuoteAsset, dataMap.get("QuoteAsset"), "Select deal input Quote Asset");
        pressEnter(XAlphaDealInputPage.dealInput_QuoteAsset);
    }

    public static String get_dealInput_QuoteAsset() {
        String QuoteAsset = getElementText(XAlphaDealInputPage.dealInput_QuoteAssetText);
        LogUtil.infoLog(thisClass, "deal input QuoteAsset=" + QuoteAsset);
        return QuoteAsset;
    }

    public static String get_dealInput_ReferencePrice() throws InterruptedException {
        delay(1000);
        String referencePrice = getElementValueWithVisibility(XAlphaDealInputPage.dealInput_ReferencePrice);
        LogUtil.infoLog(XAlphaDealInputActions.class, "Reference price=" + referencePrice);
        return referencePrice;
    }

    public static void dealInput_UnitPrice(String arg0) {
        inputText(XAlphaDealInputPage.dealInput_UnitPrice, arg0, "Select deal input unit price");
    }

    public static String get_dealInput_UnitPrice() {
        String dealInput_UnitPrice;
        dealInput_UnitPrice = getElementValue(XAlphaDealInputPage.dealInput_UnitPrice);
        LogUtil.infoLog(XAlphaDealInputActions.class, "dealInput_UnitPrice=" + dealInput_UnitPrice);
        return dealInput_UnitPrice;
    }

    public static void dealInput_QuoteAssetAmount(String QuoteAssetAmount) {
        inputText(XAlphaDealInputPage.dealInput_QuoteAssetAmount, QuoteAssetAmount, "dealInput_QuoteAssetAmount=" + QuoteAssetAmount);
    }

    public static String get_dealInput_QuoteAssetAmount() {
        String dealInput_QuoteAssetAmount;
        dealInput_QuoteAssetAmount = getElementValue(XAlphaDealInputPage.dealInput_QuoteAssetAmount);
        LogUtil.infoLog(XAlphaDealInputActions.class, "dealInput_QuoteAssetAmount=" + dealInput_QuoteAssetAmount);
        return dealInput_QuoteAssetAmount;
    }

    public static void dealInput_FeeAsset(HashMap<String, String> dataMap) {
        inputText(XAlphaDealInputPage.dealInput_FeeAsset, dataMap.get("FeeAsset"), "Select deal input Fee Asset");
        pressEnter(XAlphaDealInputPage.dealInput_FeeAsset);
    }

    public static String get_dealInput_FeeAsset() {
        String FeeAsset = getElementText(XAlphaDealInputPage.dealInput_FeeAssetText);
        LogUtil.infoLog(XAlphaDealInputActions.class, "dealInput_FeeAsset=" + FeeAsset);
        return FeeAsset;
    }

    public static void dealInput_FeeAmount(HashMap<String, String> dataMap) throws InterruptedException {
        clearInputUsingKeys(XAlphaDealInputPage.dealInput_FeeAmount);
        inputText(XAlphaDealInputPage.dealInput_FeeAmount, dataMap.get("FeeAmount"), "Select deal input Fee Amount");
    }

    public static String get_dealInput_FeeAmount() throws InterruptedException {
        delay(1000);
        String feeAmount = getElementValueWithVisibility(XAlphaDealInputPage.dealInput_FeeAmount);
        LogUtil.infoLog(XAlphaDealInputActions.class, "Fee Amount=" + feeAmount);
        return feeAmount;
    }

    public static void dealInput_CounterpartyName(HashMap<String, String> dataMap) {
        inputText(XAlphaDealInputPage.dealInput_CounterpartyName, dataMap.get("CounterpartyName"), "Select deal input Counterparty Name");
        pressEnter(XAlphaDealInputPage.dealInput_CounterpartyName);
    }

    public static String get_dealInput_CounterpartyName() {
        String CounterpartyName = getElementText(XAlphaDealInputPage.dealInput_CounterpartyNameText);
        LogUtil.infoLog(XAlphaDealInputActions.class, "CounterpartyName=" + CounterpartyName);
        return CounterpartyName;
    }

    public static void dealInput_PortfolioNumber(HashMap<String, String> dataMap) {
        inputText(XAlphaDealInputPage.dealInput_PortfolioNumber, dataMap.get("PortfolioNumber"), "Select deal input Portfolio Number");
        pressEnter(XAlphaDealInputPage.dealInput_PortfolioNumber);
    }

    public static String get_dealInput_PortfolioNumber() {
        String PortfolioNumber = getElementText(XAlphaDealInputPage.dealInput_PortfolioNumberText);
        LogUtil.infoLog(XAlphaDealInputActions.class, "PortfolioNumber=" + PortfolioNumber);
        return PortfolioNumber;
    }

    public static void dealInput_ProcessingStatus(String arg0) {
        String processingStatus = arg0.toLowerCase();
        inputText(XAlphaDealInputPage.dealInput_ProcessingStatus, processingStatus, "Input deal input ProcessingStatus");
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + processingStatus + "']"));
        click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + processingStatus + "']"), "processingStatus=" + processingStatus);
    }

    public static void dealInput_CreateBtn() {
        click(XAlphaDealInputPage.dealInput_CreateBtn, "Click deal input Create Button");
    }

    public static void waitForDealSubmittedMsg() {
        waitForVisible(XAlphaDealInputPage.dealInput_validationMsg);
    }

    public static String dealInput_SubmitMessage() {
        String msg = getElementText(XAlphaDealInputPage.dealInput_validationMsg);
        LogUtil.infoLog(thisClass, "deal message=" + msg);
        return msg;
    }

}
