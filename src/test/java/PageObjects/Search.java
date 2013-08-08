package PageObjects;

import helpers.SeleniumFactory;
import helpers.WebPageHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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
    private String searchContenCssLocator = "#search-listings";
    private String searchResultsCssLocator = ".search-result";
    private String suggestItemsCssLocator = ".suggestive-search";
    private String noOfSugggestedItemsCssLocator = ".suggestive-search>ul>li";



    public Search() {
        driver = SeleniumFactory.get();
    }

    public boolean isSearchBoxVisible(){
        return WebPageHelpers.isElementPresentByCss(mainSearchBoxCcsLocator);
    }

    public boolean isSearchResultsVisibile(){
        return WebPageHelpers.isElementPresentByCss(searchContenCssLocator);
    }

    public boolean isSuggestedItemsVisible(){
        WebPageHelpers.waitForElement(suggestItemsCssLocator);
        return WebPageHelpers.isElementPresentByCss(suggestItemsCssLocator);
    }

    public int noOfSuggestedItems(){
        return WebPageHelpers.FindElementsByCss(noOfSugggestedItemsCssLocator).size();
    }

    public void searchFor(String term){
        mainSearchBox().sendKeys(term);
    }

    public int noOfSearchResults(){
        return searchResults().size();
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

    private List<WebElement> searchResults(){
        return WebPageHelpers.FindElementsByCss(searchResultsCssLocator);
    }



}

