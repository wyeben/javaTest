package tdd;

public class Account {

    private int balance;
    private final String PIN;

    public Account(String pin) {
        this.PIN = pin;
    }

    public int getBalance(String number) {
        if (PIN != number) return 0;
        return balance;
    }

    public void deposit(int amount) {
        balance = balance+ amount;
    }

    public void withdraw(int amount, String pin) {
        if (PIN != pin ){ }
        if (PIN == pin)
            if (balance > amount){
                balance = balance - amount;
        }

    }


}
