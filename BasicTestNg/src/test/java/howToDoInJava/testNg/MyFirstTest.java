package howToDoInJava.testNg;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * If @Test used at class level
 * all the public methods of a class will be considered as a test method
 * */
@Test                                         
public class MyFirstTest {
	
	  public void f1() {
	    	System.out.println(" test CALLED f1");
	    	System.out.println(" test CALLED f1");
	    	System.out.println(" test CALLED f1");
	    	System.out.println(" test CALLED f1");
	    	System.out.println(" test CALLED f1");
	    }
    
    public void f2() {
    	System.out.println(" test CALLED f2");
    	System.out.println(" test CALLED f2");System.out.println(" test CALLED f2");System.out.println(" test CALLED f2");System.out.println(" test CALLED f2");
    }
    
    @Test
    public void f3() {
    	System.out.println(" test CALLED f3");
    	System.out.println(" test CALLED f3");
    	System.out.println(" test CALLED f3");
    	System.out.println(" test CALLED f3");
    	System.out.println(" test CALLED f3");
    }
 
    @BeforeMethod
    public void beforeTest() {
    	System.out.println("Before test CALLED B1");
    }
 
    @AfterMethod
    public void afterTest() {
    	System.out.println("After test CALLED B1");
    }
}