package steps;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;

public class GoogleSearch {

    private WebDriver driver;
    public GoogleSearch(WebDriver driver) {
        this.driver = driver;
    }

    public void searchAfterLife() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("qaautomation.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet worksheet = workbook.getSheet("Input");
        XSSFRow row = worksheet.getRow(1);

        SearchAfterLife search = new SearchAfterLife(driver);
        search.searchInput(row.getCell(1).getStringCellValue());
    }
}
