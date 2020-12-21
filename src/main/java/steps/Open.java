package steps;

import components.Imdb;
import org.openqa.selenium.WebDriver;

import static components.Imdb.SEE_FULL_CAST_LINK;

public class Open {
    private WebDriver driver;

    public Open(WebDriver driver) {
        this.driver = driver;
    }

    public void fullCast() {
        driver.findElement(SEE_FULL_CAST_LINK).click();
    }
}
