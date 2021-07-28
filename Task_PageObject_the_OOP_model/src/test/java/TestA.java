import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class TestA {

    @Test
    public void userCanLoginByUsername() {
        open("https://www.hotwire.com/");
        $(By.cssSelector("#collapsibleNavbar > ul > li.nav-item.sign.auth-buttons.auth-buttons--visible > button.btn.btn-default.sign-in.btn-xs")).pressEnter();

//        $(By.name("user.name")).setValue("johny");
//        $("#submit").click();
//        $(".loading_progress").should(disappear); // Само подождёт, пока элемент исчезнет
//        $("#username").shouldHave(text("Hello, Johny!")); // Само подождёт, пока у элемента появится нужный текст
    }
}
