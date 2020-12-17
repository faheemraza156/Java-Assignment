package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static components.Imdb.afterXpathCastName;
import static components.Imdb.beforeXpathCastName;

public class GetCastName {

    private WebDriver driver;
    public GetCastName(WebDriver driver) {
        this.driver = driver;
    }


    public void castName() {
//        for(int i = 2; i < 116; i=i+2){
//            String actualXpathCastName = beforeXpathCastName +i+ afterXpathCastName;
//            System.out.println(driver.findElement(By.xpath(actualXpathCastName)).getText());
//        }
//
//        for(int i = 117; i <= 134; i=i+2)
//        {
//            String actualXpathCastName = beforeXpathCastName +i+ afterXpathCastName;
//            System.out.println(driver.findElement(By.xpath(actualXpathCastName)).getText());
//        }
//        System.out.println(driver.findElement(By.xpath(actualXpathCastName)).getText());
    }
}
