package org.example;

public class Withdraw extends  Thread{
    private App app;
    private double amount;
    public Withdraw(App app, double amount) {
        this.app = app;
        this.amount = amount;
    }

    public void run() {
        for(int i = 1; i < 10; i++) {
            app.withdraw(amount);
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
