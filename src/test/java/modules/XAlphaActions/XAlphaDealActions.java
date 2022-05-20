package modules.XAlphaActions;

import org.openqa.selenium.By;
import pageFactory.XAlphaPages.XAlphaDealsPage;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.HashMap;

public class XAlphaDealActions extends KeywordUtil {


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

    public static void dealInput_ProcessingStatus(HashMap<String, String> dataMap) {
        inputText(XAlphaDealsPage.dealInput_ProcessingStatus, dataMap.get("ProcessingStatus"), "Select deal input ProcessingStatus");
        pressEnter(XAlphaDealsPage.dealInput_ProcessingStatus);
    }

    public static void dealInput_CreateBtn() {
        click(XAlphaDealsPage.dealInput_CreateBtn, "Click deal input Create Button");
    }

    public static String dealInput_SubmitMessage() {
        String msg = getElementText(XAlphaDealsPage.dealInput_validationMsg);
        LogUtil.infoLog(XAlphaLoginActions.class, "deal message=" + msg);
        return msg;
    }

    public static void clickDealEnquiryTab() {
        click(XAlphaDealsPage.dealEnquiryTab, "Click deal enquiry tab");
    }

    public static void waitFordealEnquiry_navbar() {
        waitForVisible(XAlphaDealsPage.dealEnquiry_navbar);
    }

    public static String getFirstDealReference() {
        String dealRef = getElementText(XAlphaDealsPage.dealEnquiry_firstDealRef);
        LogUtil.infoLog(XAlphaDealActions.class, "Deal reference in the first row=" + dealRef);
        return dealRef;
    }

    public static String getFirstSummary() {
        String summary = getElementText(XAlphaDealsPage.dealEnquiry_firstSummary);
        LogUtil.infoLog(XAlphaDealActions.class, "Summary in the first row=" + summary);
        return summary;
    }

    public static String getFirstUnitPrice() {
        String unitPrice = getElementText(XAlphaDealsPage.dealEnquiry_firstUnitPrice);
        unitPrice = unitPrice.replace(",", "");
        LogUtil.infoLog(XAlphaDealActions.class, "Unit price in the first row=" + unitPrice);
        return unitPrice;
    }

    public static String getFirstFeeAmount() {
        String feeAmount = getElementText(XAlphaDealsPage.dealEnquiry_firstFeeAmount);
        LogUtil.infoLog(XAlphaDealActions.class, "Fee Amount in the first row=" + feeAmount);
        return feeAmount;
    }

    public static String getDealRefwrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String dealRef = KeywordUtil.getElementText(By.xpath("(//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[4]"));
        LogUtil.infoLog(XAlphaDealActions.class, "dealRef=" + dealRef);
        return dealRef;
    }

    public static String getDealTypewrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String dealType = KeywordUtil.getElementText(By.xpath("(//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[5]/span"));
        LogUtil.infoLog(XAlphaDealActions.class, "dealType=" + dealType);
        return dealType;
    }

    public static String getProcessingStatuswrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String processingStatus = KeywordUtil.getElementText(By.xpath("(//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[6]/span"));
        LogUtil.infoLog(XAlphaDealActions.class, "processingStatus=" + processingStatus);
        return processingStatus;
    }

    public static String getCounterPartywrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String counterPartyName = KeywordUtil.getElementText(By.xpath("(//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[8]/div"));
        LogUtil.infoLog(XAlphaDealActions.class, "counterPartyName=" + counterPartyName);
        return counterPartyName;
    }

    public static String getUnitPricewrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String unitPrice = KeywordUtil.getElementText(By.xpath("((//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[10])/div/div[4]/div[2]/span"));
        LogUtil.infoLog(XAlphaDealActions.class, "unitPrice=" + unitPrice);
        return unitPrice;
    }

    public static String getFeewrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String fee = KeywordUtil.getElementText(By.xpath("((//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[10])/div/div[5]/div[2]/span"));
        LogUtil.infoLog(XAlphaDealActions.class, "fee=" + fee);
        return fee;
    }

    public static String getReferencePricewrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String referencePrice = KeywordUtil.getElementText(By.xpath("((//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[10])/div/div[6]/div[2]/span"));
        LogUtil.infoLog(XAlphaDealActions.class, "referencePrice=" + referencePrice);
        return referencePrice;
    }


}
