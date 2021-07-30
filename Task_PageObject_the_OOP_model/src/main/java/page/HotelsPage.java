package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import components.Header;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HotelsPage {

    public static final String BUTTON_PREV = ""; // buttonPrev локатор
    public static final String BUTTON_NEXT = ""; // buttonNext локатор

    public Header header;

    public HotelsPage() {
        header = new Header();
        // open("https://www.hotwire.com/hotels/");
    }

    public HotelsPage goToHotelPage(String locator) {

//        executeJavaScript("window.open('" + locator + "')");
//        switchTo().window(1);
        open("https://www.hotwire.com/hotels");
     //   switchTo().window(locator);

        return this;
    }

    public HotelsPage waitForUpdateHotelPage() {
        $(By.xpath("//*[@role=\"main\"]/div/div[3]/div[2]")).shouldBe(Condition.visible, Duration.ofSeconds(10));
        return new HotelsPage();
    }
}
