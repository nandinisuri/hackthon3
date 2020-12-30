package selenium003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get ("https://foodynest.com/next_vendor/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		driver.findElement(By.name("names[first_name]")).sendKeys("Nandini Suri");
		driver.findElement(By.name("names[last_name]")).sendKeys("NaSuri");

		driver.findElement(By.name("email")).sendKeys("nandini.suri124@gmail.com");
		driver.findElement(By.name("subject")).sendKeys("Automation");
		driver.findElement(By.name("message")).sendKeys("enquiry on internship");
		driver.findElement(By.name("submit")).click();


	}

}
