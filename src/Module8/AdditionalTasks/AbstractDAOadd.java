package Module8.AdditionalTasks;

/**
 * Created by Vlad on 14.10.2016.
 */
public interface AbstractDAOadd<T> {
    void deleteById(long id);
    T get(long id);
}
