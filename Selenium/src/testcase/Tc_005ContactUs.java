package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_005ContactUs {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			driver.get ("http://nextclick.info/index.html");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[contains(text(),' Contact Us')]")).click();
			driver.findElement(By.name("name")).sendKeys("Nandini Suri");
			driver.findElement(By.name("email")).sendKeys("nandini.suri124@gmail.com");
			driver.findElement(By.name("subject")).sendKeys("Automation");
			driver.findElement(By.name("textmessage")).sendKeys("enquiry on internship");
			driver.findElement(By.name("submit")).click();


			
			//driver.close();
		
		

	}

}
