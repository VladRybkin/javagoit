package Module8.AdditionalTasks;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vlad on 14.10.2016.
 */
public class AbstractDaoimpl<T> implements AbstractDAOadd<T> {
    List<T>list=new ArrayList<T>();
    @Override
    public void deleteById(long id) {

    }

    @Override
    public T get(long id) {
        return null;
    }
}
