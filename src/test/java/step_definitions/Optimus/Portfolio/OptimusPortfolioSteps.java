package step_definitions.Optimus.Portfolio;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.OptimusActions.OptimusPortfolioCreateActions;
import modules.OptimusActions.OptimusSettlementActions;
import org.testng.Assert;
import pageFactory.OptimusPages.OptimusHomePage;
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

    public static String portfolio_number;
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
                waitForVisible(PortfolioMainPage.edit);
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

    @And("Navigate to Portfolio Task")
    public void navigateToPortfolioTask() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(PortfolioMainPage.Portfolio_system);
                OptimusSettlementActions.inputValue(dataMap.get("Portfolio Name"));
                OptimusSettlementActions.searchuser();
                OptimusSettlementActions.selectSettlementCheckbox();
                waitForVisible(SettlementMainPage.newSettlement_selectAll);
                OptimusSettlementActions.selectAllSettlementbtn();
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

    @And("Approve the Portfolio Task")
    public void approveThePortfolioTask() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.selectApprovebtn();
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

    @Then("Verify the Portfolio is updated")
    public void verifyThePortfolioIsUpdated() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(OptimusHomePage.editbtn);
                OptimusSettlementActions.inputValue(portfolio_number);
                Assert.assertEquals(OptimusPortfolioCreateActions.getPortfolioName(),dataMap.get("Portfolio Name").trim());
                Assert.assertEquals(OptimusPortfolioCreateActions.getPortfolioOwner(),dataMap.get("Portfolio Owner").trim());
                Assert.assertEquals(OptimusPortfolioCreateActions.getPortfolioLocation(),dataMap.get("Portfolio Location").trim());
                Assert.assertEquals(OptimusPortfolioCreateActions.getPortfolioentitycode(),dataMap.get("Portfolio Entity Code").trim());
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

    }    @And("Update the user detail in the Portfolio list")
    public void updateTheUserDetailInThePortfolioList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(PortfolioMainPage.portfolionumber);
                portfolio_number = OptimusPortfolioCreateActions.getPortfolionumber();
                OptimusPortfolioCreateActions.update_PortfolioOwner(dataMap.get("Portfolio Owner"));
                OptimusPortfolioCreateActions.update_HeadofBusiness(dataMap.get("Head of Business"));
                OptimusPortfolioCreateActions.update_TradingLocation(dataMap.get("Trading Location"));
                scrollingToElementofAPage(PortfolioMainPage.Portfolio_updateentitycode,"Scrolled to Account Info");
                OptimusPortfolioCreateActions.update_PortfolioEntitycode(dataMap.get("Portfolio Entity Code"));
                OptimusPortfolioCreateActions.update_PortfolioLocation(dataMap.get("Portfolio Location"));
                OptimusPortfolioCreateActions.update_PortfolioBranchCode(dataMap.get("Accounting Branch Code"));
                OptimusPortfolioCreateActions.update_PortfolioCostCenter(dataMap.get("Cost Center"));
                OptimusPortfolioCreateActions.update_PortfolioGSTInfo(dataMap.get("GST Information"));

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

    @Then("Click Update Portfolio and verify the Settlement Forwarded for Approval")
    public void clickUpdatePortfolioAndVerifyTheSettlementForwardedForApproval() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusPortfolioCreateActions.clickUpdatePortfolio();
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

    @And("Navigate to Portfolio Task input value and Click Search")
    public void navigateToPortfolioTaskInputValueAndClickSearch() {
        {
            if (BaseStepDefinitions.checkSkipExecutionFlags()) {
                BaseStepDefinitions.skipThisStep();
            } else {
                try {
                    waitForVisible(PortfolioMainPage.Portfolio_system);
                    OptimusSettlementActions.inputValue(portfolio_number);
                    OptimusSettlementActions.searchuser();
                    OptimusSettlementActions.selectSettlementCheckbox();
                    waitForVisible(SettlementMainPage.newSettlement_selectAll);
                    OptimusSettlementActions.selectAllSettlementbtn();

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

    @And("Sort the Portfolio")
    public void sortThePortfolio() {
        {
            if (BaseStepDefinitions.checkSkipExecutionFlags()) {
                BaseStepDefinitions.skipThisStep();
            } else {
                try {
                    waitForVisible(SettlementMainPage.newSettlement_edit);
                    OptimusSettlementActions.sortSettlementRef();
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

    @And("Input the changes and click Search")
    public void inputTheChangesAndClickSearch() {
        {
            if (BaseStepDefinitions.checkSkipExecutionFlags()) {
                BaseStepDefinitions.skipThisStep();
            } else {
                try {
                    OptimusSettlementActions.sortSettlementRef();
                    OptimusSettlementActions.inputValue(dataMap.get("Portfolio Name"));
                    Assert.assertEquals(OptimusPortfolioCreateActions.getPortfolioName(),dataMap.get("Portfolio Name").trim());
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
    @And("Get the Portfolio ref id")
    public void getThePortfolioRefId() {
        {
            if (BaseStepDefinitions.checkSkipExecutionFlags()) {
                BaseStepDefinitions.skipThisStep();
            } else {
                try {
                    portfolio_number = OptimusPortfolioCreateActions.getPortfolionumber();
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
    @Then("Delete the Portfolio record and login with MO Account for Approval")
    public void deleteThePortfolioRecordAndLoginWithMOAccountForApproval() {
        {
            if (BaseStepDefinitions.checkSkipExecutionFlags()) {
                BaseStepDefinitions.skipThisStep();
            } else {
                try {
                    OptimusPortfolioCreateActions.deleteRecord();

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

    @And("Input the Portfolio Number to be approved")
    public void inputThePortfolioNumberToBeApproved() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(portfolio_number);
                OptimusSettlementActions.searchuser();
                OptimusSettlementActions.selectSettlementCheckbox();
                waitForVisible(SettlementMainPage.newSettlement_selectAll);
                OptimusSettlementActions.selectAllSettlementbtn();
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

    @And("Search the Portfolio to be Updated")
    public void searchThePortfolioToBeUpdated() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(dataMap.get("Portfolio Name"));
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

    @And("Search the Portfolio to be deleted")
    public void searchThePortfolioToBeDeleted() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(dataMap.get("Portfolio Name"));
                OptimusSettlementActions.searchuser();
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

    @Then("Verify the Portfolio is deleted")
    public void verifyThePortfolioIsDeleted() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(portfolio_number);
                OptimusSettlementActions.searchuser();
                Assert.assertEquals(OptimusSettlementActions.getNoData(),"No Data");
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

    @Then("Verify the record is available")
    public void verifyTheRecordIsAvailable() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertTrue(OptimusPortfolioCreateActions.getPortfolioName().contains("Test_Portfolio_Name26"));
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
