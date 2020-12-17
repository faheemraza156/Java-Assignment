package steps;

import org.openqa.selenium.WebDriver;

public class GoogleSearch {

    private WebDriver driver;
    public GoogleSearch(WebDriver driver) {
        this.driver = driver;
    }

    public void searchAfterLife() {
        SearchAfterLife search = new SearchAfterLife(driver);
        search.searchInput("After Life");
    }
}
