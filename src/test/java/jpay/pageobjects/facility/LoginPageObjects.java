package jpay.pageobjects.facility;

import org.openqa.selenium.By;

public interface LoginPageObjects {
	
	By username_txtbox = By.xpath("//input[@id='ctl00_MainContent_uUsername']");
	By pin_txtbox = By.xpath("//input[@id='ctl00_MainContent_uPin']");
	By password_txtbox = By.xpath("//input[@id='ctl00_MainContent_uPassword']");
	By loginBtn = By.xpath("//input[@id='ctl00_MainContent_Button1']");
	By forgotPassword_link = By.xpath("//a[@id='ctl00_MainContent_lbRequestPasswordReset']");
	By forgotUser_link = By.xpath("//a[@id='ctl00_MainContent_lbRequestUsernameReset']");
	By helpDesk_link = By.xpath("//a[text()='helpdesk@jpay.com']");
	By forgotPassword_label = By.xpath("//table/descendant::b[text()='Forgot Password']");
	By forgotUsername_label = By.xpath("//table/descendant::b[text()='Forgot Username']");
	By forgotPasswordUsername_txtbox = By.xpath("//input[@id='ctl00_MainContent_tbUserName2']");
	By forgotUsername_txtbox = By.xpath("//input[@id='ctl00_MainContent_tbEmail3']");
	By sendBtn = By.xpath("//tr/descendant::input[@type='submit']");
	By returnToLogin_link = By.xpath("//a/font[text()='< Return to Login']");
	By pinCode_txtbox = By.xpath("//input[@id='ctl00_MainContent_tbPin3']");
	By logoutBtn = By.xpath("//a[@id='ctl00_Header_MenuRepeater_ctl10_lnkLogout']");



}
