package runners;

import configuration.WebConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestRemote {

    public static void main(String[] arg){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/"), chromeOptions);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setCapability("browserVersion", "67");
//        chromeOptions.setCapability("platformName", "Windows XP");
//        WebDriver driver = new RemoteWebDriver(new URL("http://www.example.com"), chromeOptions);
//        driver.get("http://www.google.com");
//        driver.quit();

        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
