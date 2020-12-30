package selenium003;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class lsitingsub {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://foodynest.com/nextclick/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("next@click");
		driver.findElement(By.xpath("//button[contains(text(),' Login')]")).click();
		Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Listing Master Data']")));
		driver.findElement(By.xpath("//span[text()='Listing Master Data']")).click();
		Thread.sleep(2000);
		// Select s= new Select(driver.findElement(By.xpath("//span[text()='Listing Master Data']")));
		//	s.selectByVisibleText("Category");

					
	}

	

}
