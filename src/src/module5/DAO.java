package src.module5;

/**
 * Created by Vlad on 11.09.2016.
 */
public interface DAO {
    boolean save(Room room);
    boolean delete(Room room);
    Room update(Room room, int index);
    Room findById(long id);

}
