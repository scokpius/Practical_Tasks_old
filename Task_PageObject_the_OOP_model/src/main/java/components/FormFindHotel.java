package components;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class FormFindHotel extends SearchOptions {

    public String inputLocation;
                                    //локаторы
    public FormFindHotel(String inputLocation, String buttonCheckIn, String buttonCheckOut,
                         String buttonGuests, String dropdownGuests, String buttonFind, String dropdownCalendar,
                         String buttonPrev, String buttonNext, String textMonth, String textDay,
                         String buttonAddAndMin, String buttonDone) {
        super(buttonCheckIn, buttonCheckOut, buttonGuests, dropdownGuests, buttonFind, dropdownCalendar, buttonPrev,
                buttonNext, textMonth, textDay, buttonAddAndMin, buttonDone);
        this.inputLocation = inputLocation;
    }

    public void writeFindSearch(String  location) {
        $(By.xpath(inputLocation)).setValue(location).
                shouldBe(Condition.visible, Duration.ofSeconds(5)).pressEnter();
        $(By.xpath(super.buttonCheckIn.buttonCalendar)).should(Condition.visible).click();
        $(By.xpath(super.buttonCheckIn.dropdownCalendar)).should(Condition.visible).click();
        $(By.xpath(super.buttonCheckIn.textDay)).should(Condition.visible).click();
        $(By.xpath(super.buttonCheckOut.buttonCalendar)).should(Condition.visible).click();
        $(By.xpath(super.buttonCheckOut.dropdownCalendar)).should(Condition.visible).click();
        $(By.xpath(super.buttonCheckOut.textDay)).should(Condition.visible).click();
        $(By.xpath(buttonFind)).shouldBe(Condition.disabled).pressEnter();

    }
}
