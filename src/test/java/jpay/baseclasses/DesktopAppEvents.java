package jpay.baseclasses;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class DesktopAppEvents {
	private static WindowsDriver kioskSession;
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		
		
		
		
		DesiredCapabilities appCapabilities = new DesiredCapabilities();
		appCapabilities.setCapability("deviceName", "WindowsPC");
		appCapabilities.setCapability("app", "C:\\Program Files (x86)\\JPay\\MoneyKiosk\\MoneyKiosk.exe");	
		kioskSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), appCapabilities);

		Thread.sleep(3000);
		kioskSession.findElementByAccessibilityId("label1");
		Thread.sleep(3000);
		kioskSession.findElementByAccessibilityId("SendMoneyBtn").click();
		Thread.sleep(3000);
		kioskSession.findElementByAccessibilityId("ContinueBtn").click();
		Thread.sleep(3000);
		kioskSession.findElementByAccessibilityId("UserAgreementError");
		Thread.sleep(3000);
		kioskSession.findElementByAccessibilityId("UserAgreementCheckBox").click();
		Thread.sleep(3000);
		kioskSession.findElementByAccessibilityId("ContinueBtn").click();
		Thread.sleep(3000);
		kioskSession.findElementByAccessibilityId("button0").click();
		Thread.sleep(3000);
		kioskSession.findElementByAccessibilityId("button1").click();
		Thread.sleep(3000);
		kioskSession.findElementByAccessibilityId("button0").click();
		Thread.sleep(3000);
		kioskSession.findElementByAccessibilityId("button1").click();
		Thread.sleep(3000);
		kioskSession.findElementByAccessibilityId("button1").click();
		Thread.sleep(3000);
		kioskSession.findElementByAccessibilityId("button9").click();
		Thread.sleep(3000);
		kioskSession.findElementByAccessibilityId("button9").click();
		Thread.sleep(3000);
		kioskSession.findElementByAccessibilityId("button0").click();
		Thread.sleep(3000);
		kioskSession.findElementByAccessibilityId("ContinueBtn").click();
		System.out.println("This has passed but the session in not kept");

	}
}