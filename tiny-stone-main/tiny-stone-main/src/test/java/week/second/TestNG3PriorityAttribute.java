package week.second;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class TestNG3PriorityAttribute {


    @Test(priority = 1)
    public void cTest(){

        System.out.println("\nCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\n");

      //  fail();
    }

    @Test(priority = 2)
    public void aTest(){

        System.out.println("\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n");
    }

    @Test(priority = 3)
    public void bTest(){

        System.out.println("\nBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB\n");
    }
}
