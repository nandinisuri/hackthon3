package testcase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listingmaster {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 		WebDriver driver =new ChromeDriver();
		
		driver.get("http://foodynest.com/nextclick/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("next@click");
		driver.findElement(By.xpath("//button[contains(text(),' Login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Listing Master Data']")).click();
		//driver.findElement(By.xpath("//a[text()='Category']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Brands']")).click();

		

}
}
