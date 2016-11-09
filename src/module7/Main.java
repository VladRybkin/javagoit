package module7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.function.Supplier;

/**
 * Created by Vlad on 07.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Sort1 sort1 = new Sort1();
        TreeSetclass treeSet = new TreeSetclass();


        sort1.deleteDuplicates();
        sort1.deletePriceLess(200);
        sort1.getListOrder();
        sort1.getListuser();
        sort1.increaseorderANDUsercity();
        sort1.decrease();
        sort1.sortItemShopCity();
        sort1.separateList(Currency.EUR);
        treeSet.deleteForCurency(Currency.EUR);
        treeSet.findLastName("Petrov");


        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 1000000; j++) {
                int a = i * 10 - 1000 + 200 - 21212;
                int b = i;
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }


}

