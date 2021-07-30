package components;

import java.time.LocalDate;

import static com.codeborne.selenide.Selenide.*;

public class Calendar {

    private LocalDate textDate; // дата в календаре вносимая пользователем

                                                            // локаторы для HomePage
    private String buttonCalendar; // локатор кнопки календаря     XPath = //*[@id="input1-farefinder-hotel-date"]
    private String dropdownCalendar; // локатор выподающей менюшки с календарем    XPath = //*[@id="tipContent-888"]
    private String buttonPrev; // локатор кнопки смены месяца назад    XPath =  //*[@role="application"]/div[1]/button
    private String buttonNext; // локатор кнопки смены месяца вперед    XPath =  //*[@role="application"]/div[3]/button
    private String textMonth; // локатор месяца    XPath =  //*[@class="month multi simple"]/h4/span
    private String textDay; // локатор дня     XPath = //*[@id="tipContent-329"]/span[2]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[3]/div/div/div


    public void checkDate(LocalDate textDate) {
        $(this.buttonCalendar).click();

        String month = $(this.dropdownCalendar).find(this.textMonth).getText();
        textDate.getMonth(); // Возвращает название месяца



    }


}
