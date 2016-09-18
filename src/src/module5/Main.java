package src.module5;

import java.util.Date;

/**
 * Created by Vlad on 11.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller=new Controller();
        //controller.requstRooms(3, 200, "Kyivhotel", "Kyiv");
        DAO daOimpl = new DAOimpl();
        daOimpl.findById(1);
    }


}
