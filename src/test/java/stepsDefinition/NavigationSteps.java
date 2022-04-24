package stepsDefinition;

import configuration.WebConfig;
import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CommonPage;
import pages.ProductsPage;

public class NavigationSteps{

    WebDriver webDriver;
    TestContext testContext;

    CommonPage commonPage;
    ProductsPage productsPage;

    public NavigationSteps(TestContext testContext){
        this.testContext = testContext;
        webDriver = testContext.getWebDriver();
    }

    @Given("I am on Amazon home page")
    public void i_am_on_amazon_home_page() {
        webDriver.get(WebConfig.BASE_URL);
    }

    @When("I click Left menu icon")
    public void i_click_left_menu_icon() {
        commonPage = new CommonPage(webDriver);
        commonPage.getMenuBar().clickHamburgerMenu();
    }

    @When("I click on category {string}")
    public void i_click_on_category(String category) {
       productsPage = commonPage.getMenuBar().clickMenuItem(category);
    }
    @Then("Products page displays banner {string}")
    public void products_page_displays_banner(String banner) {
        Assert.assertEquals(banner, productsPage.getBannerText());
    }

    @Then("The page title is correct {string}")
    public void the_page_title_is_correct(String title) {
        Assert.assertEquals(title, productsPage.getTitle());

    }

    @When("I click on category {string} and sub category {string}")
    public void i_click_on_category_and_sub_category(String category, String subCategory) {
        productsPage = commonPage.getMenuBar().clickMenuItem(category, subCategory);
    }
    @Then("The department is highlighted correctly {string}")
    public void the_department_is_highlighted_correctly(String category) {
        Assert.assertEquals(category, productsPage.getHeader().getSelectedCategory());

    }
}
