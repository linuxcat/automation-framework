package PageObjects;

import helpers.SeleniumFactory;
import helpers.WebPageHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created with IntelliJ IDEA.
 * User: sarndeep
 * Date: 22/07/13
 * Time: 19:18
 * To change this template use File | Settings | File Templates.
 */
public class Search {

    WebDriver driver = SeleniumFactory.get();
    private String mainSearchBoxCcsLocator = "#acstoolbarquerystring";
    private String searchIconCssLocator = ".search-submit";


    public Search() {
        driver = SeleniumFactory.get();
    }

    public Boolean isSearchBoxVisible(){
        return WebPageHelpers.isElementPresentByCss(mainSearchBoxCcsLocator);
    }

    public void searchFor(String term){
        mainSearchBox().sendKeys(term);
    }

    public void clickSearchIcon(){
        searchIcon().click();
    }

    private WebElement mainSearchBox(){
        return WebPageHelpers.FindElementByCss(mainSearchBoxCcsLocator);
    }

    private WebElement searchIcon(){
        return WebPageHelpers.FindElementByCss(searchIconCssLocator);

    }



}

