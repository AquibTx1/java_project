package pageFactory.XAlphaPages;

import org.openqa.selenium.By;

public class XAlphaDealInputPage {

    //X-Alpha tab in the header section
    public static By xAlphaHeader = By.linkText("X-Alpha");

    //tabs/pages on the left
    public static By dealInputTab = By.linkText("Deal Input");

    //fx-spot
    public static By dealInput_navbar = By.linkText("deal_input");
    public static By dealInput_FXSpot = By.id("rc-tabs-0-tab-FX Spot");
    public static By dealInput_ExecutionTab = By.id("rc-tabs-0-tab-Execution");
    public static By dealInput_direction = By.id("deal_type_data.direction");
    public static String dealInput_directionOptions = "//div[@id='deal_type_data.direction_list']/following-sibling::div//div[text()='%s']";
    public static By dealInput_directionText = By.xpath("//input[@id='deal_type_data.direction']/../following-sibling::span");
    public static By dealInput_BaseAssetAmount = By.id("deal_type_data.base_asset_amount");
    public static By dealInput_BaseAsset = By.id("deal_type_data.base_asset");
    public static String dealInput_BaseAssetOptions = "//div[@id='deal_type_data.base_asset_list']/following-sibling::div//div[text()='%s']";
    public static By dealInput_BaseAssetText = By.xpath("//input[@id='deal_type_data.base_asset']/../following-sibling::span");
    public static By dealInput_QuoteAsset = By.id("deal_type_data.quote_asset");
    public static String dealInput_QuoteAssetOptions = "//div[@id='deal_type_data.quote_asset_list']/following-sibling::div//div[text()='%s']";
    public static By dealInput_QuoteAssetText = By.xpath("//input[@id='deal_type_data.quote_asset']/../following-sibling::span");
    public static By dealInput_UnitPrice = By.id("deal_type_data.unit_price");
    public static By dealInput_QuoteAssetAmount = By.id("deal_type_data.quote_asset_amount");
    public static By dealInput_FeeAsset = By.id("deal_type_data.fee_asset");
    public static String dealInput_FeeAssetOptions = "//div[@id='deal_type_data.fee_asset_list']/following-sibling::div//div[text()='%s']";
    public static By dealInput_FeeAssetText = By.xpath("//input[@id='deal_type_data.fee_asset']/../following-sibling::span");
    public static By dealInput_FeeAmount = By.id("deal_type_data.fee_amount");
    public static By dealInput_ReferencePrice = By.id("deal_type_data.reference_price");
    public static By dealInput_ReferencePriceLoadingIcon= By.xpath("//span[text()='Reference Price']/span[@aria-label='loading']");
    public static By dealInput_MarketPrice = By.xpath("//input[@id='deal_type_data.market_price' and @aria-valuenow]");
    public static By dealInput_CounterpartyName = By.id("counterparty_name");
    public static String dealInput_CounterpartyNameOptions = "//div[@id='counterparty_name_list']/following-sibling::div//div[text()='%s']";
    public static By dealInput_CounterpartyNameText = By.xpath("//input[@id='counterparty_name']/../following-sibling::span");
    public static By dealInput_PortfolioNumber = By.id("portfolio_number");
    public static By dealInput_PortfolioNumberText = By.xpath("//input[@id='portfolio_number']/../following-sibling::span");
    public static By dealInput_ProcessingStatus = By.id("deal_processing_status");
    public static By dealInput_ProcessingStatusClick = By.xpath("//label[@for='deal_processing_status']/../following-sibling::div//div[@class='ant-select-selector']");
    public static By dealInput_ValueDate = By.id("value_date");
    public static By dealInput_ValueDateXbtn = By.xpath("//label[text()='Value Date']/../following-sibling::div//span[@class='ant-picker-clear']");
    public static By dealInput_ValueDateOkBtn = By.xpath("//button[@type='button']/span[text()='OK']");
    public static By dealInput_ValueDateOkBtn2 = By.xpath("(//button[@type='button']/span[text()='OK'])[last()]");
    public static By dealInput_ValueDateNowBtn = By.xpath("//a[@class='ant-picker-now-btn' and text()='Now']");
    public static By dealInput_ValueDateNowBtn2 = By.xpath("(//a[@class='ant-picker-now-btn' and text()='Now'])[last()]");
    public static By dealInput_CreateBtn = By.xpath("//button[@type='submit']/span[text()='Create']");
    public static By dealInput_validationMsg = By.xpath("//div[@class='ant-notification-notice-description']");
    public static By dealInput_IncomingSettledYes = By.xpath("(//span[@class='ant-switch-inner' and text()='YES'])[1]");
    public static By dealInput_OutgoingSettledYes = By.xpath("(//span[@class='ant-switch-inner' and text()='YES'])[2]");

    //execution deal
    public static By dealInput_StartAsset = By.id("deal_type_data.start_asset");
    public static String dealInput_StartAssetOptions = "//div[@id='deal_type_data.start_asset_list']/following-sibling::div//div[text()='%s']";
    public static By dealInput_StartAssetAmount = By.id("deal_type_data.start_asset_amount");
    public static By dealInput_EndAsset = By.id("deal_type_data.end_asset");
    public static String dealInput_EndAssetOptions = "//div[@id='deal_type_data.end_asset_list']/following-sibling::div//div[text()='%s']";
    public static By dealInput_EndAssetAmount = By.id("deal_type_data.end_asset_amount");
    public static By dealInput_FeeProportion = By.id("deal_type_data.fee_proportion");
    public static By dealInput_FeeAdjustment = By.id("deal_type_data.fee_adjustment_amount");

    //cash flow
    public static By dealInput_CashFlowTab = By.id("rc-tabs-0-tab-Cash Flow");
    public static By dealInput_CashFlow_Direction = By.id("deal_type_data.direction");
    public static String dealInput_CashFlow_DirectionOptions = "//div[@id='deal_type_data.direction_list']/following-sibling::div//div[text()='%s']";
    public static By dealInput_CashFlow_DirectionText = By.xpath("//input[@id='deal_type_data.direction']/../following-sibling::span");
    public static By dealInput_CashFlow_Asset = By.id("deal_type_data.asset");
    public static String dealInput_CashFlow_AssetOptions = "//div[@id='deal_type_data.asset_list']/following-sibling::div//div[text()='%s']";
    public static By dealInput_CashFlow_AssetText = By.xpath("//input[@id='deal_type_data.asset']/../following-sibling::span");
    public static By dealInput_CashFlow_Amount = By.id("deal_type_data.amount");
    public static By dealInput_CashFlow_Purpose = By.id("deal_type_data.cashflow_purpose");

    public static By dealInput_OptionsPrice_Exchange = By.id("deal_type_data.exchange");
    public static String dealInput_OptionPrice_ExchangeOptions = "//div[@id='deal_type_data.exchange_list']/following-sibling::div//div[text()='%s']";

    public static By dealInput_OptionsPrice_Expiry = By.id("deal_type_data.expiry_price_source");

    public static String dealInput_OptionPrice_ExpiryPrice = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";

    public static String dealInput_CashFlow_PurposeOptions = "//div[@id='deal_type_data.cashflow_purpose_list']/following-sibling::div//div[text()='%s']";
    public static By dealInput_CashFlow_PurposeText = By.xpath("//input[@id='deal_type_data.cashflow_purpose']/../following-sibling::span");
}
