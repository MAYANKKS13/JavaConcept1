package org.example;

public class SavingAccount extends AbstractAccount{
    private double interestRate;

    public SavingAccount(int accNumber, String accHolder, double initialBalance, double interestRate) {
        super(accNumber, accHolder, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return (getInitialBalance() + interestRate);
    }

}
