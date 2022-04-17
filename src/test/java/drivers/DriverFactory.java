package drivers;

import configuration.WebConfig;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver initDriver() {
        if (driver == null) {
            if(WebConfig.RUN_MODE.equals("local")){
                driver = new LocalDriverManager().createDriver(WebConfig.BROWSER);
            }
           else {
                try {
                    driver = new RemoteDriverManager().createDriver();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        return driver;
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void quitDriver(){

        if(driver != null) {
            driver.quit();
        }
    }

}
