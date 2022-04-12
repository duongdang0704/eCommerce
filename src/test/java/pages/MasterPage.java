package pages;

import configuration.WebConfig;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MasterPage extends PageObject {

    private MenuBar menuBar;
    private Header header;

    public MenuBar getMenuBar() {
        return menuBar;
    }

    public Header getHeader() {
        return header;
    }

    public String getTitle(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(WebConfig.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.not(ExpectedConditions.titleIs("")));
        return getDriver().getTitle();
    }
}
