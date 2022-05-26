package pageFactory.XAlphaPages;

import org.openqa.selenium.By;

public class XAlphaDealEnquiryPage {

    //deal Enquiry
    public static By dealEnquiryTab = By.linkText("Deal Enquiry");
    public static By dealEnquiry_navbar = By.linkText("deals");
    public static By dealEnquiry_firstDealRef = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[04]");
    public static By dealEnquiry_firstDetailLink = By.xpath("(//tbody[@class='ant-table-tbody']//a[@type='link' and text()='Detail'])[1]");
    public static By dealEnquiry_firstDealType = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[05]/span");
    public static By dealEnquiry_firstProcessingStatus = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[06]/span");
    public static By dealEnquiry_firstCounterPartyName = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[08]/div");
    public static By dealEnquiry_firstPortfolio = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[09]/div");
    public static By dealEnquiry_firstSummary = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[1]/div/span");
    public static By dealEnquiry_firstBaseAmount = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[2]/div[2]/span");
    public static By dealEnquiry_firstQuote = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[3]/div[2]/span");
    public static By dealEnquiry_firstUnitPrice = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[4]/div[2]/span");
    public static By dealEnquiry_firstFeeAmount = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[5]/div[2]/span");

    //deal filters
    public static By dealEnquiry_processingStatusClick = By.xpath("//div[@ph_label='Processing Status']");
    public static By dealEnquiry_processingStatusInput = By.id("filter_form_processing_status");
    public static By dealEnquiry_processingStatuses = By.xpath("//div[@ph_label='Processing Status']//div[@class='ant-select-selection-overflow-item']/span/span[2]");
    public static String dealEnquiry_processingStatusChoice = "//div[@class='ant-select-item-option-content' and text()='%s']";
    public static By dealEnquiry_LoadDealBtn = By.xpath("//button[@type='submit']/span[text()='Load Deal']");
    public static By dealEnquiry_LoadDealSuccessMsg = By.xpath("//div[@class='ant-notification-notice-message' and text()='Success!']");
    public static By dealEnquiry_LoadDealSuccessMsg_MO = By.xpath("//div[@class='ant-notification-notice-description' and text()='Deal update has to be approved by MO. A task has created.']");
    public static By dealEnquiry_DealRefInput = By.id("filter_form_deal_ref");
    public static String dealEnquiry_DealRefInputSuggestion = "//div[@class='ant-select-item-option-content' and text()='%s']";
    public static By dealEnquiry_UpdateBtn = By.xpath("//button[@type='submit']/span[text()='Update']");

    //deal details
    public static By dealDetail_dealRef = By.xpath("//input[@placeholder='Deal Ref']");
}
