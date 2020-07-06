package jpay.testcases.staging;

import jpay.baseclasses.DriverEvents;
import jpay.pageobjects.staging.HomePageStagingObjects;
import jpay.pageobjects.staging.MoneyOrders;
import jpay.utilities.StagingData;
import org.testng.annotations.Test;

public class MoneyOrder extends DriverEvents {
    DriverEvents user = new DriverEvents();
    Transfers action = new Transfers();
    String blank = "";
    StagingData data;

    @Test(priority = 9, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void moneyOrderReport(StagingData data){

        action.userLogin(data);
        user.click(HomePageStagingObjects.moneyOrders_tab);
        user.click(MoneyOrders.moneyOrdersReport_link);
        user.click(MoneyOrders.generate_button);
        user.verifyElementPresent(MoneyOrders.errorMsg_validation);

        user.click(MoneyOrders.calendar_picker);
        user.click(MoneyOrders.changetoPreviousMonth_button);
        user.click(MoneyOrders.fromdate_option);
        user.click(MoneyOrders.calendar_picker2);
        user.click(MoneyOrders.toDate_option);
        user.click(MoneyOrders.generate_button);
        user.verifyElementPresent(MoneyOrders.results_table);
        user.click(MoneyOrders.export_link);

        user.click(MoneyOrders.statusPending_option);
        user.click(MoneyOrders.generate_button);
        user.verifyElementPresent(MoneyOrders.pending_validation);

        user.click(MoneyOrders.statusUncomplete_option);
        user.click(MoneyOrders.generate_button);
        user.verifyElementPresent(MoneyOrders.uncomplete_validation);

        user.click(MoneyOrders.statusException_option);
        user.click(MoneyOrders.generate_button);
        user.verifyElementPresent(MoneyOrders.exception_validation);

        user.click(MoneyOrders.statusConfirmed_option);
        user.click(MoneyOrders.generate_button);
        user.verifyElementPresent(MoneyOrders.confirmed_validation);

        user.click(MoneyOrders.statusAutoConfirmed_option);
        user.click(MoneyOrders.generate_button);
        user.verifyElementPresent(MoneyOrders.autoConfirmed_validation);

        user.click(MoneyOrders.statusCancelled_option);
        user.click(MoneyOrders.generate_button);
        user.verifyElementPresent(MoneyOrders.cancelled_validation);

        user.click(HomePageStagingObjects.signout_button);

    }
}
