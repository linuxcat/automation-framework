package PageObjects;


import helpers.SeleniumFactory;
import helpers.WebPageHelpers;
import org.openqa.selenium.WebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: sarndeep
 * Date: 21/07/13
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 *
 */



public class MainNavigation {

    WebDriver driver;



    public MainNavigation() {
        driver = SeleniumFactory.get();
    }

    public void openHomepage() {
        if(driver.getCurrentUrl().equals("http://www.thesundaytimes.co.uk/sto/")) {
            System.out.println("Already on homepage, nothing to do");
        }else{
        WebPageHelpers.openWebPage("homepage");
        }
    }


}
