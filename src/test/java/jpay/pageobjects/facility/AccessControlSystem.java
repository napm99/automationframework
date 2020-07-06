package jpay.pageobjects.facility;

import org.openqa.selenium.By;

public interface AccessControlSystem {

    By createUsers_link = By.xpath("//a[contains(text(),'Create Users Account')]");
    By importMultipleUsersAccount_link = By.xpath("//a[contains(text(),'Import Multiple Users Account')]");
    By listUsersAccount_link = By.xpath("//a[contains(text(),'List Users Account')]");
    By viewAuditTrail_link = By.xpath("//a[@id='ctl00_MainContent_lbViewAuditTrail']");
    By manageGroups_link = By.xpath("//a[contains(text(),'Manage Groups')]");
    By IP_label = By.xpath("//span[@id='ctl00_MainContent_lbl_currentIP']");

}
