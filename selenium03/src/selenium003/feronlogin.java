package selenium003;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class feronlogin {
	WebDriver driver;
	@BeforeMethod 
	public void launchbrowsersetup() {
		 
	System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
	
	  driver =new ChromeDriver();
	}
	@Test 
	public void driver() throws InterruptedException {
		
		
	  driver.get("http://grepthorhosting.com/feron/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("nandini.suri24@gmail.com");
		driver.findElement(By.name("password")).sendKeys("suri@click");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Alert alert = driver.switchTo().alert();
		String x=alert.getText();
		System.out.println(x);
		alert.accept();
		driver.get("http://grepthorhosting.com/feron/product_info?id=479");
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		String x1=alert1.getText();
		System.out.println(x1);
		alert.accept();
	} 

}
