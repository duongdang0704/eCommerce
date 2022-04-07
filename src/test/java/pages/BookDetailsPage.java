package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BookDetailsPage extends ProductDetailsPage{

    @Override
    public void setPriceElement() {
        this.price = webDriver.findElement(By.id("price"));
    }

    @Override
    public void setProductOverviewElement() {
        this.productOverview = webDriver.findElement(By.id("bookDescription_feature_div"));
    }

    @Override
    public void setProductDetailsElement() {
        this.productDetails = webDriver.findElement(By.id("detailBullets_feature_div"));
    }

    public BookDetailsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
        setPriceElement();
        setProductOverviewElement();
        setProductDetailsElement();
    }

}
