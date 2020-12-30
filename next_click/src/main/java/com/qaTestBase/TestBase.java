package com.qaTestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestBase {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties org = new Properties();
	FileInputStream fig_config,fig_org;
	
	
public void OpenBrowser(String browser) {
	
	
	if(browser.equals("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
		 
		  driver =new ChromeDriver();  
		
	}

    else if(browser.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","\"E:\\seleniumFiles\\Drivers");
		
		  driver =new FirefoxDriver();
	}
	
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}



public void GetURL(String url) {
	
	try {
		driver.get(url);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void Sendkeys(WebDriver driver,String xpath,String value) {
	
	try {
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}


public void Click(WebDriver driver,String xpath) {
	
	try {
		driver.findElement(By.xpath(xpath)).click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
//take screenshot

public void TakeScreenshot(WebDriver driver, String screenshotName) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
}

//select dropdown
public void Selectdropdown(WebDriver driver,String xpath ,String value){
try {
	Select s = new Select(driver.findElement(By.xpath(xpath)));
	s.selectByVisibleText(value);

} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

public void Actions(WebDriver driver,String xpath) {
Actions a = new Actions(driver);
a.moveToElement(driver.findElement(By.xpath(xpath))).perform();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
public void Scroll() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1000)", "");



}
}