package module7.Task7_5;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vlad on 15.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>();
        List<String> stringArrayList = new ArrayList<>();
        List<Integer> integerLinkedList = new LinkedList<>();
        List<String> stringLinkedList = new LinkedList<>();

        long startTime;
        long finishTime;

        System.out.println("System output:\nTest of ArrayList and LinkedList for add method (1000, 10000 elements). Time in millis:\n");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerArrayList.add(5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerArrayList for add method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerLinkedList.add(5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for add method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringArrayList.add("Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for add method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringLinkedList.add("Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for add method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        integerArrayList.clear();
        integerLinkedList.clear();
        stringArrayList.clear();
        stringLinkedList.clear();

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integerArrayList.add(5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("\nTest of integerArrayList for add method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integerLinkedList.add(5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for add method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringArrayList.add("Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for add method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringLinkedList.add("Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for add method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nSystem output:\nTest of ArrayList and LinkedList for set method (1000, 10000 elements). Time in millis:\n");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerArrayList.set(i, 5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerArrayList for set method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerLinkedList.set(i, 5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for set method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringArrayList.set(i, "Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for set method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringLinkedList.set(i, "Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for set method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integerArrayList.set(i, 5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("\nTest of integerArrayList for set method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integerLinkedList.set(i, 5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for set method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringArrayList.set(i, "Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for set method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringLinkedList.set(i, "Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for set method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");


        //////////////////////////////////////

        System.out.println("\nSystem output:\nTest of ArrayList and LinkedList for get method (1000, 10000, 100000 elements). Time in millis:\n");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerArrayList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerArrayList for get method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerLinkedList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for get method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringArrayList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for get method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringLinkedList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for get method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");


        ///////////////////////////////////////


        System.out.println("\nSystem output:\nTest of ArrayList and LinkedList for remove method (1000, 10000 elements). Time in millis:\n");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerArrayList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerArrayList for remove method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integerLinkedList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for remove method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringArrayList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for remove method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringLinkedList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for remove method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

    }

}
