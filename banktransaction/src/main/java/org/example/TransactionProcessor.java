package org.example;

public class TransactionProcessor {
    private int accountNumber;
    private double balance;

    public TransactionProcessor() {
    }

    public TransactionProcessor(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(int accountNumber, double amount) {
        setBalance(balance - amount);
        System.out.println("Withdrawal of $"+amount+" from account number "+accountNumber);
    }
    public void deposit(int accountNumber, double amount) {

        setBalance(balance + amount);
        System.out.println("Regular deposit of $"+amount+" to account number "+accountNumber);
    }
    public void deposit(int accountNumber, double amount, String description) {
        setBalance(balance + amount);
        System.out.println("Deposit of $"+amount+" to account number "+accountNumber+
                " with description "+description);
    }
}
