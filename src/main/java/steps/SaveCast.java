package steps;

import components.Imdb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.SQLOutput;

import static components.Imdb.*;

public class SaveCast {

    private WebDriver driver;

    public SaveCast(WebDriver driver) {
        this.driver = driver;
    }

    public void inExcelFile() {

        GetCastName getCastName = new GetCastName(driver);
        getCastName.castName();

        GetCastCharacter getCastCharacter = new GetCastCharacter(driver);
        getCastCharacter.castCharacter();


    }
}
