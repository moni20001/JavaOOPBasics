package Lab1;

public class BankAccount {
    private final static double DEFAULT_INTEREST = 0.02;

    private static double rate = DEFAULT_INTEREST;
    private static int bankAccountsCount;
    private int Id;
    private double balance;

    public BankAccount(){
        this.Id = ++bankAccountsCount;
    }
    public static void setInterest(double interest){
        rate = interest;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(!(amount<=0)){
            this.balance += amount;
        }
    }
   public double getInterest(int years){
        return this.balance*rate*years;
   }

    @Override
    public String toString() {
        return "ID" + this.Id;
    }
}
