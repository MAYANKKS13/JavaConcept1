package org.example;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(int accNumber, String accHolder, double balance, double interestRate) {
        super(accNumber, accHolder, balance);
        this.interestRate = interestRate;
    }
    @Override
    public double calInterest() {
        return getBalance()*interestRate;
    }
}
