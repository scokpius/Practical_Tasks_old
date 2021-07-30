package components;

import java.time.LocalDate;

import static com.codeborne.selenide.Selenide.$;

public class FormFindHotel {

    public String inputLocation;
    public Calendar buttonCheckIn;
    public Calendar buttonCheckOut;
    public String buttonGuests;
    public Guests dropdownGuests;
    public String buttonFind;

    public void writeFindSearch(String location, LocalDate text) {
        $(inputLocation).setValue(location);
      //  $(buttonCheckIn.checkDate(text)).click();
      //  $(buttonCheckOut.checkDate(text)).click();
        $(buttonGuests).click();
      //  $(dropdownGuests).click();
    }
}
