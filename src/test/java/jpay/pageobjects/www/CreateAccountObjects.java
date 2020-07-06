package jpay.pageobjects.www;

import org.openqa.selenium.By;

public interface CreateAccountObjects {
    By selectState_dropdown = By.xpath("//input[@id='StatesDropdown_txtautofromDB']");
    By selectState_option = By.xpath("//a[contains(text(),'Wyoming')]");
    By selectInmate_textbox = By.xpath("//input[@id='inmateIDTextBox']");
    By next_button = By.xpath("//a[@id='nextImageButton']");





}
