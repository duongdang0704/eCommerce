package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends CommonPage{

    @FindBy(id = "productTitle")
    WebElement productTitle;
    @FindBy(id = "productSubtitle")
    WebElement productSubTitle;
    @FindBy(id = "add-to-cart-button")
    WebElement addToCartButton;
    WebElement price;
    WebElement productOverview;
    WebElement productDetails;

    public void setPriceElement(){
        this.price = webDriver.findElement(By.id("corePrice_desktop")).findElement(By.cssSelector(".a-price.a-text-price.a-size-medium.apexPriceToPay"));
    }

    public void setProductOverviewElement(){
        this.productOverview = webDriver.findElement(By.id("productOverview_feature_div"));
    }

    public void setProductDetailsElement(){
        this.productDetails = webDriver.findElement(By.id("prodDetails"));
    }

    public String getPrice() {
        return price.getText();
    }

    public String getProductOverview() {
        return productOverview.getText();
    }

    public String getProductDetails() {
        return productDetails.getText();
    }

    public ProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public String getProductTitle(){
        return productTitle.getText();
    }

    public String getProductSubTitle(){
        return productSubTitle.getText();
    }

    public ShoppingCartPage clickAddToCart(){
        addToCartButton.click();
        return new ShoppingCartPage(webDriver);
    }

}
