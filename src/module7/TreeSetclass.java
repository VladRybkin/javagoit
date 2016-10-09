package module7;

import java.util.*;
import module7.Currency;

/**
 * Created by Vlad on 07.10.2016.
 */
public class TreeSetclass {

    Set<Order> orders = new TreeSet<>();
    Sort1 sort1 =new Sort1();
    {
        orders.addAll(sort1.getListOrder());
    }

    public TreeSetclass() {
        orders.add(new Order(1, 100, Currency.EUR, "itemName", "shopidentificator1", new User("1", "", "", 100)));
        orders.add(new Order(1, 100, Currency.EUR, "itemName", "shopidentificator1", new User("1", "", "", 100)));
        orders.add(new Order(3, 300, Currency.EUR, "itemName", "shopidentificator3", new User("1", "", "", 100)));
        orders.add(new Order(4, 400, Currency.EUR, "itemName", "shopidentificator4", new User("1", "", "", 100)));
        orders.add(new Order(5, 500, Currency.EUR, "itemName", "shopidentificator5", new User("1", "", "", 100)));
        orders.add(new Order(6, 600, Currency.EUR, "itemName", "shopidentificator6", new User("1", "", "", 100)));
        orders.add(new Order(7, 700, Currency.EUR, "itemName", "shopidentificator7", new User("1", "", "", 100)));
        orders.add(new Order(8, 800, Currency.EUR, "itemName", "shopidentificator8", new User("1", "", "", 100)));
        orders.add(new Order(9, 900, Currency.EUR, "itemName", "shopidentificator9", new User("1", "", "", 100)));
        orders.add(new Order(10, 1000, Currency.EUR, "itemName", "shopidentificator10", new User("1", "", "", 100)));
    }


    void findLastName(String lastName) {
        for (Order order : orders) {
            if (order.getUser().getLastName().equals(lastName))
                System.out.println(order);
        };
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
        System.out.println("  deleteForCurency"+(currency)) ;
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}




