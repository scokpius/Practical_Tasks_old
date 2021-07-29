import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Menu {

    public static final String LINK_LIST_MENU_XPATH = "//*[@id=\"root\"]/div[1]/nav/div/ul/li";//  linkListMenu: SelenideElement
    public void menuNavigation(String locator) {   // локатор элемента списка

        $(By.xpath(locator)).click();
    }

}
