package drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

public class MobileDriverManager {
    public WebDriver createDriver(String configFile, String environment) throws IOException, ParseException {
        AppiumDriver driver = null;
        JSONParser parser = new JSONParser();
        JSONObject config = (JSONObject) parser.parse(new FileReader("src/test/resources/conf/" + configFile));
        JSONObject envs = (JSONObject) config.get("environments");
        JSONObject env = (JSONObject) envs.get(environment);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        Map<String, String> envCapabilities = (Map<String, String>) env.get("capabilities");
        Iterator it = envCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
        }
        if (environment.contains("iOS")){
            driver = new IOSDriver(new URL((String)env.get("appiumServer")), capabilities);
        }else {
            driver = new AndroidDriver(new URL((String)env.get("appiumServer")), capabilities);
        }
        return driver;
    }
}
