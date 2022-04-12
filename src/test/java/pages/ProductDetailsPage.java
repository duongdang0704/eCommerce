package pages;

import businessObjects.ProductDetails;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ui.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class ProductDetailsPage extends PageObject {

    @FindBy(id = "productTitle")
    WebElementFacade productTitle;
    @FindBy(id = "productSubtitle")
    WebElementFacade productSubTitle;
    @FindBy(id = "add-to-cart-button")
    WebElementFacade addToCartButton;
    @FindBy(id = "corePrice_feature_div")
    WebElement price;
    @FindBy(id = "productOverview_feature_div")
    WebElement productOverview;
    @FindBy(id = "prodDetails")
    WebElement productDetails;

    public String getPrice(){
        return price.getText();
    }

    public String getProductOverview(){
        return productOverview.getText();
    }

    public String getProductDetails(){
        return productDetails.getText();
    }

    public String getProductTitle(){
        return productTitle.getText();
    }

    public String getProductSubTitle(){
        return productSubTitle.getText();
    }

    public void clickAddToCart(){
        addToCartButton.click();
    }

    public ProductDetails getProductInfo(){
        String title = getProductTitle();
        String price = getPrice();
        System.out.println(price);
        String overview = getProductOverview();
        String details = getProductDetails();
        return new ProductDetails(getProductTitle(), getPrice(), getProductOverview(), getProductDetails());
    }
}
