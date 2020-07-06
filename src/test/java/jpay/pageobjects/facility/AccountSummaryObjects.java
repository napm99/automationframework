package jpay.pageobjects.facility;

import org.openqa.selenium.By;

public interface AccountSummaryObjects {

	By AccountSummary_label = By.xpath("//table/descendant::b[text()='Account Summary']");
	By Desposits_label = By.xpath("//table/descendant::b[text()='Deposits']");
	By MediaTransfers_label = By.xpath("//table/descendant::b[text()='Media Transfers']");
	By LettersSent_label = By.xpath("//table/descendant::b[text()='Letters Sent']");
	By LettersReceived_label = By.xpath("//table/descendant::b[text()='Letters Received']");
	By MediaFundsFreeAlerts_label = By.xpath("//table/descendant::b[text()='Media Funds Free Alerts']");
	By ScheduledCalls_label = By.xpath("//table/descendant::b[text()='Scheduled calls']");
	By OtherCalls_label = By.xpath("//table/descendant::b[text()='Other calls']");
	By exportFileBtn = By.xpath("//div/input[@id='ctl00_MainContent_btnExport']");
	By Back_btn = By.xpath("//a/font[text()='<< BACK']");
			
}
