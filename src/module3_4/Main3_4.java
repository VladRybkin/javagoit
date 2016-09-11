package module3_4;

/**
 * Created by Vlad on 02.09.2016.
 */
public class Main3_4 {
    public static void main(String[] args) {


        User object = new User("vlad", 1600, 500, "Goit", 900, "euro");
        //String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency
        System.out.print("paysalary"+" ");
        object.paySalary();
        System.out.println("withdrawal"+" "+ object.withdraw(600));
        System.out.print("companylenght"+" ");
        object.companyNameLenfht();
        System.out.println("increase"+" "+ object.monthIncreaser(500));

    }
}
