package week.second;


import org.testng.annotations.*;

import static org.testng.Assert.*;

public class TestNG2BeforeAfterAnnotation { //extends TestNG2BeforeAfterExtendedClass {


    @BeforeClass
    public void runBeforeClass() {

        System.out.println("\nThis is @beforeClass annotation.");

        //fail();
    }


    @AfterClass()//alwaysRun = true)
    public void runAfterClass(){

        System.out.println("\nThis is @afterClass annotation.");
    }


    @BeforeMethod
    public void runBeforeMethod(){

        System.out.println("\nThis is @beforeMethod annotation.");
    }

    @AfterMethod
    public void runAfterMethod(){

        System.out.println("\nThis is @afterMethod annotation.");
    }


    @Test(description = "dfdsfsdfs")
    public void firstTest(){

        System.out.println("\nFIRST TEST STARTS!");

        System.out.println("This is the first test!");

        System.out.println("\nFIRST TEST ENDS!");
    }


    @Test
    public void secondTest(){

        System.out.println("\nSECOND TEST STARTS!");

        System.out.println("This is the second test!");

        System.out.println("\nSECOND TEST ENDS!");
    }

}
