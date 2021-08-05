import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import page.HomePage;

import static com.codeborne.selenide.Selenide.$;

public class SearchTest {


    @Test
    public void checkHotelSearch(){
        HomePage homePage = new HomePage();
        homePage.enterTheSite("https://www.hotwire.com/");
        homePage.searchForHotel("Paris", "August", "25", "2021", "September",
                "3", "2021", 2, 3, 3);

    }

    @Test
    public void checkTheTransitionToTheHotelsPage(){
        HomePage homePage = new HomePage();
        homePage.enterTheSite("https://www.hotwire.com/");
        homePage.chooseFunction();
        homePage.waitDisableElement("//*[@role=\"main\"]/div/div[3]/div[2]");
        Assert.assertTrue($(By.xpath("//*[@role=\"main\"]/div/div[3]/div[2]")).isDisplayed());
    }
}
