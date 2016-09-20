package src.module5;

import java.util.Date;

/**
 * Created by Vlad on 11.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        BookingComAPI bookAndComAPI = new BookingComAPI();
        Controller controller = new Controller();
        controller.requstRooms(200, 2, "KyivHotel", "Kiev");
        controller.requstRooms(300, 3, "nonKyivHotel", "Kiev");
        controller.requstRooms(400, 4, "Kyiv Hotel", "Kiev");
        controller.check(tripAdvisorAPI, googleAPI);
        controller.check(bookAndComAPI, googleAPI);
        controller.check(tripAdvisorAPI, bookAndComAPI);
    }


}
