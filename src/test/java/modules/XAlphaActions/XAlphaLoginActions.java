package modules.XAlphaActions;

import pageFactory.XAlphaPages.XAlphaLoginPage;
import utilities.KeywordUtil;

import java.util.HashMap;

public class XAlphaLoginActions extends KeywordUtil {

    public static void enterUsername(HashMap<String, String> dataMap) {
        inputText(XAlphaLoginPage.username, dataMap.get("Username"), "Enter the username");
    }

    public static void enterPassword(HashMap<String, String> dataMap) {
        inputText(XAlphaLoginPage.password, dataMap.get("Password"), "Enter the password");
    }

    public static void clickLoginBtn() {
        click(XAlphaLoginPage.loginBtn, "Click login button.");
    }

    public static void waitForLogoutBtn() {
        waitForVisible(XAlphaLoginPage.logoutbtn);
    }

    public static void waitForLoginMsg() {
        waitForVisible(XAlphaLoginPage.loginMsg);
    }

    public static String getLoginMsg() {
        return getElementText(XAlphaLoginPage.loginMsg);
    }

    public static void waitForInvisibleLoginMsg() {
        waitForInVisibile(XAlphaLoginPage.loginMsg);
    }

}
