package pageFactory.OptimusPages.Instrument;

import org.openqa.selenium.By;

public class InstrumentMainPage {

    public static By Instrument_MainTab = By.xpath("//a[text()='Instrument']");

    public static By Instrument_token = By.xpath("//a[text()='Tokens']");

    public static By Instrument_Newtoken = By.xpath("//span[text()='New Token']");

    public static By Instrument_assetName= By.id("create_instrument_asset_name");

    //Update Details
    public static By Instrument_updateassetName= By.id("update_instrument_asset_name");
    public static By Instrument_updateassetcode= By.id("update_instrument_asset_code");
    public static By Instrument_updateassetsubtype= By.id("update_instrument_asset_sub_type");
    public static By Instrument_updateassettype= By.id("update_instrument_asset_type");
    public static By Instrument_updatedecimalcon= By.id("update_instrument_decimal_convention");
    public static By Instrument_updatenetwork= By.id("update_instrument_blockchain_network");
    public static By Instrument_updatebtn= By.xpath("//span[text()='Update Instrument']");
    public static By Instrument_deletebtn= By.xpath("//span[text()='Delete Instrument']");
    public static By refid=By.id("update_instrument_instrument_ref");

    public static By Instrument_updategst= By.id("update_instrument_gst");
    public static By Instrument_assetcode= By.id("create_instrument_asset_code");
    public static By Instrument_assetType= By.id("create_instrument_asset_type");
    public static By Instrument_assetSubType= By.id("create_instrument_asset_sub_type");
    public static By Instrument_decimalConv= By.id("create_instrument_decimal_convention");
    public static By Instrument_gst= By.id("create_instrument_gst");
    public static By Instrument_blockchainNetwork= By.id("create_instrument_blockchain_network");
    public static By Instrument_country= By.id("create_instrument_country");
    public static By Instrument_status= By.id("create_instrument_status");
    public static By Instrument_notes= By.id("create_instrument_notes");
    public static By Instrument_yearofrealese= By.id("create_instrument_year_of_release_moment");
    public static By Instrument_createInstrumentbtn= By.xpath("//span[text()='Create Instrument']");

    //Trading Instruments
    public static By Instrument_TradingInstruments= By.xpath("//a[text()='Trading Instruments']");
    public static By Instrument_NewTradingInstrument= By.xpath("//span[text()='New Trading Instrument']");
    public static By Instrument_Exchange= By.id("create_instrument_exchange_id");
    public static By Instrument_updateExchange= By.id("update_instrument_exchange_id");

    public static By Instrument_ExchangeSymbol= By.id("create_instrument_exchange_symbol");
    public static By Instrument_AltCoin= By.id("create_instrument_alt_coin");
    public static By Instrument_updateAltCoin= By.id("update_instrument_alt_coin");

    public static By Instrument_QuoteCoin= By.id("create_instrument_quote_coin");
    public static By Instrument_updateQuoteCoin= By.id("update_instrument_quote_coin");
    public static By Instrument_InstrumentType= By.id("create_instrument_instrument_type");
    public static By Instrument_updateInstrumentType= By.id("update_instrument_instrument_type");
    public static By Instrument_MarginType= By.id("create_instrument_margin_type");
    public static By Instrument_updateMarginType= By.id("update_instrument_margin_type");
    public static By Instrument_DeliveryDate= By.id("create_instrument_delivery_date");
    public static By Instrument_updateDeliveryDate= By.id("update_instrument_delivery_date");
    public static By Instrument_PricePrecision= By.id("create_instrument_price_precision");
    public static By Instrument_updatePricePrecision= By.id("update_instrument_price_precision");
    public static By Instrument_SizePrecision= By.id("create_instrument_size_precision");
    public static By Instrument_updateSizePrecision= By.id("update_instrument_size_precision");
    public static By Instrument_MinOrderSize= By.id("create_instrument_min_order_size");
    public static By Instrument_updateMinOrderSize= By.id("update_instrument_min_order_size");

    public static By Instrument_MaxOrderSize= By.id("create_instrument_max_order_size");
    public static By Instrument_updateMaxOrderSize= By.id("update_instrument_max_order_size");
    public static By Instrument_LotSize= By.id("create_instrument_lot_size");
    public static By Instrument_updateLotSize= By.id("update_instrument_lot_size");
    public static By Instrument_TickSize= By.id("create_instrument_tick_size");
    public static By Instrument_updateTickSize= By.id("update_instrument_tick_size");
    public static By Instrument_Min_Order= By.id("create_instrument_min_order_notional");
    public static By Instrument_Max_Order= By.id("create_instrument_max_num_orders");
    public static By Instrument_Min_Price= By.id("create_instrument_min_price");
    public static By Instrument_Max_Price= By.id("create_instrument_max_price");
    public static By Instrument_Contract_Size= By.id("create_instrument_contract_size");
    public static By Instrument_ContractAsset= By.id("create_instrument_contract_asset");
    public static By Instrument_SettlementAsset= By.id("create_instrument_settlement_asset");
    public static By Instrument_Tradingstatus= By.id("create_instrument_status");
    public static By Instrument_Tradingnotes= By.id("create_instrument_notes");

    public static By InstrumentFutures_SideTab = By.xpath("//span/a[text()='Futures']");
    public static By instrumentFutures_Exchange_dropdown_List = By.id("exchange_list");
    public static By instrumentFuture_ExchangeName_List = By.xpath("//tbody/tr[2]/td[1]");
    public static By instrumentFuture_ExchangeSymbol_List = By.xpath("//tbody/tr[2]/td[3]");
    public static By intrumentTokenPrices_SideTab = By.xpath("//ul/li/span/a[contains(text(),'Token Prices')]");
    public static By intrumentTokenPrices_SearchBase_List = By.xpath("//input[@placeholder='search base']");
    public static By intrumentTokenPrices_SearchQuote_List = By.xpath("//input[@placeholder='search quote']");
    public static By intrumentTokenPrices_SearchStartDate_List = By.xpath("//input[@placeholder='Start date']");
    public static By intrumentTokenPrices_SearchEndDate_List = By.xpath("//input[@placeholder='End date']");
    public static By intrumentTokenPrices_SearchTime_List = By.className("ant-select-selection-overflow");
    public static By intrumentTokenPrices_Base_List = By.xpath("//tbody/tr[2]/td[1]");
    public static By intrumentTokenPrices_Quote_List = By.xpath("//tbody/tr[2]/td[2]");
    public static By intrumentTokenPrices_Date_List = By.xpath("//tbody/tr[2]/td[4]");



}
