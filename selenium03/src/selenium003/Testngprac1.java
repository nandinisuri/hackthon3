package selenium003;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class Testngprac1 {
	
	
	 @Test(priority = 1) 
	 public void E() {
		 
		 Reporter.log("E Method execute",true);
		 
		 assertEquals("actual title", "expected title");
		 }
	 @Test (priority = 4,enabled = false)
	 public void K() {
		 System.out.println("k");
		 Reporter.log("K Method execute");
	 }
		 @Test(priority = 2) 
		 public void N() {
			 System.out.println("n");
			 Reporter.log("N Method execute");
		 }
		 @Test (priority = 3)
		 public void G() {
			 System.out.println("g");
			 Reporter.log("G Method execute");
			 }
		
		 

		
	

}
