package src.module5;

import java.util.Date;

/**
 * Created by Vlad on 11.09.2016.
 */
public class DAOimpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("Room save " + room.getHotelName() + " has saved");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room delete " + room.getHotelName() + " has deleted");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room update" + room.getHotelName() + " has updated");
        return room;
    }


    @Override
    public Room findById(long id) {
        System.out.println("Room found by id: " + id);
        return null;
    }
    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
