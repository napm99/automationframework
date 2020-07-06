package jpay.pageobjects.facility;

import org.openqa.selenium.By;

public interface HomePageObjects {
	
	By moneypage_link = By.xpath("//a[text()='Money']");
	By InmatePrepaidReport_link = By.xpath("//tr/descendant::a[text()='Inmate Prepaid Report']");
	String HomePageTitle = "Admin: News";
	By accessControlSystem_link = By.xpath("//a[@id='ctl00_LeftBar_LeftbarRepeater_ctl03_NavbarItem_HyperLink1']");
	By signout_button = By.xpath("//a[@id='ctl00_Header_MenuRepeater_ctl08_lnkLogout']");



}
