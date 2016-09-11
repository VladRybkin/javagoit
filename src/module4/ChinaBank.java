package module4;

/**
 * Created by Vlad on 06.09.2016.
 */
public class ChinaBank extends Bank{
    public ChinaBank(Currency currency) {
        super(currency);
    }
    @Override
    int getCommission(int summ) {
        int commission;

        if (getCurrency() == Currency.USD) {
            if (summ < 1000) {commission = 3;}
            else {commission = 5;}
        } else {
            if (getCurrency() == Currency.EUR) {
                if (summ < 1200) {commission = 10;}
                else {commission = 11;}
            } else {
                return 0;
            }
        }
        return commission;

    }
    @Override
    double getMonthlyRate(double monthlyrate){
        if (getCurrency() == Currency.USD) {
            monthlyrate=1;
        }
        if  (getCurrency() == Currency.EUR){
            monthlyrate=0;
        }
        return monthlyrate;
    }

    @Override
    int getLimitOfFunding(int limit_of_funding){
        if (getCurrency() == Currency.USD) {
            limit_of_funding=10000;
        }
        if  (getCurrency() == Currency.EUR){
            limit_of_funding=5000;
        }
        return limit_of_funding;
    }
    @Override
    int getLimitOfWithdrawal(int limit_of_withdrawal){
        if (getCurrency() == Currency.USD) {
            limit_of_withdrawal=100;
        }
        if  (getCurrency() == Currency.EUR){
            limit_of_withdrawal=120;
        }
        return limit_of_withdrawal;
    }

    @Override
    public String toString() {
        return "ChinaBank{}";
    }
}
