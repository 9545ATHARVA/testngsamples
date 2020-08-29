package mypack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider1 {
    @DataProvider(name = "mydata")
    public Object[][] setUp() {
        return new Object[][]{
                {10, 20},
                {30, 40},
                {50, 60},
                {60, 70}
        };
    }

    @Test(dataProvider = "mydata")
    public void sum(int x, int y) {
        System.out.print("Sum is = " + (x + y));
    }

    @Test(dataProvider = "mydata")
    public void subtract(int x, int y) {
        System.out.println("Subtract is = " + (x - y));
    }

    @Test(dataProvider = "mydata")
    public void multiplication(int x, int y) {
        System.out.print("Sum is = " + (x * y));
    }


}
