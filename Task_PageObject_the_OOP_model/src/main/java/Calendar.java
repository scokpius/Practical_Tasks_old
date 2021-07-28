import java.time.LocalDate;

import static com.codeborne.selenide.Selenide.*;

public class Calendar {

    private LocalDate textDate; // дата в календаре вносимая пользователем

                                                            // локаторы для HomePage
    private String button; // локатор кнопки календаря     XPath = //*[@id="input1-farefinder-hotel-date"]
    private String dropdownCalendar; // локатор выподающей менюшки с календарем    XPath = //*[@id="tipContent-888"]
    private String buttonPrev; // локатор кнопки смены месяца назад    XPath =  //*[@role="application"]/div[1]/button
    private String buttonNext; // локатор кнопки смены месяца вперед    XPath =  //*[@role="application"]/div[3]/button
    private String textMonth; // локатор месяца    XPath =  //*[@class="month multi simple"]/h4/span
    private String textDay; // локатор дня     XPath =

    public void checkDate(LocalDate textDate) {
        $(this.button).click();

        String month = $(this.dropdownCalendar).find(this.textMonth).getText();
        textDate.getMonth(); // Возвращает название месяца



    }


}