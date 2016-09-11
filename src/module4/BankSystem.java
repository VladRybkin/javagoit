package module4;

/**
 * Created by Vlad on 06.09.2016.
 */
public interface BankSystem {
    void withdrawOfUser(User user, int summ);
    void fundUser(User user, int summ);
    void transferMoney(User fromUser, User toUser, int summ);
    void paySalary(User user, int summ);
}
