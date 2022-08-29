package step_definitions.Optimus;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.NitroXActions.NitroXBotsAction;
import modules.OptimusActions.*;
import org.testng.Assert;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyCreatePage;
import pageFactory.OptimusPages.Portfolio.PortfolioMainPage;
import pageFactory.OptimusPages.Settlement.SettlementMainPage;
import pageFactory.OptimusPages.Settlement.SettlementUpdatePage;
import step_definitions.BaseStepDefinitions;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

import static utilities.KeywordUtil.*;


import java.util.HashMap;


public class OptimusSettlementSteps {

    public static HashMap<String, String> dataMap;

    public static String nick_name,refid;
    public OptimusSettlementSteps()
    {
        dataMap = BaseStepDefinitions.dataMap;
    }

    @And("Click the Settlement Tab")
    public void clickTheSettlementTab()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.settlement_MainTab);
                OptimusSettlementActions.clickSettlement();
                waitForVisible(SettlementMainPage.settlementlink);
                OptimusSettlementActions.clickSettlementLink();
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
    @And("Choose New Settlement")
    public void chooseNewSettlement() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.choosenewSettlement();
                waitForVisible(SettlementMainPage.newSettlement_CounterpartyID);

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

    @And("Enter the Settlement Ref detail")
    public void enterTheSettlementRefDetail() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.newSettlement_CounterParty(dataMap.get("Counterparty Name"));

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

    @And("Enter the Basic Information detail")
    public void enterTheBasicInformationDetail() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.newSettlement_ExternalNickName(dataMap.get("Settlement Nickname External"));

                OptimusSettlementActions.newSettlement_InternalNickName(dataMap.get("Settlement Nickname Internal"));

                OptimusSettlementActions.chooseSettlementType(dataMap.get("Settlement Type"));

                OptimusSettlementActions.chooseCurrency(dataMap.get("Currency"));

                OptimusSettlementActions.chooseTransferMethod(dataMap.get("Transfer Method"));
                OptimusSettlementActions.chooseNetwork(dataMap.get("Network"));
                OptimusSettlementActions.chooseCustodian(dataMap.get("Custodian"));
                //to be used in MO Account
               nick_name= OptimusSettlementActions.getSettlement_Nickname_Internal();
                System.out.println(nick_name);

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

    @And("Enter the Bank Information detail")
    public void enterTheBankInformationDetail() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.chooseBankName(dataMap.get("Bank Name"));
                OptimusSettlementActions.chooseAddress(dataMap.get("Bank Address"));
                OptimusSettlementActions.enterBankAccountNumber(dataMap.get("Bank Account Number"));
                OptimusSettlementActions.chooseBankBeneficiaryName(dataMap.get("Bank Beneficiary Name"));
                OptimusSettlementActions.chooseBankswiftcode(dataMap.get("Bank Swift Code"));
                OptimusSettlementActions.chooseBankABACode(dataMap.get("Bank ABA Code"));
                OptimusSettlementActions.chooseBankBeneficiaryaddress(dataMap.get("Bank Address"));
                OptimusSettlementActions.chooseBankRef(dataMap.get("Bank Reference"));



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

    @And("Enter Additional Information")
    public void enterAdditionalInformation() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.choosePurpose(dataMap.get("Purpose"));
                OptimusSettlementActions.enterWhitelistingRemarks(dataMap.get("Whitelisting Remarks"));
                OptimusSettlementActions.chooseWhitelistingMethod(dataMap.get("Whitelisting Method"));


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

    @Then("Click Create Settlement and verify the Settlement Forwarded for Approval")
    public void clickCreateSettlementAndVerify() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.clickCreateSettlement();
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
    @And("Logout from Optimus")
    public void logoutFromOptimus()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
              OptimusSettlementActions.logoutFromOptimus();
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
    @And("Click Tasks link")
    public void clickTasksLink() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.clickTaskslink();
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

    @And("Navigate to Settlement Task")
    public void navigateToSettlementTask() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputNickname(dataMap.get("Settlement Nickname Internal"));
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

    @And("Approve the Settlement")
    public void approveTheSettlement() {
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

    @Then("Verify the Settlement is approved")
    public void verifyTheSettlementIsApproved() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.settlementlist);
                OptimusSettlementActions.sortSettlementRef();
                OptimusSettlementActions.inputValue(dataMap.get("Counterparty Name"));
                Assert.assertEquals(OptimusSettlementActions.getNameSettlementList(),dataMap.get("Settlement Nickname Internal"));
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

    @And("Logout from MO Account")
    public void logoutFromMOAccount() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.refreshPage();
                delay(5000);
                OptimusSettlementActions.clickLogout();
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

    @And("Click the Settlement link")
    public void clickTheSettlementLink() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.clickSettlementLink();
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

    @And("Sort the Settlement Ref.")
    public void sortTheSettlementRef()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.settlementlist);
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
    @And("Click Edit Button")
    public void clickEditButton() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.newSettlement_edit);
                OptimusSettlementActions.clickEditSettlement();
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
    @And("Update the user detail in the Settlement list")
    public void updateTheUserDetailInTheSettlementList()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForPresent(SettlementMainPage.newSettlement_updatedNicknameInternal);
                OptimusSettlementActions.newSettlement_UpdatedExternalNickName(dataMap.get("Settlement Nickname External Updated"));
                OptimusSettlementActions.newSettlement_UpdatedInternalNickName(dataMap.get("Settlement Nickname Internal Updated"));
                OptimusSettlementActions.newSettlement_UpdatedSettlementType(dataMap.get("Settlement Type"));
                OptimusSettlementActions.newSettlement_UpdatedMethod(dataMap.get("Transfer Method"));
                OptimusSettlementActions.newSettlement_UpdatedNetwork(dataMap.get("Network"));
                OptimusSettlementActions.newSettlement_UpdateCustodian(dataMap.get("Custodian"));
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

    @And("Input the values and click Search")
    public void inputTheValuesAndClickSearch() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputNickname(refid);
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

    @Then("Click Update Settlement and verify the Settlement Forwarded for Approval")
    public void clickUpdateSettlementAndVerifyTheSettlementForwardedForApproval() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.updateSettlement();
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

    @Then("Verify the Settlement is updated")
    public void verifyTheSettlementIsUpdated() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.settlementlist);
                OptimusSettlementActions.inputValue(refid);
              //  OptimusSettlementActions.sortSettlementRef();
                Assert.assertEquals(OptimusSettlementActions.getNameSettlementList(),dataMap.get("Settlement Nickname Internal Updated").trim());
                Assert.assertEquals(OptimusSettlementActions.getExtNameSettlementList(),dataMap.get("Settlement Nickname External Updated").trim());
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

    @And("Click Portfolio Tab")
    public void clickPortfolioTab() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.clickPortfolio();
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

    @And("Click CounterParty Tab")
    public void clickCounterPartyTab() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.clickCounterPartyTab();
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

    @And("Click the edit link")
    public void clickTheEditLink() {

        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.settlementlist);
                OptimusSettlementActions.clickEditSettlement();
                waitForVisible(SettlementUpdatePage.updatesettlement_refid);
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

    @And("Delete the user detail in the Settlement list and sent for Approval")
    public void deleteTheUserDetailInTheSettlementList()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.deleteRecord();
                delay(3000);
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

    @And("Input the value to be delete for approval")
    public void inputTheValueToBeDeleteForApproval() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(refid);
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

    @And("Get the Settlement Ref id")
    public void getTheSettlementRefId()
    {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                refid=OptimusSettlementActions.getSettlmentrefid();
                System.out.println(refid);
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

    @Then("Verify the Settlement is deleted")
    public void verifyTheSettlementIsDeleted() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.settlementlist);
                OptimusSettlementActions.sortSettlementRef();
                OptimusSettlementActions.inputValue(refid);
                OptimusSettlementActions.clickSearch();
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

    @And("Navigate to list again and search the user")
    public void navigateToListAgainAndSearchTheUser() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                KeywordUtil.navigateToBack();
                delay(3000);
                waitForVisible(SettlementMainPage.settlementlist);
                OptimusSettlementActions.inputValue(refid);
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

    @Then("Verify the existing user is available")
    public void verifyTheExistingUserIsAvailable() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                Assert.assertEquals(OptimusSettlementActions.validateuser(dataMap),dataMap.get("Counterparty Name"));
                //Assert.assertTrue(KeywordUtil.isWebElementVisible(SettlementMainPage.newSettlement_edit));
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

    @And("Input the user detail to search")
    public void inputTheUserDetailToSearch() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.settlementlist);
                OptimusSettlementActions.inputNickname(dataMap.get("Counterparty Name"));
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

    @And("Click the download csv")
    public void clickTheDownloadCsv() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(SettlementMainPage.newSettlement_download);
                OptimusSettlementActions.clickdownloadcsv();

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
    @Then("Verify the file is downloaded")
    public void verifyTheFileIsDownloaded() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusPortfolioCreateActions.verifyDownloadCSVBtn();
                //Assert.assertTrue(OptimusSettlementActions.isfiletestDownloaded());
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


    @And("Sort the data")
    public void sortTheData() {
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
    }@And("Enter the Wallet detail")
    public void enterTheWalletDetail() {
        {
            if (BaseStepDefinitions.checkSkipExecutionFlags()) {
                BaseStepDefinitions.skipThisStep();
            } else {
                try {
                    OptimusSettlementActions.createWalletAddress(dataMap.get("Wallet Address"));
                    OptimusSettlementActions.createWalletMemo(dataMap.get("Wallet Memo"));

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
    }@And("Search the CounterParty to be Updated")
    public void searchTheCounterPartyToBeUpdated() {
        {
            if (BaseStepDefinitions.checkSkipExecutionFlags()) {
                BaseStepDefinitions.skipThisStep();
            } else {
                try {
                    OptimusSettlementActions.inputValue(dataMap.get("Counterparty Name"));
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
    }@And("Search the CounterParty to be deleted")
    public void searchTheCounterPartyToBeDeleted() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                OptimusSettlementActions.inputValue(dataMap.get("Counterparty Name"));
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

    @And("Search the Existing record")
    public void searchTheExistingRecord() {
        if (BaseStepDefinitions.checkSkipExecutionFlags()) {
            BaseStepDefinitions.skipThisStep();
        } else {
            try {
                waitForVisible(PortfolioMainPage.edit);
                OptimusSettlementActions.inputValue(dataMap.get("Portfolio Name"));
            }
            catch (Throwable e)
            {
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

