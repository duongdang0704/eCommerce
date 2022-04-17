package runners;

import configuration.WebConfig;
import drivers.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileReader;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/cucumber-reports/cucumber-report.html",
                            "json:target/cucumber-reports/cucumber.json"},
        features= "src/test/resources/features",
        glue= {"stepsDefinition"},
        tags= "@Navigation or @ShoppingCart"
)
public class TestRunner {
    public static WebDriver webDriver;

    @BeforeClass
    public static void setup() {
        WebConfig.loadConfig();
        webDriver = DriverFactory.initDriver();
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        DriverFactory.quitDriver();
    }

}