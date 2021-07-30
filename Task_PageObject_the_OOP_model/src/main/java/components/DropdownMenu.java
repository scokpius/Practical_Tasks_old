package components;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropdownMenu {

    // локаторы
    private String buttonDropdown;
    private String dropdown;


    public DropdownMenu(String buttonDropdown, String dropdown) {
        this.buttonDropdown = buttonDropdown;
        this.dropdown = dropdown;

    }


    public void selectFromDropdownMenu(String element) {  //
        $(By.xpath(this.buttonDropdown)).click();
        $(By.xpath(this.dropdown)).$(By.xpath(element));

    }




}
