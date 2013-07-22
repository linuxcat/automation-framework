package steps;

import PageObjects.Search;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.PendingException;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: sarndeep
 * Date: 22/07/13
 * Time: 19:16
 * To change this template use File | Settings | File Templates.
 */
public class SearchDefs {

    private Search search = new Search();

    @Then("^I can see the search box at the top right of the page$")
    public void I_can_see_the_search_box_at_the_top_right_of_the_page() throws Throwable {
        assertTrue(search.isSearchBoxVisible());
      }

    @When("^I type the search term \"([^\"]*)\"$")
    public void I_type_the_search_term(String searchTerm) throws Throwable {
        // Express the Regexp above with the code you wish you had
        System.out.println(searchTerm);
        search.searchFor(searchTerm);
    }

    @And("^Click the search icon$")
    public void Click_the_search_icon() throws Throwable {
        // Express the Regexp above with the code you wish you had
        search.clickSearchIcon();
    }

    @Then("^the search results page is displayed$")
    public void the_search_results_page_is_displayed() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^the page returns the first (\\d+) search results$")
    public void the_page_returns_the_first_search_results(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^has clickable pages in the pagination$")
    public void has_clickable_pages_in_the_pagination() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
