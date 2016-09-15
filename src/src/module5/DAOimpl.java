package src.module5;

import java.util.Date;

/**
 * Created by Vlad on 11.09.2016.
 */
public class DAOimpl implements DAO {
    @Override
    public Room save(Room room) {
        return null;
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room update(Room room) {
        return null;
    }

    @Override
    public Room findById(long id) {
       Room room = new Room(5, 600, 3, new Date(24072016), "Kyivhotel", "Kyiv");
        return room;
    }
}
