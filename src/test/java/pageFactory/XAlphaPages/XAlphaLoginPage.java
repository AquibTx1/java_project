package pageFactory.XAlphaPages;

import org.openqa.selenium.By;

public class XAlphaLoginPage {

    public static By username = By.id("login_username");
    public static By password = By.id("login_password");
    public static By loginBtn = By.xpath("//button/span[text()='Login']");
    public static By logoutbtn = By.xpath("//span[text()='Logout']");
    public static By loginMsg = By.xpath("//div[@class='ant-notification-notice-description']");
}
