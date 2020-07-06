package jpay.pageobjects.facility;

import org.openqa.selenium.By;

public interface WeeklyDepositReportObjects {

	By weekLyDepositReport_Label = By.xpath("//table/descendant::b[text()='Weekly Deposit Report']");
	By weeklyDepositReport_Link = By.xpath("//tr/descendant::a[text()='Weekly Deposit Report']");
	By fromDate_TxtBox = By.xpath("//input[@id='ctl00_MainContent_txtFromDate']");
	By toDate_TxtBox = By.xpath("//input[@id='ctl00_MainContent_txtToDate']");
	By viewReport_Btn = By.xpath("//input[@id='ctl00_MainContent_btnView']");
	By loadingReport_Bar = By.xpath("//div[@id='ctl00_MainContent_UpdatePanel1']");
	By weeklyReportHistory_Table = By.xpath("//table[@id='ctl00_MainContent_dgTransfers']");
	By exportToExcel_Link = By.xpath("//input[@id='ctl00_MainContent_lnkExportExcel']");
	
	
}
