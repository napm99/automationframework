package jpay.testcases.facility;

import jpay.baseclasses.DriverEvents;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ReleaseCards extends LoginPage {

    DriverEvents user = new DriverEvents();

    @Parameters({ "facilityURL", "userName", "pinCode", "userPassword" })
    @Test
    public void activateReleaseCard(String facilityURL, String userName, String pinCode, String userPassword){
        userLogin(facilityURL,userName,pinCode,userPassword);
        user.click(jpay.pageobjects.facility.ReleaseCards.releaseCards_link);
        user.setText(jpay.pageobjects.facility.ReleaseCards.rpid_textbox, "494740");
        user.setText(jpay.pageobjects.facility.ReleaseCards.inmateID_textbox, "111234");
        user.click(jpay.pageobjects.facility.ReleaseCards.locate_button);
        user.setText(jpay.pageobjects.facility.ReleaseCards.fundingAmount_textbox,"19.95");
        user.click(jpay.pageobjects.facility.ReleaseCards.releaseDate_selection);
        user.click(jpay.pageobjects.facility.ReleaseCards.preview_button);
        user.click(jpay.pageobjects.facility.ReleaseCards.activateCard_button);

    }
}
