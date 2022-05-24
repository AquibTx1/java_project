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

    public static String getFirstDealReferenceId() {
        String dealRef = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstDealRef);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "Deal reference in the first row=" + dealRef);
        return dealRef;
    }

    public static String getFirstSummary() {
        String summary = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstSummary);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "Summary in the first row=" + summary);
        return summary;
    }

    public static String getFirstUnitPrice() {
        String unitPrice = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstUnitPrice);
        unitPrice = unitPrice.replace(",", "");
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "Unit price in the first row=" + unitPrice);
        return unitPrice;
    }

    public static String getFirstFeeAmount() {
        String feeAmount = getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstFeeAmount);
        LogUtil.infoLog(XAlphaDealEnquiryPage.class, "Fee Amount in the first row=" + feeAmount);
        return feeAmount;
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
        click(XAlphaDealEnquiryPage.dealEnquiry_processingStatusClick, "");
        inputText(XAlphaDealEnquiryPage.dealEnquiry_processingStatusInput, processingStatus, "input processing status");
        waitForPresent(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_processingStatusChoice, processingStatus)));
        click(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_processingStatusChoice, processingStatus)), "Click processing status from dropdown");
    }

    public static void clickLoadDealBtn() {
        click(XAlphaDealEnquiryPage.dealEnquiry_LoadDealBtn, "Click load deal button");
    }

    public static void waitForSuccessMsgToAppear() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_LoadDealSuccessMsg);
    }

    public static void waitForSuccessMsgToDisappear() {
        waitForInVisibile(XAlphaDealEnquiryPage.dealEnquiry_LoadDealSuccessMsg);
    }

    public static void waitForDealDetailsPage() {
        waitForPresent(XAlphaDealEnquiryPage.dealEnquiry_UpdateBtn);
    }

    public static void clickUpdateDealBtn() {
        click(XAlphaDealEnquiryPage.dealEnquiry_UpdateBtn, "Click update deal button");
    }

    //enter deal reference
    public static void inputDealRef(String dealRef) throws InterruptedException {
        System.out.println("inputDealRef=" + dealRef);
        inputText(XAlphaDealEnquiryPage.dealEnquiry_DealRefInput, dealRef, "Input deal reference.");
        waitForPresent(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_DealRefInputSuggestion, dealRef)));
        click(By.xpath(String.format(XAlphaDealEnquiryPage.dealEnquiry_DealRefInputSuggestion, dealRef)), "Choose deal reference from dropdown suggestion");
    }

    //get entered deal reference
    public static String getDealReferenceFromDealDetails() {
        String dealRef = getElementValueWithVisibility(XAlphaDealEnquiryPage.dealDetail_dealRef);
        LogUtil.infoLog(thisClass, "dealRef on deal details page="+dealRef);
        return dealRef;
    }

    public static String getFirstDealProcessingStatus() {
        return getElementText(XAlphaDealEnquiryPage.dealEnquiry_firstProcessingStatus);
    }
}
