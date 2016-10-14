package Module8;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Vlad on 12.10.2016.
 */
public class DaoImpl<T> implements AbstractDAO<T> {
    List<T>list=new ArrayList<T>();
    @Override
    public T save(T t) {
        list.add(t);
        System.out.println("has saved:\t");
        return null;
    }

    @Override
    public void delete(T t) {
        list.remove(t);
        System.out.println("has deleted:\t");


    }

    @Override
    public void deleteAll(List<T> t) {
        list.removeAll(t);
        System.out.println("have deleted all:\t");



    }

    @Override
    public void saveall(List<T> t) {
       list.addAll(t);
        System.out.println("have added all:\t");
    }

    @Override
    public List<T> getList() {
        return list;
    }
}
