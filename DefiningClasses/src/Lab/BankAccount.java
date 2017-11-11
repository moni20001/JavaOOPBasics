package Lab;

public class BankAccount {
    private int Id;
    private double balance;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        if(!(amount<=0)){
            this.balance += amount;
        }
    }
    public void withdraw(double amount){
        if(this.balance>=amount){
            this.balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "ID" + this.Id;
    }
}
