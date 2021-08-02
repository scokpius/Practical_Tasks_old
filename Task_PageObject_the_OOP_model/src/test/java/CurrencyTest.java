import org.junit.Assert;
import org.junit.Test;
import page.HomePage;

import static com.codeborne.selenide.Selenide.$;

public class CurrencyTest {
    @Test
    public void checkTheCurrencyHasChanged(){
        HomePage homePage = new HomePage();
        homePage.enterTheSite("https://www.hotwire.com/");
        homePage.chooseCurrency();
        homePage.waitVisibleCurrency("#currency > span.btn__label");
        Assert.assertTrue("Wrong currency selected", $("#currency > span.btn__label").getText().equals("EUR"));
    }

}
