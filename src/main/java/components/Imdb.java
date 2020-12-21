package components;

import org.openqa.selenium.By;
import steps.SaveCast;

public class Imdb {
    public static final By SEE_FULL_CAST_LINK = By.xpath("//a[@href='fullcredits?ref_=tt_cl_sm#cast']");

    public static final String XpathCastName = "//table[@class='cast_list']//tr[%s]//td[2]";

    public static final String XpathCastAppearance = "//table[@class='cast_list']//tr[%s]//td[4]//a[2]";

    public static final String XpathScreenName = "//table[@class='cast_list']//tr[%s]//td[4]//a[1]";
}