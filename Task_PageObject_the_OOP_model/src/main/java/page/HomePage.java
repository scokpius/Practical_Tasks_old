package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import components.FormFindHotel;
import components.FunctionMenu;
import components.Header;
import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.Cookie;

import java.util.Date;
import java.util.concurrent.TimeUnit;

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
                HOME_PAGE_BUTTON_GUESTS_XPATH, HOME_PAGE_BUTTON_GUESTS_DROPDOWN_XPATH, HOME_PAGE_BUTTON_FIND_XPATH,
                HOME_PAGE_DROPDOWN_CALENDAR_XPATH, HOME_PAGE_BUTTON_PREV_MONTH_XPATH, HOME_PAGE_BUTTON_NEXT_MONTH_XPATH,
                HOME_PAGE_TEXT_MONTH_XPATH, HOME_PAGE_TEXT_DAY_XPATH, HOME_PAGE_BUTTON_ADD_MIN_XPATH, HOME_PAGE_BUTTON_DONE_XPATH);
        header = new Header();
        functionMenu = new FunctionMenu();
    }

    public HomePage enterTheSite(String locator) {
        open(locator);
        WebDriverRunner.getWebDriver().manage().deleteCookieNamed("ak_bmsc");
        WebDriverRunner.getWebDriver().manage().addCookie(new Cookie("ak_bmsc",
                "5949BB4D1CE164DBFF9FA3CE76ECB53C~000000000000000000000000000000~YAAQX/1zPmwO7PB6AQAAGMn" +
                        "MCgzyo4OhFNpAH7LQrwG7EcgwjNEGjvPmn04RrImfbgmSN25chB6KKLX2C1aA9zPbwa3SlXLeKkdob4eVLY89Hz" +
                        "nNU+1T6Z9074XclZiiMnyosqb1iFD0VTx2X1wdV8o9+5kr/ubVWojXdDU52goQJPLXGq3nzS9VLP2cc+bFbhwa2kL" +
                        "9cbLFd6w0Vf4IsonRm9z+YrGslWFyqyVbjGpfbC0JsYKI2VXVRII5wC3LCenCeCj8XAIrMPKIlC6tX22VOeKWiYBQR" +
                        "qs27DUHf6Y5sAwSc9oEHMvClJVeC43qlB2LkJD9Wz9sRr9TCJKbunUn2Z44NZwaJrDKWgVfXRlW3B1pzy3TalZH97jq" +
                        "CafIKLtJqV7cfkWnqhqS60Jc1yHnW+abZHxJlgQnNM5VF6r8ctfml5cytg6FuU5uS1CDb+16AyGxbFdY8Z7RJAAjLPfbB" +
                        "jMMz0G7MCLetfNs3vR5oQRwNdcJT0RyaqVBP8TS",
                ".hotwire.com", "/", DateUtils.addHours(new Date(), 2)));
        WebDriverRunner.getWebDriver().manage().timeouts().pageLoadTimeout(10000,
                TimeUnit.MILLISECONDS);
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
        header.chooseElement(BUTTON_CURRENCY_ELEMENTS_XPATH);
        new HomePage();
    }
    public void chooseSignOut() {
        header.chooseElement(BUTTON_ACCOUNT_ELEMENTS_XPATH);
        new HomePage();
    }

    public void waitVisibleCurrency(String locator) {
        $(locator).shouldBe(Condition.visible);
    }

    public void waitDisableElement(String locator) {
        $(locator).shouldBe(Condition.disabled);
    }

    public void searchForHotel(String location) {
        super.writeFindSearch(location);

    }

    public void chooseCheckInDate() {
        $(super.buttonCheckIn.buttonCalendar).should(Condition.enabled).click();
    }

    public HotelsPage chooseFunction() {
        String locator = header.chooseFunction();
        return new HotelsPage().goToHotelPage(locator).waitForUpdateHotelPage();

    }


}
