package jpay.testcases.facility;

import jpay.baseclasses.DriverEvents;
import jpay.pageobjects.facility.AccessControlSystem;
import jpay.pageobjects.facility.CreateUsersAccountObjects;
import jpay.pageobjects.facility.HomePageObjects;
import org.bytedeco.javacpp.annotation.Const;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateUsers extends DriverEvents {

    DriverEvents user = new DriverEvents();


    @Parameters({ "facilityURL", "userName", "pinCode", "userPassword" })
    @Test
    public void createConsolidateUser(String facilityURL, String userName, String pinCode, String userPassword){
    LoginPage login = new LoginPage();
    login.userLogin(facilityURL, userName, pinCode, userPassword);
    user.click(HomePageObjects.accessControlSystem_link);
    user.click(AccessControlSystem.createUsers_link);
    user.setText(CreateUsersAccountObjects.firstName_txtbox, emailGenerated);
    user.setText(CreateUsersAccountObjects.lastName_txtbox, emailGenerated);
    user.setText(CreateUsersAccountObjects.position_txtbox, emailGenerated);
    user.setText(CreateUsersAccountObjects.zipCode_txtbox, "90018");
    user.setText(CreateUsersAccountObjects.pin_txtbox, pinCode);
    user.click(CreateUsersAccountObjects.selectFlorida_StateDropdown);
    user.setText(CreateUsersAccountObjects.location_txtbox, emailGenerated);
    user.setText(CreateUsersAccountObjects.password_txtbox, wwwPassword);
    user.setText(CreateUsersAccountObjects.confirmPassword_txtbox, wwwPassword);
    user.click(CreateUsersAccountObjects.consolidate_dropdownOpt);
    user.click(CreateUsersAccountObjects.continue_Btn);

    }

}
