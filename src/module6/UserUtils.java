package module6;

import java.util.ArrayList;

/**
 * Created by Vlad on 21.09.2016.
 */
public class UserUtils {
    static User[] uniqueUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].equals(users[j])) {
                    users[j] = null;

                }
            }
        }
        return users;
    }

    static User[] usersWithContitionalBalance(User[] users, int balance) {
        ArrayList<User> list = new ArrayList<>();
        for (User user : users) {
            if (user != null) {
                if (user.getBalance() == balance) {
                    list.add(user);
                }
            }
        }
        User users1[] = new User[list.size()];
        list.toArray(users1);
        return users1;

    }

    static final User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            user.setBalance(user.getBalance() + user.getSalary());
            System.out.println(user.getBalance() + "  user paysalary" + user.getFirstName());
        }
        return users;
    }

    static final long[] getUsersId(User[] users) {
        long[] userid = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            userid[i] = users[i].getId();
        }
        return userid;
    }

    static User[] deleteEmptyUsers(User[] users) {
        ArrayList<User> list = new ArrayList<>();
        for (User user : users) {
            if (user != null) {
                list.add(user);
            }
        }
        User user1[] = new User[list.size()];
        list.toArray(user1);
        return user1;
    }

}
