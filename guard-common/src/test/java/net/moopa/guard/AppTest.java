package net.moopa.guard;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

/**
 * Junit4 test for simple App.
 */
public class AppTest
{

    @Before
    public void beforeTest(){
        System.out.println("Before test...");
    }

    @After
    public void afterTest(){
        System.out.println("After test...");
    }
    /**
     * Create test case
     */
    public AppTest(){

    }

    /**
     * Test method
     */
    @Test
    public void test(){
        System.out.println("Test successfully.");
    }
}
