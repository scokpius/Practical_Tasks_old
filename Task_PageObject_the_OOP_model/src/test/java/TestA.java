import org.junit.Test;
import page.*;
import components.Header;


public class TestA {

    @Test
    public void userCanLoginByUsername() {
       HomePage homePage = new HomePage();
       Header header = new Header();
       HotelsPage hotelsPage = new HotelsPage();
       homePage.enterTheSite("https://www.hotwire.com/");

     //  homePage.createAccount();
     //  homePage.clickSingIN();
     //  homePage.chooseCurrency();
       homePage.chooseFunction();
       // homePage.header.chooseFunction("//*[@id=\"root\"]/div[1]/nav/div/ul/li[1]");




//        $("#submit").click();
//        $(".loading_progress").should(disappear); // Само подождёт, пока элемент исчезнет
//        $("#username").shouldHave(text("Hello, Johny!")); // Само подождёт, пока у элемента появится нужный текст
    }
}
