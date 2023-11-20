package week.second;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestNG5Parameters {

    @Parameters({"firstNumber", "secondNumber"})

    @Test
    public void parametersTest(int firstNum, int secondNum) {

        System.out.println("\nPARAMETERS TEST STARTS!");

        int sum = addition( firstNum, secondNum);

        assertTrue(sum < 25,
                "Error! Sum is not less than 25!");


        System.out.println("The sum is: " + sum + "\n");
        System.out.println("\nPARAMETERS TEST ENDS!");

    }

    private int addition(int firstNum, int secondNum){

        return firstNum + secondNum;
    }

}
