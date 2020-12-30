package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_003Home {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://nextclick.info/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()= 'Home']")).click();
		driver.close();


}
	
}
