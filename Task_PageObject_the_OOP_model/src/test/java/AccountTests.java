import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import page.*;
import components.Header;

import static com.codeborne.selenide.Selenide.$;


public class AccountTests {
        /* проверить не удалось на сайте не возможно зарегистрироваться вылазит
           сообщение о том что не верно указон email, даже примануальном тестировани
        */
    @Test
    public void checkAnAccountHasBeenCreated() {
       HomePage homePage = new HomePage();
       Header header = new Header();
       homePage.enterTheSite("https://www.hotwire.com/");
       homePage.createAccount("Vasia", "Pupkin", "vasia_pupkin_mail00@mail.ru",
               "pass_WORD_2000");
       Assert.assertTrue("Account not activated",
               $(By.xpath("//*[@id=\"dropdown-account-options\"]/span[1]")).getText() == "Vasia");
    }
        // проверить не удается вылазит капча
    @Test
    public void checkThatTheUserIsLoggedIn(){
        HomePage homePage = new HomePage();
        homePage.enterTheSite("https://www.hotwire.com/");
        homePage.clickSingIN( "lenka_107522@mail.ru", "201184");
        Assert.assertTrue("User is not logged in account", $(By.xpath("//*[@id=\"dropdown-account-options\"]/span[1]")).getText() == "Alena");

    }

    @Test
    public void checkThatTheUserLoggedOutTheAccount() {
        HomePage homePage = new HomePage();
        homePage.enterTheSite("https://www.hotwire.com/");
        homePage.clickSingIN( "lenka_107522@mail.ru", "201184");

    }

}
