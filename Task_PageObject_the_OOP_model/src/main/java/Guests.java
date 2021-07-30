import static com.codeborne.selenide.Selenide.$;

public class Guests {

    // локаторы
    private static final String BUTTON_ADD_ROOM_XPATH="//*[@id=\"tipContent-139\"]/span[2]/div/div[1]/div[1]/div/button[2]";
    private static final String BUTTON_MIN_ROOM_XPATH ="//*[@id=\"tipContent-139\"]/span[2]/div/div[1]/div[1]/div/button[1]";
    private static final String BUTTON_ADD_ADULT_XPATH ="//*[@id=\"tipContent-139\"]/span[2]/div/div[1]/div[2]/div/button[2]";
    private static final String BUTTON_MIN_ADULT_XPATH ="//*[@id=\"tipContent-139\"]/span[2]/div/div[1]/div[2]/div/button[1]";
    private static final String BUTTON_ADD_CHILDREN_XPATH ="//*[@id=\"tipContent-139\"]/span[2]/div/div[1]/div[3]/div/button[2]";
    private static final String BUTTON_MIN_CHILDREN_XPATH ="//*[@id=\"tipContent-139\"]/span[2]/div/div[1]/div[3]/div/button[1]";
    public static final String BUTTON_DONE_XPATH ="//*[@id=\"tipContent-139\"]/span[2]/div/div[2]/div/button";




    public AddAndMinButton addAndMinButtonRoom = new AddAndMinButton(BUTTON_ADD_ROOM_XPATH, BUTTON_MIN_ROOM_XPATH);
    public AddAndMinButton addAndMinButtonAdult = new AddAndMinButton(BUTTON_ADD_ADULT_XPATH, BUTTON_MIN_ADULT_XPATH);
    public AddAndMinButton addAndMinButtonChildren = new AddAndMinButton(BUTTON_ADD_CHILDREN_XPATH, BUTTON_MIN_CHILDREN_XPATH);


}
