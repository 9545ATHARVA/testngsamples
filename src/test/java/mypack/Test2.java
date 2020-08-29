package mypack;


import org.testng.annotations.Test;

public class Test2 {

    @Test(expectedExceptions = ArithmeticException.class)
    public void method1() {
        System.out.println(10 / 0);
    }

    @Test(timeOut = 5000)
    public void method2() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Test Method2 Passed");
    }

    @Test(invocationCount = 5, successPercentage = 80, invocationTimeOut = 5000)
    public void method3() {
        System.out.println("Test Method3 Passed");
    }

}
