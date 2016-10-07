package module7;

import java.util.*;
import java.util.Comparator;

/**
 * Created by Vlad on 04.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        //String firstName, String lastName, String city, int balance
        Order order1 = new Order(1, 100, Currency.USD, "itemName", "shopidentificator1", new User("1", "", "", 100));
        Order order2 = new Order(2, 200, Currency.USD, "itemName", "shopidentificator2", new User("2", "", "", 100));
        Order order3 = new Order(3, 300, Currency.EUR, "itemName", "shopidentificator3", new User("3", "", "", 100));
        Order order4 = new Order(4, 400, Currency.USD, "itemName", "shopidentificator4", new User("4", "", "", 100));
        Order order5 = new Order(5, 500, Currency.USD, "itemName", "shopidentificator5", new User("5", "", "", 100));
        Order order6 = new Order(6, 600, Currency.EUR, "itemName", "shopidentificator6", new User("6", "", "", 100));
        Order order7 = new Order(7, 700, Currency.USD, "itemName", "shopidentificator7", new User("7", "", "", 100));
        Order order8 = new Order(8, 800, Currency.USD, "itemName", "shopidentificator8", new User("8", "", "", 100));
        Order order9 = new Order(9, 900, Currency.EUR, "itemName", "shopidentificator9", new User("9", "", "", 100));
        Order order10 = new Order(10, 1000, Currency.USD, "itemName", "shopidentificator10", new User("10", "", "", 100));
        //long id, int price, Currency currency, String itemName, String shopIdentificator, User user)
        List<Order> listorder=new ArrayList<>();
        listorder.add(order1);
        listorder.add(order2);
        listorder.add(order3);
        listorder.add(order4);
        listorder.add(order5);
        listorder.add(order6);
        listorder.add(order7);
        listorder.add(order8);
        listorder.add(order9);
        listorder.add(order10);
        System.out.println(listorder);
        listorder.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {

                return 0;
            }
        });
        Set<Order>set= new HashSet<>();
        set.add(order1);
        set.add(order2);
        set.add(order3);
        set.add(order4);
        set.add(order5);
        set.add(order6);
        set.add(order7);
        set.add(order8);
        set.add(order9);
        set.add(order10);
        System.out.println(set);



    }
}
