package org.example;

public class Deposit extends Thread{
    private App app;
    private double amount;

    public Deposit(App app, double amount) {
        this.app = app;
        this.amount = amount;
    }


    public void run() {
        for(int i = 1; i < 10; i++) {
            app.deposit(amount);
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}


