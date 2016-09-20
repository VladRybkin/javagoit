package src.module5;

import java.util.Date;

/**
 * Created by Vlad on 11.09.2016.
 */
public class BookingComAPI implements API {
    private Room[] rooms  = new Room[5];


    BookingComAPI() {
        rooms[0]  = new Room(1, 200, 3, new Date(20072016), "Kyivhotel", "Kyiv");

        rooms[1] = new Room(2, 200, 3, new Date(20072016), "Kyivhotel", "Kyiv");

        rooms[2] = new Room(3, 200, 3, new Date(20072016), "Kyivhotel", "Kyiv");

        rooms[3] = new Room(4, 200, 3, new Date(20072016), "Kyivhotel", "Kyiv");

        rooms[4] = new Room(5, 200, 3, new Date(20072016), "Kyivhotel", "Kyiv");

        rooms =new Room[]{rooms[0], rooms[1], rooms[2], rooms[3], rooms[4]};
        //long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] foundroomsTemp =new Room[100];
        int count =0;
        for ( Room room : rooms){
            if ((room.getPrice() == price) && (room.getPersons()==persons)&& (room.getCityName().equals(city)&& (room.getHotelName().equals(hotel)))){
                foundroomsTemp[count]=room;
                count++;
            }
        }
        Room[] foundroomsarray = new Room[count];
        for (int i=0; i<count; i++){
            foundroomsarray[i]=foundroomsTemp[i];
        }

        return foundroomsarray;
    }
    @Override
    public Room[] getAll() {
        return rooms;
    }
}