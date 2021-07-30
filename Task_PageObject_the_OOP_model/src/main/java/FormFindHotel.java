import java.time.LocalDate;

import static com.codeborne.selenide.Selenide.$;

public class FormFindHotel {
    //для HomPage
    public static final String INPUT_LOCATION_XPATH = "//*[@id=\"root\"]//form/div[1]/div/div/div/input"; //inputLocation
    public static final String BUTTON_CHECK_IN_XPATH = "//*[@role=\"presentation\"]/div/div[1]/div[1]"; //buttonCheckIn
    public static final String BUTTON_CHECK_OUT_XPATH = "//*[@role=\"presentation\"]/div/div[1]/div[2]"; //buttonCheckOut
    public static final String BUTTON_GUESTS_XPATH = "//*[@id=\"root\"]//form/div[2]/div[2]/div/div/div/div[1]"; //buttonGuests
    public static final String BUTTON_GUESTS_DROPDOWN_XPATH = "//*[@id=\"tipContent-139\"]/span[2]"; //dropdownGuests
    public static final String BUTTON_FIND_XPATH = "//*[@id=\"root\"]//form/div[2]/div[3]/button"; //buttonFind
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
        $(dropdownGuests).click();
    }
}
