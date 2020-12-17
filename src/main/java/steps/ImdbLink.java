package steps;

import components.Imdb;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ImdbLink {

    Imdb imdb = new Imdb();

    private WebDriver driver;
    public ImdbLink(WebDriver driver) {
        this.driver = driver;
    }

    public void click() {
        Actions action = new Actions(driver);
//        action.contextClick(driver.findElement(imdb.imdbLink)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        driver.findElement(imdb.imdbLink).click();
    }
}
