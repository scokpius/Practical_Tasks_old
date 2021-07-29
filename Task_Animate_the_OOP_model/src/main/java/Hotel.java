import java.util.ArrayList;
import java.util.Arrays;

public class Hotel {
    private String hotelName;
    private ArrayList<HotelRoom> listRooms;
    private ArrayList<String> photoHotel;
    private Location location;


    public ArrayList<String> getPhotoHotel() {
        return photoHotel;
    }

    public void setPhotoHotel(ArrayList<String> photoHotel) {
        this.photoHotel.addAll(photoHotel);
    }

    public ArrayList<HotelRoom> getListRooms() {
        return listRooms;
    }

    public void setListRooms(ArrayList<HotelRoom> rooms) {
        for (int i = 0; i < listRooms.size(); i++) {
            listRooms.add(rooms.get(i));
        }
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }


}
