package drivers;

import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public abstract class DriverManager {
    private Map<Long, WebDriver> driverMap = new HashMap();
    protected abstract WebDriver createDriver(Environment evn);

//    public synchronized void quitDriver(){
//        Long currentThread = Thread.currentThread().getId();
//        WebDriver driver = driverMap.get(currentThread);
//        if(driver != null) {
//            driver.quit();
//            driverMap.remove(currentThread);
//        }
//    }
//
//    public synchronized WebDriver getDriver(){
//        WebDriver currentDriver = driverMap.get(Thread.currentThread().getId());
//        if(currentDriver == null) {
//            WebDriver newDriver = this.createDriver();
//            driverMap.put(Thread.currentThread().getId(), newDriver);
//            return newDriver;
//        }
//        return currentDriver;
//    }
}
