package stepsDefinition;

import businessObjects.Item;
import businessObjects.ShoppingCart;
import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ProductDetailsPage;
import pages.ShoppingCartPage;

public class ShoppingCartSteps {

    TestContext testContext;
    WebDriver webDriver;

    ProductDetailsPage productDetailsPage;
    ShoppingCartPage shoppingCartPage;
    ShoppingCart shoppingCart;

    public ShoppingCartSteps(TestContext testContext){
        this.testContext = testContext;
        webDriver = testContext.getWebDriver();
        shoppingCart = new ShoppingCart();
    }
    @When("I click Add to Cart")
    public void i_click_add_to_cart() {
        shoppingCartPage = productDetailsPage.clickAddToCart();
        productDetailsPage.getPrice()
        shoppingCart.addItem(new Item(productDetailsPage.getPrice(), productDetailsPage.getProductTitle(), productDetailsPage, 1));
    }
    @Then("Message {string} notify added to cart")
    public void message_notify_added_to_cart(String string) {

    }
    @Then("I go to cart")
    public void i_go_to_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Item name, quantity are correct")
    public void item_name_quantity_are_correct() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Amount is correct")
    public void amount_is_correct() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
