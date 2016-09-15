package src.module5;

/**
 * Created by Vlad on 11.09.2016.
 */
public class Main {
    public static void main(String[] args) {
       Controller controller = new Controller();
        DAO daOimpl = new DAOimpl();
        //controller.check();
        controller.requstRooms(200, 2, "Kyiv", "Kyivhotel");
        controller.requstRooms(200, 3, "Odessa", "Kyivhotel");


        daOimpl.findById(1);
    }


}
