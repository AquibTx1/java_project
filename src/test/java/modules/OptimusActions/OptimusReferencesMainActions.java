package modules.OptimusActions;

import org.openqa.selenium.By;
import pageFactory.OptimusPages.OptimusReferenceMasterPage;
import utilities.KeywordUtil;
import utilities.LogUtil;

public class OptimusReferencesMainActions extends KeywordUtil {

    static Class<OptimusReferencesMainActions> thisClass = OptimusReferencesMainActions.class;

    public static void open_ReferenceTasksTab_MO_Checker() {
        waitForVisible(OptimusReferenceMasterPage.referenceTasksTab_MO_Checker);
        click(OptimusReferenceMasterPage.referenceTasksTab_MO_Checker, "Click References Tasks tab with Mo Account");
    }

    public static void open_Reference_SideTab() {
        waitForVisible(OptimusReferenceMasterPage.reference_SideTab);
        click(OptimusReferenceMasterPage.reference_SideTab, "Click References side tab");
        waitForVisible(OptimusReferenceMasterPage.reference_MainSearch);
    }

    public static void reference_MainSearch_Tab(String item) {
        waitForVisible(OptimusReferenceMasterPage.reference_MainSearch);
        inputText(OptimusReferenceMasterPage.reference_MainSearch, item, "Enter Search for Tab Name");
        click(OptimusReferenceMasterPage.reference_MainSearchBtn, "Click Master Search button");
    }

    public static void referenceTask_MOCheckerSearch(String item) {
        waitForVisible(OptimusReferenceMasterPage.referenceTasksTab_SearchBox_Checker);
        inputText(OptimusReferenceMasterPage.referenceTasksTab_SearchBox_Checker, item, "Enter Search for Reference Task");
        click(OptimusReferenceMasterPage.referenceTasksTab_SearchBtn_Checker, "Click Search button");
    }

    public static void select_FirstReferenceTasks() {
        waitForVisible(OptimusReferenceMasterPage.referenceTasksTab_TaskCheckbox_Checker);
        click(OptimusReferenceMasterPage.referenceTasksTab_TaskCheckbox_Checker, "click to Select Reference Type to approve");
    }

    public static void select_All_ReferenceTasks() {
        waitForVisible(OptimusReferenceMasterPage.referenceTasksTab_SelectAll_Checker);
        click(OptimusReferenceMasterPage.referenceTasksTab_SelectAll_Checker, "click to Select All button for Reference Type to approve");
    }

    public static void approve_AllSelected_ReferenceTasks() {
        waitForVisible(OptimusReferenceMasterPage.referenceTasksTab_Checker_ApproveBtn);
        click(OptimusReferenceMasterPage.referenceTasksTab_Checker_ApproveBtn, "click to Approve All button for Reference Type to approve");
        waitForVisible(OptimusReferenceMasterPage.referenceTasksTab_Checker_ApproveAll_YesBtn);
        click(OptimusReferenceMasterPage.referenceTasksTab_Checker_ApproveAll_YesBtn, "click Yes in popup to Approve All button for Reference Type to approve");

    }


    public static void reference_List_SearchBox(String item) {
        waitForVisible(OptimusReferenceMasterPage.reference_List_SearchBox);
        inputText(OptimusReferenceMasterPage.reference_List_SearchBox, item, "Enter Ref typeSearch for Tab Name");
        click(OptimusReferenceMasterPage.reference_List_SearchBtn, "Click Ref type Search button");
    }

    public static void open_Reference_SubTab(String tabName) {
        waitForVisible(OptimusReferenceMasterPage.reference_MainSearch);
        click(By.xpath(String.format(OptimusReferenceMasterPage.reference_SubTab, tabName)), "Click on Reference sub tab " + tabName);
        waitForVisible(OptimusReferenceMasterPage.reference_SubTab_List);
    }

    public static void open_Reference_ListTab() {
        waitForVisible(OptimusReferenceMasterPage.reference_MainSearch);
        click(OptimusReferenceMasterPage.reference_SubTab_List, "Click on Reference sub tab ");
        waitForVisible(OptimusReferenceMasterPage.reference_List_SearchBox);
    }

    public static void click_New_ReferenceType_SubTab_Page() {
        waitForVisible(OptimusReferenceMasterPage.reference_SubTab_NewEdit_Page);
        click(OptimusReferenceMasterPage.reference_SubTab_NewEdit_Page, "click to open New or Edit Reference Type page");
    }

    public static void input_New_ReferenceType_Name(String index, String text) throws InterruptedException {
        waitForVisible(By.xpath(String.format(OptimusReferenceMasterPage.reference_New_Name, index)));
        clearInputUsingKeys(By.xpath(String.format(OptimusReferenceMasterPage.reference_New_Name, index)));
        inputText(By.xpath(String.format(OptimusReferenceMasterPage.reference_New_Name, index)), text, "Enter Name for Reference sub tab " + text);
    }


    public static void input_New_ReferenceType_Description(String index, String text) throws InterruptedException {
        waitForVisible(By.xpath(String.format(OptimusReferenceMasterPage.reference_New_Description, index)));
        clearInputUsingKeys(By.xpath(String.format(OptimusReferenceMasterPage.reference_New_Description, index)));
        inputText(By.xpath(String.format(OptimusReferenceMasterPage.reference_New_Description, index)), text, "Enter Name for Reference sub tab " + text);
    }

    public static void referenceType_Submit_Createbtn(String index) throws InterruptedException {
        waitForVisible(By.xpath(String.format(OptimusReferenceMasterPage.reference_New_Submit_CreateBtn, index)));
        click(By.xpath(String.format(OptimusReferenceMasterPage.reference_New_Submit_CreateBtn, index)), "Clicked Submit button");
    }

    public static void input_New_ReferenceType_Deletebtn(String index) throws InterruptedException {
        waitForVisible(OptimusReferenceMasterPage.reference_New_DeleteBtn);
        click(OptimusReferenceMasterPage.reference_New_DeleteBtn, "Clicked Delete button");
        click(OptimusReferenceMasterPage.reference_New_Delete_YesBtn, "Clicked Yes to delete Item");
    }

    public static void input_New_ReferenceType_Updatebtn(String index) throws InterruptedException {
        waitForVisible(OptimusReferenceMasterPage.reference_New_UpdateBtn);
        click(OptimusReferenceMasterPage.reference_New_UpdateBtn, "Clicked Update button");
    }

    public static void click_ReferenceList_Editbtn(String index) throws InterruptedException {
        waitForVisible(OptimusReferenceMasterPage.reference_New_UpdateBtn);
        click(OptimusReferenceMasterPage.reference_New_UpdateBtn, "Clicked Edit button in List");
    }


    public static String get_Name_ReferenceList() {
        waitForVisible(OptimusReferenceMasterPage.reference_List_Name);
        String text = getElementText(OptimusReferenceMasterPage.reference_List_Name);
        LogUtil.infoLog(thisClass, "Element Text is =" + text);
        return text;
    }

    public static String get_Description_ReferenceList() {
        waitForVisible(OptimusReferenceMasterPage.reference_List_Description);
        String text = getElementText(OptimusReferenceMasterPage.reference_List_Description);
        LogUtil.infoLog(thisClass, "Element text is =" + text);
        return text;
    }


}
