package components;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.LocalDate;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FormFindHotel extends SearchOptions {

    public String inputLocation;

    public FormFindHotel(String inputLocation, String buttonCheckIn, String buttonCheckOut,
                         String buttonGuests, String dropdownGuests, String buttonFind) {
        super(buttonCheckIn, buttonCheckOut, buttonGuests, dropdownGuests, buttonFind);
        this.inputLocation = inputLocation;
    }

    public void writeFindSearch(String location) {
        $(By.xpath(inputLocation)).setValue(location).pressEnter();
        $(By.xpath(super.buttonCheckIn.buttonCalendar)).click();


        $(By.xpath(buttonFind)).pressEnter().shouldBe(Condition.disabled);


     //   $$(By.xpath(super.buttonCheckIn.buttonCalendar)).get(0).click();




      //  $(buttonCheckIn.checkDate(text)).click();
      //  $(buttonCheckOut.checkDate(text)).click();
      //  $(buttonGuests).click();
      //  $(dropdownGuests).click();
    }
}