package runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Testing {

    public static void main(String[] args) throws MalformedURLException {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), firefoxOptions);
        driver.get("http://www.google.com");
//        driver.quit();
    }
}
