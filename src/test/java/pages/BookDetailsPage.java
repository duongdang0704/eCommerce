package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookDetailsPage extends ProductDetailsPage{

//    @FindBy(id = "price")
//    WebElementFacade price;
//    @FindBy(id = "bookDescription_feature_div")
//    WebElementFacade productOverview;
//    @FindBy(id = "detailBullets_feature_div")
//    WebElementFacade productDetails;

    public void setBookDetailsElements(){
        price = getDriver().findElement(By.id("price"));
        productOverview =  getDriver().findElement(By.id("bookDescription_feature_div"));
        productDetails =  getDriver().findElement(By.id("detailBullets_feature_div"));
    }
}
