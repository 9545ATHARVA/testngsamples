package mypack;

import org.testng.annotations.*;

public class ExcecutionFlowForAnnotations {


    @BeforeTest
    public void method1() {
        System.out.print("---Before Test-----");
    }

    @AfterTest
    public void method2() {
        System.out.print("---After Test-----");
    }

    @BeforeMethod
    public void method3() {
        System.out.print("---Before Method-----");
    }

    @AfterMethod
    public void method4() {
        System.out.print("---After Method-----");
    }

    @BeforeClass
    public void method5() {
        System.out.print("---Before Class-----");
    }

    @AfterClass
    public void method6() {
        System.out.print("---After Class-----");
    }

    @BeforeSuite
    public void method7() {
        System.out.print("---Before Suite-----");
    }

    @AfterSuite
    public void method8() {
        System.out.print("---After Suite-----");
    }

    @Test
    public void method9() {
        System.out.print("---Test Method1-----");
    }

    @Test
    public void method10() {
        System.out.print("---Test Method2-----");
    }

}
