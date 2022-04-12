package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MenuBar extends PageObject {

    @FindBy(id = "nav-hamburger-menu")
    WebElementFacade hamburgerMenuIcon;
    @FindBy(id = "hmenu-content")
    WebElementFacade menu;
    @FindBy(css = ".nav-sprite.hmenu-close-icon")
    WebElementFacade closeLeftMenuIcon;
    @FindBy(css = ".hmenu-item.hmenu-compressed-btn")
    List<WebElementFacade> seeMoreLinks;

    public void clickMenu(String menu){

    }

    public void clickHamburgerMenu(){
        hamburgerMenuIcon.click();
    }

    public void clickSingleCategory(String trending){
        WebElement trendingItem = menu.findElement(By.xpath("//*[text()='" + trending + "'][@class='hmenu-item']"));
        trendingItem.click();
    }
    public void clickSubCategory(String category, String subCategory){

        clickCategory(category);
        clickCategory(subCategory);
    }
    public void clickCategory(String category){
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
    }

    public void closeLeftMenu(){
        closeLeftMenuIcon.click();
    }
}
