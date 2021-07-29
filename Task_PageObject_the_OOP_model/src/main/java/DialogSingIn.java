import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.$;

public class DialogSingIn {
    private static final String INPUT_EMAIL_CSS = "#email"; // inputEmail локатор
    private static final String INPUT_PASSWORD_CSS = "#password";// inputPassword локатор
    private static final String BUTTON_SING_IN_XPATH = "//*[@class = \"form-row\"]/button"; // buttonSingIn = new Dial#passwordog(" "); // локатор


    public static String getInputEmailCss() {
        return INPUT_EMAIL_CSS;
    }

    public static String getButtonSingInXpath() {
        return BUTTON_SING_IN_XPATH;
    }

    public static String getInputPasswordCss() {
        return INPUT_PASSWORD_CSS;
    }

    public void logInAccount(String email, String password) {
        $(INPUT_EMAIL_CSS).setValue(email);
        $(INPUT_PASSWORD_CSS).setValue(password);
        $(BUTTON_SING_IN_XPATH).click();
    }
}
