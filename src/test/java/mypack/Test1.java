package mypack;

import org.testng.annotations.Test;

public class Test1 {
    @Test
    public void method1() {
        System.out.print("Test Method1 Pass");
    }

    @Test(description = "Method Description")
    public void method2() {
        System.out.print("Test Method2 Pass");
    }

    @Test(dependsOnMethods = "method2")
    public void method3() {
        System.out.print("Test Method3 Pass");
    }

    @Test(enabled = false)  // This method is skip from Execution
    public void method4() {
        System.out.println("Test Method4 Pass");
    }
}
