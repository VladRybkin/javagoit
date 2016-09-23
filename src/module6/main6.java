package module6;

/**
 * Created by Vlad on 21.09.2016.
 */
public class main6 {
    public static void main(String[] args) {
        User users[] = new User[6];

        users[0]= new User(1," Anton", "Georgiev", 500, 100);
        users[1]= new User(2," Valentin", "Zabrovskiy", 400, 100);
        users[2]= new User(3," Dmitry", "Dmitev", 300, 100);
        users[3]= new User(4," Anna", "Shevchuk", 600, 100);
        users[4]= new User(5," Ekaterina", "Zaprovkaya", 500, 100);
        users[5]= new User(6," Name6", "Lastname6", 500, 100);
        User[] uniq = UserUtils.uniqueUsers(users);
        User[] contitional= UserUtils.usersWithContitionalBalance(users, 300);
        User[] emptyUser = UserUtils.deleteEmptyUsers(users);
        User[] salary = UserUtils.paySalaryToUsers(users);
        long[] geid = UserUtils.getUsersId(users);

    }


}
