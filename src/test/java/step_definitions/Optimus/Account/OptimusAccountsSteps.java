package step_definitions.Optimus.Account;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.OptimusActions.*;
import org.testng.Assert;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

import java.util.HashMap;

public class OptimusAccountsSteps {

    public static HashMap<String, String> dataMap;

    public OptimusAccountsSteps() {
        dataMap = BaseStepDefinitions.dataMap;
    }

    String mainAccID;
    String accName;
    String accLogin;

    @And("Open Account main tab")
    public void openAccountMainTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.openAccountMainTab();
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

    @And("Open Accounts side tab")
    public void openAccountsSideTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.openAccountsSideTab();
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

    @And("Open Accounts List tab")
    public void openAccountsListTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.openAccountListTab();
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

    @And("Search for existing Account in List")
    public void searchForExistingAccountInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusMainActions.searchForItem(dataMap.get("AccountName"));
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

    @Then("Verify Search Results of Existing Accounts")
    public void verifySearchResultsOfExistingAccounts() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.editLinkinResultPresent();
                Assert.assertTrue(OptimusAccountActions.getAccountNameFromList().contains(dataMap.get("AccountName")), "Account contains TXAAccount Name");
                Assert.assertTrue(OptimusAccountActions.getAccountLoginFromList().contains(dataMap.get("AccountLogin")), "Account contains TXAAccountLogin");
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

    @And("Open Create New Accounts Page")
    public void openCreateNewAccountsPage() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.openAccountCreateTab();
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

    @And("Enter Mandatory And Text Fields in Accounts")
    public void enterMandatoryAndTextFieldsInAccounts() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                mainAccID = dataMap.get("MainAccountID") + KeywordUtil.generateRandomNumber200to500();
                OptimusAccountActions.account_MainAccountID(mainAccID);
                OptimusAccountActions.account_Exchange(dataMap.get("Exchange"));
                accName = dataMap.get("AccountName") + KeywordUtil.generateRandomNumber200to500();
                OptimusAccountActions.account_AccountName(accName);
                OptimusAccountActions.account_AccountLogin(dataMap.get("AccountLogin"));
                OptimusAccountActions.account_Owner(dataMap.get("Owner"));
                OptimusAccountActions.account_Comment(dataMap.get("Comment"));
                OptimusAccountActions.account_Channel1(dataMap.get("Channel1"));
                OptimusAccountActions.account_Address1(dataMap.get("Address1"));
                OptimusAccountActions.account_Memo1(dataMap.get("Memo1"));
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

    @And("Enter Dropdown Fields for Account")
    public void enterDropdownFieldsForAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.account_AccountSource(dataMap.get("AccountSource"));
                OptimusAccountActions.account_AccountType(dataMap.get("AccountType"));
                OptimusAccountActions.account_Function(dataMap.get("Function"));
                OptimusAccountActions.account_Permission(dataMap.get("Permission"));
                OptimusAccountActions.account_Entity(dataMap.get("Entity"));
                OptimusAccountActions.account_WalletController(dataMap.get("WalletController"));
                OptimusAccountActions.account_PortfolioNumber(dataMap.get("PortfolioNumber"));
                OptimusAccountActions.account_CounterpartyRef(dataMap.get("CounterpartyRef"));

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

    @And("Click Create button to create Account")
    public void clickCreateButtonToCreateAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.click_Account_Create_btn();
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

    @And("Search for Account tasks to approve")
    public void searchForAccountTasksToApprove() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusMainActions.searchTasks(accName);
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

    @And("Approve searched tasks")
    public void approveSearchedTasks() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusMainActions.selectFirstTask();
                OptimusMainActions.selectAllTasks();
                OptimusMainActions.approveAllSelectedTasks();
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

    @And("Search for created Account in List")
    public void searchForCreatedAccountInList() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusMainActions.searchForItem(accName);
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

    @Then("Verify Search Results of added or updated Accounts")
    public void verifySearchResultsOfAddedOrUpdatedAccounts() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusAccountActions.editLinkinResultPresent();
                Assert.assertEquals(OptimusAccountActions.getAccountNameFromList(), accName, "Account Name Matches");
                Assert.assertTrue(OptimusAccountActions.getAccountNameFromList().contains(dataMap.get("AccountName")), "Account contains TXAAccount Name");
                Assert.assertTrue(OptimusAccountActions.getAccountLoginFromList().contains(dataMap.get("AccountLogin")), "Account contains TXAAccountLogin");
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
