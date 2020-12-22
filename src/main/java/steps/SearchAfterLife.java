package steps;

import org.openqa.selenium.WebDriver;

import static components.GoogleSearchFeild.GOOGLE_SEARCH;
import static components.GoogleSearchFeild.SEARCH_FEILD;

public class SearchAfterLife {
    private WebDriver driver;

    public SearchAfterLife(WebDriver driver) {
        this.driver = driver;
    }


    public void using(String input){
        driver.findElement(SEARCH_FEILD).click();
        driver.findElement(SEARCH_FEILD).sendKeys(input);
        driver.findElement(GOOGLE_SEARCH).click();
    }
}
