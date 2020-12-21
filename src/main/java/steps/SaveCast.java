package steps;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static components.Imdb.*;

public class SaveCast {

    private WebDriver driver;

    public SaveCast(WebDriver driver) {
        this.driver = driver;
    }

    public void inExcelFile() throws IOException {



        FileInputStream fileInputStream = new FileInputStream("qaautomation.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet worksheet = workbook.getSheet("Series Cast");


        List<String> castNameList = new ArrayList<String>();
        List<String> castScreenNameList = new ArrayList<String>();
        List<String> castAppearanceList = new ArrayList<String>();

        for(int i = 2; i<96; i=i+2) {
            String castName = "";
            String castScreenName = "";
            String castAppearance = "";

            String actualXpathCastName = String.format(XpathCastName, i);
            castName = driver.findElement(By.xpath(actualXpathCastName)).getText();

            String actualXpathScreenName = String.format(XpathScreenName, i);
            castScreenName = driver.findElement(By.xpath(actualXpathScreenName)).getText();

            String actualXpathCastAppearance = String.format(XpathCastAppearance, i);
            castAppearance = driver.findElement(By.xpath(actualXpathCastAppearance)).getText();


            castNameList.add(castName);
            castScreenNameList.add(castScreenName);
            castAppearanceList.add(castAppearance);

        }

        for(int i=0; i<castNameList.size();i++){
            XSSFRow firstRow = worksheet.createRow(i+2);

            XSSFCell firstCell = firstRow.createCell(0);
            firstCell.setCellValue(castNameList.get(i));

            XSSFCell secondCell = firstRow.createCell(1);
            secondCell.setCellValue(castScreenNameList.get(i));

            XSSFCell thirdCell = firstRow.createCell(2);
            thirdCell.setCellValue(castAppearanceList.get(i));
        }

        FileOutputStream fileOutputStream = new FileOutputStream("qaautomation.xlsx");
        workbook.write(fileOutputStream);

    }
}


