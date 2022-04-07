package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultsPage extends LandingPage {

    @FindBy(css = ".a-color-state.a-text-bold")
    WebElement resultText;

    @FindBy(css = "*[data-component-type='s-search-result']")
    List<WebElement> resultList;
    public ResultsPage(WebDriver webDriver){
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public String getSearchLabel(){
        return resultText.getText();
    }

    private WebElement getBestMatch(String title){
        WebElement productLink = null;
        for (WebElement element:resultList) {
            WebElement titleH2 = element.findElement(By.tagName("h2"));
            String currentTitle = titleH2.getText();
            if (currentTitle.contains(title)){
                productLink = titleH2.findElement(By.tagName("a"));
                Actions actions = new Actions(webDriver);
                actions.moveToElement(element);
                actions.perform();
                break;
            }
        }
        return productLink;
    }

    public ProductDetailsPage clickBestMatch(String title, String productType){
        getBestMatch(title).click();
        switch (productType){
            case "Book":
                return new BookDetailsPage(webDriver);
            case "Household":
                return new HouseholdDetailsPage(webDriver);
            default:
                return new ProductDetailsPage(webDriver);
        }
    }
}
