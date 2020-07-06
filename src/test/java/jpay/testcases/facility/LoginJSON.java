package jpay.testcases.facility;


import org.testng.annotations.Test;

import jpay.baseclasses.DriverEvents;
import jpay.pageobjects.facility.LoginPageObjects;
import jpay.utilities.Constants;
import jpay.utilities.TestData;

public class LoginJSON extends DriverEvents implements Constants {

	DriverEvents user = new DriverEvents();
	
	@Test(dataProvider="testData",dataProviderClass=TestData.class)
	public void userLogin(TestData data) {
		
			user.openBrowser(data.getBrowser());
			user.goTo(urlFacility);
			user.setText(LoginPageObjects.username_txtbox, data.getUserName());
			user.setText(LoginPageObjects.pin_txtbox, data.getPinCode());
			user.setText(LoginPageObjects.password_txtbox, data.getPassword());
			user.click(LoginPageObjects.loginBtn);
			user.verifyTitle("Admin: News");
			user.quitBrowser();
			logger.info("-- userLogin test has PASSED --");

	}


}
