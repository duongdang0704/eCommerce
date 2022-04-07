package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppingCartPage extends CommonPage{

    @FindBy(id = "sw-atc-details-single-container")
    WebElement confirmation;
    @FindBy(id = "sw-atc-buy-box")
    WebElement buyBox;

    public ShoppingCartPage(WebDriver webDriver){
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public CheckoutPage clickProceedToCheckout(){
        buyBox.findElement(By.name("proceedToRetailCheckout")).click();
        return new CheckoutPage(webDriver);
    }

    public ShoppingCartDetailsPage clickGotoCart(){
        buyBox.findElement(By.id("sw-gtc")).click();
        return new ShoppingCartDetailsPage(webDriver);
    }

    public String getSubTotal(){
        return buyBox.findElement(By.id("sw-subtotal")).getText();
    }
}
