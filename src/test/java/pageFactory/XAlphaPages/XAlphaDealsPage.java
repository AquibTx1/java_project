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

}
