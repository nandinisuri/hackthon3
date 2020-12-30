package selenium003;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngbasics {
	
	
	/*
	 * @BeforeMethod public void startexecution() {
	 * System.out.println("execute before method"); }
	 * 
	 * @Test public void st() { System.out.println("execute main method"); }
	 * 
	 * @AfterMethod public void teardown() {
	 * System.out.println("execute teardown method"); }
	 * 
	 * 

	 * 
	 */
	
	
	
	@Test    
	public void B() {
		System.out.println("b");
		
	}
	@Test
	public void A() {
		System.out.println("a");
		
	}
	
}




