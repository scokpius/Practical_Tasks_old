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
        homePage.searchForHotel("Paris", "August", "25", "2021", "September",
                "3", "2021", 1, 2, 2);

    }
}
