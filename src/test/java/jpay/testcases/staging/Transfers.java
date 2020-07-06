package jpay.testcases.staging;

import jpay.baseclasses.DriverEvents;
import jpay.pageobjects.staging.HomePageStagingObjects;
import jpay.pageobjects.staging.LoginPage;
import jpay.pageobjects.staging.LookupTransaction;
import jpay.pageobjects.staging.SearchAccountPage;
import jpay.utilities.Constants;
import jpay.utilities.StagingData;
import org.testng.annotations.Test;

public class Transfers extends DriverEvents{

    DriverEvents user = new DriverEvents();
    String blank = "";
    StagingData data;

    @Test(priority = 1, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void userLogin(StagingData data){

        user.openBrowser("chrome");
        user.goTo(Constants.urlStaging);
        user.setText(LoginPage.username_input, data.getUsername());
        user.setText(LoginPage.password_input, data.getPassword());
        user.click(LoginPage.login_button);
    }

    @Test(priority = 2, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void lookUpAccount(StagingData data){
        //userLogin(data);
        user.click(HomePageStagingObjects.transfers_tab);
        user.verifyElementPresent(SearchAccountPage.lookupAccount_link);
        user.click(SearchAccountPage.lookupAccount_link);
        user.click(SearchAccountPage.byfullname_option);
        user.setText(SearchAccountPage.search_input, data.getLookFullname());
        user.click(SearchAccountPage.go_button);
        user.verifyElementPresent(SearchAccountPage.accountNumber_text);

        user.click(SearchAccountPage.bylastname_option);
        user.setText(SearchAccountPage.search_input, data.getLookLastName());
        user.click(SearchAccountPage.go_button);
        user.verifyElementPresent(SearchAccountPage.accountNumber_text);

        user.click(SearchAccountPage.byfirstname_option);
        user.setText(SearchAccountPage.search_input, data.getLookFirstName());
        user.click(SearchAccountPage.go_button);
        user.verifyElementPresent(SearchAccountPage.accountNumber_text);

        user.click(SearchAccountPage.byemailaddress_option);
        user.setText(SearchAccountPage.search_input, data.getLookEmailAddress());
        user.click(SearchAccountPage.go_button);
        user.verifyElementPresent(SearchAccountPage.accountNumber_text);

        user.click(SearchAccountPage.byphonenumber_option);
        user.setText(SearchAccountPage.search_input, data.getLookPhoneNumber());
        user.click(SearchAccountPage.go_button);
        user.verifyElementPresent(SearchAccountPage.accountNumber_text);

        user.click(SearchAccountPage.bycellphone_option);
        user.setText(SearchAccountPage.search_input, data.getLookCellPhone());
        user.click(SearchAccountPage.go_button);
        user.verifyElementPresent(SearchAccountPage.accountNumber_text);

        user.click(SearchAccountPage.bycity_option);
        user.setText(SearchAccountPage.search_input, data.getLookCity());
        user.click(SearchAccountPage.go_button);

        user.click(SearchAccountPage.byzipcode_option);
        user.setText(SearchAccountPage.search_input, data.getLookZipCode());
        user.click(SearchAccountPage.go_button);

        user.click(SearchAccountPage.bystate_option);
        user.setText(SearchAccountPage.search_input, data.getLookState());
        user.click(SearchAccountPage.go_button);

        user.click(SearchAccountPage.byaccount_option);
        user.setText(SearchAccountPage.search_input, data.getLookAccountNumber());
        user.click(SearchAccountPage.go_button);
        user.verifyElementPresent(SearchAccountPage.accountNumber_text);

    }

    @Test(priority = 3, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void lookHalfAccount(StagingData data){
        //userLogin(data);
        //user.click(HomePage.transfers_tab);
        user.verifyElementPresent(SearchAccountPage.lookupHalfAccount_link);
        user.click(SearchAccountPage.lookupHalfAccount_link);
        user.setText(SearchAccountPage.halfaccountEmail_input, data.getHalfAccount());
        user.click(SearchAccountPage.go_button);
        user.verifyElementPresent(SearchAccountPage.halfaccountResult_table);

    }

    @Test(priority = 4, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void lookUpTransaction(StagingData data){

        user.click(HomePageStagingObjects.transfers_tab);
        user.verifyElementPresent(LookupTransaction.lookupTransaction_link);
        user.click(LookupTransaction.lookupTransaction_link);

        user.click(LookupTransaction.byTransferID_option);
        user.setText(LookupTransaction.search_input, data.getLookTransferID());
        user.click(SearchAccountPage.go_button);
        user.verifyElementPresent(LookupTransaction.transactionID_value);

        user.click(LookupTransaction.byPaymentRefnum_option);
        user.setText(LookupTransaction.search_input, data.getLookPaymentRefNum());
        user.click(SearchAccountPage.go_button);
        user.verifyElementPresent(LookupTransaction.transactionID_value);

        user.click(LookupTransaction.byBatchID_option);
        user.setText(LookupTransaction.search_input, data.getLookBatchID());
        user.click(SearchAccountPage.go_button);
        user.verifyElementPresent(LookupTransaction.transactionID_value);

        user.click(LookupTransaction.byBatchName_option);
        user.setText(LookupTransaction.search_input, data.getLookBatchName());
        user.click(SearchAccountPage.go_button);
        user.verifyElementPresent(LookupTransaction.transactionID_value);

        user.click(LookupTransaction.bySenderFirstName_option);
        user.setText(LookupTransaction.senderFirstName_input, data.getSenderFirstName());
        user.click(SearchAccountPage.go_button);

        user.click(LookupTransaction.bySenderLastName_option);
        user.setText(LookupTransaction.senderFirstName_input, data.getSenderLastName());
        user.click(SearchAccountPage.go_button);

        user.click(LookupTransaction.byInmateFullName_option);
        user.setText(LookupTransaction.search_input, data.getInmateFirstName());
        user.click(SearchAccountPage.go_button);
        user.verifyElementPresent(LookupTransaction.transactionID_value);

        user.click(LookupTransaction.byInmateFirstName_option);
        user.setText(LookupTransaction.search_input, data.getInmateFirstName());
        user.click(SearchAccountPage.go_button);
        user.verifyElementPresent(LookupTransaction.transactionID_value);

        user.click(LookupTransaction.byInmateLastName_option);
        user.setText(LookupTransaction.search_input, data.getInmateLastName());
        user.click(SearchAccountPage.go_button);
        user.verifyElementPresent(LookupTransaction.transactionID_value);

        user.click(LookupTransaction.byInmateID_option);
        user.setText(LookupTransaction.search_input, data.getInmateID());
        user.click(SearchAccountPage.go_button);
        refreshPage();
        user.click(HomePageStagingObjects.signout_button);

    }

}
