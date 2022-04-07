package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends CommonPage {

    public LandingPage(WebDriver webDriver){
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public ResultsPage search(String keywords){
        getHeader().enterSearchString(keywords)
                    .clickSearchIcon();
        return new ResultsPage(webDriver);
    }
}
