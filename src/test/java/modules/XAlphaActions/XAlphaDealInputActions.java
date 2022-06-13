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

    public static void clickExecutionTab() {
        click(XAlphaDealInputPage.dealInput_ExecutionTab, "Click Execution tab");
    }

    public static void dealInput_direction_click() {
        click(XAlphaDealInputPage.dealInput_direction, "Click FX Spot tab");
    }

    public static void dealInput_direction(String direction) {
        inputText(XAlphaDealInputPage.dealInput_direction, direction.toLowerCase(), "Select deal input direction=" + direction);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_directionOptions, direction)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_directionOptions, direction)), "Choose direction from drop down options");
    }

    public static String get_dealInput_direction() {
        String direction = getElementText(XAlphaDealInputPage.dealInput_directionText);
        LogUtil.infoLog(thisClass, "deal input direction=" + direction);
        return direction;
    }

    public static void dealInput_BaseAssetAmount(String BaseAssetAmount) throws InterruptedException {
        clearInputUsingKeys(XAlphaDealInputPage.dealInput_BaseAssetAmount);
        inputText(XAlphaDealInputPage.dealInput_BaseAssetAmount, BaseAssetAmount, "Select deal input base asset amount=" + BaseAssetAmount);
    }

    public static String get_dealInput_BaseAssetAmount() {
        String BaseAssetAmount = getElementValue(XAlphaDealInputPage.dealInput_BaseAssetAmount);
        LogUtil.infoLog(thisClass, "deal input base asset amount=" + BaseAssetAmount);
        return BaseAssetAmount;
    }

    public static void dealInput_BaseAsset(String BaseAsset) {
        inputText(XAlphaDealInputPage.dealInput_BaseAsset, BaseAsset, "Select deal input base asset" + BaseAsset);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_BaseAssetOptions, BaseAsset)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_BaseAssetOptions, BaseAsset)), "Select deal input base asset from drop down options");
    }

    public static String get_dealInput_BaseAsset() {
        String BaseAsset = getElementText(XAlphaDealInputPage.dealInput_BaseAssetText);
        LogUtil.infoLog(thisClass, "deal input BaseAsset=" + BaseAsset);
        return BaseAsset;
    }

    public static void dealInput_QuoteAsset(String QuoteAsset) {
        inputText(XAlphaDealInputPage.dealInput_QuoteAsset, QuoteAsset, "Select deal input Quote Asset=" + QuoteAsset);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_QuoteAssetOptions, QuoteAsset)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_QuoteAssetOptions, QuoteAsset)), "Choose QuoteAsset from dropdown options");
    }

    public static String get_dealInput_QuoteAsset() {
        String QuoteAsset = getElementText(XAlphaDealInputPage.dealInput_QuoteAssetText);
        LogUtil.infoLog(thisClass, "deal input QuoteAsset=" + QuoteAsset);
        return QuoteAsset;
    }

    public static String get_dealInput_ReferencePrice() throws InterruptedException {
        delay(1500);
        String referencePrice = getElementValueWithVisibility(XAlphaDealInputPage.dealInput_ReferencePrice);
        LogUtil.infoLog(XAlphaDealInputActions.class, "Reference price=" + referencePrice);
        return referencePrice;
    }

    public static void dealInput_UnitPrice(String unitPrice) throws InterruptedException {
        clearInputUsingKeys(XAlphaDealInputPage.dealInput_UnitPrice);
        inputText(XAlphaDealInputPage.dealInput_UnitPrice, unitPrice, "Select deal input unit price=" + unitPrice);
    }

    public static String get_dealInput_UnitPrice() {
        String dealInput_UnitPrice;
        dealInput_UnitPrice = getElementValue(XAlphaDealInputPage.dealInput_UnitPrice);
        LogUtil.infoLog(XAlphaDealInputActions.class, "dealInput_UnitPrice=" + dealInput_UnitPrice);
        return dealInput_UnitPrice;
    }

    public static void dealInput_QuoteAssetAmount(String QuoteAssetAmount) throws InterruptedException {
        inputText(XAlphaDealInputPage.dealInput_QuoteAssetAmount, QuoteAssetAmount, "dealInput_QuoteAssetAmount=" + QuoteAssetAmount);
    }

    public static String get_dealInput_QuoteAssetAmount() {
        String dealInput_QuoteAssetAmount;
        dealInput_QuoteAssetAmount = getElementValue(XAlphaDealInputPage.dealInput_QuoteAssetAmount);
        LogUtil.infoLog(XAlphaDealInputActions.class, "dealInput_QuoteAssetAmount=" + dealInput_QuoteAssetAmount);
        return dealInput_QuoteAssetAmount;
    }

    public static void dealInput_FeeAsset(String FeeAsset) {
        inputText(XAlphaDealInputPage.dealInput_FeeAsset, FeeAsset, "Select deal input Fee Asset=" + FeeAsset);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_FeeAssetOptions, FeeAsset)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_FeeAssetOptions, FeeAsset)), "Choose FeeAsset from drop down options");
    }

    public static String get_dealInput_FeeAsset() {
        String FeeAsset = getElementText(XAlphaDealInputPage.dealInput_FeeAssetText);
        LogUtil.infoLog(XAlphaDealInputActions.class, "dealInput_FeeAsset=" + FeeAsset);
        return FeeAsset;
    }

    public static void dealInput_FeeAmount(String FeeAmount) throws InterruptedException {
        clearInputUsingKeys(XAlphaDealInputPage.dealInput_FeeAmount);
        inputText(XAlphaDealInputPage.dealInput_FeeAmount, FeeAmount, "Select deal input Fee Amount=" + FeeAmount);
    }

    public static String get_dealInput_FeeAmount() throws InterruptedException {
        delay(1000);
        String feeAmount = getElementValueWithVisibility(XAlphaDealInputPage.dealInput_FeeAmount);
        LogUtil.infoLog(XAlphaDealInputActions.class, "Fee Amount=" + feeAmount);
        return feeAmount;
    }

    public static void dealInput_CounterpartyName(String CounterpartyName) {
        inputText(XAlphaDealInputPage.dealInput_CounterpartyName, CounterpartyName, "Select deal input Counterparty Name=" + CounterpartyName);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_CounterpartyNameOptions, CounterpartyName)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_CounterpartyNameOptions, CounterpartyName)), "Choose counterparty name from dropdown options");
    }

    public static String get_dealInput_CounterpartyName() {
        String CounterpartyName = getElementText(XAlphaDealInputPage.dealInput_CounterpartyNameText);
        LogUtil.infoLog(XAlphaDealInputActions.class, "CounterpartyName=" + CounterpartyName);
        return CounterpartyName;
    }

    public static void dealInput_PortfolioNumber(String PortfolioNumber) {
        inputText(XAlphaDealInputPage.dealInput_PortfolioNumber, PortfolioNumber, "Select deal input Portfolio Number=" + PortfolioNumber);
        pressEnter(XAlphaDealInputPage.dealInput_PortfolioNumber);
    }

    public static String get_dealInput_PortfolioNumber() {
        String PortfolioNumber = getElementText(XAlphaDealInputPage.dealInput_PortfolioNumberText);
        LogUtil.infoLog(XAlphaDealInputActions.class, "PortfolioNumber=" + PortfolioNumber);
        return PortfolioNumber;
    }

    public static void dealInput_ProcessingStatus(String arg0) {
        String processingStatus = arg0.toLowerCase();
        inputText(XAlphaDealInputPage.dealInput_ProcessingStatus, processingStatus, "Input deal input ProcessingStatus=" + arg0);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + processingStatus + "']"));
        click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + processingStatus + "']"), "processingStatus=" + processingStatus);
    }

    public static void dealInput_ValueDate(String ValueDate) throws InterruptedException {
        click(XAlphaDealInputPage.dealInput_ValueDate, "");
        clearInputUsingKeys(XAlphaDealInputPage.dealInput_ValueDate);
        inputText(XAlphaDealInputPage.dealInput_ValueDate, ValueDate, "Deal input ValueDate=" + ValueDate);
        delay(2000);
        waitForPresent(XAlphaDealInputPage.dealInput_ValueDateOkBtn);
        click(XAlphaDealInputPage.dealInput_ValueDateOkBtn, "Click OK button on value date picker");
        delay(1500);
        pressTabKey(XAlphaDealInputPage.dealInput_ValueDate);
    }

    public static void dealInput_ValueDateNow() {
        click(XAlphaDealInputPage.dealInput_ValueDate, "Click ValueDate picker");
        waitForPresent(XAlphaDealInputPage.dealInput_ValueDateNowBtn);
        click(XAlphaDealInputPage.dealInput_ValueDateNowBtn, "Click OK button on value date picker");
    }

    //execution deal > start asset
    public static void dealInput_StartAsset(String StartAsset) {
        inputText(XAlphaDealInputPage.dealInput_StartAsset, StartAsset, "Select deal input StartAsset=" + StartAsset);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_StartAssetOptions, StartAsset)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_StartAssetOptions, StartAsset)), "Choose StartAsset from dropdown options");
    }

    //execution deal > StartAssetAmount
    public static void dealInput_StartAssetAmount(String StartAssetAmount) {
        clearInputValue(XAlphaDealInputPage.dealInput_StartAssetAmount);
        inputText(XAlphaDealInputPage.dealInput_StartAssetAmount, StartAssetAmount, "Deal input StartAssetAmount=" + StartAssetAmount);
    }

    //execution deal > end asset
    public static void dealInput_EndAsset(String EndAsset) {
        inputText(XAlphaDealInputPage.dealInput_EndAsset, EndAsset, "Select deal input EndAsset=" + EndAsset);
        waitForPresent(By.xpath(String.format(XAlphaDealInputPage.dealInput_EndAssetOptions, EndAsset)));
        click(By.xpath(String.format(XAlphaDealInputPage.dealInput_EndAssetOptions, EndAsset)), "Choose EndAsset from dropdown options");
    }

    //execution deal > EndAssetAmount
    public static void dealInput_EndAssetAmount(String EndAssetAmount) {
        clearInputValue(XAlphaDealInputPage.dealInput_EndAssetAmount);
        inputText(XAlphaDealInputPage.dealInput_EndAssetAmount, EndAssetAmount, "Deal input EndAssetAmount=" + EndAssetAmount);
    }

    //execution deal > FeeProportion
    public static void dealInput_FeeProportion(String FeeProportion) {
        clearInputValue(XAlphaDealInputPage.dealInput_FeeProportion);
        inputText(XAlphaDealInputPage.dealInput_FeeProportion, FeeProportion, "Deal input FeeProportion=" + FeeProportion);
    }

    //execution deal > FeeAdjustment
    public static void dealInput_FeeAdjustment(String FeeAdjustment) {
        clearInputValue(XAlphaDealInputPage.dealInput_FeeAdjustment);
        inputText(XAlphaDealInputPage.dealInput_FeeAdjustment, FeeAdjustment, "Deal input FeeAdjustment=" + FeeAdjustment);
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

    public static String getDealRefFromNotif() {
        String msg = getElementText(XAlphaDealInputPage.dealInput_validationMsg);
        String[] splittedMsg = msg.split(" ");
        LogUtil.infoLog(thisClass, "Deal ref id in notification message=" + splittedMsg[3]);
        return splittedMsg[3];
    }

}
