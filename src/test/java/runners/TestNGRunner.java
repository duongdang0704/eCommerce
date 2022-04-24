package runners;

//import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import configuration.WebConfig;
import drivers.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.BuildInfo;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepsDefinition"},
        tags = "@Navigation",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
//        plugin = {"html:target/cucumber-reports/cucumber.html",
//                "json:target/cucumber-reports/cucumber.json"})
//        plugin = {"pretty","html:target/html-reports/report.html"})
//@Listeners({ExtentITestListenerClassAdapter.class})
public class TestNGRunner extends AbstractTestNGCucumberTests {

    @Parameters({ "mode", "configFile", "environment"})
    @BeforeMethod(alwaysRun = true)
    public void setUp(String mode, String configFile, String environment) {
        WebConfig.setConfig(mode, configFile, environment);
        DriverFactory.initDriver();
        WebDriver driver = DriverFactory.getDriverThread();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverFactory.quitDriver();
    }

}
