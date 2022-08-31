package modules.OptimusActions;

import org.openqa.selenium.By;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyCreatePage;
import pageFactory.OptimusPages.Instrument.InstrumentMainPage;
import pageFactory.OptimusPages.Portfolio.PortfolioMainPage;
import pageFactory.OptimusPages.Settlement.SettlementUpdatePage;
import utilities.KeywordUtil;
import utilities.LogUtil;

public class OptimusInstrumentActions  extends KeywordUtil {


    static Class<OptimusInstrumentActions> thisClass = OptimusInstrumentActions.class;



    public static void clickInstrumentTab() {
        click(InstrumentMainPage.Instrument_MainTab, "Clicked the Instrument  Tab");
    }

    public static void clickTokenLink() {
        click(InstrumentMainPage.Instrument_token, "Clicked the Instrument Token");
    }

    public static void clickNewToken() {
        click(InstrumentMainPage.Instrument_Newtoken, "Clicked the New Instrument");
    }


    public static void createAssetCode(String asset_code) {
        inputText(InstrumentMainPage.Instrument_assetcode, asset_code, "Asset Code is entered =" + asset_code);

    }

    public static void createAssetType(String asset_type) {
        inputText(InstrumentMainPage.Instrument_assetType, asset_type, "Select Portfolio Status=" + asset_type);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + asset_type + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + asset_type + "']"), "Asset Type selected"+asset_type);
    }

    public static void createAssetSubType(String subtype) {
        inputText(InstrumentMainPage.Instrument_assetSubType, subtype, "Select Portfolio Status=" + subtype);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + subtype + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + subtype + "']"), "Asset Sub Type selected"+subtype);

    }

    public static void createDecimalConvention(String decimal_convention) {
        inputText(InstrumentMainPage.Instrument_decimalConv, decimal_convention, "Decimal Value Entered =" + decimal_convention);

    }

    public static void createGST(String gst) {
        inputText(InstrumentMainPage.Instrument_gst, gst, "Select Portfolio Status=" + gst);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + gst + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + gst + "']"), "GST entered and  selected"+gst);

    }

    public static void createBlockchainNetwork(String blockchain_network) {
        inputText(InstrumentMainPage.Instrument_blockchainNetwork, blockchain_network, "Blockchain Network =" + blockchain_network);
    }

    public static void createYOR(String year_of_release) {
        click(InstrumentMainPage.Instrument_yearofrealese, "Click in date field and Year Selected");
        inputText(InstrumentMainPage.Instrument_yearofrealese, year_of_release, "Entered the Year "+year_of_release);
        pressEnter(InstrumentMainPage.Instrument_yearofrealese);
    }

    public static void createCountrty(String country) {
        inputText(InstrumentMainPage.Instrument_country, country, "Country Selected =" + country);

    }

    public static void createStatus(String status) {
        inputText(InstrumentMainPage.Instrument_status, status, "Select Portfolio Status=" + status);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + status + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + status + "']"), "Status selected"+status);

    }

    public static void createNotes(String notes) {
        inputText(InstrumentMainPage.Instrument_notes, notes, "Remarks Entered =" + notes);

    }

    public static void createAssetName(String asset_name) {
        inputText(InstrumentMainPage.Instrument_assetName, asset_name, "Asset Name is  Entered =" + asset_name);
    }

    public static void clickCreateInstrument() {
        click(InstrumentMainPage.Instrument_createInstrumentbtn, "Clicked the Create Button and Forwarded for Approval");
    }

    public static String getAssetCode()
    {
        String Asset_code=getElementText(By.xpath("//span[text()='Instrument Ref.']//following::tr[2]/td[5]"));
        LogUtil.infoLog(thisClass,"Asset name is ="+Asset_code);
        return  Asset_code;
    }

    public static String getInstrumentRefid() {
        return getElementValueWithVisibility(InstrumentMainPage.refid);
    }

    public static void updateAssetName(String asset_name) throws InterruptedException {
        clearInputUsingKeys(InstrumentMainPage.Instrument_updateassetName);
        inputText(InstrumentMainPage.Instrument_updateassetName, asset_name, "Update Asset Name  Entered =" + asset_name);
    }

    public static void updateAssetCode(String asset_code) throws InterruptedException {
        clearInputUsingKeys(InstrumentMainPage.Instrument_updateassetcode);
        inputText(InstrumentMainPage.Instrument_updateassetcode, asset_code, "Update Asset code  Entered =" + asset_code);

    }

    public static void updateAssetType(String asset_type) {
        inputText(InstrumentMainPage.Instrument_updateassettype, asset_type, "Select Portfolio Status=" + asset_type);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + asset_type + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + asset_type + "']"), "Asset Type selected"+asset_type);

    }

    public static void updateAssetSubType(String sub_type) {
        inputText(InstrumentMainPage.Instrument_updateassetsubtype, sub_type, "Select Portfolio Status=" + sub_type);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + sub_type + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + sub_type + "']"), "Sub Asset Type selected"+sub_type);

    }

    public static void updateDecimalConvention(String decimal_convention) throws InterruptedException {
        clearInputUsingKeys(InstrumentMainPage.Instrument_updatedecimalcon);
        inputText(InstrumentMainPage.Instrument_updatedecimalcon, decimal_convention, "Update Decimal code  Entered =" + decimal_convention);

    }

    public static void updateGST(String gst) {
        inputText(InstrumentMainPage.Instrument_updategst, gst, "Select Portfolio Status=" + gst);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + gst + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + gst + "']"), "GST Updated and  selected"+gst);

    }

    public static void updateBNetwork(String blockchain_network) throws InterruptedException {
        clearInputUsingKeys(InstrumentMainPage.Instrument_updatenetwork);
        inputText(InstrumentMainPage.Instrument_updatenetwork, blockchain_network, "Update BlockChain Network  Entered =" + blockchain_network);
    }

    public static void clickUpdateInstrument() {
        click(InstrumentMainPage.Instrument_updatebtn,"Updated the Records");
    }

    public static void deleteRecord() {
        click(InstrumentMainPage.Instrument_deletebtn,"Deleted the Records");
        waitForVisible(SettlementUpdatePage.updatesettlement_yesdeletebtn);
        click(SettlementUpdatePage.updatesettlement_yesdeletebtn,"clicked on Yes Button");
    }

    public static String getAssetName() {
        String Asset_name=getElementText(By.xpath("//span[text()='Instrument Ref.']//following::tr[2]/td[4]"));
        LogUtil.infoLog(thisClass,"Asset name available in the list ="+Asset_name);
        return  Asset_name;

    }

    public static void clickTradingInstruments() {
        click(InstrumentMainPage.Instrument_TradingInstruments,"Open Trading Instruments");


    }

    public static void clickNewTradingInstrument() {
        click(InstrumentMainPage.Instrument_NewTradingInstrument,"Open Trading Instruments");
    }

    public static void createExchange(String exchange) {
        inputText(InstrumentMainPage.Instrument_Exchange, exchange, "Select Exchange =" + exchange);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + exchange + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + exchange + "']"), "Exchange Type selected"+exchange);
    }

    public static void createExchangeSymbol(String exchange_symbol) {
        inputText(InstrumentMainPage.Instrument_ExchangeSymbol, exchange_symbol, "Select Exchange Symbol=" + exchange_symbol);

    }

    public static void createAltCoin(String alt_coin) {
        inputText(InstrumentMainPage.Instrument_AltCoin, alt_coin, "Select Exchange =" + alt_coin);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+alt_coin+"'])[1]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+alt_coin+"'])[1]"), "Alt Coin Type selected"+alt_coin);

    }

    public static void createQuoteCoin(String quote_coin) {
        inputText(InstrumentMainPage.Instrument_QuoteCoin, quote_coin, "Select Exchange =" + quote_coin);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+quote_coin+"'])[1]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+quote_coin+"'])[1]"), "Quote Coin Type selected"+quote_coin);

    }

    public static void createInsDerivateType(String instrument_derivative_type) {
        inputText(InstrumentMainPage.Instrument_InstrumentType, instrument_derivative_type, "Select Exchange =" + instrument_derivative_type);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+instrument_derivative_type+"'])[1]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+instrument_derivative_type+"'])[1]"), "Derivative Type selected"+instrument_derivative_type);

    }

    public static void createMarginType(String margin_type) {
        inputText(InstrumentMainPage.Instrument_MarginType, margin_type, "Select Exchange =" + margin_type);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+margin_type+"'])[1]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+margin_type+"'])[1]"), "Margin  Type selected"+margin_type);

    }

    public static void createDeliveryDate(String delivery_date) throws InterruptedException {
        inputText(InstrumentMainPage.Instrument_DeliveryDate, delivery_date, "Delivery Date =" + delivery_date);
        delay(2000);

    }

    public static void createPricePrecision(String price_precision) throws InterruptedException {
        inputText(InstrumentMainPage.Instrument_PricePrecision, price_precision, "Price Precision=" + price_precision);
        delay(2000);
    }

    public static void createSizePrecision(String size_precision) throws InterruptedException {
        inputText(InstrumentMainPage.Instrument_SizePrecision, size_precision, "Size Precision=" + size_precision);
        delay(2000);
    }

    public static void createMinOrder(String min_order) throws InterruptedException {
        inputText(InstrumentMainPage.Instrument_Min_Order, min_order, "Min. Order=" + min_order);
        delay(2000);
    }

    public static void createMaxOrder(String max_ordersize) throws InterruptedException {
        inputText(InstrumentMainPage.Instrument_MaxOrderSize, max_ordersize, "Max Order Size =" + max_ordersize);
        delay(2000);
    }

    public static void createMinOrderSize(String s) {
        inputText(InstrumentMainPage.Instrument_MinOrderSize, s, "Min.Order  Size=" + s);

    }


    public static void createLotSize(String lot_size) {
        inputText(InstrumentMainPage.Instrument_LotSize, lot_size, "Lot Exchange Symbol=" + lot_size);

    }

//    public static void createMinOrderNotional(String s) {
//        inputText(InstrumentMainPage.Instrument_MinOrderSize, exchange_symbol, "Select Exchange Symbol=" + exchange_symbol);
//
//    }

    public static void createTickSize(String tick_size) {
        inputText(InstrumentMainPage.Instrument_TickSize, tick_size, "Select Exchange Symbol=" + tick_size);

    }

    public static void createMinPrice(String s) {
        inputText(InstrumentMainPage.Instrument_Min_Price, s, "Min. Price =" + s);

    }

    public static void createMaxPrice(String max_price) {
        inputText(InstrumentMainPage.Instrument_Max_Price, max_price, "Max Price =" + max_price);

    }

    public static void createContarctSize(String contract_size) {
        inputText(InstrumentMainPage.Instrument_Contract_Size,contract_size , "Contract Size =" + contract_size);

    }

    public static void createContractAsset(String contract_asset) {
        inputText(InstrumentMainPage.Instrument_ContractAsset, contract_asset, "Select Exchange =" + contract_asset);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+contract_asset+"'])[1]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+contract_asset+"'])[1]"), "Contract Asset  selected"+contract_asset);

    }

    public static void createSetAsset(String settlement_asset) {
        inputText(InstrumentMainPage.Instrument_SettlementAsset, settlement_asset, "Select Exchange =" + settlement_asset);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+settlement_asset+"'])[2]"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+settlement_asset+"'])[2]"), "Settlement Asset selected"+settlement_asset);

    }

    public static void createTradingStatus(String status) {
        inputText(InstrumentMainPage.Instrument_Tradingstatus, status, "Select status =" + status);
        waitForVisible(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+status+"'])"));
        KeywordUtil.click(By.xpath("(//div[@class='rc-virtual-list-holder-inner']//div[text()='"+status+"'])"), "Status  Type selected"+status);

    }

    public static void createMinOrderNotional(String s) {
    }
}
