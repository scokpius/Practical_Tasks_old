package components;


public class Guests {


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

