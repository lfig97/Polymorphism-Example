package ExampleCode;

public class Account {
    private double balance;

    public final void withdraw(double amount) {
        double newBalance = balance - amount;

        if(newBalance > 0){
            balance = newBalance;
        }
    }
}
