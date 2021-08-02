package components;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchOptions {

    public CalendarDate buttonCheckIn;
    public CalendarDate buttonCheckOut;
    public String buttonGuests;
    public Guests dropdownGuests;
    public String buttonFind;

    public SearchOptions(String buttonCheckIn, String buttonCheckOut,
                         String buttonGuests, String dropdownGuests, String buttonFind) {
        this.buttonCheckIn.buttonCalendar = buttonCheckIn;
   //     this.buttonCheckOut.buttonCalendar = buttonCheckOut;
   //     this.buttonGuests = buttonGuests;
  //      this.dropdownGuests. = dropdownGuests;
        this.buttonFind = buttonFind;
    }
        public void clickCheckIn(String buttonCalendar, String dropdownCalendar,
                             String buttonPrev, String buttonNext,
                             String textMonth, String textDay) {
        buttonCheckIn = new CalendarDate(buttonCalendar, dropdownCalendar,
                buttonPrev, buttonNext, textMonth, textDay);
        $(By.xpath(buttonCheckIn.buttonCalendar)).click();
        $$(By.xpath(buttonCheckIn.textDay)).get(0).click();
    }
//
//    public void clickCheckOut (String buttonCalendar, String dropdownCalendar,
//                             String buttonPrev, String buttonNext,
//                             String textMonth, String textDay) {
//        buttonCheckOut = new CalendarDate(buttonCalendar, dropdownCalendar,
//                buttonPrev, buttonNext, textMonth, textDay);
//        $(By.xpath(buttonCheckOut.buttonCalendar)).click();
//        $$(By.xpath(buttonCheckOut.textDay)).get(1).click();
//    }
}
