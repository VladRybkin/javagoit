package module6;

import java.util.ArrayList;

/**
 * Created by Vlad on 21.09.2016.
 */
public class UserUtils {
    static User[] uniqueUsers(User[] users){
        for (int i=0; i<users.length; i++){
            for (int j=i+1; j<users.length; j++){
                if (users[i].equals(users[j])){
                    users[j]=null;
                    System.out.println(users[1]+"  unique");

                }
            }
        }
        return users;
    }

    static User[] usersWithContitionalBalance(User[] users, int balance){
        for (User user : users){
           if (user.getBalance()==balance){

           }
       }
        return null;
    }
    static final User[] paySalaryToUsers(User[] users){
        for (User user : users) {
                user.setBalance(user.getBalance() + user.getSalary());
            System.out.println(user.getBalance()+"  user paysalary");
        }
        return users;
    }
    static final  long[] getUsersId(User[] users){
        long[] userid= new long[users.length];
        for (int i=0; i<users.length; i++){
           userid[i] =users[i].getId();
            System.out.println(users[1]+" userid ");
        }
        return userid;
    }
     static User[] deleteEmptyUsers(User[] users){

        return null;
    }

    @Override
    public String toString() {
        return "UserUtils{}";
    }
}
