package selenium003;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngpractice {
	
	
	 @BeforeMethod public void startexecution() {
		 System.out.println("execute before method"); }
	 
	 @Test public void F() {
		 System.out.println("f");
		 }
	 @Test public void K() {
		 System.out.println("k");
	 }
		 @Test public void B() {
			 System.out.println("b");
		 }
		 @Test public void G() {
			 System.out.println("g");
		 }
		 @AfterMethod public void teardown() {
       System.out.println("execute teardown method");
		 }


		 
		 
		 
		 
		 
		 
	 
	 }

