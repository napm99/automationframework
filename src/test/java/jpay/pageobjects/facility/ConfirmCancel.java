package jpay.pageobjects.facility;

import org.openqa.selenium.By;

public interface ConfirmCancel {

    By reference_link = By.xpath("//a[@id='ctl00_MainContent_ListDepositCounties_ctl02_lnkTransferId']");
    By offenderLastName_text = By.xpath("//span[@id='ctl00_MainContent_ListDepositCounties_ctl02_lblInmateLN']");
    By offenderFirstName_text = By.xpath("//span[@id='ctl00_MainContent_ListDepositCounties_ctl02_lblInmateFN']");
    By offenderNumbber_text = By.xpath("//span[@id='ctl00_MainContent_ListDepositCounties_ctl02_lblInmateId']");
    By editInmate_link = By.xpath("(//a[text()='Edit'])[1]");
    By select_checkbox = By.xpath("//input[@id='ctl00_MainContent_ListDepositCounties_ctl02_Confirm']");
    By viewReport_button = By.xpath("//input[@id='ctl00_MainContent_BtnViewReport']");
    By confirmTransaction_button = By.xpath("//input[@id='ctl00_MainContent_btn_confirmall']");
    By transferDetails_table = By.xpath("//div[@id='ctl00_MainContent_p_listofdepositsbybatchno']//center");
    By cancelTransaction_link = By.xpath("//a[@id='ctl00_MainContent_lnk_Fail']");
    By getConfirmTransaction_link = By.xpath("//a[@id='ctl00_MainContent_lnk_Confirm']");
    By back_button = By.xpath("//a[@href='javascript:history.back()']");




}
