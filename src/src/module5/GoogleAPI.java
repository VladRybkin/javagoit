package src.module5;

import java.util.Date;

/**
 * Created by Vlad on 11.09.2016.
 */
public class GoogleAPI implements API {
    public Room[] rooms  = new Room[5];
    public GoogleAPI() {
        rooms[1] = new Room(1, 200, 3, new Date(20072016), "Kyivhotel", "Kyiv");
        rooms[2] = new Room(2, 300, 3, new Date(21072016), "Kyivhotel", "Kyiv");
        rooms[3] = new Room(3, 400, 3, new Date(22072016), "Kyivhotel", "Kyiv");
        rooms[4] = new Room(4, 500, 3, new Date(23072016), "Kyivhotel", "Kyiv");
        rooms[5] = new Room(5, 600, 3, new Date(24072016), "Kyivhotel", "Kyiv");
        //long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName
    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
