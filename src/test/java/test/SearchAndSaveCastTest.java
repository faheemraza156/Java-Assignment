package test;

import org.testng.annotations.Test;
import steps.GoogleSearch;
import steps.ImdbCast;

public class SearchAndSaveCastTest extends BaseTest {

    @Test
    public void searchAndSaveCastTest() {

        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchAfterLife();

        ImdbCast imdbCast = new ImdbCast(driver);
        imdbCast.save();

    }
}


