package pages;

import io.appium.java_client.pagefactory.AndroidBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends CommonPage{
    @FindBy(id = "zg_banner_text")
    WebElement banner;
    @FindBy(css = ".a-section.octopus-pc-category-card-v2")
    WebElement featureCategories;
    @FindBy(css = ".a-section.octopus-pc-card.octopus-best-seller-card")
    WebElement bestSellers;

    public ProductsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public String getBannerText(){
        return banner.getText();
    }
}
