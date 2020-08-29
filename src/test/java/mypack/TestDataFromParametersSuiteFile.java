package mypack;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;

public class TestDataFromParametersSuiteFile {


    @Test
    @Parameters({"x", "y"})
    public void sum(String x, String y) {
        System.out.print("Sum is = " + (Integer.parseInt(x) + Integer.parseInt(y)));
    }

    @Test
    @Parameters({"x", "y"})
    public void subtract(String x, String y) {
        System.out.println("Subtract is = " + (Integer.parseInt(x) - Integer.parseInt(y)));
    }
}
