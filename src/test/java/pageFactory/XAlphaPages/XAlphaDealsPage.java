package pageFactory.XAlphaPages;

import org.openqa.selenium.By;

public class XAlphaDealsPage {

    //X-Alpha tab in the header section
    public static By xAlphaHeader = By.linkText("X-Alpha");

    //tabs/pages on the left
    public static By dealInputTab = By.linkText("Deal Input");

    //deal input
    public static By dealInput_navbar = By.linkText("deal_input");
    public static By dealInput_FXSpot = By.id("rc-tabs-0-tab-FX Spot");
    public static By dealInput_direction = By.id("deal_type_data.direction");
    public static By dealInput_BaseAssetAmount = By.id("deal_type_data.base_asset_amount");
    public static By dealInput_BaseAsset = By.id("deal_type_data.base_asset");
    public static By dealInput_QuoteAsset = By.id("deal_type_data.quote_asset");
    public static By dealInput_UnitPrice = By.id("deal_type_data.unit_price");
    public static By dealInput_QuoteAssetAmount = By.id("deal_type_data.quote_asset_amount");
    public static By dealInput_FeeAsset = By.id("deal_type_data.fee_asset");
    public static By dealInput_FeeAmount = By.id("deal_type_data.fee_amount");
    public static By dealInput_ReferencePrice = By.id("deal_type_data.reference_price");
    public static By dealInput_CounterpartyName = By.id("counterparty_name");
    public static By dealInput_PortfolioNumber = By.id("portfolio_number");
    public static By dealInput_ProcessingStatus = By.id("deal_processing_status");
    public static By dealInput_CreateBtn = By.xpath("//button[@type='submit']/span[text()='Create']");
    public static By dealInput_validationMsg = By.xpath("//div[@class='ant-notification-notice-description']");

    //deal inquiry
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
