package steps;

import org.junit.Test;
import page.HomePage;
import page.ResultsSearchPage;

public class SearchFindSteps {

    @Test
    public void createSearchRequestHomePage() {
        HomePage homePage = new HomePage();
        ResultsSearchPage resultsSearchPage= new ResultsSearchPage();
        homePage.enterTheSite("https://www.hotwire.com/");
        homePage.searchForHotel("Paris");
        r

    }
}
