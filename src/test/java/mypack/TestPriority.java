package mypack;

import org.testng.annotations.Test;

public class TestPriority {

    @Test
    public void method1() {
        System.out.println("Test Method1 Passed");
    }

    @Test(priority = 1)
    public void method2() {
        System.out.println("Test Method2 Passed");
    }

    @Test(priority = -1)
    public void method3() {
        System.out.println("Test Method3 Passed");
    }

    @Test
    public void method4() {
        System.out.println("Test Method4 Passed");
    }

    @Test(priority = 0)
    public void method5() {
        System.out.println("Test Method5 Passed");
    }
}
