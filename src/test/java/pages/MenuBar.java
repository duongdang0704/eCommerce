package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MenuBar extends BasePage{

    @FindBy(id = "nav-hamburger-menu")
    WebElement hamburgerMenuIcon;
    @FindBy(id = "hmenu-content")
    WebElement menu;
    @FindBy(css = ".nav-sprite.hmenu-close-icon")
    WebElement closeLeftMenuIcon;
    @FindBy(css = ".hmenu-item.hmenu-compressed-btn")
    List<WebElement> seeMoreLinks;

    WebDriver webDriver;

    public MenuBar(WebDriver webDriver){
        super(webDriver);
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void clickMenu(String menu){

    }

    public MenuBar clickHamburgerMenu(){
        hamburgerMenuIcon.click();
        return this;
    }

    public ProductsPage clickMenuItem(String category, String subCategory){

        clickMenuItem(category);
        clickMenuItem(subCategory);
        return new ProductsPage(webDriver);
    }
    public ProductsPage clickMenuItem(String category){
        WebElement categoryMenuItem = menu.findElement(By.xpath("//*[text()='" + category + "']"));
        WebElement parent = categoryMenuItem.findElement(By.xpath("./.."));
        String tabIndex = parent.getAttribute("tabindex");
        //Click first More to show more menu items if cannot find the menu item
        if (tabIndex != null){
            seeMoreLinks.get(0).click();
            categoryMenuItem = menu.findElement(By.xpath("//*[text()='" + category + "']"));
            parent = categoryMenuItem.findElement(By.xpath("./.."));
            tabIndex = parent.getAttribute("tabindex");
            //Click second More to show more menu items if cannot find the menu item
            if (tabIndex != null){
                seeMoreLinks.get(1).click();
                categoryMenuItem = menu.findElement(By.xpath("//*[text()='" + category + "']"));

            }
        }
        categoryMenuItem.click();
        return new ProductsPage(webDriver);
    }

    public MenuBar closeLeftMenu(){
        closeLeftMenuIcon.click();
        return this;
    }
}
