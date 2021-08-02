package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DialogCreateAccount extends DialogSingIn {

    public static final String INPUT_FIRST_NAME_CSS = "#firstName"; // inputFirstName локатор
    public static final String INPUT_LAST_NAME_CSS = "#lastName"; // inputLastName локатор
    public static final String BUTTON_SING_UP_XPATH = "//*[@id=\"signin-model\"]/div/div/div[2]/form/div[2]/div[1]/button"; // inputLastName локатор



    public HomePage registerAnAccount(String firstName, String lastName, String email, String password) {
        $(INPUT_FIRST_NAME_CSS).setValue(firstName);
        $(INPUT_LAST_NAME_CSS).setValue(lastName);
        Selenide.$(DialogSingIn.INPUT_EMAIL_CSS).setValue(email);
        Selenide.$(DialogSingIn.INPUT_PASSWORD_CSS).setValue(password);
        $(By.xpath(BUTTON_SING_UP_XPATH)).pressEnter().should(Condition.disappear);
    return new HomePage();
    }

}
