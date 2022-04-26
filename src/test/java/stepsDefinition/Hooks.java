package stepsDefinition;

import cucumber.TestContext;
import drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Hooks {
    private TestContext testContext;
    private WebDriver driver;
    private JavascriptExecutor jse;
    public Hooks(TestContext testContext){
        this.testContext = testContext;
        driver = DriverFactory.getDriverThread();
        testContext.setWebDriver(driver);
        //jse = (JavascriptExecutor)driver;
    }

    @Before
    public void setup(Scenario scenario){
//        // Setting name of the test
//        jse.executeScript("browserstack_executor: {\"action\": \"setSessionName\", \"arguments\": {\"name\":\"" + scenario.getName() + "\" }}");
    }

    @After
    public void tearDown(Scenario scenario){
//        if (scenario.isFailed()){
//            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"failed\"}}");
//        }else {
//            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\"}}");
//        }
    }
    @AfterStep
    public void addScreenshot(Scenario scenario) throws IOException {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //validate if scenario has failed
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }

    }
}
