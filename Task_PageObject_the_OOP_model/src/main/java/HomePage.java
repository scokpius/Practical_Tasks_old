

import static com.codeborne.selenide.Selenide.open;

public class HomePage {
    private static final String BUTTON_SING_UP_CSS = "#collapsibleNavbar > ul > li.nav-item.sign.auth-buttons.auth-buttons--visible > button.btn.btn-primary.sign-up.btn-xs"; // buttonSignUp локатор
    private static final String BUTTON_SING_IN_CSS = "#collapsibleNavbar > ul > li.nav-item.sign.auth-buttons.auth-buttons--visible > button.btn.btn-default.sign-in.btn-xs"; // buttonSignIn локатор
    private static final String BUTTON_CURRENCY_ELEMENTS_XPATH = "//*[@id=\"currency--container\"]/li[1]"; // buttonCurrency локатор
    public static final String LINK_LIST_MENU_XPATH = "//*[@id=\"root\"]/div[1]/nav/div/ul/li[1]";//  linkListMenu: SelenideElement



//    public static final String BUTTON_PREV = ""; // buttonPrev локатор
//    public static final String BUTTON_NEXT = ""; // buttonNext локатор

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
        header.chooseFunction(LINK_LIST_MENU_XPATH);
         return new HotelsPage();
     //   open("https://www.hotwire.com/hotels/");
    }


}
