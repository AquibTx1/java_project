package NitroXPages;

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
    //Total Filtered
    public static By totalfilered=By.xpath("//div[text()='Total (Filtered)']");

   // Detailed Bots Frame
    public static By serviceid=By.xpath("//span[text()='Detailed Bots ETH/USDT' or text()='Detailed Bots BTC/USDT']/following::table[1]/tbody/tr[1]/td[2]");

    public static By botid=By.xpath("//span[text()='Detailed Bots ETH/USDT' or text()='Detailed Bots BTC/USDT']/following::table[1]/tbody/tr[1]/td[3]");
    public static By botName=By.xpath("//span[text()='Detailed Bots ETH/USDT' or text()='Detailed Bots BTC/USDT']/following::table[1]/tbody/tr[1]/td[4]");
    public static By status=By.xpath("//span[text()='Detailed Bots ETH/USDT' or text()='Detailed Bots BTC/USDT']/following::table[1]/tbody/tr[1]/td[5]");
    public static By progress=By.xpath("//span[text()='Detailed Bots ETH/USDT' or text()='Detailed Bots BTC/USDT']/following::table[1]/tbody/tr[1]/td[6]");
    public static By starttime=By.xpath("//span[text()='Detailed Bots ETH/USDT' or text()='Detailed Bots BTC/USDT']/following::table[1]/tbody/tr[1]/td[7]");
    public static By editbtn=By.xpath("//span[text()='Edit']");
    public static By resumebtn=By.xpath("//span[text()='Resume']");
    public static By restartbtn=By.xpath("//span[text()='Restart']");
    public static By duplicatetbtn=By.xpath("//span[text()='Duplicate']");
    public static By stopbtn=By.xpath("//span[text()='Stop']");
    public static By closeframebtn=By.xpath("//span[text()='Closed']");
    public static By startnewbot=By.xpath("//div[text()='Start New Bot']");
    public static By botsuccessMsg=By.xpath("//div[text()='1 Bot(s) were suceessfully started.']");

    //div[text()='Start New Bot']
    /*****
     *
     * SNIPER METHOD****************************************?

     */
    public static By totalamount=By.id("bot_config_form_config_totalAmount");
    public static By side=By.id("bot_config_form_config_side");

}