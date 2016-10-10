package src.module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Vlad on 11.09.2016.
 */
public class TripAdvisorAPI implements API {
    DAO dao=new DAOimpl();
    private Room[] rooms  = new Room[5];
    public TripAdvisorAPI() {
        dao.save(new Room(1, 100, 3, new Date(), "Paradise", "Kiev"));
        dao.save(new Room(2, 150, 3, new Date(), "City Hotel", "Kiev"));
        dao.save(new Room(3, 300, 2, new Date(), "Grant Hotel", "Kiev"));
        dao.save(new Room(4, 600, 1, new Date(), "Bontiak Hotel", "Kiev"));
        dao.save(new Room(5, 100, 3, new Date(), "Paradise", "Kiev"));

        //rooms[5] = new Room(5, 600, 3, new Date(24072016), "Kyivhotel", "Kyiv");
        //long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName
    }
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        //Room roomFind = new Room(1, 100, 3, new Date(), "","");
        Room roomFind = new Room(price, persons, city, hotel);
        ArrayList<Room> list = new ArrayList<>();
        for (Room room : rooms) {
            if (room.equals(roomFind)) {
                list.add(room);
            }
        }
        return list.toArray(new Room[list.size()]);
    }
    @Override
    public Room[] getAll() {
        return rooms;
    }


}
