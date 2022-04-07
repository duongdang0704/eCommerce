package cucumber;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class TestContext {

    WebDriver webDriver;
    Map<String, String> data = new HashMap();
    public void setWebDriver(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }

    public void setData(String key, String value){
        data.put(key, value);
    }

    public String getData(String key){
        return data.get(key);
    }
}
