package steps;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class ImdbCast {
    private WebDriver driver;

    public ImdbCast(WebDriver driver) {
        this.driver = driver;
    }

    public void save() throws IOException {
        Open open = new Open(driver);
        open.fullCast();

        SaveCast saveCast = new SaveCast(driver);
        saveCast.inExcelFile();
    }
}
