import org.openqa.selenium.By;
import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class DialogSingIn {
    public static final String INPUT_EMAIL_CSS = "#email"; // inputEmail локатор
    public static final String INPUT_PASSWORD_CSS = "#password";// inputPassword локатор
    public static final String BUTTON_SING_IN_XPATH = "//*[@class = \"form-row\"]/button"; // buttonSingIn = new Dial#passwordog(" "); // локатор


    public static String getInputEmailCss() {
        return INPUT_EMAIL_CSS;
    }

    public static String getInputPasswordCss() {
        return INPUT_PASSWORD_CSS;
    }

    public void logInAccount(String email, String password) {
        $(INPUT_EMAIL_CSS).setValue(email);
        $(INPUT_PASSWORD_CSS).setValue(password);
        $(By.xpath(BUTTON_SING_IN_XPATH)).pressEnter().shouldBe(Condition.visible, Duration.ofSeconds(10));

     }
}
