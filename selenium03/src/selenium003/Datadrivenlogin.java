package selenium003;

import org.openqa.selenium.By;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenlogin {
WebDriver driver;


	@BeforeTest
	 public void TestSetup() throws InterruptedException
	 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
		
		driver =new ChromeDriver();
	     
	  
	    driver.get("http://foodynest.com/nextclick/auth/login");
	    driver.manage().window().maximize();
	     
	    Thread.sleep(3000);
	}	
	//Data driven 
	@Test
	public void datadrivernlogin() throws IOException {
		
		FileInputStream f= new FileInputStream("C:\\Users\\dell\\Desktop\\login.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		int rc=sh.getLastRowNum();
		
		String row1=sh.getRow(0).getCell(0).getStringCellValue();
		String col2=sh.getRow(1).getCell(1).getStringCellValue();
		String row2=sh.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(rc+"   "+row1+"  "+ row2+   col2 );
		driver.findElement(By.id("email")).sendKeys(row2);
		driver.findElement(By.name("password")).sendKeys(col2);
		driver.findElement(By.xpath("//button[contains(text(),' Login')]")).click();
		

		}
}
