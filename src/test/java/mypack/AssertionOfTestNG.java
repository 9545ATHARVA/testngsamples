package mypack;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionOfTestNG {
    SoftAssert sa = new SoftAssert();

    @Test
    public void method1() {
        System.out.print("Test Method1 Pass");
        Assert.assertTrue(true);
    }

    @Test(description = "Method Description")
    public void method2() {
        sa.assertTrue(false);
        System.out.print("Test Method2 Pass");
        sa.assertAll();// collected failed scenario
    }
}
