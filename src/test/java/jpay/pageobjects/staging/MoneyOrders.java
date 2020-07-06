package jpay.pageobjects.staging;

import org.openqa.selenium.By;

public interface MoneyOrders {


    By moneyOrdersReport_link = By.xpath("//font[text()='Money Order Report']");
    By status_dropdown = By.xpath("//select[@id='ddlStatus']");
    By statusAll_option = By.xpath("//select[@id='ddlStatus']//option[contains(text(),'All')]");
    By statusPending_option = By.xpath("//select[@id='ddlStatus']//option[contains(text(),'All')]");
    By statusUncomplete_option = By.xpath("//select[@id='ddlStatus']//option[contains(text(),'All')]");
    By statusException_option = By.xpath("//select[@id='ddlStatus']//option[contains(text(),'All')]");
    By statusConfirmed_option = By.xpath("//select[@id='ddlStatus']//option[contains(text(),'All')]");
    By statusAutoConfirmed_option = By.xpath("//select[@id='ddlStatus']//option[contains(text(),'All')]");
    By statusCancelled_option = By.xpath("//select[@id='ddlStatus']//option[contains(text(),'All')]");
    By calendar_picker = By.xpath("(//img[@src='images/calendar.jpg'])[1]");
    By calendar_picker2 = By.xpath("(//img[@src='images/calendar.jpg'])[2]");
    By fromdate_option = By.xpath("//tr//tr[2]//td[6]//a[1]");
    By toDate_option = By.xpath("//font[contains(text(),'28')]");
    By generate_button = By.xpath("//input[@id='btnSubmit']");
    By export_link = By.xpath("//a[@id='lnkExportToExcel']");
    By results_table = By.xpath("//div[@id='p_viewresults']");
    By pending_validation = By.xpath("(//span[text()='Pending'])[1]");
    By uncomplete_validation = By.xpath("(//span[text()='UncompleteData'])[1]");
    By exception_validation = By.xpath("(//span[text()='Exception'])[1]");
    By confirmed_validation = By.xpath("(//span[text()='Confirmed'])[1]");
    By autoConfirmed_validation = By.xpath("(//span[text()='AutoConfirmed'])[1]");
    By cancelled_validation = By.xpath("(//span[text()='Cancelled'])[1]");
    By errorMsg_validation = By.xpath("//span[@id='lblError']");
    By changetoPreviousMonth_button = By.xpath("//span[@id='spanLeft']");







}
