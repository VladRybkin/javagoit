package src.module5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Vlad on 11.09.2016.
 */
public class DAOimpl implements DAO {
    private List<Room> list = new ArrayList<>();
    @Override
    public boolean save(Room room) {
        return list.add(room);
    }



    @Override
    public boolean delete(Room room) {
        list.remove(room);
        return true;
    }

    @Override
    public Room update(Room room, int index) {
        return list.set(index, room);
    }


    @Override
    public Room findById(long id) {
        for (Room room : list){
            if (room.getId()== id) return room;
        }
        return null;
    }

}
