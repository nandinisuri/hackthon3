package selenium003;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ferondatadriven {
	WebDriver driver;


	
	@Test(priority=0)
	public void datadrivernlogin() throws IOException {
		 
		FileInputStream f= new FileInputStream("C:\\Users\\dell\\Desktop\\login2.xlsx");
		XSSFWorkbook x =new XSSFWorkbook(f);
		XSSFSheet sh=x.getSheet("Sheet1");
		
		//Writing into excel
		sh.getRow(0).createCell(2).setCellValue("STATUS");
		sh.getRow(1).createCell(2).setCellValue("FERONFAIL");
		
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\dell\\Desktop\\login2.xlsx");
		x.write(fout);
		x.close();
		
	}
		
		@Test(priority=1)
		public void TestSetup() throws InterruptedException, IOException
		 
		{
		
			System.setProperty("webdriver.chrome.driver", "E:\\seleniumFiles\\Drivers\\chromedriver.exe");
			
			driver =new ChromeDriver();
		     
		  
		    driver.get("http://grepthorhosting.com/feron");
		    driver.manage().window().maximize();
		     
		    Thread.sleep(5000);
		    		  
		    FileInputStream f= new FileInputStream("C:\\Users\\dell\\Desktop\\login2.xlsx");
			try (XSSFWorkbook x = new XSSFWorkbook(f)) {
				XSSFSheet sh=x.getSheet("Sheet1");
				
				int rc=sh.getLastRowNum();
				
			
				//String row1=sh.getRow(0).getCell(0).getStringCellValue();
				//String cell03=sh.getRow(0).getCell(2).getStringCellValue();
				//String cell13=sh.getRow(1).getCell(2).getStringCellValue();
				//String cell12=sh.getRow(1).getCell(1).getStringCellValue();
				//String row2=sh.getRow(1).getCell(0).getStringCellValue();
				
				for(int i=0; i<=rc; i++) {
				 System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
				 System.out.println(sh.getRow(i).getCell(1).getStringCellValue()); 
		
				driver.findElement(By.name("email")).sendKeys(sh.getRow(i+1).getCell(0).getStringCellValue());
				driver.findElement(By.name("password")).sendKeys(sh.getRow(i+1).getCell(1).getStringCellValue());
				driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			
				Thread.sleep(3000);

				 Alert alert = driver.switchTo().alert();
					String aa=alert.getText();
					System.out.println(aa);
					alert.accept();

				

					
			}
				
			/*
			 * File screenshot = ((TakesScreenshot)
			 * driver).getScreenshotAs(OutputType.FILE);
			 * 
			 * //Copy the file to a location and use try catch block to handle exception try
			 * { FileUtils.copyFile(screenshot, new
			 * File("C:\\projectScreenshots\\homePageScreenshot.png")); } catch (IOException
			 * e) { System.out.println(e.getMessage()); }
			 */
				/*
				try {
					TakesScreenshot ts = (TakesScreenshot)driver;
					File source = ts.getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
				} catch (WebDriverException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				
		}
		}}
		
		
		
