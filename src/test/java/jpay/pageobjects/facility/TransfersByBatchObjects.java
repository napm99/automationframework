package jpay.pageobjects.facility;

import org.openqa.selenium.By;

public interface TransfersByBatchObjects {
	
	By accountID_link = By.xpath("//table/descendant::a[@id='ctl00_MainContent_ListDepositStates_ctl03_lbAccountID']");
	By customer_link = By.xpath("//table/descendant::a[@id='ctl00_MainContent_ListDepositStates_ctl03_Linkbutton6']");
	By inmateID_link = By.xpath("(//a[contains(@href,'inmateID')])[1]");
	By inmateName_link = By.xpath("(//a[contains(@href,'inmateID')])[2]");
	By backBtn = By.xpath("//a/font[text()='<<BACK']");
	

}
