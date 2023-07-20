package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    public void canDepositintoAccountTest() {

        BankAccount benAccount = new BankAccount("2222");
        int currentBalance = benAccount.getBalance("2222");
        assertEquals(0, currentBalance);

        benAccount.deposit(5000);

        int newBalance = benAccount.getBalance("2222");
        assertEquals(5000, newBalance);
    }

    @Test
    public void canDepositTwice() {
        BankAccount benAccount = new BankAccount("2222");
        benAccount.deposit(8000);
        int currentBalance = benAccount.getBalance("2222");
        assertEquals(8000, currentBalance);

        benAccount.deposit(2000);

        int newBalance = benAccount.getBalance("2222");
        assertEquals(10000, newBalance);

    }

    @Test
    public void canDepositNegativeAmountTest() {
        BankAccount benAccount = new BankAccount("2222");
        benAccount.deposit(1000);
        int currentBalance = benAccount.getBalance("2222");
        assertEquals(1000, currentBalance);

        benAccount.deposit(1000);

        int newBalance = benAccount.getBalance("2222");
        assertEquals(2000, newBalance);

    }

    @Test
    public void canWithdraw() {
        BankAccount benAccount = new BankAccount("2222");
        benAccount.deposit(3000);
        int currentBalance = benAccount.getBalance("2232");
        assertEquals(0, currentBalance);

        benAccount.withdraw(2000, "2232");
        int newBalance = benAccount.getBalance("2222");
        assertEquals(3000, newBalance);
    }
    @Test
     public void canBalancePin() {
        BankAccount benAccount = new BankAccount("2222");
        benAccount.deposit(2000);
        int currentBalance = benAccount.getBalance("2222");
        assertEquals(2000, currentBalance);

        benAccount.withdraw(1000, "2232");
        int newBalance = benAccount.getBalance("2222");
        assertEquals(2000, newBalance);

    }
}
