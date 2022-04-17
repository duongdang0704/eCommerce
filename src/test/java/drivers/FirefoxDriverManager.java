package drivers;

import configuration.WebConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static io.github.bonigarcia.wdm.config.DriverManagerType.FIREFOX;

public class FirefoxDriverManager{

    public WebDriver createDriver(){
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = WebDriverManager.firefoxdriver()
                .capabilities(options)
                .create();

        return driver;
    }

}
