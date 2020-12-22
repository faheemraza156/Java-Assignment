package steps;

import org.openqa.selenium.WebDriver;
import utility.GetByObject;

public class ImdbLink {
    private WebDriver driver;
    public ImdbLink(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUsing(String linkText) {
        driver.findElement(GetByObject.containingText(linkText)).click();
    }
}
