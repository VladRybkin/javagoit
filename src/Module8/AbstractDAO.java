package Module8;

import java.util.List;

/**
 * Created by Vlad on 12.10.2016.
 */
public interface AbstractDAO<T> {
     T save(T t);
     void delete(T t);
     void deleteAll(List <T> t);
     void saveall(List <T> t);
     List <T> getList();
}
