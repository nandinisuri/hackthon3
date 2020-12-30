package selenium003;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class feronextent {
	WebDriver driver;
	static ExtentTest test;
	static ExtentReports ex;
	 @Test
		public void feronextent() throws IOException {
		 ExtentReports ex = new ExtentReports(System.getProperty("user.dir")+"/test-output/Nandini1newReport.html");
            ExtentTest test =ex.startTest("Feron Dtatdriven");
		 
		 FileInputStream f= new FileInputStream("C:\\Users\\dell\\Desktop\\login2.xlsx");
			XSSFWorkbook x =new XSSFWorkbook(f);
			XSSFSheet sh=x.getSheet("Sheet1");
			
		

             test.log(LogStatus.PASS, "TEST PASSED");
              test.log(LogStatus.FAIL, "TEST FAILED");

             test.log(LogStatus.SKIP, "TEST SKIPPED");
                test.log(LogStatus.INFO, "TEST INFO");

               ex.endTest(test);
                ex.flush();


	 }
			 

}
