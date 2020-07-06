package jpay.pageobjects.facility;

import org.openqa.selenium.By;

public interface ReleaseCards {

    By releaseCards_link = By.xpath("//a[contains(text(),'Release Cards')]");
    By rpid_textbox = By.xpath("//input[@id='ctl00_MainContent_txtExternalKey']");
    By inmateID_textbox = By.xpath("//input[@id='ctl00_MainContent_txtInmateID']");
    By locate_button = By.xpath("//input[@id='ctl00_MainContent_btnLookUpInmate']");
    By preview_button = By.xpath("//input[@id='ctl00_MainContent_btnPreview']");
    By fundingAmount_textbox = By.xpath("//input[@id='ctl00_MainContent_txtDepositAmountDollars']");
    By releaseDate_selection = By.xpath("//span[contains(@class,'CurrentDateStyle')]");
    By activateCard_button = By.xpath("//input[@id='ctl00_MainContent_btnActivate']");
}
