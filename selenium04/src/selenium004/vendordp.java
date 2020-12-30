package selenium004;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vendordp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
		selenium004.ChromeDriver driver =new ChromeDriver();

		driver.get ("https://foodynest.com/next_vendor/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Vendor Registration']")).click();
		
		
		
		  driver.findElement(By.name("names[first_name]")).sendKeys("Nandini Suri");
		 driver.findElement(By.name("input_text_2")).sendKeys(" mahika");
		  driver.findElement(By.name("email")).sendKeys("nandini.suri124@gmail.com");
		  driver.findElement(By.name("phone")).sendKeys("0123456789");
		  driver.findElement(By.name("input_text")).sendKeys("abcdef");
		  driver.findElement(By.name("input_text_1")).sendKeys("hitech city");
		  driver.findElement(By.name("numeric-field")).sendKeys("520003");
		 driver.findElement(By.xpath("//option[@value='Andhra Pradesh']")).click();
		  driver.findElement(By.xpath("//option[@value='Hyderabad']")).click();
		  driver.findElement(By.xpath("//option[@value='Tours & Travels'][1]")).click();
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		

	}

}
