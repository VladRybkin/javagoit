package module7;

import java.util.*;
import module7.Currency;

/**
 * Created by Vlad on 07.10.2016.
 */
public class TreeSetclass {
    List<User> listuser = new ArrayList<>();
    List<Order> listorder = new ArrayList<>();
    List<String> citieslist = new ArrayList<>();
    String[] cities = {"Kyiv", "Lviv", "kharkiv", "Budapest", "Minsk", "Vienna", "Salzburg"};


    Sort1 sort1 = new Sort1();
    Set<Order> orders = new TreeSet<>();
    Queue<Order> queue = new PriorityQueue<>(new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            return o2.getPrice() - o1.getPrice();
        }
    });


    {
        orders.addAll(sort1.getListOrder());
    }
    void findLastName(String lastName) {
        for (Order order : orders) {
            if (order.getUser().getLastName().equals(lastName))
                System.out.println(order);
        }
        ;
        Queue<Order> queue = new PriorityQueue<>(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
    }

     void deleteForCurency(Currency currency) {
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency().equals(currency)) {
                iterator.remove();
            }
        }
        System.out.println("  deleteForCurency" + (currency));
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}





