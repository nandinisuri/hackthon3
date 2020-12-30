package selenium003;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class DataDriven 
{

	
	//Data driven 
	@Test
	public void datadrivern() throws IOException {
	FileInputStream f= new FileInputStream("C:\\Users\\dell\\Desktop\\datadriven.xlsx");
	XSSFWorkbook wb =new XSSFWorkbook(f);
	XSSFSheet sh=wb.getSheet("Sheet1");
	
	int rc=sh.getLastRowNum();
	
	String row1=sh.getRow(0).getCell(0).getStringCellValue();
	String row2=sh.getRow(1).getCell(0).getStringCellValue();
	System.out.println(rc+"   "+row1+"  "+ row2  );

	}
}