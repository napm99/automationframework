package jpay.pageobjects.facility;

import org.openqa.selenium.By;

public interface KioskActivity {

    By lobbyKioskID_link = By.xpath("//a[@id='ctl00_MainContent_ViewDepositGridStates_ctl03_sBatchNo']");
    By lobbyKioskActivity_label = By.xpath("//b[contains(text(),'Lobby Kiosk Cash Batches')]");
    By loobbyKioskID_text = By.xpath("//span[@id='ctl00_MainContent_lblKioskId']");
    By lobbyKioskBatchID_link = By.xpath("//a[@id='ctl00_MainContent_dgLobbyKioskBatches_ctl03_lbBatchNo']");
    By lobbyKioskBatchExport_link = By.xpath("//a[@id='ctl00_MainContent_lnkActivatedExportXLS']");
    By lobbyKioskBatchDetails_label = By.xpath("//b[contains(text(),'Kiosk Cash Batch Details')]");
    By lobbyKioskBatchID_text = By.xpath("//span[@id='ctl00_MainContent_lblBatchId']");
    By lobbyKioskBatchDetails_table = By.xpath("//body/form[@id='aspnetForm']/div/div[@class='LeftMainClass']/div[@class='siteMasterMainContentClass']/div[@class='mainContentClass']/table[@class='maintable']/tbody/tr/td/table/tbody/tr[4]/td[1]");

    By decription_text = By.xpath("//td/a[@id='ctl00_MainContent_ViewDepositGridStates_ctl03_sBatchNo']/following::td/ancestor::tr/td/table/tbody/tr[@class='gridheaders']/td[text()='Description']");
    By valueOfTransactions_text = By.xpath("//td/a[@id='ctl00_MainContent_ViewDepositGridStates_ctl03_sBatchNo']/following::td/ancestor::tr/td/table/tbody/tr[@class='gridheaders']/td[text()='$ Value Of Transactions']");
    By numberOfTransaction_text = By.xpath("//td/a[@id='ctl00_MainContent_ViewDepositGridStates_ctl03_sBatchNo']/following::td/ancestor::tr/td/table/tbody/tr[@class='gridheaders']/td[text()='# Of Transactions']");
    By lastWithdraw_text = By.xpath("//td/a[@id='ctl00_MainContent_ViewDepositGridStates_ctl03_sBatchNo']/following::td/ancestor::tr/td/table/tbody/tr[@class='gridheaders']/td[text()='Last Withdraw']");
}
