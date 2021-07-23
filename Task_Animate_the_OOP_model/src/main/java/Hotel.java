import java.awt.*;




public class Hotel {
    private String hotelName;
    private HotelRoom[] listRomms;
    private Image photoHotel;

    public HotelRoom[] getListRomms() {
        return listRomms;
    }

    public void setListRooms(HotelRoom[] rooms) {
        for (int i = 0; i < listRomms.length; i++) {
            listRomms[i] = rooms[i];
        }
            }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Image getPhotoHotel() {
        return photoHotel;
    }

    public void setPhotoHotel(Image photoHotel) {
        this.photoHotel = photoHotel;
    }
}
