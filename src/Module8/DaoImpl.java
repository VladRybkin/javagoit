package Module8;

import java.util.List;
import java.util.Stack;

/**
 * Created by Vlad on 12.10.2016.
 */
public class DaoImpl<T> implements AbstractDAO<T> {
    Stack<T>stack=new Stack<T>();
    @Override
    public T save(T t) {
        stack.push(t);
        System.out.println("has saved:\t");
        return null;
    }

    @Override
    public void delete(T t) {
        stack.remove(t);
        System.out.println("has deleted:\t");


    }

    @Override
    public void deleteAll(List<T> t) {
        stack.removeAll(t);
        System.out.println("have deleted all:\t");



    }

    @Override
    public void saveall(List<T> t) {
        stack.addAll(t);
        System.out.println("have added all:\t");
    }

    @Override
    public List<T> getList() {
        return stack;
    }
}
