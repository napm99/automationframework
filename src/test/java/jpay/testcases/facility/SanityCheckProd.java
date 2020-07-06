package jpay.testcases.facility;

import jpay.utilities.Constants;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jpay.baseclasses.DriverEvents;
import jpay.pageobjects.facility.AccountSummaryObjects;
import jpay.pageobjects.facility.HomePageObjects;
import jpay.pageobjects.facility.LoginPageObjects;
import jpay.pageobjects.facility.MoneyPageObjects;
import jpay.pageobjects.facility.MonthlyTotalsReportPageObjects;
import jpay.pageobjects.facility.TransfersByBatchObjects;
import jpay.pageobjects.facility.WeeklyDepositReportObjects;

public class SanityCheckProd  extends DriverEvents  implements Constants {
	DriverEvents user = new DriverEvents();

	@Parameters({ "facilityURL" })
	@Test(priority = 1)
	public void loginPageValidation(String facilityURL) {

			user.openBrowser("chrome");
			user.goTo(urlFacilityProd);
			user.verifyElementPresent(LoginPageObjects.username_txtbox);
			user.verifyElementPresent(LoginPageObjects.pin_txtbox);
			user.verifyElementPresent(LoginPageObjects.password_txtbox);
			user.verifyElementPresent(LoginPageObjects.loginBtn);
			user.verifyElementPresent(LoginPageObjects.forgotPassword_link);
			user.verifyElementPresent(LoginPageObjects.forgotUser_link);
			user.verifyElementPresent(LoginPageObjects.helpDesk_link);
			user.verifyTitle("Facility: Login");
			logger.info("-- loginPageValidation test has PASSED --");

	}

	@Parameters({ "facilityURL", "userName", "pinCode", "userPassword" })
	@Test(priority = 2)
	public void emptyUsername(String facilityURL, String userName, String pinCode, String userPassword) {
		
			user.click(LoginPageObjects.loginBtn);
			user.verifyElementPresent(By.xpath("//td/span[@id='ctl00_MainContent_lblUserNameError']"));
			user.setText(LoginPageObjects.username_txtbox, userName);
			user.click(LoginPageObjects.loginBtn);
			user.verifyElementPresent(By.xpath("//td/span[@id='ctl00_MainContent_lblPinError']"));
			user.setText(LoginPageObjects.pin_txtbox, pinCode);
			user.click(LoginPageObjects.loginBtn);
			user.verifyElementPresent(By.xpath("//td/span[@id='ctl00_MainContent_Message']"));
			logger.info("-- emptyUsername test has PASSED --");

	}

	@Parameters({ "facilityURL" })
	@Test(priority = 3)
	public void forgotPassword(String facilityURL) {

			user.click(LoginPageObjects.forgotPassword_link);
			user.verifyElementPresent(LoginPageObjects.forgotPassword_label);
			user.verifyElementPresent(LoginPageObjects.forgotPasswordUsername_txtbox);
			user.verifyElementPresent(LoginPageObjects.sendBtn);
			user.verifyElementPresent(LoginPageObjects.returnToLogin_link);
			user.setRandomEmail(LoginPageObjects.forgotPasswordUsername_txtbox);
			user.click(LoginPageObjects.sendBtn);
			user.verifyElementPresent(By.xpath("//font[contains(text(),'If the username exists a temporary password')]"));
			logger.info("-- forgotPassword test has PASSED --");

	}

	@Test(priority = 4)
	public void returnToLogin() {

			user.click(LoginPageObjects.returnToLogin_link);
			user.verifyTitle("Facility: Login");
			logger.info("-- returnToLogin test has PASSED --");

	}

	@Parameters({ "facilityURL", "userName", "pinCode", "userPassword" })
	@Test(priority = 5)
	public void forgotUserName(String facilityURL, String userName, String pinCode, String userPassword) {

			user.click(LoginPageObjects.forgotUser_link);
			user.verifyElementPresent(LoginPageObjects.forgotUsername_label);
			user.setRandomEmail(LoginPageObjects.forgotUsername_txtbox);
			user.setRandomPin(LoginPageObjects.pinCode_txtbox);
			user.click(LoginPageObjects.sendBtn);
			user.verifyElementPresent(By.xpath("//font[contains(text(),'If the information is correct a username will be')]"));
			user.click(LoginPageObjects.returnToLogin_link);
			user.verifyTitle("Facility: Login");
			logger.info("-- forgotUserName test has PASSED --");

	}

	@Parameters({ "facilityURL", "userName", "pinCode", "userPassword" })
	@Test(priority = 6)
	public void userLogin(String facilityURL, String userName, String pinCode, String userPassword) {
		
			user.setText(LoginPageObjects.username_txtbox, userName);
			user.setText(LoginPageObjects.pin_txtbox, pinCode);
			user.setText(LoginPageObjects.password_txtbox, userPassword);
			user.click(LoginPageObjects.loginBtn);
			user.verifyTitle("Admin: News");
			logger.info("-- userLogin test has PASSED --");
	
	}
	
	@Parameters({ "facilityURL", "userName", "pinCode", "userPassword" })
	@Test(priority = 7)
	public void goToMoney() {
		
			user.verifyTitle(HomePageObjects.HomePageTitle);
			user.click(HomePageObjects.moneypage_link);
			user.verifyTitle(MoneyPageObjects.MoneyPageTitle);
			logger.info("-- moneyPageValidation test has PASSED --");
			
	
	}
	
	@Test(priority = 8)
	public void despositHistory() {
			// user.click(MoneyPageObjects.DespositHistory_link);
			user.verifyElementPresent(MoneyPageObjects.despositHistoryGrid_table);
			logger.info("-- despositHistory test has PASSED --");


	}
	
	@Test(priority = 9)
	public void checkBatchLink() {
		
			user.click(MoneyPageObjects.batchID_link);
			user.verifyElementContains(MoneyPageObjects.batchID_label, "Batch");
			user.verifyElementPresent(MoneyPageObjects.batchGrid_table);
			user.click(TransfersByBatchObjects.backBtn);
			logger.info("-- checkBatchLink test has PASSED --");

	}
	
	@Test(priority = 10)
	public void checkBatchDateLink() {
		
			user.click(MoneyPageObjects.BatchDate_link);
			user.verifyElementPresent(MoneyPageObjects.batchGrid_table);
			user.click(MoneyPageObjects.AccountID_link);
			user.verifyElementPresent(MoneyPageObjects.loadingReport_Bar);
			user.verifyElementPresent(AccountSummaryObjects.AccountSummary_label);
			logger.info("-- checkBatchDateLink test has PASSED --");

	}
	
	@Test(priority = 11)
	public void exportAccountSummaryFile() {
		
			user.click(AccountSummaryObjects.exportFileBtn);
			user.click(HomePageObjects.moneypage_link);
			user.verifyElementPresent(MoneyPageObjects.despositHistoryGrid_table);
			logger.info("-- exportAccountSummaryFile test has PASSED --");

	}
	
	@Test(priority = 12)
	public void checkNumBatch() {
		
			user.click(MoneyPageObjects.numBatch_link);
			user.verifyElementPresent(MoneyPageObjects.multiBatch_grid);
			logger.info("-- checkNumBatch test has PASSED --");

	}
	
	@Test(priority = 13)
	public void downloadAllReports() {
		
			user.click(MoneyPageObjects.depositHistoryViewAllReports_btn);
			logger.info("-- downloadAllReports test has PASSED --");

	}
	
	@Test(priority = 14)
	public void reportDownload() {
		
			user.click(MoneyPageObjects.reportDownload);
			logger.info("-- downloadAllReports test has PASSED --");

	}
	
	@Test(priority = 15)
	public void downloadReceipt() {
		
			user.click(MoneyPageObjects.viewReceipt);
			user.verifyElementPresent(MoneyPageObjects.loadingReport_Bar);
			user.click(MoneyPageObjects.downloadReceipt_link);
			logger.info("-- downloadReceipt test has PASSED --");

	}
	

	
	@Test(priority=16)
	public void validateWeeklyDepositReport(){
		
		user.click(HomePageObjects.moneypage_link);
		user.click(WeeklyDepositReportObjects.weeklyDepositReport_Link);
		user.verifyElementPresent(WeeklyDepositReportObjects.weekLyDepositReport_Label);
	
	}
	
	@Test(priority=17)
	public void viewWeeklyDepositReport(){
		
		user.click(WeeklyDepositReportObjects.viewReport_Btn);
		user.verifyElementPresent(WeeklyDepositReportObjects.loadingReport_Bar);
		user.verifyElementPresent(WeeklyDepositReportObjects.viewReport_Btn);
		user.verifyElementPresent(WeeklyDepositReportObjects.fromDate_TxtBox);
		user.verifyElementPresent(WeeklyDepositReportObjects.toDate_TxtBox);
		user.verifyElementPresent(WeeklyDepositReportObjects.weeklyReportHistory_Table);
		
	}
	
	@Test(priority=18)
	public void downWeeklyDepositReport(){
		user.click(WeeklyDepositReportObjects.exportToExcel_Link);
	}
	
	@Test(priority=19)
	public void checkRecapReport(){
		
		user.click(MoneyPageObjects.recapReport_link);
		user.click(MoneyPageObjects.recapDate_link);
		user.verifyElementPresent(MoneyPageObjects.loadingReport_Bar);
		user.verifyElementPresent(MoneyPageObjects.recapReportResult);
		
	}
	
	


}
