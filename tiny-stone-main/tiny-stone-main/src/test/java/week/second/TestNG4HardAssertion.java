package week.second;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestNG4HardAssertion {


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
        int secondNum = 20;

        int sum = addition( firstNum, secondNum);

        assertFalse(sum < 25,
                "Error! Sum is not greater than 25!");


        System.out.println("The sum is: " + sum + "\n");
        System.out.println("\nSECOND TEST ENDS!");


    }

    @Test()
    public void thirdTest(){

        System.out.println("\nTHIRD TEST STARTS!");

        int firstNum = 20;
        int secondNum = 20;


        assertEquals(firstNum, secondNum,
                "Error! Given numbers are not equal!");


        System.out.println("Given numbers are equal!\n");
        System.out.println("\nTHIRD TEST ENDS!");


    }

    private int addition(int firstNum, int secondNum){

        return firstNum + secondNum;
    }

}
