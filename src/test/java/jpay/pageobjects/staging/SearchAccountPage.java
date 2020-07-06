package jpay.pageobjects.staging;

import org.openqa.selenium.By;

public interface SearchAccountPage {

    By searchfiter_dropdown = By.xpath("//select[@id='searchfilter']");
    By byfullname_option = By.xpath("//select[@id='searchfilter']/option[text()='Fullname']");
    By bylastname_option = By.xpath("//select[@id='searchfilter']/option[text()='Lastname']");
    By byfirstname_option = By.xpath("//select[@id='searchfilter']/option[text()='Firstname']");
    By byemailaddress_option = By.xpath("//select[@id='searchfilter']/option[text()='Email Address']");
    By byphonenumber_option = By.xpath("//select[@id='searchfilter']/option[text()='Phone Number']");
    By bycellphone_option = By.xpath("//select[@id='searchfilter']/option[text()='Cell Phone']");
    By byadditionalphone_option = By.xpath("//select[@id='searchfilter']/option[text()='Additional Phone']");
    By bycity_option = By.xpath("//select[@id='searchfilter']/option[text()='City']");
    By bystate_option = By.xpath("//select[@id='searchfilter']/option[text()='State']");
    By byzipcode_option = By.xpath("//select[@id='searchfilter']/option[text()='Fullname']");
    By byaccount_option = By.xpath("//select[@id='searchfilter']/option[text()='Account #']");
    By search_input = By.xpath("//input[@id='searchstring']");
    By byFilter_dropdown = By.xpath("//select[@id='searchfilter']");
    By passedValueFilter_dropdown = By.xpath("//input[@id='searchstring']");
    By includeInactive_checkbox = By.xpath("//input[@id='cbInactiveUser']");
    By includeDormant_checkbox = By.xpath("//input[@id='cbDormantUser']");
    By account_link = By.xpath("//a[@id='MyDataGrid_ctl03_bAccountID']");
    By accountNumberValue_text = By.xpath("(//td[text()='Account #']/following::tr/td[1])[1]");
    By memberSinceValue_text = By.xpath("(//td[text()='Member Since']/following::tr/td[2])[1]");
    By firstnameValue_text = By.xpath("(//td[text()='Firstname']/following::tr/td[3])[1]");
    By lastnameValue_text = By.xpath("(//td[text()='Lastname']/following::tr/td[4])[1]");
    By cityValue_text = By.xpath("(//td[text()='City']/following::tr/td[5])[1]");
    By phoneNumberValue_text = By.xpath("(//td[text()='Phone #']/following::tr/td[6])[1]");
    By cellphoneValue_text = By.xpath("(//td[text()='Cell Phone #']/following::tr/td[7])[1]");
    By statusValue_text = By.xpath("(//td[text()='Status']/following::tr/td[8]/span)[1]");
    By itemsToList_dropdown = By.xpath("//select[@id='ps']");
    By list10_dropdown = By.xpath("//select[@id='ps']/option[@value='10']");
    By list50_dropdown = By.xpath("//select[@id='ps']/option[@value='50']");
    By list100_dropdown = By.xpath("//select[@id='ps']/option[@value='100']");
    By go_button = By.xpath("//input[@id='btnSubmit']");
    By lookupAccount_link = By.xpath("//font[text()='Lookup Account']");
    By lookupHalfAccount_link = By.xpath("//font[@id='subNavCurrent_86']");
    By halfaccountEmail_input = By.xpath("//input[@id='txtSearchString']");
    By accountNumber_text = By.xpath("//a[text()='13209650']");
    By halfaccountResult_table = By.xpath("//div[@id='p_UsersResults']");





}
