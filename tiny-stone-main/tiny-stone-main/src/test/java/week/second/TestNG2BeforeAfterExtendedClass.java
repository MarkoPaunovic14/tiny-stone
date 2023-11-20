package week.second;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestNG2BeforeAfterExtendedClass {

    @BeforeClass
    public void runBeforeClassExtended() {

        System.out.println("This is @beforeClass annotation from extended class.");

    }


    @AfterClass
    public void runAfterClassExtended(){

        System.out.println("This is @afterClass annotation from extended class.");
    }

}
