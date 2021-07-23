import javax.xml.crypto.Data;

public class HotelReservation {
    private Location location;
    private Data arriveDate;
    private Data departureDate;
    private Room rooms[];

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location1) {
        location = location1;
    }

    public Data getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Data arriveDate) {
        this.arriveDate = arriveDate;
    }

    public Data getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Data departureDate) {
        this.departureDate = departureDate;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] room) {
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = room[i];
        }
    }

    public int countNumberRooms(Room room){
        int countNumberRooms = 0;
               if  (room.getGuests().length > 0){
                   if (room.getGuests().length%4 > 0){
                       countNumberRooms = room.getGuests().length / 4 + 1;
                   } else {countNumberRooms = room.getGuests().length / 4;}
               }
        return countNumberRooms;
    }




}
