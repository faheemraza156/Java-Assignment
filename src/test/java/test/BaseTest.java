package test;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;

public class BaseTest {

    protected WebDriver driver;


    @BeforeClass
    public void setUp() throws IOException
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();

        FileInputStream fileInputStream = new FileInputStream("qaautomation.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet worksheet = workbook.getSheet("Input");
        XSSFRow row = worksheet.getRow(0);

        driver.get(row.getCell(1).getStringCellValue());

        driver.manage().window().fullscreen();

    }

}
