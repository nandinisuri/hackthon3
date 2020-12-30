package com.qa.testcases;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qaTestBase.TestBase;

public class Next_login extends TestBase{
	
	public Next_login()
	{
		super();
	}
	
	@BeforeMethod
	@Parameters("browser")
	
	public void Start_intialisation (String browser) {
		
		Reporter.log("broswer",true);
		
		//OPEN BROWSER //
		GetURL(config.getProperty("URL"));
		
		
		
		
		
		
	}
	

}
