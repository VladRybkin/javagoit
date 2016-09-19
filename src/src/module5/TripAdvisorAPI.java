package src.module5;

import java.util.Date;

/**
 * Created by Vlad on 11.09.2016.
 */
public class TripAdvisorAPI implements API {
    private Room[] rooms  = new Room[5];
    public TripAdvisorAPI() {
        Room room1 = new Room(1, 200, 3, new Date(20072016), "Kyivhotel", "Kyiv");
        rooms[0]=room1;
        Room room2 = new Room(2, 200, 3, new Date(20072016), "Kyivhotel", "Kyiv");
        rooms[01]=room2;
        Room room3 = new Room(3, 200, 3, new Date(20072016), "Kyivhotel", "Kyiv");
        rooms[2]=room3;
        Room room4 = new Room(4, 200, 3, new Date(20072016), "Kyivhotel", "Kyiv");
        rooms[3]=room4;
        Room room5 = new Room(5, 200, 3, new Date(20072016), "Kyivhotel", "Kyiv");
        rooms[4]=room5;
        rooms =new Room[]{room1, room2, room3, room4, room5};

        //rooms[5] = new Room(5, 600, 3, new Date(24072016), "Kyivhotel", "Kyiv");
        //long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName
    }
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        return null;
    }
    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
