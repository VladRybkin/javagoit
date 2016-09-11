package module4;

public class Mainm4 {
    public static void main(String[] args) {

        // USBank(long id, String bankCountry, int numberOfEmployees,
        // double avrSalaryOfEmployee, long rating, long totalCapital, Currency currency) {
        //  super(id, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital, currency);

        User user1 = new User(1, "Maxim", 5000, 600, "GOIT", 7000, new USBank( Currency.USD));
        User user2 = new User(2, "Anton", 4000, 500, "TPS", 6000, new USBank( Currency.EUR));
        User user3 = new User(3, "Vitaliy", 6000, 400, "TPS1", 5000, new EUBank(Currency.EUR));
        User user4 = new User(4, "Kirill", 3000, 300, "TPS2", 4000, new EUBank(Currency.USD));
        User user5 = new User(5, "Oleg", 2000, 450, "TPS3", 3000, new ChinaBank( Currency.EUR));
        User user6 = new User(6, "Dmitry", 2500, 550, "TPS4", 3000, new ChinaBank(Currency.USD));

        System.out.println(user1.getName()+" "+ user1.getBank());
        System.out.println(user2.getName()+" "+ user2.getBank());
        System.out.println(user3.getName()+" "+ user3.getBank());
        System.out.println(user4.getName()+" "+ user4.getBank());
        System.out.println(user5.getName()+" "+ user5.getBank());
        System.out.println(user6.getName()+" "+ user6.getBank());
        //(long id, String name, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank)

        BankSystem bankSystem = new BankSystemImpl();
        bankSystem.fundUser(user1, 20000);
        bankSystem.withdrawOfUser(user1, 400);
        bankSystem.paySalary(user1, 600);
        bankSystem.transferMoney(user1, user2, 600);

        bankSystem.fundUser(user2, 10000);
        bankSystem.withdrawOfUser(user2, 400);
        bankSystem.paySalary(user2, 700);
        bankSystem.transferMoney(user2, user1, 600);

        bankSystem.fundUser(user3, 20000);
        bankSystem.withdrawOfUser(user3, 400);
        bankSystem.paySalary(user3, 600);
        bankSystem.transferMoney(user3, user4, 600);

        bankSystem.fundUser(user4, 20000);
        bankSystem.withdrawOfUser(user4, 400);
        bankSystem.paySalary(user4, 600);
        bankSystem.transferMoney(user4, user3, 600);

        bankSystem.fundUser(user5, 20000);
        bankSystem.withdrawOfUser(user5, 400);
        bankSystem.paySalary(user5, 600);
        bankSystem.transferMoney(user5, user6, 600);

        bankSystem.fundUser(user6, 20000);
        bankSystem.withdrawOfUser(user6, 400);
        bankSystem.paySalary(user6, 600);
        bankSystem.transferMoney(user6, user5, 600);

    }
}