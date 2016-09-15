package src.module5;

import java.util.Date;

/**
 * Created by Vlad on 11.09.2016.
 */
public class Controller {
    private API apis[] = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis[0] = bookingComAPI;

    }

    public Controller(API[] apis) {
        this.apis = apis;
    }

    Room[] requstRooms(int price, int persons, String city, String hotel){
        apis[0].findRooms(price, persons, city, hotel);
        apis[1].findRooms(price, persons, city, hotel);
        return null;
    }
    Room[] check(API api1, API api2){
        //api1.findRooms(0, 0, null, null);
        int price =100;
        int persons =2;
        String city="kyiv";
        String hotel ="Kyivhotel";
        Room[] res1=api1.findRooms(price, persons, city, hotel);
        Room[] res2=api2.findRooms(price, persons, city, hotel);
        res1.equals(res2);
        return null;

    }

}


