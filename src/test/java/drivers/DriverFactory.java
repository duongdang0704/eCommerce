package drivers;

import configuration.WebConfig;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class DriverFactory {

//    private static WebDriver driver;
    protected static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();

    public static void initDriver() {
        try {
            switch (WebConfig.RUN_MODE){
                case "local":
                    driverThread.set(new LocalDriverManager().createDriver(WebConfig.CONFIG_FILE, WebConfig.ENVIRONMENT));
                    break;
                case "remote":
                    driverThread.set(new RemoteDriverManager().createDriver(WebConfig.CONFIG_FILE, WebConfig.ENVIRONMENT));
                    break;
                case "browserstack":
                    driverThread.set(new BrowserStackDriverManager().createDriver(WebConfig.CONFIG_FILE, WebConfig.ENVIRONMENT));
                    break;
                case "mobile":
                    driverThread.set(new MobileDriverManager().createDriver(WebConfig.CONFIG_FILE, WebConfig.ENVIRONMENT));
                    break;
            }
//            if (WebConfig.RUN_MODE.equals("local")) {
//                driverThread.set(new LocalDriverManager().createDriver(WebConfig.CONFIG_FILE, WebConfig.ENVIRONMENT));
//            } else if (WebConfig.RUN_MODE.equals("remote")) {
//                driverThread.set(new RemoteDriverManager().createDriver(WebConfig.CONFIG_FILE, WebConfig.ENVIRONMENT));
//            } else if (WebConfig.RUN_MODE.equals("browserstack")) {
//                driverThread.set(new BrowserStackDriverManager().createDriver(WebConfig.CONFIG_FILE, WebConfig.ENVIRONMENT));
//            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriverThread(){
        return driverThread.get();
    }

    public static void quitDriver(){
        if(driverThread != null) {
            driverThread.get().quit();
            driverThread.remove();
        }
    }

}
