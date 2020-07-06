package jpay.testcases.www;

import jpay.baseclasses.DriverEvents;
import jpay.pageobjects.www.CreateAccountObjects;
import jpay.pageobjects.www.HomePageObjects;
import jpay.utilities.Constants;
import jpay.utilities.StagingData;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateAccount extends DriverEvents implements Constants {

    DriverEvents user = new DriverEvents();

    @Test(dataProvider="wwwData",dataProviderClass= StagingData.class)
    public void validateHomePage() {


    }
}
