package module2_3;

/**
 * Created by Vlad on 16.10.2016.
 */
public class Userwithdraw extends Users{

    public Userwithdraw(int balance, String ownerNames, double withdrawal, double comission) {
        super(balance, ownerNames, withdrawal, comission);
    }

    void money(String ownerName, double withdrawal, double comission) {

        if (getBalance() - getWithdrawal() * comission > 0) {
            double i= (getWithdrawal() * getComission());
                    System.out.println( " " + withdrawal + " " +i);
                } else {
                    System.out.println("NO");
                }



    }
}
