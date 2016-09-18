package src.module5;

import java.util.Date;

/**
 * Created by Vlad on 11.09.2016.
 */
public class Controller {
    private API apis[] = new API[3];



    public Controller() {
        apis[0]=new TripAdvisorAPI();
        apis[1]=new BookingComAPI();
        apis[2]=new GoogleAPI();
    }

    Room[] requstRooms(int price, int persons, String city, String hotel){
        Room[] request1=apis[1].findRooms(price, persons, city, hotel);
        Room[] request2=apis[2].findRooms(price, persons, city, hotel);
        Room[] request3=apis[3].findRooms(price, persons, city, hotel);
        Room[] request=new Room[request1.length+request2.length+request3.length];


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
       // res1.equals(res2);
        return null;

    }

}


