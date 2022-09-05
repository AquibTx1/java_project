package modules.OptimusActions;

import com.relevantcodes.extentreports.LogStatus;
import pageFactory.OptimusPages.Account.OptimusAccountMainPage;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyListPage;
import pageFactory.OptimusPages.CounterParty.OptimusCounterPartyTasksPage;
import step_definitions.RunCukesTest;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;

public class OptimusMainActions extends KeywordUtil {

    static Class<OptimusMainActions> thisClass = OptimusMainActions.class;

    public static void openListTab() {
        click(OptimusCounterPartyListPage.counterParties_ListTab, "Click List tab");
    }
    public static void searchForItem(String itemName) throws InterruptedException {
        waitForClickable(OptimusCounterPartyListPage.counterPartyList_SearchBox);
        inputText(OptimusCounterPartyListPage.counterPartyList_SearchBox, itemName, "Enter Search Criteria");
        click(OptimusCounterPartyListPage.counterPartyList_SearchBtn, "Click Search button");
    }

    public static void searchTasks(String searchText) {
        click(OptimusCounterPartyTasksPage.tasks_CpSearchBox, "Click Search box");
        inputText(OptimusCounterPartyTasksPage.tasks_CpSearchBox, searchText, "Searching Tasks");
        click(OptimusCounterPartyTasksPage.tasks_CpSearchBtn, "Click Search button");
        waitForVisible(OptimusCounterPartyTasksPage.tasks_CpSearchResult1);
    }

    public static void selectFirstTask() {
        waitForVisible(OptimusCounterPartyTasksPage.tasks_CpSearchResult1);
        click(OptimusCounterPartyTasksPage.tasks_CpSearchResult1_Checkbox, "Click first result check box");
    }

    public static void selectAllTasks() {
        waitForVisible(OptimusCounterPartyTasksPage.tasks_CpSelectAllBtn);
        click(OptimusCounterPartyTasksPage.tasks_CpSelectAllBtn, "Select All tasks on page");
    }

    public static void approveAllSelectedTasks() throws InterruptedException {
        waitForVisible(OptimusCounterPartyTasksPage.tasks_CpApproveBtn);
        click(OptimusCounterPartyTasksPage.tasks_CpApproveBtn, "Click Approve All button");
        waitForVisible(OptimusCounterPartyTasksPage.tasks_CpApprovePopUp);
        delay(2000);
        click(OptimusCounterPartyTasksPage.tasks_CpApproveAll_YesBtn, "Approve all Click yes button");
    }

    public static void verifyDownloadCSVBtn() {
        waitForClickable(OptimusCounterPartyListPage.counterPartyList_DownloadCSVBtn);
        RunCukesTest.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringGreyColor("Download CSV button is enabled and clickable"));
    }

    public static void clickNitroSideTab() {
        click(OptimusAccountMainPage.account_NitroAccount_SideTab, "Clicking Nitro Account Side tab");
    }

}
