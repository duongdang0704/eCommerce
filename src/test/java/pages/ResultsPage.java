package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultsPage extends PageObject {

    @FindBy(css = ".a-color-state.a-text-bold")
    WebElementFacade resultText;

    @FindBy(css = "*[data-component-type='s-search-result']")
    List<WebElementFacade> resultList;

    public String getResultBanner(){
        return resultText.getText();
    }

    private WebElement getBestMatch(String title){
        WebElement productLink = null;
        for (WebElementFacade element:resultList) {
            WebElement titleH2 = element.findElement(By.tagName("h2"));
            String currentTitle = titleH2.getText();
            if (currentTitle.contains(title)){
                productLink = titleH2.findElement(By.tagName("a"));
//                Actions actions = new Actions(getwebDriver);
//                actions.moveToElement(element);
//                actions.perform();
                break;
            }
        }
        return productLink;
    }

    public void clickBestMatch(String title){
        getBestMatch(title).click();
    }
}
