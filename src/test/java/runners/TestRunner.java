package runners;

import configuration.WebConfig;
import drivers.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//
//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"html:target/cucumber-reports/cucumber-report.html",
//                            "json:target/cucumber-reports/cucumber.json"},
//        features= "src/test/resources/features",
//        glue= {"stepsDefinition"},
//        tags= "@Navigation or @ShoppingCart"
//)
public class TestRunner {
    public static WebDriver webDriver;

//    @BeforeClass
//    public static void setup() {
//        WebConfig.setConfig();
//        webDriver = DriverFactory.initDriver();
//        webDriver.manage().window().maximize();
//    }
//
//    @AfterClass
//    public static void tearDown() {
//        DriverFactory.quitDriver();
//    }
    public static void main(String[] args){
        //ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();

        webDriver = new ChromeDriver();
        webDriver.get("google.com");
    }

}