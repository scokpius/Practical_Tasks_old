package steps;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import page.HomePage;

import static com.codeborne.selenide.Selenide.$;
import static constant.XPathCSS.HOME_PAGE_BUTTON_GUESTS_DROPDOWN_XPATH;

public class AccountSteps {
    HomePage homePage = new HomePage();

    @Test
    public void createAccount() {
        homePage.enterTheSite("https://www.hotwire.com/");
        homePage.createAccount("Vasia", "Pupkin", "vasia_pupkin_mail00@mail.ru",
                "pass_WORD_2000");
        Assert.assertTrue("Account not activated",
                $(By.xpath("//*[@id=\"dropdown-account-options\"]/span[1]")).getText() == "Vasia");
    }

    @Test
    public void checkThatTheUserIsLoggedIn() {
        HomePage homePage = new HomePage();
        homePage.enterTheSite("https://www.hotwire.com/");
        homePage.clickSingIN("lenka_107522@mail.ru", "201184");
        Assert.assertTrue("User is not logged in account", $(By.xpath("//*[@id=\"dropdown-account-options\"]/span[1]")).getText() == "Hi,Alena");

    }

    @Test
    public void checkThatTheUserLoggedOutTheAccount() {
        HomePage homePage = new HomePage();
        homePage.enterTheSite("https://www.hotwire.com/");
        homePage.clickSingIN("lenka_107522@mail.ru", "201184");
        homePage.chooseSignOut();
        Assert.assertTrue("User is not logged in account", $(By.xpath(HOME_PAGE_BUTTON_GUESTS_DROPDOWN_XPATH)).isEnabled());

    }

}
