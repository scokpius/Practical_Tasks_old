import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class TestA {

    @Test
    public void userCanLoginByUsername() {
        DialogCreateAccount dialogCreateAccount = new DialogCreateAccount();
        DialogSingIn dialogSingIn = new DialogSingIn();
        open("https://www.hotwire.com/");
//        $(By.cssSelector("#collapsibleNavbar > ul > li.nav-item.sign.auth-buttons.auth-buttons--visible > button.btn.btn-default.sign-in.btn-xs")).pressEnter();
        $(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[1]/button[1]")).pressEnter();
      //  dialogCreateAccount.registerAnAccount("Vasia","Pupkin", "lenka_107522@mail.ru","123456");
        dialogSingIn.logInAccount("lenka_107522@mail.ru", "201184");


//        $("#submit").click();
//        $(".loading_progress").should(disappear); // Само подождёт, пока элемент исчезнет
//        $("#username").shouldHave(text("Hello, Johny!")); // Само подождёт, пока у элемента появится нужный текст
    }
}
