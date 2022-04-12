package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends MasterPage {
    @FindBy(id = "zg_banner_text")
    WebElement banner;
    @FindBy(css = ".a-section.octopus-pc-category-card-v2")
    WebElement featureCategories;
    @FindBy(css = ".a-section.octopus-pc-card.octopus-best-seller-card")
    WebElement bestSellers;

    public String getBannerText(){
        waitABit(100000);
        return banner.getText();
    }
}
