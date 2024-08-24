package org.example;

public abstract class AbstractAccount implements Account {
    protected int accNumber;
    protected String accHolder;
    protected double initialBalance;

    public AbstractAccount(int accNumber, String accHolder, double initialBalance) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.initialBalance = initialBalance;
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

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }
    @Override
    public void deposit(double amount) {
        if(amount > 0) {
            setInitialBalance(getInitialBalance() + amount);
            System.out.println("Deposit of $"+amount+" successful. New balance: $"+getInitialBalance());
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }
    @Override
    public void withdraw(double amount) {
        if(amount > 0 && amount <= getInitialBalance()) {
            setInitialBalance(getInitialBalance() - amount);
            System.out.println("Withdrawal of $"+amount+" successful. New balance: $"+getInitialBalance());
        }
        else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    public abstract double calculateInterest();

}
