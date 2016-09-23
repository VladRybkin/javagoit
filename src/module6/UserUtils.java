package module6;

import java.util.ArrayList;

/**
 * Created by Vlad on 21.09.2016.
 */
public class UserUtils {
    public User[] uniqueUsers(User[] users){
        for (int i=0; i<users.length; i++){
            for (int j=i+1; j<users.length; j++){
                if (users[i].equals(users[j])){
                    users[j]=null;

                }
            }
        }
        return users;
    }

    User[] usersWithContitionalBalance(User[] users, int balance){
        for (User user : users){
           if (user.getBalance()==balance){

           }
       }
        return null;
    }
    final User[] paySalaryToUsers(User[] users){
        for (User user : users) {
                user.setBalance(user.getBalance() + user.getSalary());
        }
        return users;
    }
    final  long[] getUsersId(User[] users){
        long[] userid= new long[users.length];
        for (int i=0; i<users.length; i++){
           userid[i] =users[i].getId();
        }
        return userid;
    }
     User[] deleteEmptyUsers(User[] users){

        return null;
    }

}
