package components;

import org.openqa.selenium.By;
import steps.SaveCast;

public class Imdb {

    public By imdbLink = By.xpath("//a[@href='https://www.imdb.com/title/tt8398600/']");
    public By seeFullCastLink = By.xpath("//a[@href='fullcredits?ref_=tt_cl_sm#cast']");

    public static final By CAST_NAME = By.xpath("//*[@id=\"fullcredits_content\"]/table[3]/tbody/tr[2]/td[2]");
    public static final By castCharacter = By.xpath("//*[@id=\"fullcredits_content\"]/table[3]/tbody/tr[2]/td[4]");

    public static final String beforeXpathCastName = "//*[@id=\"fullcredits_content\"]/table[3]/tbody/tr[";
    public static final String afterXpathCastName = "]/td[2]";

    public static final String getBeforeXpathCastCharacter = "//*[@id=\"fullcredits_content\"]/table[3]/tbody/tr[";
    public static final String getAfterXpathCastCharacter = "]/td[4]";
}
