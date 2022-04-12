package actions;

import businessObjects.ProductDetails;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import pages.*;

public class NavigationSteps {

    MasterPage masterPage;
    ResultsPage resultsPage;
    ProductDetailsPage productDetailsPage;
    BookDetailsPage bookDetailsPage;

    public void openHomePage(){
        masterPage.open();
    }

    public void openLeftMenu(){
        masterPage.getMenuBar().clickHamburgerMenu();
    }

    public void goToMenuItem(String menuItem){
        masterPage.getMenuBar().clickSingleCategory(menuItem);
    }

    public void goToSubMenuItem(String menuItem, String subMenuItem){
        masterPage.getMenuBar().clickSubCategory(menuItem, subMenuItem);
    }

    public MasterPage getMasterPage(){
        return masterPage;
    }

    public void searchProduct(String keywords){
        masterPage.getHeader().enterSearchString(keywords);
        masterPage.getHeader().clickSearchIcon();
    }

    public ResultsPage getResultsPage(){
        return resultsPage;
    }

    public void selectCategory(String category){
        masterPage.getHeader().selectCategory(category);
    }

    public void goToProductDetails(String productTitle){
        resultsPage.clickBestMatch(productTitle);
    }

    public ProductDetailsPage getProductDetailsPage(String productType) {
        switch (productType) {
            case "Books":
                bookDetailsPage.setBookDetailsElements();
                return bookDetailsPage;
            default:
                return productDetailsPage;
        }
    }
}
