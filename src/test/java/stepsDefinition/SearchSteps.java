package stepsDefinition;

import configuration.WebConfig;
import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import pages.ResultsPage;

public class SearchSteps {

    TestContext testContext;
    WebDriver webDriver;

    ResultsPage resultsPage;
    CommonPage commonPage;

    public SearchSteps(TestContext testContext){
        this.testContext = testContext;
        webDriver = testContext.getWebDriver();
        commonPage = new CommonPage(webDriver);
    }

    @When("I search a product {string}")
    public void i_search_a_product(String keywords) {
        resultsPage = commonPage.getHeader().enterSearchString(keywords).clickSearchIcon();
        testContext.setData("keywords", keywords);
    }
    @Then("Search results display {string}")
    public void search_results_display(String searchResult) {
        Assert.assertEquals(searchResult, resultsPage.getSearchLabel());
    }
    @When("I select a category {string}")
    public void i_select_category(String category) {
        commonPage.getHeader().selectCategory(category);
        testContext.setData("Category", category);
    }

}
