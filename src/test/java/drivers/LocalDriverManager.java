package drivers;

import org.openqa.selenium.WebDriver;

public class LocalDriverManager {

    public WebDriver createDriver(String browser){
        WebDriver driver = null;
        switch (browser){
            case "chrome":
                driver = new ChromeDriverManager().createDriver();
                break;
            case "firefox":
                driver = new FirefoxDriverManager().createDriver();
                break;
            default:
                break;

        }
        return driver;
    }
}
