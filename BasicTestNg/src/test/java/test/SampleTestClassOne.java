package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTestClassOne {
	
	

	 @BeforeSuite
	 public void beforeSuite()
	 {
		 System.out.println("Before Suite called from "+this.getClass().getSimpleName());
	 }

	 
	  @AfterSuite
		 public void afterSuite()
		 {
			 System.out.println("After Suite called from "+this.getClass().getSimpleName());
		 }
	    
	
	 
	 @BeforeTest
	 public void beforeTest()
	 {
		 System.out.println("Before test called from "+this.getClass().getSimpleName());
	 }

	 
	  @AfterTest
		 public void afterTest()
		 {
			 System.out.println("After test called from "+this.getClass().getSimpleName());
		 }
	    
	    
		  @BeforeClass
			 public void beforeClass()
			 {
				 System.out.println("Before Class called from "+this.getClass().getSimpleName());
			 }

			 
			  @AfterClass
				 public void afterClass()
				 {
					 System.out.println("After Class called from "+this.getClass().getSimpleName());
				 }

	    
	  @Test
	  public void ClassOneTestOne() {
		  System.out.println("11");
	    Assert.assertTrue(true);
	  }
	  
	  @Test
	  public void ClassOneTestTwo() {
		  System.out.println("12");
		  Assert.fail();
	  }
	  
	  @Test
	  public void ClassOneTestThree() {
		  System.out.println("13");
		  Assert.assertTrue(true);
		  
	  }
	  
	  @Parameters({ "first-name" })
	  @Test
	  public void testSingleString(String firstName) {
	    System.out.println("Invoked testString " + firstName);
	    assert "Cedric".equals(firstName);
	  }

	  
	  
	}
