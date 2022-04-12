package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Header extends PageObject {
    @FindBy(id="twotabsearchtextbox")
    WebElementFacade searchTextbox;
    @FindBy(id = "nav-search-submit-button")
    WebElementFacade searchIcon;
    @FindBy(id = "searchDropdownBox")
    WebElementFacade categoryDropdown;

    public void enterSearchString(String keywords){
        searchTextbox.sendKeys(keywords);
    }

    public void clickSearchIcon(){
        searchIcon.click();
    }

    public void selectCategory(String category){
        Select selectCategory = new Select(categoryDropdown);
        selectCategory.selectByVisibleText(category);
    }

    public String getSelectedCategory(){
        return categoryDropdown.getFirstSelectedOptionVisibleText();
    }
}
