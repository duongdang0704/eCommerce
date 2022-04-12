package actions;

import pages.ProductsPage;

public class ProductSteps {

    ProductsPage productsPage;

    public void searchProduct(String keywords){

    }

    public String getProductBanner(){
        return productsPage.getBannerText();
    }

    public ProductsPage getProductsPage(){
        return productsPage;
    }
}
