package jpay.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import jpay.baseclasses.DriverEvents;


public class ExtentReport extends TestListenerAdapter {
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	
		
	public void onStart(ITestContext testContext){
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		String reportName="Test-Report-"+timeStamp+".html";
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/"+reportName);//specify location of the report
		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
		
		extent=new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host name","localhost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("user","Nilbert");
		
		htmlReporter.config().setDocumentTitle("JPay Automation Project"); // Tile of report
		htmlReporter.config().setReportName("Functional Test Automation Report"); // name of the report
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); //location of the chart
		htmlReporter.config().setTheme(Theme.STANDARD);
	}
	
	public void onTestSuccess(ITestResult testResult){
		logger=extent.createTest(testResult.getName()); // create new entry in th report
		logger.log(Status.PASS,MarkupHelper.createLabel(testResult.getName(),ExtentColor.GREEN)); // send the passed information to the report with GREEN color highlighted
	}
	
	public void onTestFailure(ITestResult testResult){
		
		DriverEvents captureEvent = new DriverEvents();
		
		try {
			captureEvent.captureScreen(DriverEvents.driver, testResult.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		logger = extent.createTest(testResult.getName()); // create new entry in th report
		logger.log(Status.FAIL,MarkupHelper.createLabel(testResult.getName(),ExtentColor.RED)); // send the passed information to the report with GREEN color highlighted	
		
		
		
		String screenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+testResult.getName()+".png";
		
		
		File file = new File(screenshotPath); 
		
		if(file.exists()){
			try {
				logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void onTestSkipped(ITestResult testResult){
		logger=extent.createTest(testResult.getName()); // create new entry in th report
		logger.log(Status.SKIP,MarkupHelper.createLabel(testResult.getName(),ExtentColor.ORANGE));
	}
	
	public void onFinish(ITestContext testContext){
		extent.flush();
	}
}
