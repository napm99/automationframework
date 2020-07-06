package jpay.testcases.www;

import jpay.baseclasses.DriverEvents;
import jpay.pageobjects.www.HomePageObjects;
import jpay.utilities.Constants;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Payment extends DriverEvents implements Constants {

    DriverEvents user = new DriverEvents();

    @Test
    public void sendMoneyTest() {
        userLogin();
        //user.click(By.xpath("//select[@id='inmatesDropDownList']/option[@value='17879923']"));
        //user.click(By.xpath("//select[@id='inmatesDropDownList']/option[@value='17883367']"));
        user.click(By.xpath("//select[@id='inmatesDropDownList']/option[@value='17883368']"));
        //user.click(By.xpath("//select[@id='inmatesDropDownList']/option[@value='17884489']"));
        //user.click(By.xpath("//select[@id='inmatesDropDownList']/option[@value='17884147']"));
        user.click(By.xpath("//a[@class='HeaderNavLinkInactive'][contains(text(),'Send Money')]"));
        user.click(By.xpath("//input[@id='uclSelectInmate_btnContinue']"));
        user.setText(By.xpath("//input[@id='ed_Amount']"), "111.00" );
        user.click(By.xpath("//input[@id='btnContinue']"));
        visaPaymentForm();
        user.click(By.xpath("//input[@id='AcceptedProductTerms']"));
        user.click(By.xpath("//input[@id='ContinueButton']"));
        user.verifyElementPresent(By.xpath("//section[@class='thanks_container']"));
        logger.info("-- ValidateHomePage test has PASSED --");

    }

    @Test
    public void setrRecurringPayment(){
        userLogin();
        user.click(By.xpath("//select[@id='inmatesDropDownList']/option[@value='17879923']"));
        //user.click(By.xpath("//select[@id='inmatesDropDownList']/option[@value='17883367']"));
        //user.click(By.xpath("//select[@id='inmatesDropDownList']/option[@value='17883368']"));
        user.click(By.xpath("//a[@id='LinkButton2']"));
        user.click(By.xpath("//input[@id='btn_Initiate']"));
        user.click(By.xpath("//input[@id='uclSelectInmate_btnContinue']"));
        masterCardPaymentForm();
        user.click(By.xpath("//input[@id='ContinueButton']"));
        user.setText(By.xpath("//input[@id='ed_Amount']"), "125.00");
        user.jsclick(By.xpath("//a[@title='May 26']"));
        user.click(By.xpath("//input[@id='rdoInterval_0']"));
        user.click(By.xpath("//input[@id='btnContinue']"));
        user.verifyElementPresent(By.xpath("//section[@class='recurring_payments_container_2']"));
        user.click(By.xpath("//input[@id='uclLegalAgreementPresentation_chkTerms']"));
        user.click(By.xpath("//input[@id='uclLegalAgreementPresentation_chkCardOnFile']"));
        user.click(By.xpath("//input[@id='btnContinue']"));
        user.verifyElementPresent(By.xpath("//div[@id='PanelThanks']"));

    }

    public void masterCardPaymentForm(){
        user.click(By.xpath("//input[@id='NewCardButton']"));
        user.setText(By.xpath("//input[@id='CardholderData_FirstName']"), "test");
        user.setText(By.xpath("//input[@id='CardholderData_MiddleName']"),"m");
        user.setText(By.xpath("//input[@id='CardholderData_LastName']"),"qatest");
        user.setText(By.xpath("//input[@id='CardholderData_Address1']"),"10981 Marks Way");
        user.setText(By.xpath("//input[@id='CardholderData_City']"), "Miramar");
        user.setText(By.xpath("//input[@id='CardholderData_Zip']"), "33025");
        user.setText(By.xpath("//input[@id='CardholderData_CardNumber']"),"5555555555554444");
        user.click(By.xpath("//select[@id='CardholderData_CardExpiryMonth']/option[text()='May']"));
        user.click(By.xpath("//select[@id='CardholderData_CardExpiryYear']/option[text()='25']"));
        user.setText(By.xpath("//input[@id='CardholderData_Cvv']"), "123");

    }

    public void visaPaymentForm(){
        user.click(By.xpath("//input[@id='NewCardButton']"));
        user.setText(By.xpath("//input[@id='CardholderData_FirstName']"), "test");
        user.setText(By.xpath("//input[@id='CardholderData_MiddleName']"),"m");
        user.setText(By.xpath("//input[@id='CardholderData_LastName']"),"qatest");
        user.setText(By.xpath("//input[@id='CardholderData_Address1']"),"10981 Marks Way");
        user.setText(By.xpath("//input[@id='CardholderData_City']"), "Miramar");
        user.setText(By.xpath("//input[@id='CardholderData_Zip']"), "33025");
        user.setText(By.xpath("//input[@id='CardholderData_CardNumber']"),"4001919257537193");
        user.click(By.xpath("//select[@id='CardholderData_CardExpiryMonth']/option[text()='Sep']"));
        user.click(By.xpath("//select[@id='CardholderData_CardExpiryYear']/option[text()='23']"));
        user.setText(By.xpath("//input[@id='CardholderData_Cvv']"), "666");

    }

    public void discoverPaymentForm(){
        user.click(By.xpath("//input[@id='NewCardButton']"));
        user.setText(By.xpath("//input[@id='CardholderData_FirstName']"), "test");
        user.setText(By.xpath("//input[@id='CardholderData_MiddleName']"),"m");
        user.setText(By.xpath("//input[@id='CardholderData_LastName']"),"qatest");
        user.setText(By.xpath("//input[@id='CardholderData_Address1']"),"10981 Marks Way");
        user.setText(By.xpath("//input[@id='CardholderData_City']"), "Miramar");
        user.setText(By.xpath("//input[@id='CardholderData_Zip']"), "33025");
        user.setText(By.xpath("//input[@id='CardholderData_CardNumber']"),"6011111111111117");
        user.click(By.xpath("//select[@id='CardholderData_CardExpiryMonth']/option[text()='Feb']"));
        user.click(By.xpath("//select[@id='CardholderData_CardExpiryYear']/option[text()='25']"));
        user.setText(By.xpath("//input[@id='CardholderData_Cvv']"), "123");

    }

    public void userLogin(){
        user.openBrowser("chrome");
        user.goTo("https://www.qa.jpay.com/login.aspx");
        user.setText(By.xpath("//input[@id='uclLoginFirstTime_txtUserId']"), "jpayqa2019@gmail.com");
        user.setText(By.xpath("//input[@id='uclLoginFirstTime_txtPassword']"), "Jpay2020#");
        user.click(By.xpath("//div[@class='LoginButton']"));
    }


}
