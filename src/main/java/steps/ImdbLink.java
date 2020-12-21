package steps;

import components.Imdb;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import utils.GetByObject;

import java.io.FileInputStream;
import java.io.IOException;

public class ImdbLink {

    Imdb imdb = new Imdb();

    private WebDriver driver;
    public ImdbLink(WebDriver driver) {
        this.driver = driver;
    }

    public void click() throws IOException {
//        Actions action = new Actions(driver);
//        action.contextClick(driver.findElement(imdb.imdbLink)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        FileInputStream fileInputStream = new FileInputStream("qaautomation.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet worksheet = workbook.getSheet("Input");
        XSSFRow row = worksheet.getRow(2);

        String cellValue = row.getCell(1).getStringCellValue();
        driver.findElement(GetByObject.containingText(cellValue)).click();




    }
}
