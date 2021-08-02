package page;

public class HotelInformationPage {

    public static final String FIGURE_PHOTOS_CSS = "#Overview > div > div";// figurePhotos локатор
    public static final String FIELD_NAME_HOTEL_XPATH = "//*[@class=\"uitk-heading-3\"]";// fieldNameHotel локатор
    public static final String INPUT_LOCATION_XPATH = " //*[@itemprop=\"address\"]";// inputLocation локатор
    public static final String SELECT_LIST_ROOMS_CSS = "#Offers > span > div:nth-child(3) > div>div"; //тут список selectListRooms локатор
    public static final String LINK_MORE_DETAILS = "//*[@id=\"Offers\"]/span/div[3]/div/div[3]/div[1]/div/button";//  второя три переходит между элементами linkMoreDetails локатор


    public RoomInformationPage selectRoom() {

    return new RoomInformationPage();
    }

}
