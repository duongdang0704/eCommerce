package stepsDefinition;

import actions.NavigationSteps;
import actions.ProductSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class NavigationStepsDef {

    @Steps
    NavigationSteps navigationSteps;
    @Steps
    ProductSteps productSteps;

    @Given("I am on Amazon home page")
    public void i_am_on_amazon_home_page() {
        navigationSteps.openHomePage();
    }

    @When("I click Left menu icon")
    public void i_click_left_menu_icon() {
        navigationSteps.openLeftMenu();
    }

    @When("I click on category {string}")
    public void i_click_on_category(String category) {
       navigationSteps.goToMenuItem(category);
    }
    @Then("Products page displays banner {string}")
    public void products_page_displays_banner(String banner) {
        Assert.assertEquals(banner, productSteps.getProductBanner());
    }

    @Then("The page title is correct {string}")
    public void the_page_title_is_correct(String title) {
        Assert.assertEquals(title, navigationSteps.getMasterPage().getTitle());
    }

    @When("I click on category {string} and sub category {string}")
    public void i_click_on_category_and_sub_category(String category, String subCategory) {
        navigationSteps.goToSubMenuItem(category, subCategory);
    }
    @Then("The department is highlighted correctly {string}")
    public void the_department_is_highlighted_correctly(String category) {
        Assert.assertEquals(category, productSteps.getProductsPage().getHeader().getSelectedCategory());
    }
}
