package mypack;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;

public class TestDataProvider3 {
    @DataProvider(name = "mydataFromExcel")
    public Object[][] setUp() throws Exception {
        String path = System.getProperty("user.dir");
        File f = new File(path + "/src/test/resources/operations.xlsx");
        FileInputStream fi = new FileInputStream(f);
        Workbook wb = WorkbookFactory.create(fi);
        Sheet sh = wb.getSheetAt(0);
        Row r1 = sh.getRow(0);   // go to 1 st row
        int nour = sh.getPhysicalNumberOfRows(); // No.of used Rows in Sheet1
        int nouc = r1.getLastCellNum();  // get last Column Number
        Object[][] data = new Object[nour - 1][nouc]; // send required
        for (int i = 1; i < nour; i++)  // from 2 nd rows
        {

            Row r = sh.getRow(i);
            for (int j = 0; j < nouc; j++) {
                DataFormatter df = new DataFormatter();
                String value = df.formatCellValue(r.getCell(j));
                data[i - 1][j] = value;
            }
        }
        fi.close();
        wb.close();
        return data;
    }

    @Test(dataProvider = "mydataFromExcel")
    public void sum(String x, String y) {
        System.out.print("Sum is = " + (Integer.parseInt(x) + Integer.parseInt(y)));
    }

//    @Test(dataProvider = "mydataFromExcel")
//    public void subtract(String x, String y) {
//        System.out.println("Subtract is = " + (x - y));
//    }
}
