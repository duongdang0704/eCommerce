package runners;

//import com.browserstack.local.Local;
import drivers.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepsDefinition"},
        tags = "@Navigation",
//        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"})
public class BrowserStackTestNGRunner extends AbstractTestNGCucumberTests {
    public WebDriver driver;
//    private Local l;

    @BeforeMethod(alwaysRun = true)
    @Parameters(value = { "config", "environment" })
    @SuppressWarnings("unchecked")
    public void setUp(String config_file, String environment) throws Exception {
        DriverFactory.initDriver();
        DriverFactory.getDriverThread().manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
//        if (l != null) {
//            l.stop();
//        }
    }
}
