import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import page.RoomInformationPage;

import static com.codeborne.selenide.Selenide.$;

public class RoomsTest {
    @Test
    public void checkAnAccountHasBeenCreated() {
      //  HomePage homePage = new HomePage();
     //   Header header = new Header();
        RoomInformationPage roomInformationPage = new RoomInformationPage();
        roomInformationPage.enterTheSite("https://vacation.hotwire.com/Paris-Hotels-Mercure-Paris-Saint-Ouen.h17398093.Hotel-Information?chkin=8%2F2%2F2021&chkout=8%2F3%2F2021&currency=USD&exp_dp=83&gaiaId=179898&paandi=true&pwaDialog=room-info-201940577&rfrr=Header.Currency.USD&rm1=a2&tmid=31604908394");
                Assert.assertTrue("",
                $(By.xpath(roomInformationPage.FIELD_NAME_ROOM)).getText() == "Classic Double Room, 1 Double Bed");
    }
}
