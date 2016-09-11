package module4;

/**
 * Created by Vlad on 06.09.2016.
 */
public class EUBank extends Bank{
    public EUBank(Currency currency) {
        super(currency);
    }


    @Override
    int getCommission(int summ) {
        int commission;

        if (getCurrency() == Currency.USD) {
            if (summ < 1000) {commission = 5;}
            else {commission = 7;}
        } else {
            if (getCurrency() == Currency.EUR) {
                if (summ < 1200) {commission = 2;}
                else {commission = 4;}
            } else {
                return 0;
            }
        }
        return commission;

    }

    @Override
    double getMonthlyRate(double monthlyrate){
        if (getCurrency() == Currency.USD) {
           monthlyrate=0;
        }
        if  (getCurrency() == Currency.EUR){
            monthlyrate=1;
        }
        return monthlyrate;
    }

    @Override
    int getLimitOfFunding(int limit_of_funding){
        if (getCurrency() == Currency.USD) {
            limit_of_funding=10000;
        }
        if  (getCurrency() == Currency.EUR){
            limit_of_funding=20000;
        }
        return limit_of_funding;
    }
    @Override
    int getLimitOfWithdrawal(int limit_of_withdrawal){
        if (getCurrency() == Currency.USD) {
            limit_of_withdrawal=2000;
        }
        if  (getCurrency() == Currency.EUR){
            limit_of_withdrawal=2200;
        }
        return limit_of_withdrawal;
    }

    @Override
    public String toString() {
        return "EUBank{}";
    }
}
