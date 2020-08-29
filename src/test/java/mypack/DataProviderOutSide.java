package mypack;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderOutSide {


    @DataProvider(name = "mydata")
    @Test
    public  Object[][] setUp() {
        return new Object[][]{
                {10, 20},
                {30, 40},
                {50, 60},
                {60, 70}
        };
    }
}
