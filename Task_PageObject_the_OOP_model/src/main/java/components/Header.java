package components;

import org.openqa.selenium.By;
import page.DialogCreateAccount;
import page.DialogSingIn;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.*;

public class Header {

    DialogSingIn dialogSingIn;
    DialogCreateAccount dialogCreateAccount;

    private DropdownMenu dropdownAccount;
    private DropdownMenu dropdownCurrency;
    private Menu menu;

    public Header() {
        dialogSingIn = new DialogSingIn();
        dialogCreateAccount = new DialogCreateAccount();
        dropdownCurrency = new DropdownMenu(BUTTON_CURRENCY_XPATH, BUTTON_CURRENCY_CONTAINER_XPATH);
        menu = new Menu();
    }

    public void clickSingIn(String locator, String email, String password) {
        $(locator).click();
        dialogSingIn.logInAccount(email, password);
    }

    public void clickSingUp(String locator, String firstName, String lastName, String email, String password) {
        $(locator).click();
        dialogCreateAccount.registerAnAccount(firstName, lastName, email, password);

    }

    public void chooseCurrency(String element) {
        dropdownCurrency.selectFromDropdownMenu(element);
        $(By.xpath(element)).click();
    }

    public String  chooseFunction () {
        return menu.menuNavigation();
    }
    public void outAccount(String locator) {

        // dropdownAccount.selectFromDropdownMenu();

    }


}
