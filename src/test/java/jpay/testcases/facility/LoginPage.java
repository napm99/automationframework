package jpay.testcases.facility;

import jpay.pageobjects.facility.ReleaseCards;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import jpay.baseclasses.DriverEvents;
import jpay.pageobjects.facility.LoginPageObjects;

public class LoginPage extends DriverEvents {

	DriverEvents user = new DriverEvents();

	@Parameters({ "facilityURL" })
	@Test(priority = 1)
	public void forgotPassword(String facilityURL) {

		user.openBrowser("chrome");
		user.goTo(facilityURL);
		user.click(LoginPageObjects.forgotPassword_link);
		user.verifyElementPresent(LoginPageObjects.forgotPassword_label);
		user.verifyElementPresent(LoginPageObjects.forgotPasswordUsername_txtbox);
		user.verifyElementPresent(LoginPageObjects.sendBtn);
		user.verifyElementPresent(LoginPageObjects.returnToLogin_link);
		user.setRandomEmail(LoginPageObjects.forgotPasswordUsername_txtbox);
		user.click(LoginPageObjects.sendBtn);
		user.verifyElementPresent(By.xpath("//font[contains(text(),'If the username exists a temporary password')]"));
		returnToLogin();
		logger.info("-- forgotPassword test has PASSED --");

	}

	@Parameters({ "facilityURL", "userName", "pinCode", "userPassword" })
	@Test(priority = 2)
	public void forgotUserName(String facilityURL, String userName, String pinCode, String userPassword) {

		user.verifyElementPresent(LoginPageObjects.forgotUser_link);
		user.click(LoginPageObjects.forgotUser_link);
		user.verifyElementPresent(LoginPageObjects.forgotUsername_label);
		user.setRandomEmail(LoginPageObjects.forgotUsername_txtbox);
		user.setRandomPin(LoginPageObjects.pinCode_txtbox);
		user.click(LoginPageObjects.sendBtn);
		user.verifyElementPresent(By.xpath("//font[contains(text(),'If the information is correct a username will be')]"));
		user.click(LoginPageObjects.returnToLogin_link);
		user.verifyTitle("Facility: Login");
		logger.info("-- forgotUserName test has PASSED --" );

	}

	@Parameters({ "facilityURL", "userName", "pinCode", "userPassword" })
	@Test(priority = 3)
	public void userLogin(String facilityURL, String userName, String pinCode, String userPassword) {

		user.verifyElementPresent(LoginPageObjects.loginBtn);
		emptyUsername(facilityURL,userName, pinCode, userPassword);
		user.setText(LoginPageObjects.username_txtbox, userName);
		user.setText(LoginPageObjects.pin_txtbox, pinCode);
		user.setText(LoginPageObjects.password_txtbox, userPassword);
		user.click(LoginPageObjects.loginBtn);
		user.verifyTitle("Admin: News");
		logger.info("-- userLogin test has PASSED --");

	}




	/*
	*
	*  HELPER METHODS
	*
	*
	* */
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

	public void returnToLogin() {

		user.verifyElementPresent(LoginPageObjects.returnToLogin_link);
		user.click(LoginPageObjects.returnToLogin_link);
		user.verifyTitle("Facility: Login");
		logger.info("-- returnToLogin test has PASSED --");

	}



}
