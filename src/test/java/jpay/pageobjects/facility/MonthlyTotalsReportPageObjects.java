package jpay.pageobjects.facility;

import org.openqa.selenium.By;

public interface MonthlyTotalsReportPageObjects {
	
	By monthlyTotalsReport_link = By.xpath("//tr/descendant::a[text()='Monthly Totals Report']");
	By monthlyTotalsReport_Label = By.xpath("//b[contains(text(),'Monthly Totals Report')]");
	By viewReport_Btn = By.xpath("//input[@id='ctl00_MainContent_btnViewRep']");
	By selYeay19_Dropdown = By.xpath("//select[@id='ctl00_MainContent_ddlYears']/option[@value='2019']");
	By selDec19_Dropdown = By.xpath("//select[@id='ctl00_MainContent_ddlMonthes']/option[@value='December']");
	By loadingReport_Bar = By.xpath("//div[@id='ctl00_MainContent_UpdatePanel1']");
	By monthlyTotalsReportHistory_Table = By.xpath("//table[@id='ctl00_MainContent_dgTransfers']");
	By exportToExcel_Link = By.xpath("//a[@id='ctl00_MainContent_lnkActivatedExport']");
	By back_Btn = By.xpath("//a/font[text()='<< BACK']");
	By includeArchiveData_Checkbox = By.xpath("//input[@id='ctl00_MainContent_cbShouldUseArchive']");
	By months_Dropdown = By.xpath("//select[@id='ctl00_MainContent_ddlMonthes']");
	By years_Dropdown = By.xpath("//select[@id='ctl00_MainContent_ddlYears']");
	
	

}
