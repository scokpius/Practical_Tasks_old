import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import page.RoomInformationPage;

import static com.codeborne.selenide.Selenide.$;

public class RoomsTest {
    @Test
    public void checkAnAccountHasBeenCreated() {

        RoomInformationPage roomInformationPage = new RoomInformationPage();
        roomInformationPage.enterTheSite("https://vacation.hotwire.com/Paris-Hotels-Mercure-Paris-Saint-Ouen.h17398093.Hotel-Information?chain=&chkin=8%2F7%2F2021&chkout=8%2F8%2F2021&currency=USD&daysInFuture=&destination=&gaiaId=179898&group=&guestRating=&hotelName=&latLong=&misId=&neighborhood=&paandi=true&poi=&pwaDialog=room-info-201940577&regionId=&rfrr=Header.Currency.USD&rm1=a2&roomIndex=&selected=&sort=RECOMMENDED&stayLength=&theme=&tmid=31604908394&useRewards=true&userIntent=");
                Assert.assertTrue("",
                $(By.xpath(roomInformationPage.FIELD_NAME_ROOM)).getText() == "Classic Double Room, 1 Double Bed");
    }
}
