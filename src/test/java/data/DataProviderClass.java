package data;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderClass {

    @DataProvider(name = "searchAndSaveCastDataProvider")
    public Object[][] excelData() throws IOException {
        Object[][] data = new Object[1][3];

        FileInputStream fileInputStream = new FileInputStream("qaautomation.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet worksheet = workbook.getSheet("Input");

        XSSFRow row1 = worksheet.getRow(0);
        String googleUrl = row1.getCell(1).getStringCellValue();

        XSSFRow row2 = worksheet.getRow(1);
        String googleSearchInput = row2.getCell(1).getStringCellValue();

        XSSFRow row3 = worksheet.getRow(2);
        String linkTest = row3.getCell(1).getStringCellValue();

        data[0][0] = googleUrl;
        data[0][1] = googleSearchInput;
        data[0][2] = linkTest;

        return data;
    }
}
