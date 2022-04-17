package drivers;

import org.openqa.selenium.WebDriver;

public class DriverUtils {
    private static WebDriver driver;

    public static void setDriver(WebDriver webdriver) {
        if (driver == null) {
            driver = webdriver;
        }
    }
    public static WebDriver getDriver() {
        if (driver == null) {
            throw new AssertionError("Driver is null. Initialize driver before calling this method.");
        }
        return driver;
    }
}