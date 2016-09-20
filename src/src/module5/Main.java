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
        DAOimpl daoimpl = new DAOimpl();
        Controller controller = new Controller();
        controller.requstRooms(200, 200, "KyivHotel", "Kiev");
        controller.requstRooms(300, 300, "nonKyivHotel", "Kiev");
        controller.requstRooms(400, 400, "Bontiak Hotel", "Kiev");
        controller.requstRooms(500, 500, "Bontiak Hotel", "Kiev");
        controller.check(tripAdvisorAPI, googleAPI);
        controller.check(bookAndComAPI, googleAPI);
        controller.check(tripAdvisorAPI, bookAndComAPI);

    }


}
