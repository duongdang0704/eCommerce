package stepsDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.ProductDetailsPage;
import pages.ResultsPage;

import java.util.Map;

public class ProductSteps {

    WebDriver webDriver;
    TestContext testContext;

    ResultsPage resultsPage;
    ProductDetailsPage productDetailsPage;
    String productTitle;

    public ProductSteps(TestContext testContext){
        this.testContext = testContext;
        webDriver = testContext.getWebDriver();
        resultsPage = new ResultsPage(webDriver);
    }
    @When("I click on the best match result product type {string}")
    public void i_click_on_the_best_match_result(String productType) {
        productTitle = testContext.getData("keywords");
        productDetailsPage = resultsPage.clickBestMatch(productTitle, productType);
    }
    @Then("Product details page display")
    public void product_details_page_display() {
        Assert.assertTrue(resultsPage.getTitle().contains(productTitle));
    }
    @Then("Its details are correct")
    public void its_details_are_correct(io.cucumber.datatable.DataTable data) {
        Map<String, String> productDetails = data.transpose().asMap(String.class, String.class);
        Assert.assertEquals(productDetails.get("Product Title"), productDetailsPage.getProductTitle());
        Assert.assertEquals(productDetails.get("Price"), productDetailsPage.getPrice());
        Assert.assertTrue(productDetailsPage.getProductOverview().contains(productDetails.get("Product Overview")));
        Assert.assertTrue(productDetailsPage.getProductDetails().contains(productDetails.get("Product Details")));
    }

}
