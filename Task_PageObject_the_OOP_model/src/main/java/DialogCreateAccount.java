import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.$;

public class DialogCreateAccount extends DialogSingIn {

    public static final String INPUT_FIRST_NAME_CSS = "#firstName"; // inputFirstName локатор
    public static final String INPUT_LAST_NAME_CSS = "#lastName"; // inputLastName локатор


    public void registerAnAccount(String firstName, String lastName, String email, String password) {
        $(INPUT_FIRST_NAME_CSS).setValue(firstName);
        $(INPUT_LAST_NAME_CSS).setValue(lastName);
        $(getInputEmailCss()).setValue(email);
        $(getInputPasswordCss()).setValue(password);
        $(getButtonSingInXpath()).click();
    }

}
