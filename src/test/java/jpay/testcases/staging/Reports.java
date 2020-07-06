package jpay.testcases.staging;

import jpay.baseclasses.DriverEvents;
import jpay.pageobjects.staging.HomePageStagingObjects;
import jpay.pageobjects.staging.Reporting;
import jpay.utilities.StagingData;
import org.testng.annotations.Test;

public class Reports extends DriverEvents {

    DriverEvents user = new DriverEvents();
    Transfers action = new Transfers();
    String blank = "";
    StagingData data;

    @Test(priority = 5, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void TransactionReport(StagingData data){

        action.userLogin(data);
        user.click(HomePageStagingObjects.reporting_tab);
        user.click(Reporting.controllerReport_link);
        user.click(Reporting.transactionReport_link);
        user.click(Reporting.calendarFirst_img);
        user.jsclick(Reporting.fromdate_option);
        user.click(Reporting.calendarSecond_img);
        user.jsclick(Reporting.todate_option);
        user.click(Reporting.transferTypeAll_option);
        user.click(Reporting.go_button);
        user.verifyElementPresent(Reporting.resulttable_validation);
        user.deselectOptions(Reporting.transfertype_dropdown);

        user.click(Reporting.transferTypeVisa_option);
        user.click(Reporting.go_button);
        user.verifyElementPresent(Reporting.visaValidation_type);
        user.deselectOptions(Reporting.transfertype_dropdown);

        user.click(Reporting.transferTypeMasterCard_option);
        user.click(Reporting.go_button);
        user.verifyElementPresent(Reporting.mastercardValidation_type);
        user.deselectOptions(Reporting.transfertype_dropdown);

        user.click(Reporting.transferTypeMoneyOrder_option);
        user.click(Reporting.go_button);
        user.verifyElementPresent(Reporting.moneyOrderValidation_type);
        user.deselectOptions(Reporting.transfertype_dropdown);

        user.click(Reporting.transferTypeKiosk_option);
        user.click(Reporting.go_button);
        user.verifyElementPresent(Reporting.kioskValidation_type);
        user.deselectOptions(Reporting.transfertype_dropdown);

        user.click(Reporting.transferTypebookingKiosk_option);
        user.click(Reporting.go_button);
        user.verifyElementPresent(Reporting.bookingKioskValidation_type);
        user.deselectOptions(Reporting.transfertype_dropdown);

        user.click(Reporting.transferTypeDiscover);
        user.click(Reporting.go_button);
        user.verifyElementPresent(Reporting.discoverValidation_type);
        user.deselectOptions(Reporting.transfertype_dropdown);

    }

    @Test(priority = 6, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void TransactionReportDownload(StagingData data){

        user.click(Reporting.transferTypeVisa_option);
        user.click(Reporting.go_button);
        user.verifyElementPresent(Reporting.visaValidation_type);
        user.click(Reporting.reportExport_button);


    }

    @Test(priority = 7, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void lobbyKioskTransactionReport(StagingData data){

        user.click(Reporting.controllerReport_link2);
        user.click(Reporting.lobbyKioskReport_link);
        user.click(Reporting.calendarFirst_img);
        user.jsclick(Reporting.lkfromdate_option);
        user.click(Reporting.calendarSecond_img);
        user.jsclick(Reporting.lktodate_option);
        user.click(Reporting.lkGo_button);
        user.verifyElementPresent(Reporting.resulttable_validation);

    }

    @Test(priority = 8, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void newlobbyKioskTransactionReport(StagingData data){

        user.click(Reporting.controllerReport_link2);
        user.click(Reporting.newLobbyKioskReport_link);
        user.click(Reporting.calendarFirst_img);
        user.jsclick(Reporting.lkfromdate_option);
        user.click(Reporting.calendarSecond_img);
        user.jsclick(Reporting.lktodate_option);
        user.click(Reporting.lkGo_button);
        user.verifyElementPresent(Reporting.resulttable_validation);
        user.click(HomePageStagingObjects.signout_button);


    }

}
