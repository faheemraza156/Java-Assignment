package utility;

import org.openqa.selenium.By;

public class GetByObject {
    public static By containingText(String cellValue) {
        String xpathString = "//span[text()='%s']";
        String formattedXpathString = String.format(xpathString, cellValue);
        return By.xpath(formattedXpathString);
    }
}
