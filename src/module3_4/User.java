package module3_4;

/**
 * Created by Vlad on 02.09.2016.
 */
 class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;



    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /////////////////////////////////////////////////////////////////

    void paySalary()
    {
       int addmoney = balance + salary;
        System.out.println(addmoney);
    }

        double withdraw (int summ){
            if(summ < 1000){
            return balance-((summ/100)*5);
        }
        else {
            return balance-((summ/100)*10);
        }

    }
        void companyNameLenfht(){
            companyName.length();
            System.out.println(companyName.length());
        }

        int monthIncreaser(int addMonth){
        return monthsOfEmployment + addMonth;

    }
}
