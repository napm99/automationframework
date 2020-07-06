package jpay.pageobjects.staging;

import org.openqa.selenium.By;

public interface AdministrationObjects {

    By wwwSettings_link = By.xpath("//font[text()='WWW Settings']");
    By wwwSettings_grid = By.xpath("//div[@id='pWWWSettingsDataGrid']");
    By policyEdit_button = By.xpath("(//a[text()='Edit'])[1]");
    By legalAdreementsEdit_button = By.xpath("(//a[text()='Edit'])[2]");
    By consumerProtectionEdit_button = By.xpath("(//a[text()='Edit'])[3]");
    By policyFooterLink_text = By.xpath("//input[@id='dgWWWSettings_ctl03_lblUrl']");
    By actionUpdate_button = By.xpath("//a[contains(text(),'Update')]");
    By actionCancel_button = By.xpath("//a[contains(text(),'Cancel')]");
    By legalAgreementsFooterLink_text = By.xpath("//input[@id='dgWWWSettings_ctl04_lblUrl']");
    By consumerProtectionFooterLink_text = By.xpath("//input[@id='dgWWWSettings_ctl05_lblUrl']");
    By updatedSuccesfully_text = By.xpath("//span[text()='Settings updated successfully']");





}
