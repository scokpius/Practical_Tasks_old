import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Header {

    private static final String BUTTON_CURRENCY_XPATH = "//*[@id=\"currency\"]"; // buttonCurrency локатор
    private static final String BUTTON_CURRENCY_CONTAINER_XPATH = "//*[@id=\"currency--container\"]"; // buttonCurrency локатор
    private static final String BUTTON_CURRENCY_ELEMENTS_XPATH = "//*[@id=\"currency--container\"]/li[3]"; // buttonCurrency локатор
    private static final String BUTTON_ACCOUNT_XPATH = "//*[@id=\"dropdown-account-options\"]"; // buttonAccount локатор

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

    public void  chooseFunction (String locator) {
        menu.menuNavigation(locator);
    }
    public void outAccount(String locator) {

        // dropdownAccount.selectFromDropdownMenu();

    }


}
