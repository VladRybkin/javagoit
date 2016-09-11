package module4;

/**
 * Created by Vlad on 06.09.2016.
 */
public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int summ) {
        Bank userBank = user.getBank();


        if (userBank.getLimitOfWithdrawal(summ) >= summ + (summ/100*(userBank.getCommission(summ)))) {
            double newBalance = user.getBalance()-summ - (summ/100*(userBank.getCommission(summ)));
            user.setBalance(newBalance);
            System.out.println(newBalance+" withdraw "+user.getName());
        } else{
            System.out.println("error");
        }
    }

    @Override
    public void fundUser(User user, int summ) {
        double newBalance1 = user.getBalance()+summ;
        System.out.println(newBalance1+" fund "+user.getName());
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int summ) {
        Bank fromUserBank = fromUser.getBank();
        if (fromUserBank.getLimitOfWithdrawal(summ) >= (summ/100*(fromUserBank.getCommission(summ)))) {
            double balancefrom = fromUser.getBalance()-summ - (summ/100*(fromUserBank.getCommission(summ)));
            System.out.println(balancefrom + " balance from "+fromUser.getName());
            double balanceto = toUser.getBalance() + summ;
            System.out.println(balanceto + " balance to "+toUser.getName());
        } else{
            System.out.println("error");
        }
        


    }

    @Override
    public void paySalary(User user, int summ) {
        double paysalary1 =user.getBalance()+summ;
        System.out.println(paysalary1+" paysalary "+user.getName());


    }
}
