package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    private double balance;

    public App(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited amount of $"+amount+", Final balance: $"+ balance);

    }

    public synchronized void withdraw(double amount) {
        if(balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawal amount of $"+ amount+", Final balance: $" + balance);
        }
        else {
            System.out.println("Withdrawal not possible");
        }


    }

    public static void main(String[] args )
    {
        App app = new App(50000);

        Deposit deposit = new Deposit(app, 2000);
        Withdraw withdraw = new Withdraw(app, 4000);

        deposit.start();
        withdraw.start();



    }
}
