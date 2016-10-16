package module2_3;


/**
 * Created by Vlad on 14.10.2016.
 */
public class Testmain {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        double comission = 1.05;
        String ownerName = "Ann";
        double withdrawal = 100;

        String ownerName1 = "Oww";
        double withdrawal1 = 490;

        money(ownerNames, ownerName, balances, withdrawal, comission);
        money(ownerNames, ownerName1, balances, withdrawal1, comission);

    }

    static void money(String ownerNames[], String ownerName, int balances[], double withdrawal, double comission) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                if (balances[i] - withdrawal * comission > 0) {
                    balances[i] -= (withdrawal * comission);
                    System.out.println(ownerNames[i] + " " + withdrawal + " " + balances[i]);
                } else {
                    System.out.println(ownerNames[i] + "NO");
                }
                break;
            }
        }
    }


}






