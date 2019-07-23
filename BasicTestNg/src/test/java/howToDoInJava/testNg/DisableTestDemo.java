package howToDoInJava.testNg;

import org.testng.annotations.Test;


public class DisableTestDemo {

	
	    @Test(enabled = true)
	    public void testMethodOne() {
	        System.out.println("Test method one.");
	    }
/*
 *  @Test(enabled = false) this can also be used at class level
 *  to disable all class methods
 * */	 
	    @Test(enabled = false)
	    public void testMethodTwo() {
	        System.out.println("Test method two.");
	    }
	 
	    @Test
	    public void testMethodThree() {
	        System.out.println("Test method three.");
	    }
	}

/*
 *Note:- enabled =false means it wont read @Test annotation on particular method 
 *
 *At class level if any method contains @Test in that class it will get executed
 * as it consider as normal class
 **/
