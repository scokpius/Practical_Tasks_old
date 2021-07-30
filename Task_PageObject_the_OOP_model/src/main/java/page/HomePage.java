package page;

import components.FunctionMenu;
import components.Header;

import static com.codeborne.selenide.Selenide.open;

public class HomePage {
    private static final String BUTTON_SING_UP_CSS = "#collapsibleNavbar > ul > li.nav-item.sign.auth-buttons.auth-buttons--visible > button.btn.btn-primary.sign-up.btn-xs"; // buttonSignUp локатор
    private static final String BUTTON_SING_IN_CSS = "#collapsibleNavbar > ul > li.nav-item.sign.auth-buttons.auth-buttons--visible > button.btn.btn-default.sign-in.btn-xs"; // buttonSignIn локатор
    private static final String BUTTON_CURRENCY_ELEMENTS_XPATH = "//*[@id=\"currency--container\"]/li[1]"; // buttonCurrency локатор

    public Header header;
    private FunctionMenu functionMenu;


    public HomePage() {

        header = new Header();
        functionMenu = new FunctionMenu();
    }

    public HomePage enterTheSite(String locator) {
        open(locator);
        return new HomePage();
    }

    public HomePage clickSingIN() {
        header.clickSingIn(BUTTON_SING_IN_CSS, "scokpius@gmsil.com", "201184");
        return new HomePage();
    }

    public HomePage createAccount() {
        header.clickSingUp(BUTTON_SING_UP_CSS, "Vasia", "Pupkin", "lenka_107522@mail.ru", "12345678");
        return new HomePage();
    }

    public void chooseCurrency() {
        header.chooseCurrency(BUTTON_CURRENCY_ELEMENTS_XPATH);
        new HomePage();
    }

    public HotelsPage chooseFunction() {
        String locator = header.chooseFunction();
        return new HotelsPage().goToHotelPage(locator).waitForUpdateHotelPage();

    }


}
