import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import page.HomePage;

import static com.codeborne.selenide.Selenide.$;

public class SearchTest {
    @Test
    public void checkHotelSearch(){
        HomePage homePage = new HomePage();
   //     homePage.enterTheSite("https://www.hotwire.com/");
        homePage.searchForHotel("Paris");

//        homePage.enterTheSite("https://www.hotwire.com/hotels/search?destination=Paris%2C%20France&startDate=2021-08-05&endDate=2021-08-07&rooms=1&adults=2&children=0");
//
//        homePage.searchForHotel("Paris");
//        homePage.chooseCheckInDate();



    }

    @Test
    public void checkTheTransitionToTheHotelsPage(){
        HomePage homePage = new HomePage();
 //       homePage.enterTheSite("https://www.hotwire.com/");
        homePage.chooseFunction();
        homePage.waitDisableElement("//*[@role=\"main\"]/div/div[3]/div[2]");
        Assert.assertTrue($(By.xpath("//*[@role=\"main\"]/div/div[3]/div[2]")).isDisplayed());
    }
}
