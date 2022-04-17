package drivers;

import configuration.WebConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;

public class ChromeDriverManager{

    public WebDriver createDriver(){
        ChromeOptions options = getChromeOptions();
        WebDriver driver = WebDriverManager.chromedriver()
                    .capabilities(options)
                    .create();

        return driver;
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-features=EnableEphemeralFlashPermission");
        options.addArguments("--disable-infobars");
        return options;
    }
}
