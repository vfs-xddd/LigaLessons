package lesson_9.HomeWork;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class ParentTest {

    @BeforeSuite(groups = "default")
    public void bSuite() {
        System.out.println("BeforeSuite");
    }

    @Test(groups = "g2")
    public void test_1p() {
        System.out.println("Test");
    }

    @AfterClass(groups = "g2")
    public void aClassP() {
        System.out.println("AfterClass");
    }

    @AfterTest(groups = "g2")
    public void aTest() {
        System.out.println("AfterTest");
    }

    @AfterSuite(groups = "default")
    public void aSuite() {
        System.out.println("AfterSuite");
    }
}
