import java.awt.*;

public class HotelRoom {
    private String roomName;
    private Price price;
    private int numberOfPeopleSleep;
    private int areaRoom;
    private Image photoRoom;

    public HotelRoom(String roomName, Price priceIn, int numberOfPeopleSleep, int areaRoom, Image photoRoom) {
        this.roomName = roomName;
        price = priceIn;
        this.numberOfPeopleSleep = numberOfPeopleSleep;
        this.areaRoom = areaRoom;
        this.photoRoom = photoRoom;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price priceIn) {
        price = priceIn;
    }

    public int getNumberOfPeopleSleep() {
        return numberOfPeopleSleep;
    }

    public void setNumberOfPeopleSleep(int numberOfPeopleSleep) {
        this.numberOfPeopleSleep = numberOfPeopleSleep;
    }

    public int getAreaRoom() {
        return areaRoom;
    }

    public void setAreaRoom(int areaRoom) {
        this.areaRoom = areaRoom;
    }

    public Image getPhotoRoom() {
        return photoRoom;
    }

    public void setPhotoRoom(Image photoRoom) {
        this.photoRoom = photoRoom;
    }
}
