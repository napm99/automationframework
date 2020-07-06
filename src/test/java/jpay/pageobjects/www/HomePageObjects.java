package jpay.pageobjects.www;

import org.openqa.selenium.By;

public interface HomePageObjects {
	
	/*
	 * ALL THE ELEMENTS FROM THE FOOTER OF THE PAGE ARE FOUND HERE
	 * 
	 */
	
	By About_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='About']");
	By ContactUs_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Contact Us']");
	By Help_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Help']");
	By Home_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Home']");
	By InmateSearch_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Inmate Search']");
	By PrisonSearch_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Prison Search']");
	By Education_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Education']");
	By EmailVideoGram_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Email & VideoGram']");
	By JpayTablet_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='JPay Tablet']");
	By MoneyTransfer_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Money Transfer']");
	By VideoVisitation_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Video Visitation']");
	By CourtFees_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Court Fees']");
	By ReleaseCards_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Release Cards']");
	By Restitution_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Restitution']");
	By SelfReport_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Self-Report Fees']");
	By SupervisionFees_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Supervision Fees']");
	By DevBlog_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='devblog.jpay.com']");
	By Facebook_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Facebook']");
	By ForumJpay_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='forum.jpay.com']");
	By OurCommunity_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Our Community']");
	By Twitter_link = By.xpath("//div[@id='wholefooter']/descendant::a[text()='Twitter']");
	By FooterDiv_Section = By.xpath("//div[@id='wholefooter']");
	
	
	/*
	 * REST OF ELEMENTS LOCATED IN THE HOME PAGE
	 * 
	 */
	
	By Login_Btn = By.xpath("//a[@id='newHeader_TopRightNavButton_lnkLogin']");
	By States_Dropdown = By.xpath("//input[@id='StatesDropdown_txtautofromDB']");
	By next_button = By.xpath("//a[@id='nextImageButton']");
	By DontKnowId_link = By.xpath("//a[@id='nextImageButton']/following-sibling::a[@href='PAvail.aspx']");
	By TopHelp_link = By.xpath("//a[@id='newHeader_HyperLink3' and text()='Help']");
	By TopPrisonSearch_link = By.xpath("//a[@id='newHeader_HyperLink2' and text()='Prison Search']");
	By TopInmateSearch_link = By.xpath("//a[@id='newHeader_inmateSearchHyperLink' and text()='Inmate Search']");
	By TopTwitter_link = By.xpath("//section/a[@href='http://twitter.com/jpay_com']");
	By TopFacebook_link = By.xpath("//section/a[@href='http://www.facebook.com/JPayInc']");
	By inmateID_textbox = By.xpath("//input[@id='inmateIDTextBox']");
}
