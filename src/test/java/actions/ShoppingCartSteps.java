package actions;

import businessObjects.Item;
import businessObjects.ShoppingCart;
import pages.ProductDetailsPage;
import pages.ShoppingCartPage;

public class ShoppingCartSteps {
    ShoppingCartPage shoppingCartPage;
    ProductDetailsPage productDetailsPage;

    public void addItemToCart(Item item, ShoppingCart cart){

        productDetailsPage.clickAddToCart();
        cart.addItem(item);
    }
}
