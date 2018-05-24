package test;

import org.testng.annotations.Test;

public class Test1 {
	  @Test(groups = { "functest", "checkintest" })
	  public void testMethod1() {
		  System.out.println("called "+1);
	  }
	 
	  @Test(groups = {"functest", "checkintest"} )
	  public void testMethod2() {
		  System.out.println("called "+2);
	  }
	 
	  @Test(groups = { "functest" })
	  public void testMethod3() {
		  System.out.println("called "+23);
	  }
	}
