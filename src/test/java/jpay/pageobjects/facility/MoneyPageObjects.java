package jpay.pageobjects.facility;

import org.openqa.selenium.By;

public interface MoneyPageObjects {

	By logoutBtn = By.xpath("//a[@id='ctl00_Header_MenuRepeater_ctl10_lnkLogout']");
	By despositHistory_link = By.xpath("//a[text()='Deposit History']");
	By despositHistoryGrid_table = By.xpath("//div[@id='ctl00_MainContent_p_ViewDepositGridStates']");
	By depositHistory_label = By.id("ctl00_MainContent_p_listofdeposits");
	By batchDate_link = By.xpath("//table[@id='ctl00_MainContent_ViewDepositGridStates']/descendant::a[1]");
	By batchID_link = By.xpath("//a[@id='ctl00_MainContent_ViewDepositGridStates_ctl03_lnkMultyBatches']");
	By batchID_label = By.xpath("//span[@id='ctl00_MainContent_listdepositmsg']/descendant::b");
	By batchGrid_table = By.xpath("//div[@id='ctl00_MainContent_p_ListDepositStates']");
	By report_link = By.xpath("//a[@id='ctl00_MainContent_dgMultyBatches_ctl02_Linkbutton2']");
	By export_link = By.xpath("(//tr/following-sibling::tr/descendant::a[text()='[View]'])[2]");
	By receipts_link = By.xpath("//a[@id='ctl00_MainContent_dgMultyBatches_ctl02_lnkReceipts']");
	By backBtn = By.xpath("//a/font[text()='<<BACK']");
	By restitutionPayments_link = By.xpath("(//tr/following-sibling::tr/descendant::a[text()='[View]'])[4]");
	By depositsForBatchNo_label = By.xpath("//div[@id='ctl00_MainContent_p_breakdownreports']");
	By reportData_Grid = By.xpath("//div[@id='ctl00_MainContent_p_breakdownreports']");
	By exportData_Grid = By.xpath("//div[@id='ctl00_MainContent_UpdatePanelReportData']");
	By loadingReport_Bar = By.xpath("//div[@id='ctl00_MainContent_UpdatePanel1']");
	By downloadReceipt_link = By.xpath("//a[text()='Click here to view and print receipts']");
	By confirmCancel_link = By.xpath("//tr/descendant::a[text()='Confirm / Cancel']");
	By confirmedTransactions_link = By.xpath("//tr/descendant::a[text()='Confirmed Transactions']");
	By kioskActivity_link = By.xpath("//tr/descendant::a[text()='Kiosk Activity']");
	By search_link = By.xpath("//a[@href='SearchByMoney.aspx' and text()='Search']");
	By weeklyDepositReport_link = By.xpath("//td/descendant::span[text()='Weekly Deposit Report']");
	By monthlyTotalReport_link = By.xpath("//tr/descendant::a[text()='Monthly Totals Report']");
	By bookingKioskActivity_link = By.xpath("//a[@id='ctl00_LeftBar_LeftbarRepeater_ctl02_NavbarItem_HyperLink1']");
	By recapReport_link = By.xpath("//a[@id='ctl00_LeftBar_LeftbarRepeater_ctl06_NavbarItem_HyperLink1']");

	//----------------------PROD PROD PROD PROD PROD PROD  -------------------------------------------------------
	String MoneyPageTitle = "Money:";
	By AccountID_link = By.xpath("//a[@id='ctl00_MainContent_ListDepositStates_ctl03_lbAccountID']");
	By BatchDate_link = By.xpath("//table[@id='ctl00_MainContent_ViewDepositGridStates']/descendant::a[1]");
	By numBatch_link = By.xpath("//a[@id='ctl00_MainContent_ViewDepositGridStates_ctl03_lnkMultyBatches']");
	By depositHistoryViewAllReports_btn = By.xpath("//input[@id='ctl00_MainContent_btnViewAllReports']");
	By multiBatch_grid = By.xpath("//table[@id='ctl00_MainContent_dgMultyBatches']");
	By reportDownload = By.xpath("//a[@id='ctl00_MainContent_dgMultyBatches_ctl02_Linkbutton2']");
	By viewReceipt = By.xpath("//a[@id='ctl00_MainContent_dgMultyBatches_ctl02_lnkReceipts']");
	By recapReport_grid = By.xpath("ctl00_MainContent_dgMonths");
	By recapDate_link = By.xpath("//a[@id='ctl00_MainContent_dgMonths_ctl02_lnkMonth']");
	By recapReportResult = By.xpath("//table[@id='ctl00_MainContent_Datagrid_ListCounties']");
	
	
	
	
	
	
	
}
