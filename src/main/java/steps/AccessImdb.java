//package steps;
//
//import components.Imdb;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//
//public class AccessImdb {
//    private WebDriver driver;
//    Imdb imdb = new Imdb();
//
//    public AccessImdb(WebDriver driver){
//        this.driver = driver;
//    }
//
//    public void openImdbLink(){
//        Actions action = new Actions(driver);
//        action.contextClick(driver.findElement(imdb.imdbLink)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//    }
//
//    public void seeFullCast(){
//        driver.findElement(imdb.seeFullCastLink).click();
//    }
//}
