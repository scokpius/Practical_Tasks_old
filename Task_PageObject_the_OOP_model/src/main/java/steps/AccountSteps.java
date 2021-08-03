package steps;

import page.HomePage;

public class AccountSteps {
    HomePage homePage = new HomePage();


    public void createAccount() {
            homePage.enterTheSite("https://www.hotwire.com/");
            homePage.createAccount("Vasia", "Pupkin", "vasia_pupkin_mail00@mail.ru",
                    "pass_WORD_2000");

    }


}
