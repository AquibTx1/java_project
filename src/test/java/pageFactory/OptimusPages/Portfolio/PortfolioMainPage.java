package pageFactory.OptimusPages.Portfolio;

import org.openqa.selenium.By;

public class PortfolioMainPage {

    public static By Portfolio_MainTab = By.xpath("//a[text()='Portfolio']");

    public static By Portfolio_link = By.xpath("//a[text()='Portfolios']");

    public static By Portfolio_createPortfoliotype = By.id("create_portfolio_portfolio_type");

    public static String Portfolio_createPortfolio = "//div[@class='rc-virtual-list-holder-inner']//div[text()='%s']";
    public static By Portfolio_createName = By.id("create_portfolio_portfolio_name");
    public static By Portfolio_createStatus = By.id("create_portfolio_portfolio_status");
    public static By Portfolio_createOwner = By.id("create_portfolio_portfolio_owner");
    public static By Portfolio_createHead = By.id("create_portfolio_head_of_business");
    public static By Portfolio_createTradingLocation = By.id("create_portfolio_trading_location");
    //Hierarchy
    public static By Portfolio_Hierarchy = By.id("create_portfolio_main_group");
    public static By Portfolio_Business = By.id("create_portfolio_business_line");
    public static By Portfolio_Activity = By.id("create_portfolio_activity");
    public static By Portfolio_SubActivity = By.id("create_portfolio_sub_activity");
    public static By Portfolio_Strategy = By.id("create_portfolio_strategy");
    //Reporting
    public static By Portfolio_currency = By.id("create_portfolio_pnl_currency");
    public static By Portfolio_functionalcurrency = By.id("create_portfolio_functional_currency");
    public static By Portfolio_calculation = By.id("create_portfolio_pnl_calculation");
    public static By Portfolio_fiatgroup = By.id("create_portfolio_fiat_settlement_group");
    public static By Portfolio_tokengroup = By.id("create_portfolio_token_settlement_group");

    public static By Portfolio_system = By.xpath("//b[text()='system.qa']");
    public static By Portfolio_entity = By.id("create_portfolio_portfolio_entity");
    public static By Portfolio_entitycode = By.id("create_portfolio_portfolio_entity_code");

    public static By Portfolio_updateentitycode = By.id("update_portfolio_portfolio_entity_code");
    public static By Portfolio_Location = By.id("create_portfolio_portfolio_location");

    public static By Portfolio_updatedLocation = By.id("update_portfolio_portfolio_location");
    public static By Portfolio_Branchcode = By.id("create_portfolio_accounting_branch_code");

    public static By Portfolio_updateBranchcode = By.id("update_portfolio_accounting_branch_code");
    public static By Portfolio_CostCenter = By.id("create_portfolio_cost_center");
    public static By Portfolio_updateCostCenter = By.id("update_portfolio_cost_center");
    public static By Portfolio_GSTInformation = By.id("create_portfolio_gst_information");

    public static By Portfolio_updateGSTInformation = By.id("update_portfolio_gst_information");
    public static By create_Portfoliobtn = By.xpath("//span[text()='Create Portfolio']");

    public static By NewPortfolio_link = By.xpath("//span[text()='New Portfolio']");
    public static By yesbtn = By.xpath("//button[@type='button']/span[text()='Yes']");
    public static By newSettlement_Approve = By.xpath("//span[text()='Approve']");

    public static By edit = By.xpath("(//a[text()='Edit'])[1]");

    public static By newSettlement_download = By.xpath("//span[text()=' Download CSV ']");
    public static By newSettlement_inputsearchtext = By.xpath("//input[@placeholder='input search text']");

    public static By adminTab = By.xpath("//a[text()='Auth Admin']");


    public static By portfolionumber=By.id("update_portfolio_portfolio_number");
    public static By updateportfolioname=By.id("update_portfolio_portfolio_name");
    public static By updateportfolio_owner=By.xpath("//label[text()='Portfolio Owner']//following::input[1]");
    public static By updatebtn=By.xpath("//span[text()='Update Portfolio']");
    public static By Portfolio_deleterecordbtn=By.xpath("//span[text()='Delete Portfolio']");
}
