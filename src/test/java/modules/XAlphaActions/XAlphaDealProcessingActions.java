package modules.XAlphaActions;

import org.openqa.selenium.WebElement;
import pageFactory.XAlphaPages.XAlphaDealProcessingPage;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.util.List;

public class XAlphaDealProcessingActions extends KeywordUtil {

    static Class thisClass = XAlphaDealProcessingActions.class;

    public static void clickDealProcessingTab() {
        click(XAlphaDealProcessingPage.dealProcessingTab, "Click deal processing tab");
    }

    public static void waitForXAlphaDealslabel() {
        waitForPresent(XAlphaDealProcessingPage.XAlphaDealslabel);
    }

    public static void searchDealwrtDealRef(String dealRef) {
        inputText(XAlphaDealProcessingPage.inputSearchBox, dealRef, "Search a deal with deal reference");
    }

    public static void clickSearchIcon() throws InterruptedException {
        click(XAlphaDealProcessingPage.searchIcon, "Click search icon");
        delay(3000); //wait for deal results to load
    }

    public static void clickSelectAllChkbox() {
        click(XAlphaDealProcessingPage.selectAllCheckBox, "Click select all deals checkbox");
    }

    public static void clickFirstApproveBtn() {
        click(XAlphaDealProcessingPage.approveBtnFirst, "Click approve button");
    }

    public static List<WebElement> getAllApproveBtns() {
        return getListElements(XAlphaDealProcessingPage.approveBtns, "Get all available approve buttons");
    }

    public static void waitForConfirmMsg() {
        waitForPresent(XAlphaDealProcessingPage.confirmMsg);
    }

    public static void waitForConfirmMsgV2() {
        waitForPresent(XAlphaDealProcessingPage.confirmMsgV2);
    }

    public static void clickYesBtn() {
        click(XAlphaDealProcessingPage.yesbtn, "Click yes button to confirm approve");
    }

    public static void waitForNotification(){
        waitForPresent(XAlphaDealProcessingPage.notifText);
    }

    public static void waitForNotificationsToDisappear(){
        waitForInVisibile(XAlphaDealProcessingPage.notifText);
    }

    //get notification title text
    public static String getNotifText() {
        String notifMsg = getElementText(XAlphaDealProcessingPage.notifText);
        LogUtil.infoLog(thisClass, "Notification message on deal processing=" + notifMsg);
        return notifMsg;
    }

    //get notification description text
    public static String getNotifDescription() {
        String notifMsg = getElementText(XAlphaDealProcessingPage.notifTextDescription);
        LogUtil.infoLog(thisClass, "Notification description on deal processing=" + notifMsg);
        return notifMsg;
    }

    //wait for "Task has been approved." message
    public static void waitForApprovedNotif() {
        waitForPresent(XAlphaDealProcessingPage.notifTextDescriptionApproved);
    }
}
