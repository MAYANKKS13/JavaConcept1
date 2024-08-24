package org.example;

public class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <=10; i ++) {
            System.out.println(Thread.currentThread().getName()+ "  "   +i);
            try {
                Thread.sleep(100);
            }
             catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyThread t1 = new MyThread();
        t.setName("Mayank");
        t1.setName("Shubham");
        t.start();
        t1.start();

    }

}
