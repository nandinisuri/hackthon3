package selenium003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowse2 {
	WebDriver driver;

	@Parameters("browser")
	
	@BeforeMethod
	public void openbrowser(String browser) {
		
		 if(browser.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","E:\\seleniumFiles\\Drivers\\geckodriver.exe");			
				  driver =new FirefoxDriver();
		}
	
		else if(browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
			
			  driver =new ChromeDriver();
		}
		
	}
	
	@Test(description = "Nextclick Login Page")
	public void LOGin() {
		driver.get("http://foodynest.com/nextclick/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("next@click");
		driver.findElement(By.xpath("//button[contains(text(),' Login')]")).click();
		
	}
	

}
