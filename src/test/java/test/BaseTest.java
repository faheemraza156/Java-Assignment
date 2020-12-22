package test;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() throws IOException
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();

        InternetConnectivity internet = new InternetConnectivity(driver);
        internet.isConnected();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
