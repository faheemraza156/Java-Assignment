package test;

import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class InternetConnectivity {
    private WebDriver driver;
    public InternetConnectivity(WebDriver driver) {
        this.driver = driver;
    }

    public void isConnected() throws IOException {
        try {
            URL url = new URL("https://www.google.com/");
            URLConnection urlConnection = url.openConnection();
            urlConnection.connect();
        }
        catch (Exception i){
            System.out.println("Internet Connectivity is compromised");
            driver.quit();
        }
    }
}
