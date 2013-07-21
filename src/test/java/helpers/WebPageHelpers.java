package helpers;

/**
 * Date: 21/07/13
 * Created with IntelliJ IDEA.
 * User: sarndeep
 * Time: 17:27
 * To change this template use File | Settings | File Templates.
 */
public class WebPageHelpers {

    public static void openWebPage(String url) {
        // load page through selenium 2.0
        String fullURL = System.getProperty("baseUrl") + url;
        if ((url.contains("homepage"))) {
            fullURL =  "http://www.thesundaytimes.co.uk";
        }

        System.out.println("Opening URL: " + fullURL);
        SeleniumFactory.get(fullURL, true);
        // Maximise browser window
    }
}
