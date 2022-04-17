package stepsDefinition;

import cucumber.TestContext;
import drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private TestContext testContext;

    public Hooks(TestContext testContext){
        this.testContext = testContext;
        testContext.setWebDriver(DriverFactory.getDriver());
    }

    @Before
    public void setup(){
//        driverManager = DriverFactory(Browser.CHROME);
//        WebDriver webDriver = driverManager.getDriver();
//        testContext.setWebDriver(webDriver);
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WebConfig.IMPLICIT_WAIT));
//        webDriver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
//        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        webDriver.manage().window().maximize();

    }

    @After
    public void tearDown(){
        //driverManager.quitDriver();
    }
}
