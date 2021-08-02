package page;

import com.codeborne.selenide.Condition;
import components.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static constant.XPathCSS.*;

public class HomePage extends FormFindHotel {
    private static final String BUTTON_SING_UP_CSS = "#collapsibleNavbar > ul > li.nav-item.sign.auth-buttons.auth-buttons--visible > button.btn.btn-primary.sign-up.btn-xs"; // buttonSignUp локатор
    private static final String BUTTON_SING_IN_CSS = "#collapsibleNavbar > ul > li.nav-item.sign.auth-buttons.auth-buttons--visible > button.btn.btn-default.sign-in.btn-xs"; // buttonSignIn локатор


    public Header header;
    private FunctionMenu functionMenu;

    public HomePage() {
        super(HOME_PAGE_INPUT_LOCATION_XPATH, HOME_PAGE_BUTTON_CHECK_IN_XPATH, HOME_PAGE_BUTTON_CHECK_OUT_XPATH,
                HOME_PAGE_BUTTON_GUESTS_XPATH, HOME_PAGE_BUTTON_GUESTS_DROPDOWN_XPATH, HOME_PAGE_BUTTON_FIND_XPATH);
        header = new Header();
        functionMenu = new FunctionMenu();
    }

    public HomePage enterTheSite(String locator) {
        open(locator);
        return new HomePage();
    }

    public HomePage clickSingIN(String email, String password) {
        header.clickSingIn(BUTTON_SING_IN_CSS, email, password);
        return new HomePage();
    }

    public HomePage createAccount(String firstName, String lastName, String email, String password) {
        header.clickSingUp(BUTTON_SING_UP_CSS, firstName, lastName, email, password);
        return new HomePage();
    }

    public void chooseCurrency() {
        header.chooseCurrency(BUTTON_CURRENCY_ELEMENTS_XPATH);
        new HomePage();
    }

    public void waitVisibleCurrency(String locator) {

        $(locator).shouldBe(Condition.visible);
    }

    public void searchForHotel(String location) {
        super.writeFindSearch(location);
        $(By.xpath(super.buttonFind)).pressEnter();

    }

    public HotelsPage chooseFunction() {
        String locator = header.chooseFunction();
        return new HotelsPage().goToHotelPage(locator).waitForUpdateHotelPage();

    }


}
