package jpay.testcases.www;

import jpay.baseclasses.DriverEvents;
import jpay.pageobjects.www.HomePageObjects;

import jpay.utilities.Constants;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePage extends DriverEvents implements Constants {

	DriverEvents user = new DriverEvents();

	@Parameters({ "wwwURL" })
	@Test
	public void validateHomePage(String wwwURL) {

			user.openBrowser("chrome");
			user.goTo(urlWWW);
			user.verifyTitle("JPay | Your Home For Corrections Services");
			user.verifyElementPresent(HomePageObjects.Login_Btn);
			user.verifyElementPresent(HomePageObjects.States_Dropdown);
			user.verifyElementPresent(HomePageObjects.TopHelp_link);
			user.verifyElementPresent(HomePageObjects.TopFacebook_link);
			user.verifyElementPresent(HomePageObjects.TopInmateSearch_link);
			user.verifyElementPresent(HomePageObjects.TopPrisonSearch_link);
			user.verifyElementPresent(HomePageObjects.TopTwitter_link);
			user.verifyElementPresent(HomePageObjects.next_button);
			user.verifyElementPresent(HomePageObjects.DontKnowId_link);
			user.verifyElementPresent(HomePageObjects.FooterDiv_Section);
			logger.info("-- ValidateHomePage test has PASSED --");

	}
	
	@Parameters({ "wwwURL" })
	@Test
	public void validateFooterLinks(String wwwURL) {

			user.click(HomePageObjects.Home_link);
			user.verifyTitle("JPay | Your Home For Corrections Services");
			user.click(HomePageObjects.About_link);
			user.verifyTitle("JPay | About Us");
			user.click(HomePageObjects.InmateSearch_link);
			user.verifyTitle("JPay - First Time Users");
			user.click(HomePageObjects.PrisonSearch_link);
			user.verifyTitle("JPay | Availability and Pricing");
			user.click(HomePageObjects.ContactUs_link);
			user.verifyTitle("JPay | Contact Info");
			user.click(HomePageObjects.Help_link);
			user.switchWindow();
			user.verifyTitle("JPay Webhelp");
			user.switchToOriginalWindow();
			user.click(HomePageObjects.MoneyTransfer_link);
			user.verifyTitle("JPay | Send Money");
			user.click(HomePageObjects.EmailVideoGram_link);
			user.verifyTitle("JPay | Email");
			user.click(HomePageObjects.Education_link);
			user.verifyTitle("JPay | Education");
			user.click(HomePageObjects.JpayTablet_link);
			user.verifyTitle("JPay | Buy Media");
			user.click(HomePageObjects.VideoVisitation_link);
			user.verifyTitle("JPay | Video Visitation");
			user.click(HomePageObjects.Restitution_link);
			user.verifyTitle("JPay | Make A Payment");
			user.click(HomePageObjects.SupervisionFees_link);
			user.verifyTitle("JPay | Make A Payment");
			user.click(HomePageObjects.CourtFees_link);
			user.verifyTitle("JPay | Make A Payment");
			user.click(HomePageObjects.SelfReport_link);
			user.verifyTitle("JPay | Make A Payment");
			user.click(HomePageObjects.ReleaseCards_link);
			user.verifyTitle("JPay | Release Cards");
			user.click(HomePageObjects.ForumJpay_link);
			user.switchWindow();
			user.verifyTitle("JPay Forum Offline");
			user.switchToOriginalWindow();
			user.click(HomePageObjects.Facebook_link);
			user.switchWindow();
			user.verifyTitle("JPay - Home | Facebook");
			user.switchToOriginalWindow();
			user.click(HomePageObjects.Twitter_link);
			user.switchWindow();
			user.verifyTitle("JPay (@JPay_com) / Twitter");
			user.switchToOriginalWindow();
			user.click(HomePageObjects.OurCommunity_link);
			user.verifyTitle("JPay | Our Community");
			logger.info("-- ValidateHomePage test has PASSED --");

	}
}
