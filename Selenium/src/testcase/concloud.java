package testcase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class concloud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get ("http://nextclick.info/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),' Contact Us')]")).click();
		driver.findElement(By.name("name")).sendKeys("Nandini Suri");
		driver.findElement(By.name("email")).sendKeys("nandini.suri124@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("0123456789");
        Select s= new Select(driver.findElement(By.xpath("//select[@name='service']")));
		s.selectByIndex(4);
		driver.findElement(By.name("subject")).sendKeys("Automation");
		driver.findElement(By.name("textmessage")).sendKeys("enquiry on internship");
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		String aa=alert.getText();
		System.out.println(aa);
		alert.accept();//alert.sendkeys("")
           //driver.close();

	}

}
