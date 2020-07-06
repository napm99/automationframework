package jpay.testcases.facility;

import jpay.pageobjects.facility.*;
import jpay.utilities.Constants;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jpay.baseclasses.DriverEvents;

import java.io.IOException;

public class MoneyPage extends DriverEvents implements Constants{

	DriverEvents user = new DriverEvents();
	LoginPage loginpage = new LoginPage();

	@Parameters({ "facilityURL", "userName", "pinCode", "userPassword" })
	@Test(priority = 4)
	public void goToMoneyPage(String facilityURL, String userName, String pinCode, String userPassword) {

		user.openBrowser("chrome");
		user.goTo(urlFacility);
		loginpage.userLogin(facilityURL, userName, pinCode, userPassword);
		user.click(HomePageObjects.moneypage_link);
		user.verifyTitle("Money:");
		logger.info("-- moneyPageValidation test has PASSED --");

	}

	@Test(priority = 5)
	public void checkADepositHistoryBatch() {

		user.verifyElementPresent(MoneyPageObjects.despositHistoryGrid_table);
		user.click(MoneyPageObjects.batchDate_link);
		user.verifyElementContains(MoneyPageObjects.batchID_label, "Batch");
		user.verifyElementPresent(MoneyPageObjects.batchGrid_table);
		user.click(HomePageObjects.moneypage_link);
		user.click(MoneyPageObjects.batchID_link);
		logger.info("-- Check a batch in deposit history test has PASSED --");

	}

	@Test(priority = 6)
	public void downloadAReport() {

		user.verifyElementPresent(MoneyPageObjects.report_link);
		user.click(MoneyPageObjects.report_link);
		logger.info("-- download a report from a deposit history batch test has passed  --");

	}

	@Test(priority = 7)
	public void downloadAReceipt() {

		user.click(MoneyPageObjects.receipts_link);
		user.verifyElementPresent(MoneyPageObjects.loadingReport_Bar);
		user.verifyElementPresent(MoneyPageObjects.downloadReceipt_link);
		user.click(MoneyPageObjects.downloadReceipt_link);
		user.click(HomePageObjects.moneypage_link);
		logger.info("-- download receipts from a deposity history batch test has PASSED --");

	}

	@Test(priority = 8)
	public void checkBookingKioskID() {

		user.click(MoneyPageObjects.bookingKioskActivity_link);
		user.verifyElementPresent(BookingKioskActivity.bookingKiosk_label);
		user.verifyElementPresent(BookingKioskActivity.id_link);
		user.click(BookingKioskActivity.id_link);
		logger.info("-- the booking kiosk ID check test has PASSED --");

	}

	@Test(priority = 9)
	public void checkBookingKioskIDBatch() {

		user.verifyElementPresent(BookingKioskActivity.bookingKioskBatch_link);
		user.click(BookingKioskActivity.bookingKioskBatch_link);
		user.verifyElementPresent(BookingKioskActivity.bookingKioskBatch_label);
		user.verifyElementPresent(BookingKioskActivity.bookingKioskBatchDetails_text);
		user.verifyElementPresent(BookingKioskActivity.bookingKioskBatch_table);
		logger.info("-- the booking kiosk ID batch check test has PASSED --");

	}

	@Test(priority = 10)
	public void exportBookingKioskBatchExcel() {

		user.verifyElementPresent(BookingKioskActivity.exportBookingKioskBatch_link);
		user.click(BookingKioskActivity.exportBookingKioskBatch_link);
		user.click(HomePageObjects.moneypage_link);
		logger.info("-- the booking kiosk ID batch export test has PASSED --");

	}

	@Test(priority = 11)
	public void checkKioskActivityID() {

		user.click(MoneyPageObjects.kioskActivity_link);
		user.click(KioskActivity.lobbyKioskID_link);
		user.verifyElementPresent(KioskActivity.lobbyKioskActivity_label);
		user.verifyElementPresent(KioskActivity.loobbyKioskID_text);
		user.click(KioskActivity.lobbyKioskBatchID_link);
		logger.info("-- the lobby kiosk ID check test has PASSED --");

	}

	@Test(priority = 12)
	public void checkKioskActivityBatchID() {

		user.verifyElementPresent(KioskActivity.lobbyKioskBatchDetails_label);
		user.verifyElementPresent(KioskActivity.lobbyKioskBatchID_text);
		user.verifyElementPresent(KioskActivity.lobbyKioskBatchDetails_table);
		logger.info("-- lobby kiosk ID batch export test has PASSED --");

	}

	@Test(priority = 13)
	public void exportKioskActivityBatchExcel() {

		user.verifyElementPresent(KioskActivity.lobbyKioskBatchExport_link);
		user.click(KioskActivity.lobbyKioskBatchExport_link);
		user.click(HomePageObjects.moneypage_link);
		logger.info("-- Export Excel file for the Activity batch test has passed --");

	}

	@Test(priority = 14)
	public void showRecapReport() {

		user.verifyElementPresent(MoneyPageObjects.recapReport_link);
		user.click(MoneyPageObjects.recapReport_link);
		user.verifyElementPresent(RecapReport.transfersCount_text);
		user.verifyElementPresent(RecapReport.amountTransfer_text);
		user.verifyElementPresent(RecapReport.transferredAmount_text);
		user.verifyElementPresent(RecapReport.facilityComission_text);
		user.click(RecapReport.month_link);
		user.verifyElementPresent(MoneyPageObjects.loadingReport_Bar);
		user.verifyElementPresent(RecapReport.recapReport_label);
		user.verifyElementPresent(RecapReport.recapReportInfo_table);
		user.click(RecapReport.backToPrevious_button);
		user.click(HomePageObjects.moneypage_link);
		logger.info("-- Show recap report per month test has passed --");

	}

	@Parameters({"inmateID"})
	@Test(priority = 15)
	public void searchByInmateID(String inmateID) {

		user.click(MoneyPageObjects.search_link);
		user.click(SearchByMoneyObjects.select_inmate);
		user.click(SearchByMoneyObjects.inmate_ById);
		user.setText(SearchByMoneyObjects.search_inputField, inmateID);
		user.click(SearchByMoneyObjects.go_btn);
		user.verifyElementPresent(MoneyPageObjects.loadingReport_Bar);
		user.verifyElementPresent(SearchByMoneyObjects.transfers_table);
		user.verifyElementPresent(SearchByMoneyObjects.validateInmatename);
		logger.info("-- Search by Inmate ID in Facility test has passed --");

	}
	@Parameters({"inmateFullName"})
	@Test(priority = 16)
	public void searchByInmateFullName(String inmateFullName) {

		user.click(SearchByMoneyObjects.inmate_ByFullName);
		user.setText(SearchByMoneyObjects.search_inputField, inmateFullName);
		user.click(SearchByMoneyObjects.go_btn);
		user.verifyElementPresent(MoneyPageObjects.loadingReport_Bar);
		user.verifyElementPresent(SearchByMoneyObjects.transfers_table);
		user.verifyElementPresent(SearchByMoneyObjects.validateInmatename);
		logger.info("-- Search by Inmate Full Name in Facility test has passed --");

	}

	@Parameters({"customerFirstName"})
	@Test(priority = 17)
	public void searchByCustomerFirstName(String customerFirstName) {

		user.click(SearchByMoneyObjects.select_customer);
		user.click(SearchByMoneyObjects.customer_ByFirstName);
		user.setText(SearchByMoneyObjects.search_inputField, customerFirstName);
		user.click(SearchByMoneyObjects.go_btn);
		user.verifyElementPresent(MoneyPageObjects.loadingReport_Bar);
		user.verifyElementPresent(SearchByMoneyObjects.transfers_table);
		user.verifyElementPresent(SearchByMoneyObjects.validateCustomerFN);
		logger.info("-- Search by customer first name in Facility test has passed --");

	}

	@Parameters({"customerLastName"})
	@Test(priority = 18)
	public void searchByCustomerLastName(String customerLastName) {

		user.click(SearchByMoneyObjects.select_customer);
		user.click(SearchByMoneyObjects.customer_ByLastName);
		user.setText(SearchByMoneyObjects.search_inputField, customerLastName);
		user.click(SearchByMoneyObjects.go_btn);
		user.verifyElementPresent(MoneyPageObjects.loadingReport_Bar);
		user.verifyElementPresent(SearchByMoneyObjects.transfers_table);
		user.verifyElementPresent(SearchByMoneyObjects.validateCustomerLN);
		logger.info("-- Search by customer last name in Facility test has passed --");

	}

	@Parameters({"customerFullName"})
	@Test(priority = 19)
	public void searchByCustomerFullName(String customerFullName) {

		user.click(SearchByMoneyObjects.select_customer);
		user.click(SearchByMoneyObjects.customer_ByFullname);
		user.setText(SearchByMoneyObjects.search_inputField, customerFullName);
		user.click(SearchByMoneyObjects.go_btn);
		user.verifyElementPresent(MoneyPageObjects.loadingReport_Bar);
		user.verifyElementPresent(SearchByMoneyObjects.transfers_table);
		user.verifyElementPresent(SearchByMoneyObjects.validateCustomerFullName);
		logger.info("-- Search by customer Full name in Facility test has passed --");

	}

	@Parameters({"accountID"})
	@Test(priority = 20)
	public void searchByCustomerAccountID(String accountID) {

		user.click(SearchByMoneyObjects.select_customer);
		user.click(SearchByMoneyObjects.customer_ByAccountId);
		user.setText(SearchByMoneyObjects.search_inputField, accountID);
		user.click(SearchByMoneyObjects.go_btn);
		user.verifyElementPresent(MoneyPageObjects.loadingReport_Bar);
		user.verifyElementPresent(SearchByMoneyObjects.transfers_table);
		user.verifyElementPresent(SearchByMoneyObjects.validateAccountID);
		logger.info("-- Search by customer account id in Facility test has passed --");

	}

	@Parameters({"batchNumber"})
	@Test(priority = 21)
	public void searchByBatchNumber(String batchNumber) {

		user.click(SearchByMoneyObjects.select_other);
		user.click(SearchByMoneyObjects.other_ByBatchNumber);
		user.setText(SearchByMoneyObjects.search_inputField, batchNumber);
		user.click(SearchByMoneyObjects.go_btn);
		user.verifyElementPresent(MoneyPageObjects.loadingReport_Bar);
		user.verifyElementPresent(SearchByMoneyObjects.transfers_table);
		user.verifyElementPresent(SearchByMoneyObjects.validateBatchNumber);
		logger.info("-- Search by Batch Number in Facility test has passed --");

	}

	@Parameters({"referenceNumber"})
	@Test(priority = 22)
	public void searchByReferenceNumber(String referenceNumber) {

		user.click(SearchByMoneyObjects.select_other);
		user.click(SearchByMoneyObjects.other_ByExternalReference);
		user.setText(SearchByMoneyObjects.search_inputField, referenceNumber);
		user.click(SearchByMoneyObjects.go_btn);
		user.verifyElementPresent(MoneyPageObjects.loadingReport_Bar);
		user.verifyElementPresent(SearchByMoneyObjects.transfers_table);
		user.verifyElementPresent(SearchByMoneyObjects.validateReferenceNumber);
		logger.info("-- Search by Reference Number in Facility test has passed --");

	}

	@Parameters({"transactionNumber"})
	@Test(priority = 23)
	public void searchByTransactionNumber(String transactionNumber) {

		user.click(SearchByMoneyObjects.select_other);
		user.click(SearchByMoneyObjects.other_ByTransaction);
		user.setText(SearchByMoneyObjects.search_inputField, transactionNumber);
		user.click(SearchByMoneyObjects.go_btn);
		user.verifyElementPresent(MoneyPageObjects.loadingReport_Bar);
		user.verifyElementPresent(SearchByMoneyObjects.transfers_table);
		user.verifyElementPresent(SearchByMoneyObjects.validateTransactionNumber);
		logger.info("-- Search by Reference Number in Facility test has passed --");

	}


	@Test(priority = 24)
	public void userLogoutFacility() {

		user.click(HomePageObjects.signout_button);
		logger.info("-- generateMonthlyReport test has PASSED --");

	}

	@Parameters({"userFacility2", "pinCode", "facilityPassword2" })
	@Test(priority = 25)
	public void generateMonthlyReport(String userFacility2, String pinCode, String facilityPassword2 ) {

		user.setText(LoginPageObjects.username_txtbox, userFacility2);
		user.setText(LoginPageObjects.pin_txtbox, pinCode);
		user.setText(LoginPageObjects.password_txtbox, facilityPassword2);
		user.click(LoginPageObjects.loginBtn);
		user.click(HomePageObjects.moneypage_link);
		user.click(MonthlyTotalsReportPageObjects.monthlyTotalsReport_link);
		user.verifyElementPresent(MonthlyTotalsReportPageObjects.monthlyTotalsReport_Label);
		user.verifyElementPresent(MonthlyTotalsReportPageObjects.viewReport_Btn);
		user.verifyElementPresent(MonthlyTotalsReportPageObjects.includeArchiveData_Checkbox);
		user.verifyElementPresent(MonthlyTotalsReportPageObjects.months_Dropdown);
		user.verifyElementPresent(MonthlyTotalsReportPageObjects.years_Dropdown);
		user.click(MonthlyTotalsReportPageObjects.selYeay19_Dropdown);
		user.click(MonthlyTotalsReportPageObjects.selDec19_Dropdown);
		user.click(MonthlyTotalsReportPageObjects.viewReport_Btn);
		user.verifyElementPresent(MonthlyTotalsReportPageObjects.loadingReport_Bar);
		user.verifyElementPresent(MonthlyTotalsReportPageObjects.monthlyTotalsReportHistory_Table);
		user.click(MonthlyTotalsReportPageObjects.exportToExcel_Link);
		user.click(HomePageObjects.moneypage_link);
		logger.info("-- Generate Monthly totals report test has PASSED --");

	}


	@Test(priority=26)
	public void generateWeeklyDepositReport(){

		user.click(WeeklyDepositReportObjects.weeklyDepositReport_Link);
		user.verifyElementPresent(WeeklyDepositReportObjects.weekLyDepositReport_Label);
		user.verifyElementPresent(WeeklyDepositReportObjects.viewReport_Btn);
		user.verifyElementPresent(WeeklyDepositReportObjects.fromDate_TxtBox);
		user.verifyElementPresent(WeeklyDepositReportObjects.toDate_TxtBox);
		user.click(WeeklyDepositReportObjects.viewReport_Btn);
		user.verifyElementPresent(WeeklyDepositReportObjects.loadingReport_Bar);
		user.verifyElementPresent(WeeklyDepositReportObjects.viewReport_Btn);
		user.verifyElementPresent(WeeklyDepositReportObjects.fromDate_TxtBox);
		user.verifyElementPresent(WeeklyDepositReportObjects.toDate_TxtBox);
		user.verifyElementPresent(WeeklyDepositReportObjects.weeklyReportHistory_Table);
		user.click(WeeklyDepositReportObjects.exportToExcel_Link);
		user.click(HomePageObjects.moneypage_link);
		logger.info("-- Generate weekly deposit reports test has PASSED --");
	}


}
