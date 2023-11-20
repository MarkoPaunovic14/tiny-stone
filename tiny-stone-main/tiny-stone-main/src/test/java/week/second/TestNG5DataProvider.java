package week.second;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestNG5DataProvider {


    @Test()
    public void firstTest(){

        System.out.println("\nFIRST TEST STARTS!");

        int firstNum = 10;
        int secondNum = 20;

        int sum = addition( firstNum, secondNum);

        assertTrue(sum < 25,
                "Error! Sum is not less than 25!");


        System.out.println("The sum is: " + sum + "\n");
        System.out.println("\nFIRST TEST ENDS!");

    }

    @Test()
    public void secondTest(){

        System.out.println("\nSECOND TEST STARTS!");

        int firstNum = 10;
        int secondNum = 2;

        int sum = addition( firstNum, secondNum);

        assertTrue(sum < 25,
                "Error! Sum is not less than 25!");


        System.out.println("The sum is: " + sum + "\n");
        System.out.println("\nSECOND TEST ENDS!");

    }

    @Test()
    public void thirdTest(){

        System.out.println("\nTHIRD TEST STARTS!");

        int firstNum = -10;
        int secondNum = -20;

        int sum = addition( firstNum, secondNum);

        assertTrue(sum < 25,
                "Error! Sum is not less than 25!");


        System.out.println("The sum is: " + sum + "\n");
        System.out.println("\nTHIRD TEST ENDS!");

    }


    private int addition(int firstNum, int secondNum){

        return firstNum + secondNum;
    }

  //  @Test(dataProvider = "pairOfIntegers")
    public void dataProviderTest(int firstNum, int secondNum) throws InterruptedException {

        System.out.println("\nDATA PROVIDER TEST STARTS!");

     //   Thread.sleep(5000);

        int sum = addition( firstNum, secondNum);

        assertTrue(sum < 25,
                "Error! Sum is not less than 25!");


        System.out.println("The sum is: " + sum + "\n");
        System.out.println("\nDATA PROVIDER TEST ENDS!");

    }


    @DataProvider()//parallel = true)
    private Object[][] pairOfIntegers( ){

        return new Object[][] {
                {3, -2},
                {0, 0},
                {45, -87},
                {10, 25}
        };
    }

}
