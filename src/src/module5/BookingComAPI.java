package src.module5;

/**
 * Created by Vlad on 11.09.2016.
 */
public class BookingComAPI implements API {
    Room[] rooms;

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
