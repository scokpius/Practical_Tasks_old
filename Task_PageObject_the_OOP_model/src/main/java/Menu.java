import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Menu {

    public static final String LINK_LIST_MENU_XPATH = "//*[@id=\"root\"]/div[1]/nav/div/ul/li/a";//  linkListMenu: SelenideElement
    public String menuNavigation() {   // локатор элемента списка
        return  $$(By.xpath(LINK_LIST_MENU_XPATH)).get(0).getAttribute("href");
    }

}
