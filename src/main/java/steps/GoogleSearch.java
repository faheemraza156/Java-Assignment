package steps;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class GoogleSearch {

    private WebDriver driver;
    public GoogleSearch(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String googleUrl) {
        driver.get(googleUrl);
    }

    public void usingText(String searchText) {
        SearchAfterLife search = new SearchAfterLife(driver);
        search.using(searchText);
    }
}
