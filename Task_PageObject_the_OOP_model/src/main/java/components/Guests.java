package components;


public class Guests {

    // локаторы для HomePage
//    private static final String BUTTON_ADD_ROOM_XPATH="//*[@id=\"tipContent-139\"]/span[2]/div/div[1]/div[1]/div/button[2]";
//    private static final String BUTTON_MIN_ROOM_XPATH ="//*[@id=\"tipContent-139\"]/span[2]/div/div[1]/div[1]/div/button[1]";
//    private static final String BUTTON_ADD_ADULT_XPATH ="//*[@id=\"tipContent-139\"]/span[2]/div/div[1]/div[2]/div/button[2]";
//    private static final String BUTTON_MIN_ADULT_XPATH ="//*[@id=\"tipContent-139\"]/span[2]/div/div[1]/div[2]/div/button[1]";
//    private static final String BUTTON_ADD_CHILDREN_XPATH ="//*[@id=\"tipContent-139\"]/span[2]/div/div[1]/div[3]/div/button[2]";
//    private static final String BUTTON_MIN_CHILDREN_XPATH ="//*[@id=\"tipContent-139\"]/span[2]/div/div[1]/div[3]/div/button[1]";
//    public static final String BUTTON_DONE_XPATH ="//*[@id=\"tipContent-139\"]/span[2]/div/div[2]/div/button";
    private String buttonAddRoom;
    private String buttonMinRoom;
    private String buttonAddAdult;
    private String buttonMinAdult;
    private String buttonAddChildren;
    private String buttonMinChildren;
    private String buttonDone;

    public Guests(String buttonAddRoom, String buttonMinRoom, String buttonAddAdult, String buttonMinAdult,
                  String buttonAddChildren, String buttonMinChildren, String buttonDone) {
        this.buttonAddRoom = buttonAddRoom;
        this.buttonMinRoom = buttonMinRoom;
        this.buttonAddAdult = buttonAddAdult;
        this.buttonMinAdult = buttonMinAdult;
        this.buttonAddChildren = buttonAddChildren;
        this.buttonMinChildren = buttonMinChildren;
        this.buttonDone = buttonDone;
    }

    public AddAndMinButton addAndMinButtonRoom = new AddAndMinButton(this.buttonAddRoom, this.buttonMinRoom);
    public AddAndMinButton addAndMinButtonAdult = new AddAndMinButton(this.buttonAddAdult, this.buttonAddAdult);
    public AddAndMinButton addAndMinButtonChildren = new AddAndMinButton(this.buttonAddChildren, this.buttonMinChildren);


}

