package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_002AboutUs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get ("http://nextclick.info/index.html");
		driver.manage().window().maximize();
		//driver.findElement(By.id("pg_2")).click();
		driver.findElement(By.xpath("//a[contains(text(),' About Us')]")).click();
		//driver.close();
		
	}

}
