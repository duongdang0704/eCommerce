package stepsDefinition;

import configuration.WebConfig;
import cucumber.TestContext;
import drivers.Browser;
import drivers.DriverFactory;
import drivers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Hooks {
    private TestContext testContext;
    private DriverManager driverManager;

    public Hooks(TestContext testContext){
        this.testContext = testContext;
    }

    @Before
    public void setup(){
        driverManager = DriverFactory.getDriverManager(Browser.CHROME);
        WebDriver webDriver = driverManager.getDriver();
        testContext.setWebDriver(webDriver);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WebConfig.IMPLICIT_WAIT));
        webDriver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        webDriver.manage().window().maximize();

    }

    @After
    public void tearDown(){
        //driverManager.quitDriver();
    }
}
