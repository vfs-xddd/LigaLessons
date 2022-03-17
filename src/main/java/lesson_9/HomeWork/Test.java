package lesson_9.HomeWork;

import org.testng.annotations.*;

import static lesson_9.HomeWork.DataProvaiders.*;


public class Test extends ParentTest {

    @BeforeClass(groups = { "default" })
    public void bClass() {
        System.out.println("BeforeClass");
    }

    @AfterMethod(groups = {"after"}, onlyForGroups = {"after"})
    public void aMethodDefault() {
        System.out.println("AfterMethod");
    }

    @AfterMethod(groups = {"default"}, onlyForGroups = {"testDataInt"})
    public void aMethodTestDataInt(Object[] parameters) {
        //тут делаем дополнительный AfterMethod для Test data: 1 2
        if (parameters[0] instanceof Integer && (int) parameters[0]==2) System.out.println("AfterMethod");
    }

    @AfterMethod(groups = {"after"}, onlyForGroups = "TestData")
    public void aMethodTestData(Object[] parameters) {
        //      parameters[0] - текущее переданное значение из  @DataProvider в Тест
        //providerInt()[1][0] - второе из отдаваемых значений провайдера ({1, 2} будет 2)
        if ( parameters[0]== providerInt()[1][0] |
             parameters[0]== providerStr()[1][0] |
             parameters[0]==providerBool()[1][0] )
        {System.out.println("AfterMethod");}
    }

    @AfterClass(groups = "g2")
    public void aClass() {
        System.out.println("AfterClass");
    }

    @org.testng.annotations.Test(groups = { "default", "after" })
    public void test_1() {
        System.out.println("Test");
    }

    @org.testng.annotations.Test(groups = { "default" }, dependsOnMethods = "test_1")
    public void test_2() {
        System.out.println("Test");
    }

    @org.testng.annotations.Test(groups = { "default" }, dependsOnMethods = "test_2")
    public void test_3() {
        System.out.println("Test");
    }

    @org.testng.annotations.Test(groups = { "default" }, dependsOnMethods = "test_3")
    public void test_4() {
        System.out.println("Test");
    }

    @org.testng.annotations.Test(groups = { "default", "TestData", "testDataInt"}, dataProvider = "dataInt",  dataProviderClass = DataProvaiders.class, dependsOnMethods = "test_2")
    public void testDataInt (int val) {
        System.out.println("Test data: " + val);
    }

    @org.testng.annotations.Test(groups = { "default", "TestData"}, dataProvider = "dataStr", dataProviderClass = DataProvaiders.class, dependsOnMethods = "test_3")
    public void testDataStr (String val) {
        System.out.println("Test data: " + val);
    }

    @org.testng.annotations.Test(groups = { "default", "TestData"}, dataProvider = "dataBool",  dataProviderClass = DataProvaiders.class,dependsOnMethods = "test_4")
    public void testDataBool (Boolean val) {
        System.out.println("Test data: " + val);
    }



}
