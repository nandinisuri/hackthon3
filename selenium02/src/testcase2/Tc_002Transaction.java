package testcase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_002Transaction {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://foodynest.com/nextclick/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("next@click");
		driver.findElement(By.xpath("//button[contains(text(),' Login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Transactions']")).click(); 

}

}