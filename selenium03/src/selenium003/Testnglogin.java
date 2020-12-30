package selenium003;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testnglogin {
	WebDriver driver;
	@BeforeSuite
	 public void setup1() {
		System.out.println("setup1");
	
	}
	@BeforeClass
	 public void classsetup1() {
		System.out.println("classsetup1");
	}
	
	
	@BeforeMethod 
	public void launchbrowsersetup() {
		 
	System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
	
	  driver =new ChromeDriver();
	}
	@Test 
	public void driver() {
		
		
	  driver.get("http://foodynest.com/nextclick/auth/login");
		driver.manage().window().maximize();
	
			 driver.findElement(By.id("email")).sendKeys("admin@admin.com");
			 driver.findElement(By.name("password")).sendKeys("next@click");
			 driver.findElement(By.xpath("//button[contains(text(),' Login')]")).click();
			 assertEquals("Dashboard-Next Click","Dashboard-Next Click");
			 

	}
			@AfterMethod 
			 public void teardown() {
				// driver.close();
			       System.out.println("execute teardown method");
					 }

		

}
