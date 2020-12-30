package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class servicecloud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://nextclick.info/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),' Our Services')]")).click();
		
		Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),' Our Services')]"))).perform();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath("//a[contains(text(),'Cloud Services')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      //driver.close();
		

	}

}
