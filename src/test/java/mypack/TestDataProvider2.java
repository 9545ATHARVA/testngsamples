package mypack;

import org.testng.annotations.Test;

public class TestDataProvider2 {


    @Test(dataProvider = "mydata", dataProviderClass = DataProviderOutSide.class)
    public void sum(int x, int y) {
        System.out.print("Sum is = " + (x + y));
    }

    @Test(dataProvider = "mydata", dataProviderClass = DataProviderOutSide.class)
    public void subtract(int x, int y) {
        System.out.print("Subtract is = " + (x - y));
    }
}
