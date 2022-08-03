package pageFactory.OptimusPages;

import org.openqa.selenium.By;

public class OptimusLoginPage {

    public static By username = By.id("login_username");

    public static By password = By.id("login_password");

    public static By loginBtn = By.xpath("//button/span[text()='Login']");

    //public static By welcomeMsg = By.xpath("//ul[@role='menu']/li[@data-menu-id='rc-menu-uuid-91791-1-tmp_key-3']/span/a");

    public static By validationMsg = By.xpath("//div[@class='ant-notification-notice-description']");

    public static By logoutBtn = By.xpath("//span[text()='Logout']");

}
