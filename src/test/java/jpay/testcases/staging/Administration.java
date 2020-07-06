package jpay.testcases.staging;

import jpay.baseclasses.DriverEvents;
import jpay.pageobjects.staging.AdministrationObjects;
import jpay.pageobjects.staging.HomePageStagingObjects;
import jpay.pageobjects.staging.MoneyOrders;
import jpay.utilities.StagingData;
import org.testng.annotations.Test;

public class Administration extends DriverEvents {
    DriverEvents user = new DriverEvents();
    Transfers action = new Transfers();
    String blank = "";
    StagingData data;

    @Test(priority = 10, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void wwwSettings(StagingData data){

        action.userLogin(data);
        user.click(HomePageStagingObjects.administration_tab);
        user.click(AdministrationObjects.wwwSettings_link);
        user.verifyElementPresent(AdministrationObjects.wwwSettings_grid);

    }
    @Test(priority = 11, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void changePolicyLink(StagingData data){

        user.click(AdministrationObjects.policyEdit_button);
        user.alertAccept();
        user.setText(AdministrationObjects.policyFooterLink_text, "https://www.google.com");
        user.click(AdministrationObjects.actionUpdate_button);
        user.verifyElementPresent(AdministrationObjects.updatedSuccesfully_text);

    }

    @Test(priority = 12, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void changeLegalAgreements_link(StagingData data){

        user.click(AdministrationObjects.legalAdreementsEdit_button);
        user.alertAccept();
        user.setText(AdministrationObjects.legalAgreementsFooterLink_text, "https://www.google.com");
        user.click(AdministrationObjects.actionUpdate_button);
        user.verifyElementPresent(AdministrationObjects.updatedSuccesfully_text);

    }
    @Test(priority = 13, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void changeConsumerProtection_link(StagingData data){

        user.click(AdministrationObjects.consumerProtectionEdit_button);
        user.alertAccept();
        user.setText(AdministrationObjects.consumerProtectionFooterLink_text, "https://www.google.com");
        user.click(AdministrationObjects.actionUpdate_button);
        user.verifyElementPresent(AdministrationObjects.updatedSuccesfully_text);

    }

    @Test(priority = 14, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void changePolicyLinkback(StagingData data){

        user.click(AdministrationObjects.policyEdit_button);
        user.alertAccept();
        user.setText(AdministrationObjects.policyFooterLink_text, "~/LegalAgreementsOut.aspx?Panel=PrivacyPolicy");
        user.click(AdministrationObjects.actionUpdate_button);
        user.verifyElementPresent(AdministrationObjects.updatedSuccesfully_text);

    }

    @Test(priority = 15, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void changeLegalAgreements_linkback(StagingData data){

        user.click(AdministrationObjects.legalAdreementsEdit_button);
        user.alertAccept();
        user.setText(AdministrationObjects.legalAgreementsFooterLink_text, "~/LegalAgreementsOut.aspx");
        user.click(AdministrationObjects.actionUpdate_button);
        user.verifyElementPresent(AdministrationObjects.updatedSuccesfully_text);

    }
    @Test(priority = 16, dataProvider="StagingData",dataProviderClass= StagingData.class)
    public void changeConsumerProtection_linkback(StagingData data){

        user.click(AdministrationObjects.consumerProtectionEdit_button);
        user.alertAccept();
        user.setText(AdministrationObjects.consumerProtectionFooterLink_text, "~/LegalAgreementsOut.aspx?Panel=StateDisclosures");
        user.click(AdministrationObjects.actionUpdate_button);
        user.verifyElementPresent(AdministrationObjects.updatedSuccesfully_text);

    }



}
