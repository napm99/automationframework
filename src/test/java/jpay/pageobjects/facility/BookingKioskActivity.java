package jpay.pageobjects.facility;

import org.openqa.selenium.By;

public interface BookingKioskActivity {

    By bookingKiosk_label = By.xpath("//b[contains(text(),'Booking Kiosks')]");
    By id_link = By.xpath("//a[@id='ctl00_MainContent_ViewDepositGridStates_ctl03_sBatchNo']");
    By bookingKioskBatch_link = By.xpath("//a[@id='ctl00_MainContent_dgBookingKioskBatches_ctl03_lbBatchNo']");
    By bookingKioskBatchDetails_text = By.xpath("//span[@id='ctl00_MainContent_lblBatchId']");
    By bookingKioskBatch_label = By.xpath("//b[contains(text(),'Booking Kiosk Cash Batch Details')]");
    By bookingKioskBatch_table = By.xpath("//body/form[@id='aspnetForm']/div/div[@class='LeftMainClass']/div[@class='siteMasterMainContentClass']/div[@class='mainContentClass']/table[@class='maintable']/tbody/tr/td/table/tbody/tr[4]/td[1]");
    By exportBookingKioskBatch_link = By.xpath("//a[@id='ctl00_MainContent_lnkActivatedExportXLS']");
    By description_text = By.xpath("//td/a[@id='ctl00_MainContent_ViewDepositGridStates_ctl03_sBatchNo']/following::td/ancestor::tr/td/table/tbody/tr[@class='gridheaders']/td[text()='Description']");
    By valueOfTransaction_text = By.xpath("//td/a[@id='ctl00_MainContent_ViewDepositGridStates_ctl03_sBatchNo']/following::td/ancestor::tr/td/table/tbody/tr[@class='gridheaders']/td[text()='$ Value Of Transactions']");
    By numberOfTransaction_text = By.xpath("//td/a[@id='ctl00_MainContent_ViewDepositGridStates_ctl03_sBatchNo']/following::td/ancestor::tr/td/table/tbody/tr[@class='gridheaders']/td[text()='# Of Transactions']");
    By lastWithdraw_text = By.xpath("//td/a[@id='ctl00_MainContent_ViewDepositGridStates_ctl03_sBatchNo']/following::td/ancestor::tr/td/table/tbody/tr[@class='gridheaders']/td[text()='Last Withdraw']");

}
