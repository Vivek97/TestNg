package howToDoInJava.testNg;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

public class ExceptionTestDemo
{
    @Test(expectedExceptions = { IOException.class })
    public void exceptionTestOne() throws Exception {
        throw new IOException();
    }
 
    @Test(expectedExceptions = { IOException.class, NullPointerException.class })
    public void exceptionTestTwo() throws Exception {
        throw new Exception();
    }
    
    @Test(expectedExceptions = { IOException.class, NullPointerException.class })
    public void exceptionTest() throws Exception {
        System.out.println("In exception 1");
        System.out.println("In exception 31");
        System.out.println("In exception 331");
        System.out.println("In exception 3331");
        
        
    }
    
    // If unexpected exception comes or expected exception doesn't come then
    // Test failed
    
}