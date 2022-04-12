package stepsDefinition;

import configuration.WebConfig;
import cucumber.TestContext;
import drivers.Browser;
import drivers.DriverFactory;
import drivers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Hooks {
    private TestContext testContext;
    private DriverManager driverManager;

    @Before
    public void setup(){

    }

    @After
    public void tearDown(){

    }
}
