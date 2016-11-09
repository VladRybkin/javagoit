package module2_3;

/**
 * Created by Vlad on 16.10.2016.
 */
public abstract class Users {
    private int balance;
    private String ownerNames;
    private double withdrawal;
    private double comission;

    public Users(int balance, String ownerNames, double withdrawal, double comission) {
        this.balance = balance;
        this.ownerNames = ownerNames;
        this.withdrawal = withdrawal;
        this.comission=comission;
    }
    abstract void money( String ownerName, double withdrawal, double comission);

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getOwnerNames() {
        return ownerNames;
    }

    public void setOwnerNames(String ownerNames) {
        this.ownerNames = ownerNames;
    }

    public double getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }
}
