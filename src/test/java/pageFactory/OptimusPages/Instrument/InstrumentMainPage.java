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



}
