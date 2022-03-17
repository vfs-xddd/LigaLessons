package lesson_9.HomeWork;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class LastClass {

    @BeforeTest
    public void bTest() {
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void aTest() {
        System.out.println("AfterTest");
    }

    @Test
    public void test_1() {
        System.out.println("Test");
    }

    @AfterMethod
    public void aMethodTestData() {
        System.out.println("AfterMethod");
    }


}
