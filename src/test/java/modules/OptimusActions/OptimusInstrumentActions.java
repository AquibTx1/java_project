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
}
