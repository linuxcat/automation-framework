package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.runtime.PendingException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: sarndeep
 * Date: 21/07/13
 * Time: 11:21
 * To change this template use File | Settings | File Templates.
 */
public class NavigationDefs {
    @Given("^I am viewing sunday times homepage$")
    public void I_am_viewing_sunday_times_homepage() throws Throwable {
        // Express the Regexp above with the code you wish you had
        System.out.println("homepage");

    }

    @Then("^I should see a top level nav with (.*)$")
    public void I_should_see_a_top_level_nav_with_nav_item(String nav_item) throws Throwable {
        // Express the Regexp above with the code you wish you had
        System.out.println("--------------------------------------");
        System.out.println(nav_item);
        assertEquals(nav_item, nav_item);


    }
}
