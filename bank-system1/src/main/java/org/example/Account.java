package org.example;

public class Account {
    private int accNumber;
    private String accHolder;
    private double balance;

    public Account() {
    }

    public Account(int accNumber, String accHolder, double balance) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double calInterest() {
        return 0.0;
    }
}
