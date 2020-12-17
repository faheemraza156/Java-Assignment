package steps;

import org.openqa.selenium.WebDriver;

public class ImdbCast {
    private WebDriver driver;

    public ImdbCast(WebDriver driver) {
        this.driver = driver;
    }

    public void save() {

        ImdbLink imdbLink = new ImdbLink(driver);
        imdbLink.click();

        Open open = new Open(driver);
        open.fullCast();

        SaveCast saveCast = new SaveCast(driver);
        saveCast.inExcelFile();

    }
}
