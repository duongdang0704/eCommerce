package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Header {
    @FindBy(id="twotabsearchtextbox")
    WebElement searchTextbox;
    @FindBy(id = "nav-search-submit-button")
    WebElement searchIcon;
    @FindBy(id = "searchDropdownBox")
    WebElement categoryDropdown;

    WebDriver webDriver;

    public Header(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public Header enterSearchString(String keywords){
        searchTextbox.sendKeys(keywords);
        return this;
    }

    public ResultsPage clickSearchIcon(){
        searchIcon.click();
        return new ResultsPage(webDriver);
    }

    public Header selectCategory(String category){
        Select selectCategory = new Select(categoryDropdown);
        selectCategory.selectByVisibleText(category);
        return this;
    }

    public String getSelectedCategory(){
        return categoryDropdown.getText();
    }
}
