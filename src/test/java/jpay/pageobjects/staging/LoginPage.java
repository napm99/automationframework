package jpay.pageobjects.staging;

import org.openqa.selenium.By;

public interface LoginPage {

    By username_input = By.xpath("//input[@id='uUsername']");
    By password_input = By.xpath("//input[@id='uPassword']");
    By forgotpassword_link = By.xpath("//a[contains(text(),'Forgot Password?')]");
    By login_button = By.xpath("//input[@id='Button1' and @value='log-in']");

}
