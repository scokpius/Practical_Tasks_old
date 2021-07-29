
import java.time.LocalDate;
import java.util.ArrayList;

public class HotelSearch {
    private Location location;
    private LocalDate arriveDate;
    private LocalDate departureDate;
    private ArrayList<Room> rooms;


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location1) {
        location = location1;
    }

    public LocalDate getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(LocalDate arriveDate) {
        this.arriveDate = arriveDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room>  room) {
        rooms.addAll(room);

    }

    // На сайте так устроенно что в 1 комнату могут заселиться только 4 гостя разного возраста
    // если гостей 5 то автомотически увелисивается количество комнот до 2
    public int countNumberRooms(Room room) {
        int countNumberRooms = 0;
        if (room.getGuests().length > 0) {
            if (room.getGuests().length % 4 > 0) {
                countNumberRooms = room.getGuests().length / 4 + 1;
            } else {
                 countNumberRooms = room.getGuests().length / 4;
                }
            }
        return countNumberRooms;
    }

    public int countGuest() {
        int countGuest = 0;
        for (Room room : rooms) {
            countGuest += room.getGuests().length;
        }
        return countGuest;
    }
}
