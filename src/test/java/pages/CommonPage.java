package pages;

import configuration.WebConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonPage {
    WebDriver webDriver;
    private MenuBar menuBar;
    private Header header;

    public CommonPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        menuBar = new MenuBar(webDriver);
        header = new Header(webDriver);
    }

    public MenuBar getMenuBar() {
        return menuBar;
    }

    public Header getHeader() {
        return header;
    }
    public String getTitle(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(WebConfig.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.not(ExpectedConditions.titleIs("")));
        return webDriver.getTitle();
    }
}
