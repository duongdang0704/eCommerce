package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LocalDriverManager {

    public WebDriver createDriver(String configFile, String environment) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONObject config = (JSONObject) parser.parse(new FileReader("src/test/resources/conf/" + configFile));
        JSONObject envs = (JSONObject) config.get("environments");
        JSONObject env = (JSONObject) envs.get(environment);
        String browser = env.get("browser").toString();
        List<String> arguments = (List<String>) env.get("options");
        WebDriver driver = null;
        switch (browser){
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                for (String argument:arguments) {
                    chromeOptions.addArguments(argument);
                }
                driver = WebDriverManager.chromedriver()
                        .capabilities(chromeOptions)
                        .create();
                break;
            case "firefox":
                FirefoxOptions ffOptions = new FirefoxOptions();
                for (String argument:arguments) {
                    ffOptions.addArguments(argument);
                }
                driver = WebDriverManager.firefoxdriver()
                        .capabilities(ffOptions)
                        .create();
                break;
            default:
                break;

        }
        return driver;
    }
}
