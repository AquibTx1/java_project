package pageFactory.NitroXPages;

import org.openqa.selenium.By;

public class NitroXBotsPage {

    //Bots

    public static By botlabel=By.xpath("//span[text()='Bots ETH/USDT']");

    public static By startbtn=By.xpath("(//span[text()='Start...'])[1]");
    public static By startbtn2=By.id("(//span[text()='Start...'])[2]");

    //Start New Bot
    public static By service=By.id("bot_config_form_service");
    public static By method=By.id("bot_config_form_method");
    public static By botquanity=By.id("bot_config_form_quantity");
    public static By orderdirection=By.id("bot_config_form_config_order_direction");
    public static By mintimebreak=By.id("bot_config_form_config_min_time_break");
    public static By maxtimebreak=By.id("bot_config_form_config_max_time_break");
    public static By randomrange=By.id("bot_config_form_config_random_range");
    public static By orderamount=By.id("bot_config_form_config_order_amount");
    public static By executionstrategy=By.id("bot_config_form_config_execution_strategy");
    public static By priceIncrement=By.id("bot_config_form_config_price_increment");
    public static By reservedamount=By.id("bot_config_form_config_reserved_amount");
    public static By minprice=By.id("bot_config_form_config_min_price");
    public static By maxprice=By.id("bot_config_form_config_max_price");
    public static By updatingbreak=By.id("bot_config_form_config_updating_break");
    public static By depthlevl=By.id("bot_config_form_config_depth_level");
    public static By ordertype=By.id("bot_config_form_config_order_type");
    public static By dealref=By.id("bot_config_form_config_deal_ref");
    public static By submitbtn=By.xpath("//span[text()='Submit']");
    public static By closebtn=By.xpath("//button[@aria-label='Close']");

    public static By trrigercond=By.id("bot_config_form_config_trigger_condition");
    //Total Filtered
    public static By totalfilered=By.xpath("//div[text()='Total (Filtered)']");

   // Detailed Bots Frame
    public static By serviceid=By.xpath("//th[text()='Service ID']//following::tr[1]/td[2]");

    public static By botid=By.xpath("//th[text()='Service ID']//following::tr[1]/td[3]");
    public static By botName=By.xpath("//th[text()='Service ID']//following::tr[1]/td[4]");
    public static By allbots=By.xpath("//th[text()='Service ID']//preceding-sibling::th");

    public static By currentbot=By.xpath("//th[text()='Service ID']//following::tr[1]/td[1]");
    public static By stopbots=By.xpath("//span[text()='Stop all']");

    public static By nodata=By.xpath("//div[text()='No Data']");
    public static By progress=By.xpath("//th[text()='Service ID']//following::tr[1]/td[6]");
    public static By starttime=By.xpath("//th[text()='Service ID']//following::tr[1]/td[7]");
    public static By config=By.xpath("//div[text()='Bot Details']/following::div[11]");
    public static By trrigger=By.xpath("//*[text()='Bot Details']/following::table/tbody/tr[7]/td[3]");

    public static By instrument_type_spot_ex=By.xpath("//*[text()='Bot Details']/following::table[4]/tbody/tr[2]/td[1]/span");

    public static By clickstarttime=By.xpath(" //span[text()='Start Time']");

    public static By recentDealtOrder = By.xpath("//span[text()='Recent Dealt Orders']/following::table[01]/tbody[01]/tr[02]/td[02]");
    //span[text()='Start Time']
    public static By editbtn=By.xpath("//span[text()='Edit']");
    public static By resumebtn=By.xpath("//span[text()='Resume']");
    public static By restartbtn=By.xpath("//span[text()='Restart']");
    public static By duplicatetbtn=By.xpath("//span[text()='Duplicate']");
    public static By stopbtn=By.xpath("//span[text()='Stop']");
    public static By closeframebtn=By.xpath("//span[text()='Closed']");
    public static By startnewbot=By.xpath("//div[text()='Start New Bot']");
    public static By botsuccessMsg=By.xpath("//div[text()='1 Bot(s) were suceessfully started.']");

    public static By closeconfigbtn=By.xpath("(//button[@class='ant-modal-close'])[2]");

    public static By closebotdetailbtn=By.xpath("(//button[@class='ant-modal-close'])[1]");

    public static By DealtOrderTab = By.xpath("//div[text()='Dealt Orders']");

    public static By trrigger_futuremode=By.xpath("//*[text()='Bot Details']/following::table/tbody/tr[7]/td[2]");



    //div[text()='Start New Bot']
    /*****
     *
     * SNIPER METHOD****************************************?

     */
    public static By totalamount=By.id("bot_config_form_config_totalAmount");

    public static By botdetail_snipper=By.xpath("(//*[text()='Bot Details']/following::table)[3]/tbody/tr[2]/td[1]/span");
    public static By side=By.id("bot_config_form_config_side");
    public static By minprice_sniper=By.id("bot_config_form_config_minPrice");
    public static By maxprice_sniper=By.id("bot_config_form_config_maxPrice");
    public static By maxSlippageThreshold_sniper=By.id("bot_config_form_config_maxSlippageThreshold");

    public static By s_trrigger=By.xpath("//*[text()='Bot Details']/following::table/tbody/tr[4]/td[3]");


    public static By s_trrigger_futuremode=By.xpath("//*[text()='Config']/following::table[8]/tbody/tr[5]/td/span");
    /*********************************PAIR TRADING BOT************************************************/

    public static By quantity= By.id("bot_config_form_config_quantity");

    public static By slicesize= By.id("bot_config_form_config_slice_size");

    public static By dealrefrow=By.xpath("//*[text()='Bot Details']/following::table[2]/tbody/tr[1]/td[1]");

    public static By quantity_twap=By.xpath("//*[text()='Bot Details']/following::table[2]/tbody/tr[2]/td[3]");

    public static By side_twap=By.xpath("//*[text()='Bot Details']/following::table[2]/tbody/tr[2]/td[3]");

    //*[text()='Bot Details']/following::table[2]/tbody/tr[2]/td[3]

    public static By duration=By.id("bot_config_form_config_duration");

    public static By DealRef=By.id("bot_config_form_config_deal_ref");
    public static By instrumenttype=By.id("bot_config_form_config_pair_leg_instrument_type");

    public static By accountid=By.id("bot_config_form_config_pair_leg_account_id");

    public static By basecurrency=By.id("bot_config_form_config_pair_leg_base");

    public static By quotecurrency=By.id("bot_config_form_config_pair_leg_quote");

    public static By pairlegSide=By.id("bot_config_form_config_pair_leg_side");

    public static By distancetotob=By.id("bot_config_form_config_pair_leg_distance_to_tob");

    /*****************************************Future Mode ****************************************/

    public static By targetaccountposition= By.id("bot_config_form_config_target_account_position");




}
