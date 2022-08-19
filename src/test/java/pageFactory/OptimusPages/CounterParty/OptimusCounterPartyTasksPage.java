package pageFactory.OptimusPages.CounterParty;

import org.openqa.selenium.By;

public class OptimusCounterPartyTasksPage {
    public static By tasks_CounterPartyTab = By.id("rc-tabs-5-tab-item_0");
    public static By tasks_CpSearchBox = By.className("ant-input");
    public static By tasks_CpSearchBtn = By.className("ant-input-group-addon");
    public static By tasks_CpReloadBtn = By.xpath("//span[@aria-label='reload']//parent::button");
    public static By tasks_CpSearchResult1 = By.xpath("//div[@class='_workflow_task_list_d4fpm_1']/div[1]");
    public static By tasks_CpSearchResult1_Checkbox = By.xpath("(//div[@class='_workflow_task_1l3ie_1']//following::label/span)[1]");
    public static By tasks_CpSelectAllBtn = By.xpath("//div[@class='_workflow_task_list_d4fpm_1']/form/button/span[contains(text(),'Select All Applicable')]");
    public static By tasks_CpApproveBtn = By.xpath("//div[@class='_workflow_task_list_d4fpm_1']/form/div/button/span[contains(text(),'Approve')]");
    public static By tasks_CpRejectBtn = By.xpath("//div[@class='_workflow_task_list_d4fpm_1']/form/div/button/span[contains(text(),'Reject')]");
    public static By tasks_CpApprovePopUp = By.xpath("//div[@class='ant-popover ant-popconfirm ant-popover-placement-top ']");
    public static By tasks_CpApproveAll_YesBtn = By.xpath("//div[@class='ant-popover-inner-content']/div[@class='ant-popover-buttons']/button/span[contains(text(),'Yes')]");
    public static By tasks_SuccessMessage = By.xpath("//div[text()='Success!']");
}
