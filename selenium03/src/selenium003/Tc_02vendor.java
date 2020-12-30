package selenium003;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tc_02vendor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get ("https://foodynest.com/next_vendor/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Vendor Registration']")).click();
		
		
		/*
		 * driver.findElement(By.name("names[first_name]")).sendKeys("Nandini Suri");
		 * driver.findElement(By.name("input_text_2")).sendKeys(" mahika");
		 * 
		 * driver.findElement(By.name("email")).sendKeys("nandini.suri124@gmail.com");
		 * driver.findElement(By.name("phone")).sendKeys("0123456789");
		 * driver.findElement(By.name("input_text")).sendKeys("abcdef");
		 * driver.findElement(By.name("input_text_1")).sendKeys("hitech city");
		 * driver.findElement(By.name("numeric-field")).sendKeys("520003");
		 * driver.findElement(By.xpath("//option[@value='Andhra Pradesh']")).click();
		 * driver.findElement(By.xpath("//option[@value='Hyderabad']")).click();
		 * driver.findElement(By.xpath("//option[@value='Tours & Travels'][1]")).click()
		 * ; driver.findElement(By.xpath("//button[@type='submit']")).click();
		 */
		
		
		/*-------  Scroll               --------*/
		 WebElement el = driver.findElement(By.name("dropdown"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();",el );
		
		/*-------  Select Dropdown             --------*/
		Select s= new Select(driver.findElement(By.name("dropdown")));
		
		List<WebElement> options= s.getOptions();
		 
		int options_size = options.size();
        System.out.println(options_size);
        
        for(int i=0;i<=options_size;i++) {
        	
        	String opt_name = options.get(i).getText();
        	
        	System.out.println(opt_name);
        	if (opt_name.equals("Assam")) {
        		s.selectByVisibleText(opt_name);
         		
        		break;
        	}
        }
		
		




		

				

	}

}
