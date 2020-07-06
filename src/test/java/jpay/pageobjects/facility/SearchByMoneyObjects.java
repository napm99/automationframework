package jpay.pageobjects.facility;

import org.openqa.selenium.By;

public interface SearchByMoneyObjects {
    By select_by = By.xpath("//select[@id='ctl00_MainContent_ddlsearchOptionLevel1']");
    By select_by_value = By.xpath("//select[@id='ctl00_MainContent_ddlsearchOptionLevel2']");
    By select_inmate = By.xpath("//select[@id='ctl00_MainContent_ddlsearchOptionLevel1']/option[text()='Inmate']");
    By select_customer = By.xpath("//select[@id='ctl00_MainContent_ddlsearchOptionLevel1']/option[text()='Customer']");
    By select_other = By.xpath("//select[@id='ctl00_MainContent_ddlsearchOptionLevel1']/option[text()='Other']");
    By inmate_ById = By.xpath("//select[@id='ctl00_MainContent_ddlsearchOptionLevel2']/option[text()='ID']");
    By inmate_ByFullName = By.xpath("//select[@id='ctl00_MainContent_ddlsearchOptionLevel2']/option[text()='Full Name']");
    By customer_ByFirstName = By.xpath("//select[@id='ctl00_MainContent_ddlsearchOptionLevel2']/option[text()='First Name']");
    By customer_ByLastName = By.xpath("//select[@id='ctl00_MainContent_ddlsearchOptionLevel2']/option[text()='Last Name']");
    By customer_ByFullname = By.xpath("//select[@id='ctl00_MainContent_ddlsearchOptionLevel2']/option[text()='Full Name']");
    By customer_ByAccountId = By.xpath("//select[@id='ctl00_MainContent_ddlsearchOptionLevel2']/option[text()='Account ID']");
    By customer_ByIpAddress = By.xpath("//select[@id='ctl00_MainContent_ddlsearchOptionLevel2']/option[text()='IP Address']");
    By other_ByBatchNumber = By.xpath("//select[@id='ctl00_MainContent_ddlsearchOptionLevel2']/option[text()='Batch Number']");
    By other_ByTransaction = By.xpath("//select[@id='ctl00_MainContent_ddlsearchOptionLevel2']/option[text()='Transaction No.']");
    By other_ByExternalReference = By.xpath("//select[@id='ctl00_MainContent_ddlsearchOptionLevel2']/option[text()='External Reference No.']");
    By search_inputField = By.xpath("//input[@id='ctl00_MainContent_tbSearch']");
    By go_btn = By.xpath("//input[@id='ctl00_MainContent_btnGo']");
    By showoldertransactions_checkbox = By.xpath("//input[@id='ctl00_MainContent_cbShowOlderTransfers']");
    By loadingReport_Bar = By.xpath("//div[@id='ctl00_MainContent_UpdatePanel1']");
    By transfers_table = By.xpath("//div[@id='ctl00_MainContent_MoneyTransfers_pnlTransfers']");
    By validateInmatename = By.xpath("//span[@id='ctl00_MainContent_MoneyTransfers_dgTransfers_ctl03_lblInmateName' and text()='TALIBY KABA']");
    By validateCustomerFN = By.xpath("(//td[text()='CONFIRM  CANCEL'])[1]");
    By validateCustomerLN = By.xpath("(//td[text()='CONFIRM  CANCEL'])[1]");
    By validateCustomerFullName = By.xpath("(//td[text()='CONFIRM  CANCEL'])[1]");
    By validateAccountID = By.xpath("//td[contains(text(),'13211824')]");
    By validateBatchNumber = By.xpath("//td[text()='NY694130']");
    By validateReferenceNumber = By.xpath("//td[text()='NYC06_M20200226101329']");
    By validateTransactionNumber = By.xpath("//td[text()='45058125']");
}
