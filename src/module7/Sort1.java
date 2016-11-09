package module7;

import java.util.*;
import java.util.TreeSet;

/**
 * Created by Vlad on 07.10.2016.
 */

public class Sort1 {
    List<User> listuser = new ArrayList<>();
    List<Order> listorder = new ArrayList<>();
    List<String> citieslist = new ArrayList<>();
    String[] cities = {"Kyiv", "Lviv", "kharkiv", "Budapest", "Minsk", "Vienna", "Salzburg"};


    public List<User> getListuser() {
        return listuser;
    }

    public List<String> getCitieslist() {
        return citieslist;
    }

    public List<Order> getListOrder() {
        return listorder;
    }

    Order order1 = new Order(1, 100, Currency.EUR, "itemName", "shopidentificator1", new User("1", "", "", 100));
    Order order2 = new Order(2, 200, Currency.EUR, "itemName", "shopidentificator2", new User("2", "", "", 100));
    Order order3 = new Order(3, 300, Currency.USD, "itemName", "shopidentificator3", new User("3", "", "", 100));
    Order order4 = new Order(4, 400, Currency.USD, "itemName", "shopidentificator4", new User("4", "", "", 100));
    Order order5 = new Order(5, 500, Currency.EUR, "itemName", "shopidentificator5", new User("5", "", "", 100));
    Order order6 = new Order(6, 600, Currency.USD, "itemName", "shopidentificator6", new User("6", "", "", 100));
    Order order7 = new Order(7, 700, Currency.EUR, "itemName", "shopidentificator7", new User("7", "", "", 100));
    Order order8 = new Order(8, 800, Currency.USD, "itemName", "shopidentificator8", new User("8", "", "", 100));
    Order order9 = new Order(9, 900, Currency.EUR, "itemName", "shopidentificator9", new User("9", "", "", 100));
    Order order10 = new Order(10, 1000, Currency.USD, "itemName", "shopidentificator10", new User("10", "", "", 100));

    public Sort1() {
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

    }

    void decrease() {
        Collections.sort(listorder, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });

        System.out.println("  decrease");
        for (Order order : listorder) {
            System.out.println(order);
        }
    }


    void increaseorderANDUsercity() {
        listorder.clear();
        for (Order order : listorder) {
            for (String string : citieslist) {
                if (string.equals(order.getUser().getCity())) {
                    listorder.add(order);
                }
            }
        }
        Collections.sort(listorder, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() - (o2.getPrice()) == 0)
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                return o1.getPrice() - (o2.getPrice());
            }
        });
        System.out.println("  orderSortPriseAscendingFilterCity");
        for (Order order : listorder) {
            System.out.println(order);
        }
    }

    void sortItemShopCity() {
        Collections.sort(listorder, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getShopIdentificator().compareTo(o2.getShopIdentificator()) == 0)
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                if (o1.getItemName().compareTo(o2.getItemName()) == 0)
                    return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                return o1.getItemName().compareTo(o2.getItemName());
            }
        });
        System.out.println("  sortItemShopCity ");

        listorder.forEach(System.out::println);
    }

    void deletePriceLess(int price) {
        for (Order order : listorder) {
            if (order.getPrice() < price)
                listorder.add(order);
        }
        listorder.removeAll(listorder);

        System.out.println("  deletePriceLess ");
        for (Order order : listorder) {
            System.out.println(order);
        }
    }

    void deleteDuplicates() {
        Set<Order> deleteDuplic = new HashSet<>();
        deleteDuplic.addAll(listorder);

        System.out.println("  deleteDuplicates ");

        deleteDuplic.forEach(System.out::println);


    }


    void separateList(Currency currency) {
        listorder.clear();
        for (Order order : listorder) {
            if (order.getCurrency() == currency)
                listorder.add(order);
        }

        System.out.println("  separateList  Curency: " + currency);

        for (Order order : listorder) {
            System.out.println(order);
        }
    }


    Set<String> citiesUnique = new TreeSet<>();

    void listUniqueSitiesInUser() {

        for (User user : listuser) {
            citiesUnique.add(user.getCity());
        }
        System.out.println("  user Cities   ");
        for (String string : citiesUnique) {
            System.out.println(string);
        }
    }

    void separateUniqueSities() {
        listUniqueSitiesInUser();
        for (String city : citiesUnique) {
            System.out.println("  List unique city: " + "'" + city + "'");
            for (Order order : listorder) {
                if (order.getUser().getCity() == city)
                    System.out.println(order);
            }
        }
    }


}
