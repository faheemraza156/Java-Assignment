package steps;

import components.Imdb;
import org.openqa.selenium.WebDriver;

public class Open {

    Imdb imdb = new Imdb();

    private WebDriver driver;
    public Open(WebDriver driver) {
        this.driver = driver;
    }

    public void fullCast() {
        driver.findElement(imdb.seeFullCastLink).click();
    }
}
