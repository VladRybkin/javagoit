package src.module5;

import java.util.*;

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

    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        List<Room> list = new ArrayList<>();
        for (API api : apis) {
            Room[] res = api.findRooms(price, persons, city, hotel);
            for (Room room : res) {
                if (res != null) {
                    list.add(room);
                }
            }

        }
        return list.toArray(new Room[list.size()]);
    }

//        Room [] foundRooms = new Room[100];
//        int count = 0;
//        for(int i = 0; i < 3; i++){
//            for(Room item : apis[i].findRooms(price, persons, city, hotel)){
//                foundRooms[count] = item;
//                count++;
//            }
//        }
//
//        Room [] foundRoomsArray = new Room[count];
//        for(int i = 0; i < count; i++) {
//            foundRoomsArray[i] = foundRooms[i];
//        }
//
//        DAOimpl daoImpl = new DAOimpl();
//        for(Room room : foundRoomsArray) {
//            daoImpl.save(room);
//        }
//
//        return foundRoomsArray;



    Room[] check(API api1, API api2){
        Room[] roomsFromapi1=api1.getAll();
        Room[] roomsFromapi2=api2.getAll();
        Set<Room> set= new HashSet<>();
        for (Room room: roomsFromapi1){
            for (Room room1 : roomsFromapi2){
                if (room.equals(room1)){
                    set.add(room);
                }
            }
        }

//        Room[] room=new Room[100];
//        int count=0;
//        for(int i=0;i<roomsFromapi1.length;i++){
//            for (int j=i;j<roomsFromapi1.length;j++){
//                if(roomsFromapi1[i].equals(roomsFromapi2[j])){
//                    room[count]=roomsFromapi1[j];
//                    count++;
//                }
//            }
//        }

        return set.toArray(new Room[set.size()]);
    }

}



