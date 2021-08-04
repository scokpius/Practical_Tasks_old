package components;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchOptions {

    public CalendarDate buttonCheckIn;
    public CalendarDate buttonCheckOut;
    public String buttonGuests;
    public String dropdownGuests;
    public Guests addAndMinGuests;
    public String buttonFind;

    public SearchOptions(String buttonCheckIn, String buttonCheckOut,
                         String buttonGuests, String dropdownGuests, String buttonFind,
                         String dropdownCalendar, String buttonPrev, String buttonNext,
                         String textMonth, String textDay, String buttonAddAndMin, String buttonDone) {
        this.buttonCheckIn = new CalendarDate(buttonCheckIn, dropdownCalendar, buttonPrev,
                buttonNext, textMonth, textDay);
        this.buttonCheckOut = new CalendarDate(buttonCheckOut, dropdownCalendar, buttonPrev,
                buttonNext, textMonth, textDay);
        this.buttonGuests = buttonGuests;
        this.dropdownGuests = dropdownGuests;
        this.addAndMinGuests = new Guests(buttonAddAndMin, buttonDone);
        this.buttonFind = buttonFind;
    }

    public void clickCheckIn() {
        $(By.xpath(buttonCheckIn.buttonCalendar)).shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        $$(By.xpath(buttonCheckIn.textDay)).get(0).shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
    }

    public void clickCheckOut () {

        $(By.xpath(buttonCheckOut.buttonCalendar)).shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        $$(By.xpath(buttonCheckOut.textDay)).get(1).shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
    }
}
