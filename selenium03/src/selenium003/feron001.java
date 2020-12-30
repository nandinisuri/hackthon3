package selenium003;




import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class feron001 {
	WebDriver driver;
	@BeforeMethod 
	public void launchbrowsersetup() {
		 
	System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
	
	  driver =new ChromeDriver();
	}
	@Test 
	public void driver() {
		
		 
	  driver.get("http://grepthorhosting.com/feron/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='SIGNUP']")).click();

	

		  driver.findElement(By.name("first_name")).sendKeys("Nandini Suri");
		  driver.findElement(By.name("last_name")).sendKeys(" mahika");
		 
		 driver.findElement(By.name("email")).sendKeys("nandini.suri24@gmail.com");
		 driver.findElement(By.name("mobile_number")).sendKeys("1123456789");
		 driver.findElement(By.name("pswd")).sendKeys("suri@click");
		 driver.findElement(By.name("cpswd")).sendKeys("suri@click");
		 driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
		 Alert alert = driver.switchTo().alert();
			String aa=alert.getText();
			System.out.println(aa);
			alert.accept();
			
	}
		 
	@AfterMethod 
	 public void teardown() {
		// driver.close();
	       System.out.println("execute teardown method");
			 }


}
