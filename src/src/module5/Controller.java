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


        return  request;
    }

    Room[] check(API api1, API api2){
        Room[] roomsFromapi1=api1.getAll();
        Room[] roomsFromapi2=api2.getAll();

        Room[] room=new Room[1000];
        int count=0;
        for(int i=0;i<roomsFromapi1.length;i++){
            for (int j=i;j<roomsFromapi1.length;j++){
                if(roomsFromapi1[i].equals(roomsFromapi2[j])){
                    room[count]=roomsFromapi1[j];
                    count++;
                }
            }
        }

        return room;
    }

}




