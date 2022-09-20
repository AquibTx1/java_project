package pageFactory.OptimusPages;

import org.openqa.selenium.By;

public class OptimusReferenceMasterPage {

    public static By referenceTasksTab_MO_Checker = By.xpath("//span[text()='Reference Tasks']");
    public static By referenceTasksTab_SearchBox_Checker = By.xpath("//div[@class='ant-tabs ant-tabs-top']/div[2]/div/div[2]//descendant::input[@placeholder='input search text']");
    public static By referenceTasksTab_SearchBtn_Checker = By.xpath("//div[@class='ant-tabs-content ant-tabs-content-top']/div[2]//form[@class='ant-form ant-form-inline _title_form_d4fpm_1']//button/span[@aria-label='search']");
    public static By referenceTasksTab_TaskCheckbox_Checker = By.xpath("//div[@class='_workflow_task_list_d4fpm_1']/div[1]/div/div/div[2]/label/span");
    public static By referenceTasksTab_SelectAll_Checker = By.xpath("//div[@class='_workflow_task_list_d4fpm_1']/form/button/span[contains(text(),'Select All Applicable')]");
    public static By referenceTasksTab_Checker_ApproveBtn = By.xpath("//div[@class='_workflow_task_list_d4fpm_1']/form/div/button/span[contains(text(),'Approve')]");
    public static By referenceTasksTab_Checker_ApproveAll_YesBtn = By.xpath("//div[@class='ant-popover-inner-content']/div[@class='ant-popover-buttons']/button/span[contains(text(),'Yes')]");
    public static By reference_SideTab = By.xpath("//ul/li/span/a[text()='References']");
    public static By reference_MainSearch = By.xpath("//input[@placeholder='input search text']");
    public static By reference_MainSearchBtn = By.cssSelector("form > span > span > span.ant-input-group-addon");
    public static String reference_SubTab = "//main/div/div/div[@role='tablist']/div/div[@class='ant-tabs-nav-list']/div/div[text()='%s']";
    public static By reference_SubTab_List = By.xpath("//div[@role='tabpanel']/div/div[@role='tablist']/div/div[@class='ant-tabs-nav-list']/div[1]/div[contains(text(),'List')]");

    public static By reference_List_SearchBox = By.xpath("//form[@class='ant-form ant-form-inline']//descendant::span[@class='ant-input-wrapper ant-input-group']/input[@placeholder='input search text']");
    public static By reference_List_SearchBtn = By.xpath("//form[@class='ant-form ant-form-inline']//descendant::span[@class='ant-input-group-addon']/button");
    public static By reference_List_Search_ReloadBtn = By.xpath("//button/span[@aria-label='reload']");
    public static By reference_List_Edit = By.xpath("//tbody/tr[2]/td[1]/div[1]");
    public static By reference_List_Name = By.xpath("//tbody/tr[2]/td[2]");
    public static By reference_List_Description = By.xpath("//tbody/tr[2]/td[3]");
    public static By reference_SubTab_NewEdit_Page = By.xpath("//div[@role='tabpanel']/div/div[@role='tablist']/div/div[@class='ant-tabs-nav-list']/div[2]/div/span[contains(text(),'New')]");
    public static String reference_New_Name = "//main/div/div/div[2]/div/div[%s]/div/div[2]/div/div[2]/div/form/div/div/div/div[2]/div/div/input";
    public static String reference_New_Description = "//main/div/div/div[2]/div/div[%s]/div/div[2]/div/div[2]/div/form/div/div[2]/div/div[2]/div/div/textarea";
    public static String reference_New_Submit_CreateBtn = "//main/div/div/div[2]/div/div[%s]/div/div[2]/div/div[2]/div/form/div[3]/div/button";
    public static By reference_New_DeleteBtn = By.xpath("//button/span[contains(text(),'Delete')]");
    public static By reference_New_Delete_YesBtn = By.xpath("//div[@class='ant-popover-inner-content']/div[2]/button[2]/span[text()='Yes']");

    public static By reference_New_UpdateBtn = By.xpath("//button/span[contains(text(),'Update')]");


}
