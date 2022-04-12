package stepsDefinition;

import actions.NavigationSteps;
import businessObjects.ProductDetails;
import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import utils.ReferenceData;

import java.util.Map;

public class ProductStepsDef {

    @Steps
    NavigationSteps navigationSteps;
    @Shared
    ReferenceData referenceData;

    @When("I click on the best match result")
    public void i_click_on_the_best_match_result() {
        String productTitle = (String)referenceData.getData("keywords");
        navigationSteps.goToProductDetails(productTitle);
    }
    @Then("Product details page {string} display")
    public void product_details_page_display(String productType) {
        String productTitle = (String)referenceData.getData("keywords");
        referenceData.setData("ProductType", productType);
        Assert.assertTrue(navigationSteps.getMasterPage().getTitle().contains(productTitle));
    }
    @Then("Its details are correct")
    public void its_details_are_correct(io.cucumber.datatable.DataTable data) {
        Map<String, String> expectedProductDetails = data.transpose().asMap(String.class, String.class);
        String productType =(String) referenceData.getData("ProductType");
        ProductDetails productDetails =  navigationSteps.getProductDetailsPage(productType).getProductInfo();
        Assert.assertEquals(expectedProductDetails.get("Product Title"), productDetails.getTitle());
        Assert.assertTrue(expectedProductDetails.get("Price").contains(productDetails.getPrice()));
        Assert.assertTrue(productDetails.getProductOverview().contains(expectedProductDetails.get("Product Overview")));
        Assert.assertTrue(productDetails.getProductDetails().contains(expectedProductDetails.get("Product Details")));
    }

}
