package selenium003;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;

public class Extentreport {

	ExtentHtmlReporter htmlReporter;
	 ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void startReport()
	{
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/NandininewReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("OS","Windows");
		extent.setSystemInfo("Env","QA");
		extent.setSystemInfo("Tool","Selenium");

		
		htmlReporter.config().setDocumentTitle("Its Me Nandini Reports");
		htmlReporter.config().setReportName("NANDINI REPORT");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
			
	}
	
	@Test
	public void demoTestpass()
	{
		test = extent.createTest("if pass","Demo for Pass");
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void demoTestfail()
	
	{
		test = extent.createTest("if fail","Demo for fail");
		Assert.assertTrue(false);
	}
	
	@AfterTest
	public void tearDown()
	{
		extent.flush();
		
	}
	
	}
