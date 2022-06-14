package modules.XAlphaActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageFactory.XAlphaPages.XAlphaDealEnquiryPage;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.List;

public class XAlphaDealEnquiryActions extends KeywordUtil {

    static Class thisClass = XAlphaDealEnquiryActions.class;

    public static void clickDealEnquiryTab() {
        click(XAlphaDealEnquiryPage.dealEnquiryTab, "Click deal enquiry tab");
    }

    public static void waitFordealEnquiry_navbar() {
        waitForVisible(XAlphaDealEnquiryPage.dealEnquiry_navbar);
    }

    public static void openFirstDeal() {
        click(XAlphaDealEnquiryPage.dealEnquiry_firstDetailLink, "Open first deal");
    }

    public static void expandFirstDealDetail() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_firstExpandDeal);
        click(XAlphaDealEnquiryPage.dealEnquiry_firstExpandDeal, "Expand deal details in the first row by clicking + icon");
    }

    public static String getFirstDealReferenceId() {
        String dealRef = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstDealRef);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "Deal reference in the first row=" + dealRef);
        return dealRef;
    }

    public static String getFirstDealType() {
        String dealType = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstDealType);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "dealType in the first row=" + dealType);
        return dealType;
    }

    public static String getFirstDealProcessingStatus() {
        return getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstProcessingStatus);
    }

    public static String getFirstCounterpartyName() {
        String CounterpartyName = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstCounterPartyName);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "CounterpartyName in the first row=" + CounterpartyName);
        return CounterpartyName;
    }

    public static String getFirstPortfolioNumber() {
        String PortfolioNumber = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstPortfolioNumber);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "PortfolioNumber in the first row=" + PortfolioNumber);
        return PortfolioNumber;
    }

    public static String getFirstSummary() {
        String summary = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstSummary);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "Summary in the first row=" + summary);
        return summary;
    }

    public static String getFirstBaseAssetAmount() {
        String BaseAssetAmount = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstBaseAssetAmount);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "BaseAssetAmount in the first row=" + BaseAssetAmount);
        return BaseAssetAmount;
    }

    public static String getFirstBaseAsset() {
        String BaseAsset = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstBaseAsset);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "BaseAsset in the first row=" + BaseAsset);
        return BaseAsset;
    }

    public static String getFirstQuoteAsset() {
        String QuoteAsset = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstQuoteAsset);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "QuoteAsset in the first row=" + QuoteAsset);
        return QuoteAsset;
    }

    public static String getFirstUnitPrice() {
        String unitPrice = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstUnitPrice);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "Unit price in the first row=" + unitPrice);
        return unitPrice;
    }

    public static String getFirstFeeAsset() {
        String FeeAsset = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstFeeAsset);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "FeeAsset in the first row=" + FeeAsset);
        return FeeAsset;
    }

    public static String getFirstFeeAmount() {
        String feeAmount = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstFeeAmount);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "Fee Amount in the first row=" + feeAmount);
        return feeAmount;
    }

    //execution deal
    public static String getFirstStartAsset() {
        String StartAsset = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstStartAsset);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "StartAsset in the first row=" + StartAsset);
        return StartAsset;
    }

    public static String getFirstStartAssetAmount() {
        String StartAssetAmount = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstStartAssetAmount);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "StartAssetAmount in the first row=" + StartAssetAmount);
        return StartAssetAmount;
    }

    public static String getFirstEndAsset() {
        String EndAsset = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstEndAsset);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "EndAsset in the first row=" + EndAsset);
        return EndAsset;
    }

    public static String getFirstEndAssetAmount() {
        String EndAssetAmount = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstEndAssetAmount);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "EndAssetAmount in the first row=" + EndAssetAmount);
        return EndAssetAmount;
    }

    public static String getFirstFeeAsset_Execution() {
        String FeeAsset = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstFeeAsset_Execution);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "FeeAsset in the first row=" + FeeAsset);
        return FeeAsset;
    }

    public static String getFirstFeeProportion() {
        String FeeProportion = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstFeeProportion);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "FeeProportion in the first row=" + FeeProportion);
        return FeeProportion;
    }

    public static String getFirstFeeAmount_Execution() {
        String FeeAmount_Execution = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstFeeAmount_Execution);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "FeeAmount_Execution in the first row=" + FeeAmount_Execution);
        return FeeAmount_Execution;
    }

    public static String getFirstValueDate_Execution() throws Exception {
        String ValueDate_Execution = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstValueDate);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "ValueDate_Execution in the first row=" + ValueDate_Execution);
        return ValueDate_Execution;
    }

    public static String getDealRefwrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String dealRef = KeywordUtil.getElementText(By.xpath("(//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[4]"));
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "dealRef=" + dealRef);
        return dealRef;
    }

    public static String getDealTypewrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String dealType = KeywordUtil.getElementText(By.xpath("(//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[5]/span"));
        LogUtil.infoLog(thisClass, "dealType=" + dealType);
        return dealType;
    }

    public static String getDirectionwrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String summary_aka_direction = KeywordUtil.getElementText(By.xpath("((//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[10])/div/div/div/span"));
        LogUtil.infoLog(thisClass, "summary_aka_direction=" + summary_aka_direction);
        return summary_aka_direction;
    }

    public static String getProcessingStatuswrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String processingStatus = KeywordUtil.getElementText(By.xpath("(//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[6]/span"));
        LogUtil.infoLog(thisClass, "processingStatus=" + processingStatus);
        return processingStatus;
    }

    public static String getCounterPartywrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String counterPartyName = KeywordUtil.getElementText(By.xpath("(//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[8]/div"));
        LogUtil.infoLog(thisClass, "counterPartyName=" + counterPartyName);
        return counterPartyName;
    }

    public static String getUnitPricewrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String unitPrice = KeywordUtil.getElementText(By.xpath("((//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[10])/div/div[4]/div[2]/span"));
        LogUtil.infoLog(thisClass, "unitPrice=" + unitPrice);
        return unitPrice;
    }

    public static String getFeewrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String fee = KeywordUtil.getElementText(By.xpath("((//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[10])/div/div[5]/div[2]/span"));
        LogUtil.infoLog(thisClass, "fee=" + fee);
        return fee;
    }

    public static String getReferencePricewrtQuoteAssetAmt(String QuotePrice) {
        QuotePrice = formatDecimalToStr(QuotePrice);
        String referencePrice = KeywordUtil.getElementText(By.xpath("((//tbody[@class='ant-table-tbody']//tr/td[10]/div/div[6]/div[2]/span[text()='" + QuotePrice + "'])//ancestor::tr/td[10])/div/div[6]/div[2]/span"));
        LogUtil.infoLog(thisClass, "referencePrice=" + referencePrice);
        return referencePrice;
    }

    //clear existing processing statuses from the filter
    public static void clearProcessingStatuses() {
        List<WebElement> statuses = getListElements(XAlphaDealEnquiryPage.dealEnquiry_processingStatuses, "Clearing processing statuses.");
        for (WebElement element : statuses) {
            element.click();
        }
    }

    //input processing status
    public static void inputProcessingStatus(String processingStatus) {
        click(XAlphaDealEnquiryPage.dealEnquiry_processingStatusClick, "Click processing status input filter box");
        inputText(XAlphaDealEnquiryPage.dealEnquiry_processingStatusInput, processingStatus, "input processing status=" + processingStatus);
        waitForPresent(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_processingStatusChoice, processingStatus)));
        click(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_processingStatusChoice, processingStatus)), "Choose processing status from dropdown");
    }

    //clear existing deal types(if any)
    public static void clearDealTypes() {
        List<WebElement> dealTypes = getListElements(XAlphaDealEnquiryPage.dealEnquiry_DealTypesXicon, 2, "Clearing deal types");
        for (WebElement element : dealTypes) {
            element.click();
        }
    }

    //input deal types
    public static void inputDealType(String dealType) {
        click(XAlphaDealEnquiryPage.dealEnquiry_DealTypesClick, "Click deal types input filter box");
        inputText(XAlphaDealEnquiryPage.dealEnquiry_DealTypesInput, dealType, "input deal type=" + dealType);
        waitForPresent(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_processingStatusChoice, dealType)));
        click(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_processingStatusChoice, dealType)), "Choose deal type from dropdown");
    }

    public static void clickLoadDealBtn() {
        click(XAlphaDealEnquiryPage.dealEnquiry_LoadDealBtn, "Click load deal button");
    }

    public static void closeSuccessNotification() {
        click(XAlphaDealEnquiryPage.dealEnquiry_LoadDealNotifXBtn, "Close the success notification");
    }

    public static void waitForLoadingIconToAppear() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_loading);
    }

    public static void waitForLoadingIconToDisappear() {
        waitForInVisibile(XAlphaDealEnquiryPage.dealEnquiry_loading);
    }

    public static void waitForLoadingIconToAppearAndDisappear() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_loading);
        waitForInVisibile(XAlphaDealEnquiryPage.dealEnquiry_loading);
    }

    public static void waitForSuccessMsgToAppear() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_LoadDealSuccessMsg);
    }

    public static void waitForSuccessMsgToDisappear() {
        waitForInVisibile(XAlphaDealEnquiryPage.dealEnquiry_LoadDealSuccessMsg);
    }

    public static void waitForSuccessMsgToAppearAndDisappear() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_LoadDealSuccessMsg);
        waitForInVisibile(XAlphaDealEnquiryPage.dealEnquiry_LoadDealSuccessMsg);
    }

    public static String getSuccessMsgDescription() {
        String notifMsg = getElementText(XAlphaDealEnquiryPage.dealEnquiry_LoadDealMsgDescp);
        LogUtil.infoLog(thisClass, "getSuccessMsgDescription=" + notifMsg);
        return getElementText(XAlphaDealEnquiryPage.dealEnquiry_LoadDealMsgDescp);
    }

    public static void waitForSuccessMsgToAppear_MO() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_LoadDealSuccessMsg_MO);
    }

    public static void waitForDealDetailsPage() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_UpdateBtn);
    }

    public static void clickUpdateDealBtn() {
        click(XAlphaDealEnquiryPage.dealEnquiry_UpdateBtn, "Click update deal button");
    }

    //enter deal reference
    public static void inputDealRef(String dealRef) {
        System.out.println("inputDealRef=" + dealRef);
        inputText(XAlphaDealEnquiryPage.dealEnquiry_DealRefInput, dealRef, "Input deal reference=" + dealRef);
        waitForPresent(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_DealRefInputSuggestion, dealRef)));
        click(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_DealRefInputSuggestion, dealRef)), "Choose deal reference from dropdown suggestion");
    }

    //get entered deal reference
    public static String getDealReferenceFromDealDetails() {
        String dealRef = getElementValueWithVisibility(XAlphaDealEnquiryPage.dealDetail_dealRef);
        LogUtil.infoLog(thisClass, "dealRef on deal details page=" + dealRef);
        return dealRef;
    }

}
