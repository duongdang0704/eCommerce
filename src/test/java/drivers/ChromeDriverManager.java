package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
