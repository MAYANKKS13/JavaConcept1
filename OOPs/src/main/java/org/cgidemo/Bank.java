package org.cgidemo;

public class Bank {
    private int accNumber;
    private double balance;

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Bank() {
    }

    public Bank(int accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public String display() {
        return "[AccountNo: "+getAccNumber()+" , Balance: "+getBalance()+" ]";
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accNumber=" + accNumber +
                ", balance=" + balance +
                '}';
    }
}
