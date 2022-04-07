package businessObjects;

import org.openqa.selenium.WebElement;

public class Product {
    String title;
    String price;
    String productOverview;
    String productDetails;

    public Product(String title, String price, String productOverview, String productDetails) {
        this.title = title;
        this.price = price;
        this.productOverview = productOverview;
        this.productDetails = productDetails;
    }

    public Product(String title, WebElement price, WebElement productOverview, WebElement productDetails) {
    }
}
