import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class FunctionMenu {

    public static final String LIST_FUNCTIONS_XPATH = "//*[@class=\"farefinder-options\"]/div";//listFunctions
    public FormFindHotel formFindHotel;

    public void unctionMenuNavigation() {   // локатор элемента списка
        $$(By.xpath(LIST_FUNCTIONS_XPATH)).get(0).click();
    }


}
