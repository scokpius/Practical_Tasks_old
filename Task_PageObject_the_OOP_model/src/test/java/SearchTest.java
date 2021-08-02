import org.junit.Assert;
import org.junit.Test;
import page.HomePage;

import static com.codeborne.selenide.Selenide.$;

public class SearchTest {
    @Test
    public void checkTheCurrencyHasChanged(){
        HomePage homePage = new HomePage();
        homePage.enterTheSite("https://www.hotwire.com/hotels/search?destination=Paris%2C%20France&startDate=2021-08-05&endDate=2021-08-07&rooms=1&adults=2&children=0");

       // homePage.searchForHotel("Paris");

       // Assert.assertTrue("Selected", ());
    }
}
