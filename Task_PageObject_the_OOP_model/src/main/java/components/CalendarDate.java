package components;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class CalendarDate {

    public String buttonCalendar;
    public String dropdownCalendar;
    public String buttonPrev;
    public String buttonNext;
    public String textMonth;
    public String textDay;

    public CalendarDate(String buttonCalendar, String dropdownCalendar,
                        String buttonPrev, String buttonNext,
                        String textMonth, String textDay) {
        this.buttonCalendar = buttonCalendar;
        this.dropdownCalendar = dropdownCalendar;
        this.buttonPrev = buttonPrev;
        this.buttonNext = buttonNext;
        this.textMonth = textMonth;
        this.textDay = textDay;
    }



}
