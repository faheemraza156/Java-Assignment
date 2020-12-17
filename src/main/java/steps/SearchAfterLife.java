package steps;

import components.Google;
import org.openqa.selenium.WebDriver;

public class SearchAfterLife {
    private WebDriver driver;

    public SearchAfterLife(WebDriver driver) {
        this.driver = driver;
    }


    public void searchInput(String input){
        Google googlesearch = new Google();
        driver.findElement(googlesearch.searchFeild).click();
        driver.findElement(googlesearch.searchFeild).sendKeys(input);
        driver.findElement(googlesearch.googleSearch).click();
    }
}
