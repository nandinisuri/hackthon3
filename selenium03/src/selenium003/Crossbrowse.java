package selenium003;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowse {
	WebDriver driver;
 
	
	@BeforeMethod
	@Parameters("browser")

	public void openbrowser(String browser) {
		
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
		
	}
	
	@Test(description = "Login Page")
	public void LOGin() {
		driver.get("http://grepthorhosting.com/feron/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("nandini.suri24@gmail.com");
		driver.findElement(By.name("password")).sendKeys("suri@click");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		 Alert alert = driver.switchTo().alert();
			String aa=alert.getText();
			System.out.println(aa);
			alert.accept();
	}
	

}
