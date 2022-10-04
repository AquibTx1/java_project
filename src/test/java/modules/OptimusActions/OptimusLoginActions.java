package modules.OptimusActions;

import pageFactory.OptimusPages.OptimusLoginPage;
import utilities.KeywordUtil;

import java.util.HashMap;

public class OptimusLoginActions extends KeywordUtil {

    public static void waitForUsernameTextBox() { waitForVisible(OptimusLoginPage.username); }

    public static void enterUsername(HashMap<String, String> dataMap){
        inputText(OptimusLoginPage.username, dataMap.get("Username"), "Enter the Username");
    }

    public static void enterPassword(HashMap<String, String> dataMap){
        inputText(OptimusLoginPage.password, dataMap.get("Password"), "Enter the Password");
    }

    public static void clickLoginBtn()  { click(OptimusLoginPage.loginBtn, "Click Login Button"); }

    public static void waitForValidationMsg() {   waitForVisible(OptimusLoginPage.validationMsg); }

    public static String getValidationMsg() { return  getElementText(OptimusLoginPage.validationMsg); }
    public static void waitForLogoutBtn() { waitForVisible(OptimusLoginPage.logoutBtn); }

    public static void logoutFromOptimus() throws InterruptedException {
        click(OptimusLoginPage.logoutBtn, "Clicking Logout button");
    }
}
