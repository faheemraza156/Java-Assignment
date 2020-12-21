package test;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import steps.GoogleSearch;
import steps.ImdbCast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.testng.Assert.*;

public class SearchAndSaveCastTest extends BaseTest {

    @Test
    public void searchAndSaveCastTest() throws IOException {

        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchAfterLife();

        ImdbCast imdbCast = new ImdbCast(driver);
        imdbCast.save();

    }
}


