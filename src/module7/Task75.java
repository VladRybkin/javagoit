package module7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vlad on 10.10.2016.
 */
public class Task75 {
        public static void main(String[] args) {
            List<Integer> integers=new ArrayList<>(10000);
            List<String> strings=new ArrayList<>(1000);
            List<String> stringList=new LinkedList<>();




            long start = System.currentTimeMillis();

            for(int i = 0 ; i < 1000000; i ++) {
                for(int j = 0 ; j < 1000000; j ++) {
                    int a = i * 10 - 1000 + 200 - 21212;

                    int b = i;
                }
            }

            long finish = System.currentTimeMillis();

            System.out.println(finish - start);
        }
}
