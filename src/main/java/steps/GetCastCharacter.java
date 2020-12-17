package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static components.Imdb.*;

public class GetCastCharacter {

    private WebDriver driver;
    public GetCastCharacter(WebDriver driver) {
        this.driver = driver;
    }

    public void castCharacter() {

        for(int i = 2; i < 116; i=i+2){
            String actualXpathCastCharacter = getBeforeXpathCastCharacter +i+ getAfterXpathCastCharacter;
            System.out.println(driver.findElement(By.xpath(actualXpathCastCharacter)).getText());
        }

        for(int i = 117; i <= 134; i=i+2)
        {
            String actualXpathCastCharacter = getBeforeXpathCastCharacter +i+ getAfterXpathCastCharacter;
            System.out.println(driver.findElement(By.xpath(actualXpathCastCharacter)).getText());
        }

    }
}
