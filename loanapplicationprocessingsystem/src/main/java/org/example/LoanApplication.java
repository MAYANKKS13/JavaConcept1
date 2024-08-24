package org.example;

public class LoanApplication {
    private int creditScore;
    private double income;
    private double loanAmount;

    public LoanApplication() {
    }

    public LoanApplication(int creditScore, double income, double loanAmount) {
        this.creditScore = creditScore;
        this.income = income;
        this.loanAmount = loanAmount;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    @Override
    public String toString() {
        return "Credit Score: " + getCreditScore() +", Income: $"+ getIncome() +
                ", Loan Amount: $"+getLoanAmount();

    }

    public boolean isLoanApproval() {
        return ((getCreditScore() >= 650) && (getIncome() >= 30000) && (getLoanAmount() < 100000));
    }

}
