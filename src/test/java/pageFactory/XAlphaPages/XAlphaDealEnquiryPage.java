package pageFactory.XAlphaPages;

import org.openqa.selenium.By;

public class XAlphaDealEnquiryPage {

    //deal Enquiry
    public static By dealEnquiryTab = By.linkText("Deal Enquiry");
    public static By dealEnquiry_navbar = By.linkText("deals");
    public static By dealEnquiry_firstDealRef = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[04]");
    public static By dealEnquiry_firstDealType = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[05]/span");
    public static By dealEnquiry_firstProcessingStatus = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[06]/span");
    public static By dealEnquiry_firstCounterPartyName = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[08]/div");
    public static By dealEnquiry_firstPortfolio = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[09]/div");
    public static By dealEnquiry_firstSummary = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[1]/div/span");
    public static By dealEnquiry_firstBaseAmount = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[2]/div[2]/span");
    public static By dealEnquiry_firstQuote = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[3]/div[2]/span");
    public static By dealEnquiry_firstUnitPrice = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[4]/div[2]/span");
    public static By dealEnquiry_firstFeeAmount = By.xpath("//tbody[@class='ant-table-tbody']/tr[02]/td[10]/div/div[5]/div[2]/span");

}
