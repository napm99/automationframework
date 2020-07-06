package jpay.pageobjects.facility;

import org.openqa.selenium.By;

public interface RecapReport {

    By month_link = By.xpath("//a[@id='ctl00_MainContent_dgMonths_ctl02_lnkMonth']");
    By transfersCount_text = By.xpath("//tr[@class='gridheaders']/following-sibling::tr/td[2]");
    By amountTransfer_text = By.xpath("//tr[@class='gridheaders']/following-sibling::tr/td[3]");
    By transferredAmount_text = By.xpath("//tr[@class='gridheaders']/following-sibling::tr/td[4]");
    By facilityComission_text = By.xpath("//tr[@class='gridheaders']/following-sibling::tr/td[5]");
    By recapReport_label = By.xpath("//b[contains(text(),'Recap Report')]");
    By backToPrevious_button = By.xpath("//input[@id='ctl00_MainContent_btnBackToPrev']");
    By recapReportInfo_table = By.xpath("//body/form[@id='aspnetForm']/div/div[@class='LeftMainClass']/div[@class='siteMasterMainContentClass']/div[@class='mainContentClass']/table[@class='maintable']/tbody/tr/td/table/tbody/tr/td/div[@id='ctl00_MainContent_p_viewresults']/table[1]");


}
