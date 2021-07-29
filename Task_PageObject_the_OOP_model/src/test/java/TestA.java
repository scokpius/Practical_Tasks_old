import org.junit.Test;


public class TestA {

    @Test
    public void userCanLoginByUsername() {
       HomePage homePage = new HomePage();
       homePage.enterTheSite("https://www.hotwire.com/");

     //  homePage.createAccount();
     //  homePage.clickSingIN();
     //  homePage.chooseCurrency();
       homePage.chooseFunction();




//        $("#submit").click();
//        $(".loading_progress").should(disappear); // Само подождёт, пока элемент исчезнет
//        $("#username").shouldHave(text("Hello, Johny!")); // Само подождёт, пока у элемента появится нужный текст
    }
}
