package test;

import data.DataProviderClass;

import org.testng.annotations.Test;
import steps.GoogleSearch;
import steps.ImdbCast;
import steps.ImdbLink;

import java.io.*;

public class SearchAndSaveCastTest extends BaseTest {

    @Test(dataProvider = "searchAndSaveCastDataProvider", dataProviderClass = DataProviderClass.class)
    public void searchAndSaveCastTest(String googleUrl, String googleSearchText, String linkText) throws IOException {

        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.open(googleUrl);
        googleSearch.usingText(googleSearchText);

        ImdbLink imdbLink = new ImdbLink(driver);
        imdbLink.clickUsing(linkText);

        ImdbCast imdbCast = new ImdbCast(driver);
        imdbCast.save();
    }
}


