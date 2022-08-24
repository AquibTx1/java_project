package step_definitions.Optimus.Portfolio;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.OptimusActions.OptimusPortfolioCreateActions;
import modules.OptimusActions.OptimusSettlementActions;
import org.testng.Assert;
import pageFactory.OptimusPages.Portfolio.PortfolioMainPage;
import pageFactory.OptimusPages.Settlement.SettlementMainPage;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;
import utilities.KeywordUtil.*;

import java.util.HashMap;

import static utilities.KeywordUtil.scrollingToElementofAPage;
import static utilities.KeywordUtil.waitForVisible;

public class OptimusPortfolioSteps {


    public static HashMap<String, String> dataMap;

    public OptimusPortfolioSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }

    @And("Click the Portfolio Tab")
    public void clickThePortfolioTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(PortfolioMainPage.Portfolio_MainTab);
            OptimusPortfolioCreateActions.clickPortfolioMainTab();
            OptimusPortfolioCreateActions.clickPortfoliolink();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @And("Choose New Portfolio")
    public void chooseNewPortfolio() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(PortfolioMainPage.NewPortfolio_link);
                OptimusPortfolioCreateActions.ChooseNewPortfolio();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
        
    }

    @And("Enter the Portfolio detail")
    public void enterThePortfolioDetail() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusPortfolioCreateActions.createPortfolioType(dataMap.get("Portfolio Type"));
                OptimusPortfolioCreateActions.create_PortfolioName(dataMap.get("Portfolio Name"));
                OptimusPortfolioCreateActions.createPortfolioStatus(dataMap.get("Portfolio Status"));
                OptimusPortfolioCreateActions.create_PortfolioOwner(dataMap.get("Portfolio Owner"));
                OptimusPortfolioCreateActions.createHead(dataMap.get("Head of Business"));
                OptimusPortfolioCreateActions.createTradingLocation(dataMap.get("Trading Location"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
        
    }
    @And("Enter the Portfolio Hierarchy detail")
    public void enterThePortfolioHierarchyDetail() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusPortfolioCreateActions.createMaingroup(dataMap.get("Main Group"));
                OptimusPortfolioCreateActions.createBusinessLine(dataMap.get("Business Line"));
                OptimusPortfolioCreateActions.createActivity(dataMap.get("Activity"));
                OptimusPortfolioCreateActions.createSubActivity(dataMap.get("Sub-Activity"));
                OptimusPortfolioCreateActions.createStrategy(dataMap.get("Strategy"));

            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
        
    }

    @And("Enter the Portfolio Reporting Information detail")
    public void enterThePortfolioReportingInformationDetail() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusPortfolioCreateActions.createCurrency(dataMap.get("PL Asset/Currency"));
                OptimusPortfolioCreateActions.createFunCurrency(dataMap.get("Functional Currency"));
                OptimusPortfolioCreateActions.createPLCalculation(dataMap.get("PL Calculation"));

            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @And("Enter Portfolio Settlement Information")
    public void enterPortfolioSettlementInformation() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(PortfolioMainPage.Portfolio_fiatgroup,"Scrolled to group");
                OptimusPortfolioCreateActions.createFiatSettlmentGroup(dataMap.get("Fiat Settlement Group"));
//                OptimusPortfolioCreateActions.createTokenSettlmentGroup(dataMap.get("Token Settlement Group"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }

    }

    @And("Enter Portfolio Accounting Information")
    public void enterPortfolioAccountingInformation() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                scrollingToElementofAPage(PortfolioMainPage.Portfolio_CostCenter,"Scrolled to page");
                OptimusPortfolioCreateActions.CostCenter(dataMap.get("Cost Center"));
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }

    @Then("Click Create Portfolio and verify the Settlement Forwarded for Approval")
    public void clickCreatePortfolioAndVerifyTheSettlementForwardedForApproval() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusPortfolioCreateActions.clickCreatePortfolio();
                OptimusSettlementActions.waitForSuccessMsgToAppear();
                OptimusSettlementActions.waitForSuccessMsgToDisappear();
            } catch (Throwable e) {
                GlobalUtil.e = e;
                GlobalUtil.errorMsg = e.getMessage();
                Assert.fail(e.getMessage());
            }
            //increase the step counter by 1
            if (BaseStepDefinitions.getSITflag()) {
                BaseStepDefinitions.increaseCounter();
            }
        }
    }
}
