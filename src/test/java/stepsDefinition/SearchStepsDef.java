package stepsDefinition;

import actions.NavigationSteps;
import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.MasterPage;
import pages.ResultsPage;
import utils.ReferenceData;

public class SearchStepsDef {

    ResultsPage resultsPage;
    MasterPage masterPage;

    @Steps
    NavigationSteps navigationSteps;
    @Shared
    ReferenceData referenceData;

    @When("I search a product {string}")
    public void i_search_a_product(String keywords) {
        navigationSteps.searchProduct(keywords);
        referenceData.setData("keywords", keywords);
    }
    @Then("Search results display {string}")
    public void search_results_display(String searchResult) {
        Assert.assertEquals(searchResult, navigationSteps.getResultsPage().getResultBanner());
    }
    @When("I select a category {string}")
    public void i_select_category(String category) {
        navigationSteps.selectCategory(category);
        referenceData.setData("category", category);
    }

}
