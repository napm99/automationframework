package jpay.pageobjects.staging;

import org.openqa.selenium.By;

public interface LookupTransaction {


    By lookupTransaction_link = By.xpath("//font[text()='Lookup Transaction']");
    By searchfiter_dropdown = By.xpath("//select[@id='searchfilter']");
    By byTransferID_option = By.xpath("//select[@id='searchfilter']/option[text()='Transfer ID']");
    By byPaymentRefnum_option = By.xpath("//select[@id='searchfilter']/option[text()='Payment Ref Num']");
    By byExternalRefNum_option = By.xpath("//select[@id='searchfilter']/option[text()='External Ref. #']");
    By byBatchID_option = By.xpath("//select[@id='searchfilter']/option[text()='Batch ID']");
    By byBatchName_option = By.xpath("//select[@id='searchfilter']/option[text()='Batch Name']");
    By bySenderFullName_option = By.xpath("//select[@id='searchfilter']/option[text()='Sender Full Name']");
    By bySenderFirstName_option = By.xpath("//select[@id='searchfilter']/option[text()='Sender First Name']");
    By bySenderLastName_option = By.xpath("//select[@id='searchfilter']/option[text()='Sender Last Name']");
    By byInmateFullName_option = By.xpath("//select[@id='searchfilter']/option[text()='Inmate Full Name']");
    By byInmateFirstName_option = By.xpath("//select[@id='searchfilter']/option[text()='Inmate First Name']");
    By byInmateLastName_option = By.xpath("//select[@id='searchfilter']/option[text()='Inmate Last Name']");
    By byInmateID_option = By.xpath("//select[@id='searchfilter']/option[text()='Inmate ID']");
    By search_input = By.xpath("//input[@id='searchstring']");
    By transactionID_value = By.xpath("//a[text()='45064550']");
    By senderFirstName_input = By.xpath("//input[@id='searchstring']");
    By senderLastName_input = By.xpath("//input[@id='fnSearch']");
    By byFilter_dropdown = By.xpath("//select[@id='searchfilter']");
    By passedValueFilter_dropdown = By.xpath("//input[@id='searchstring']");
    By go_button = By.xpath("//input[@id='btnSubmit']");
    By jpayCreditTransaction_link = By.xpath("//font[text()='Lookup JPay Credit Transaction']");
}
