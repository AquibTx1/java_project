package modules.OptimusActions;

import org.openqa.selenium.By;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyCreatePage;
import pageFactory.OptimusPages.CounterParty.OptimusRelatedPartyCreatePage;
import pageFactory.OptimusPages.Portfolio.PortfolioMainPage;
import pageFactory.OptimusPages.Settlement.SettlementMainPage;
import pageFactory.OptimusPages.Portfolio.PortfolioMainPage;
import utilities.KeywordUtil;




public class OptimusPortfolioCreateActions extends KeywordUtil {


    static Class<OptimusPortfolioCreateActions> thisClass = OptimusPortfolioCreateActions.class;



    public static void createPortfolioType(String porttype) {
        inputText(PortfolioMainPage.Portfolio_createPortfoliotype,porttype,"Portfolio Type"+porttype);
            waitForPresent(By.xpath(String.format(PortfolioMainPage.Portfolio_createPortfolio, porttype)));
            click(By.xpath(String.format(PortfolioMainPage.Portfolio_createPortfolio, porttype)), "Choose PortType");
    }
    public static void create_PortfolioName(String portfolioname) {
        inputText(PortfolioMainPage.Portfolio_createName, portfolioname, "Select Portfolioname=" + portfolioname);

    }

    public static void createPortfolioStatus(String pstatus) {
        inputText(PortfolioMainPage.Portfolio_createStatus, pstatus, "Select Portfolio Status=" + pstatus);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + pstatus + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + pstatus + "']"), "Portfolio status selected");
    }

    public static void create_PortfolioOwner(String powner) {
        inputText(PortfolioMainPage.Portfolio_createOwner, powner, "Select Portfolio Status=" + powner);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + powner + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + powner + "']"), "Portfolio Owner selected");
    }

    public static void createHead(String phead) {

        inputText(PortfolioMainPage.Portfolio_createHead, phead, "Select Portfolio Status=" + phead);
        waitForPresent(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + phead + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + phead + "']"), "Portfolio Head selected");
    }

    public static void createTradingLocation(String Tradingloc) {
        inputText(PortfolioMainPage.Portfolio_createTradingLocation, Tradingloc, "Select Portfolio Status=" + Tradingloc);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + Tradingloc + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + Tradingloc + "']"), "Portfolio Trading selected");
    }

    public static void clickPortfolioMainTab() {
        click(PortfolioMainPage.Portfolio_MainTab, "Clicked the Portfolio Tab");
    }

    public static void clickPortfoliolink() {
        click(PortfolioMainPage.Portfolio_link, "Clicked the Portfolio Tab");
    }

    public static void ChooseNewPortfolio() {
        click(PortfolioMainPage.NewPortfolio_link, "Clicked the New Portfolio");
    }

    public static void createMaingroup(String maingroup) {
        inputText(PortfolioMainPage.Portfolio_Hierarchy, maingroup, "Select Portfolio Status=" + maingroup);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + maingroup + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + maingroup + "']"), "Main Group selected");
    }

    public static void createBusinessLine(String businessline) {
        inputText(PortfolioMainPage.Portfolio_Business, businessline, "Select Portfolio Status=" + businessline);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + businessline + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + businessline + "']"), "Business Head selected");

    }

    public static void createActivity(String activity) {
        inputText(PortfolioMainPage.Portfolio_Activity, activity, "Select Portfolio Status=" + activity);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + activity + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + activity + "']"), "Activity Head selected");

    }

    public static void createSubActivity(String subactivity) {
        inputText(PortfolioMainPage.Portfolio_SubActivity, subactivity, "Select Portfolio Status=" + subactivity);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + subactivity + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + subactivity + "']"), " Sub activity selected");

    }

    public static void createStrategy(String startegy) {
        inputText(PortfolioMainPage.Portfolio_Strategy, startegy, "Select Portfolio Strategy=" + startegy);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + startegy + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + startegy + "']"), "Strategy selected");

    }

    public static void createCurrency(String currency) {
        inputText(PortfolioMainPage.Portfolio_currency, currency, "Select Portfolio Strategy=" + currency);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + currency + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + currency + "']"), "Currency selected"+currency);
    }

    public static void createFunCurrency(String functional_currency) {
        inputText(PortfolioMainPage.Portfolio_functionalcurrency, functional_currency, "Select Portfolio Strategy=" + functional_currency);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + functional_currency + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + functional_currency + "']"), "Functional Currency"+functional_currency);
    }

    public static void createPLCalculation(String calculation) {
        inputText(PortfolioMainPage.Portfolio_calculation, calculation, "Select Portfolio Strategy=" + calculation);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + calculation + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + calculation + "']"), "Calculation Selected"+calculation);
    }

    public static void createFiatSettlmentGroup(String fiat) {
        inputText(PortfolioMainPage.Portfolio_fiatgroup, fiat, "Select Portfolio Strategy=" + fiat);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + fiat + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + fiat + "']"), "Fiat  Selected"+fiat);
    }

    public static void createTokenSettlmentGroup(String Token) {
        inputText(PortfolioMainPage.Portfolio_tokengroup, Token, "Select Portfolio Strategy=" + Token);
        waitForVisible(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + Token + "']"));
        KeywordUtil.click(By.xpath("//div[@class='rc-virtual-list-holder-inner']//div[text()='" + Token + "']"), "Token Selected"+Token);
    }

    public static void CostCenter(String costcenter) {
        inputText(PortfolioMainPage.Portfolio_CostCenter, costcenter, "Select Portfolio Strategy=" + costcenter);

    }

    public static void clickCreatePortfolio() {
        clickJS(PortfolioMainPage.create_Portfoliobtn, "Clicked the Portfolio Button");

    }
}
