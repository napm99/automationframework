package jpay.pageobjects.facility;

import org.openqa.selenium.By;

public interface CreateUsersAccountObjects {
	
	By firstName_txtbox = By.xpath("//input[@id='ctl00_MainContent_sFirstName']");
	By lastName_txtbox = By.xpath("//input[@id='ctl00_MainContent_sLastName']");
	By email_txtbox = By.xpath("//input[@id='ctl00_MainContent_sEmail']");
	By position_txtbox = By.xpath("//input[@id='ctl00_MainContent_sAddress']");
	By location_txtbox = By.xpath("//input[@id='ctl00_MainContent_sCity']");
	By state_Dropdown = By.xpath("//select[@id='ctl00_MainContent_sState']");
	By selectFlorida_StateDropdown = By.xpath("//select[@id='ctl00_MainContent_sState']/option[text()='Florida']");
	By zipCode_txtbox = By.xpath("ctl00_MainContent_sZipCode");
	By userName_txtbox = By.xpath("//input[@id='ctl00_MainContent_sUserName']");
	By pin_txtbox = By.xpath("//input[@id='ctl00_MainContent_uPin']");
	By password_txtbox = By.xpath("//input[@id='ctl00_MainContent_sPassword']");
	By confirmPassword_txtbox = By.xpath("//input[@id='ctl00_MainContent_ed_PWConfirm']");
	By facilityLocation_Dropdown = By.xpath("//select[@id='ctl00_MainContent_ddlPermloc']");
	By consolidate_dropdownOpt = By.xpath("//select[@id='ctl00_MainContent_ddlPermloc']/option[@value='Consolidate']");
	By passwordNeedReset_checkbox = By.xpath("//input[@id='ctl00_MainContent_chkPasswordNeedsReset']");
	By receiveMoneyReportByEmail_checkbox = By.xpath("//input[@id='ctl00_MainContent_cbReceiveMoneyReportsByEmail']");
	By continue_Btn = By.xpath("//input[@id='ctl00_MainContent_btn_viewusersaccount']");
	By returnToMainMenu = By.xpath("//a/font[text()='<<Return to Main Menu']");
	By associatedLocation_checkbox = By.xpath("//input[@id='ctl00_MainContent_cblPermloc_0']");
	By associatedLocation2_checkbox = By.xpath("//input[@id='ctl00_MainContent_cblPermloc_1']");
	By associatedLocContinue_button = By.xpath("//input[@id='ctl00_MainContent_btn_viewusersaccount']");
	By accountInformationConfirmation_box = By.xpath("//div[@id='ctl00_MainContent_p_ViewUsersAccount']");
	By goBack_button = By.xpath("//input[@id='ctl00_MainContent_btn_goback']");
	By createUser_button = By.xpath("//input[@id='ctl00_MainContent_btn_createusersaccount']");



}
