package week.second;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class TestNG3PriorityDependsOnMethod {


    @Test(dependsOnMethods = "bTest")
    public void cTest(){

        System.out.println("\nCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\n");
    }

    @Test(dependsOnMethods = "bTest")
    public void aTest(){

        System.out.println("\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n");
    }

    @Test
    public void bTest(){

        System.out.println("\nBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB\n");

      // fail();
    }


}
