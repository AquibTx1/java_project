package modules.NitroXActions;

import AmazonPages.AccountCreationPage;
import AmazonPages.LoginPage;
import NitroXPages.NitroXLoginPage;
import utilities.KeywordUtil;

import java.util.HashMap;

public class NitoXUserLogin {


    public static void login(HashMap<String,String> dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXLoginPage.username, dataMap.get("Username"), "Enter the username");
        KeywordUtil.delay(3000);
        KeywordUtil.inputText(NitroXLoginPage.password, dataMap.get("Password"), "Enter the password");
        KeywordUtil.delay(2000);
        KeywordUtil.click(NitroXLoginPage.loginbtn, "Click on Sign on Button");
    }
}
