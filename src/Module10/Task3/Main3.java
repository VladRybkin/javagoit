package Module10.Task3;

import java.util.List;

/**
 * Created by Vlad on 02.11.2016.
 */
public class Main3 {
    public static void main(String[] args) {
        List<String>list=null;
        try {
            list.add("b");
        } catch (NullPointerException e){
            System.out.println("nullpointer"+e);
        }
    }
}
