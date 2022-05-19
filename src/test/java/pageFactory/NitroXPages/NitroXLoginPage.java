package pageFactory.NitroXPages;
import org.openqa.selenium.By;

public class NitroXLoginPage {


    public static By username=By.xpath("//input[@id='login_username']");
    public static By password= By.xpath("//input[@id='login_password']");
    public static By loginbtn= By.xpath("//button[@type='submit']");
    public static By homepage = By.linkText("Home");
    public static By invalidLoginValidation = By.xpath("//div[@class='ant-notification-notice-description']");

}
