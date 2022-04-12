package businessObjects;

import org.openqa.selenium.WebElement;

public class ProductDetails {
    String title;

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public String getProductOverview() {
        return productOverview;
    }

    public String getProductDetails() {
        return productDetails;
    }

    String price;
    String productOverview;
    String productDetails;

    public ProductDetails(String title, String price, String productOverview, String productDetails) {
        this.title = title;
        this.price = price;
        this.productOverview = productOverview;
        this.productDetails = productDetails;
    }

    public ProductDetails(String title, WebElement price, WebElement productOverview, WebElement productDetails) {
    }
}
