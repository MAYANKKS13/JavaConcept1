package org.example;

public class Account {
    private int accNumber;
    private String accHolder;
    private double balance;

    public Account(int accNumber, String accHolder, double balance) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public Account() {
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
    public void deposit(double amount) throws InvalidTransactionException {
        if(amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Amount of $"+amount+ " is deposited");
        }
        else {
            throw new InvalidTransactionException("Invalid Deposit");
        }
    }
    public void withdrawal(double amount) throws InvalidTransactionException, InsufficientFundsException {
        if(amount < 0) {
            throw new InvalidTransactionException("Invalid withdrawal amount");
        }
        else {
            if(amount <= getBalance()) {
                setBalance(getBalance() - amount);
                System.out.println("Withdrawal of $"+amount+" is successful.");
            }
            else {
                throw new InsufficientFundsException("Insufficient funds for withdrawal");
            }
        }
    }

}
