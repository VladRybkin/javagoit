package Module9;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Vlad on 22.10.2016.
 */
public class Main {
    public static void main(String[] args) {


        Order order0 = new Order(1, 100, Currency.USD, "itemName1", "1", new User("first name1", "last name1", "city", 100));
        Order order1 = new Order(2, 200, Currency.USD, "itemName2", "2", new User("first name2", "last name2", "city", 100));
        Order order2 = new Order(3, 300, Currency.USD, "itemName3", "3", new User("first name3", "last name3", "city", 100));
        Order order3 = new Order(4, 400, Currency.USD, "itemName4", "4", new User("first name4", "last name4", "city", 100));
        Order order4 = new Order(5, 500, Currency.USD, "itemName5", "5", new User("first name5", "last name5", "city", 100));
        Order order5 = new Order(6, 600, Currency.USD, "itemName6", "6", new User("first name6", "last name6", "city", 100));
        Order order6 = new Order(7, 700, Currency.USD, "itemName7", "7", new User("first name7", "last name7", "city", 100));
        Order order7 = new Order(8, 800, Currency.USD, "itemName8", "8", new User("first name8", "last name8", "city", 100));
        Order order8 = new Order(9, 900, Currency.USD, "itemName9", "9", new User("first name9", "last name9", "city", 100));
        Order order9 = new Order(10, 2000, Currency.USD, "itemName10", "10", new User("first name10", "last name10", "city", 100));


        List<Order> list = new ArrayList<>();
        list.add(order0);
        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);
        list.add(order5);
        list.add(order6);
        list.add(order7);
        list.add(order8);
        list.add(order9);
        Comparator<Order> price = ((o1, o2) -> o2.getPrice() - o1.getPrice());//decrease
        Comparator<Order> priceandcity = ((o1, o2) -> {     //price and city
            if (o1.getUser().getCity() == o2.getUser().getCity()) {
                return o1.getPrice() - o2.getPrice();
            }
            return o1.getPrice() - o2.getPrice();
        });
        Comparator<Order> shopid = ((o1, o2) -> {  //shopid

            return 0;
        });
        Comparator<Order> cityAndShopId = (o1, o2) -> {
            if (o1.getShopIdentificator() == o2.getShopIdentificator()) {
                return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            }
            if (o1.getUser().getCity() == o2.getUser().getCity()) {
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return o1.getItemName().compareTo(o2.getItemName());

        };
        list.sort(price);
        System.out.println(list);
        list.sort(priceandcity);
        System.out.println(list);
        list.sort(cityAndShopId);
        System.out.println(list);


        Set<Order> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);
        List<Order> list1 = new ArrayList<>();
        list1.addAll(set);
        list1.removeIf(x -> (x.getPrice() < 1500));
        System.out.println(list1);
        List<Order> list2 = list.stream().filter(o -> o.getCurrency() != Currency.EUR).collect(Collectors.toList());
        List<Order> list3 = list.stream().filter(o -> o.getCurrency() != Currency.USD).collect(Collectors.toList());
        list2.removeIf(x -> x.getCurrency() == Currency.EUR);
        list3.removeIf(y -> y.getCurrency() == Currency.USD);
        System.out.println("USD" + list2);
        System.out.println("EUR" + list3);

        Set<String> set1 = list.stream().map(o -> o.getUser().getCity()).collect(Collectors.toSet());
        List<ArrayList<Order>> megaListCity;
        megaListCity = create2dArray(set1, list1);
        //This loop for print
        for (ArrayList<Order> aMegaListCity : megaListCity) {
            aMegaListCity.forEach(System.out::print);
            System.out.println("");
        }

    }


    private static List<Order> createCityArray(String string, List<Order> orders) {
        List<Order> list = new ArrayList<>();
        for (Order order : orders) {
            if (order.getUser().getCity() == string) {
                list.add(order);
            }
        }
        return list;
    }

    private static List<ArrayList<Order>> create2dArray(Set<String> str, List<Order> orders) {
        List<ArrayList<Order>> list2d = new ArrayList<>();
        for (String string : str) {
            list2d.add((ArrayList<Order>) createCityArray(string, orders));
        }
        return list2d;
    }


}
