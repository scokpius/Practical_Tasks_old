package components;


public class Guests {


    private String buttonAddRoom;
    private String buttonMinRoom;
    private String buttonAddAdult;
    private String buttonMinAdult;
    private String buttonAddChildren;
    private String buttonMinChildren;
    private String buttonDone;



    public Guests(String buttonAddAndMin, String buttonDone) {
        this.buttonAddRoom = String.format(buttonAddAndMin, 1, 2);
        this.buttonMinRoom = String.format(buttonAddAndMin, 1, 1);
        this.buttonAddAdult = String.format(buttonAddAndMin, 2, 2);
        this.buttonMinAdult = String.format(buttonAddAndMin, 2, 1);
        this.buttonAddChildren = String.format(buttonAddAndMin, 3, 2);
        this.buttonMinChildren = String.format(buttonAddAndMin, 2, 1);
        this.buttonDone = buttonDone;
    }

    public AddAndMinButton addAndMinButtonRoom = new AddAndMinButton(this.buttonAddRoom, this.buttonMinRoom);
    public AddAndMinButton addAndMinButtonAdult = new AddAndMinButton(this.buttonAddAdult, this.buttonAddAdult);
    public AddAndMinButton addAndMinButtonChildren = new AddAndMinButton(this.buttonAddChildren, this.buttonMinChildren);


}

