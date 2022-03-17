package lesson_9.HomeWork;

import org.testng.annotations.DataProvider;

public class DataProvaiders {

    @DataProvider(name = "dataInt")
    public static Object[][] providerInt() {
        return new Object[][] {{1}, {2}};
    }

    @DataProvider(name = "dataStr")
    public static Object[][] providerStr() {
        return new Object[][] {{"three"}, {"four"}};
    }

    @DataProvider(name = "dataBool")
    public static Object[][] providerBool() {
        return new Object[][] {{true}, {false}};
    }
}
