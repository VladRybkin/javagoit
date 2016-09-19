package src.module5;

/**
 * Created by Vlad on 11.09.2016.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();
}
