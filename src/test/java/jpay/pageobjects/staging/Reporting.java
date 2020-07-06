package jpay.pageobjects.staging;

import org.openqa.selenium.By;

public interface Reporting {

    By controllerReport_link = By.xpath("//font[contains(text(),'Controller Report')]");
    By controllerReport_link2 = By.xpath("//b[contains(text(),'Controller Report')]");
    By transactionReport_link = By.xpath("//a[@id='lnkNewTransactionsReport']");
    By lobbyKioskReport_link = By.xpath("//a[@id='lnkLobbyKioskReport']");
    By newLobbyKioskReport_link = By.xpath("//a[@id='lnkNewLobbyKioskReport']");
    By fromdate_option = By.xpath("//tr//tr//tr//tr//tr[2]//td[6]//a[1]");
    By todate_option = By.xpath("//font[contains(text(),'28')]");
    By lkfromdate_option = By.xpath("//tr//tr//tr//tr[2]//td[6]//a[1]");
    By lktodate_option = By.xpath("//font[contains(text(),'28')]");
    By go_button = By.xpath("//input[@id='btnViewReport']");
    By lkGo_button = By.xpath("//input[@id='btnGo']");
    By transfertype_dropdown = By.xpath("//select[@id='ucTransferType_lbxTransferType']");
    By transferTypeAll_option = By.xpath("//option[contains(text(),'All')]");
    By transferTypeVisa_option = By.xpath("//option[contains(text(),'Visa')]");
    By transferTypeMasterCard_option = By.xpath("//option[contains(text(),'Master Card')]");
    By transferTypeMoneyOrder_option = By.xpath("//option[contains(text(),'Money Order')]");
    By transferTypeKiosk_option = By.xpath("//option[text()='Kiosk']");
    By transferTypebookingKiosk_option = By.xpath("//option[text()='Booking Kiosk']");
    By transferTypeDiscover = By.xpath("//option[contains(text(),'Discover')]");
    By visaValidation_type = By.xpath("(//td[contains(text(),'VISA')])[1]");
    By mastercardValidation_type = By.xpath("(//td[contains(text(),'Master Card')])[1]");
    By moneyOrderValidation_type = By.xpath("(//td[contains(text(),'MONEYORDER')])[1]");
    By kioskValidation_type = By.xpath("(//td[contains(text(),'KIOSK')])[1]");
    By discoverValidation_type = By.xpath("(//td[contains(text(),'Discover')])[1]");
    By bookingKioskValidation_type = By.xpath("(//td[contains(text(),'Booking Kiosk')])[1]");
    By resulttable_validation = By.xpath("//body//table//table[3]");
    By calendarFirst_img = By.xpath("(//img[@src='images/calendar.jpg'])[1]");
    By calendarSecond_img = By.xpath("(//img[@src='images/calendar.jpg'])[2]");
    By reportExport_button = By.xpath("//input[@id='btnExportReport']");
    By changetoPreviousMonth_button = By.xpath("//span[@id='spanLeft']");







}
