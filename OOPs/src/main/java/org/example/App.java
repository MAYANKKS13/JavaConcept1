package org.example;

import org.cgidemo.*;

import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

//        Employee e1 = new Employee("Mayank", 23, "Java", 50000);
//        Employee e2 = new Employee("Shubham", 23, "Java", 30000);
//        e1.display();
//        e2.display();
//        e1.calBonus();
//        e2.calBonus();
//        e1.display();
//        e2.display();
//        System.out.println("Hello World!");
//
//        Rectangle r = new Rectangle();
//        r.setLength(10);
//        r.setBreadth(20);
//        System.out.println(r.area());
//        System.out.println(r.perimeter(10,20));
//
//
//        Bank b = new Bank();
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter account number: ");
//        int accNum = s.nextInt();
//        b.setAccNumber(accNum);
//        System.out.println("Enter balance: ");
//        double balance = s.nextDouble();
//        b.setBalance(balance);
//
//        int choice;
//        do {
//            System.out.println("1. Deposit");
//            System.out.println("2. Withdraw");
//            System.out.println("3. Display");
//            System.out.println("4. Exit");
//            System.out.println("Enter your choice: ");
//            choice = s.nextInt();
//            if(choice == 1) {
//                System.out.println("Enter amount to be deposited: ");
//                double amount = s.nextDouble();
//                b.deposit(amount);
//            } else if (choice == 2) {
//                System.out.println("Enter amount to be withdrawn: ");
//                double amount = s.nextDouble();
//                b.withdraw(amount);
//            } else if (choice == 3) {
//                System.out.println(b.display());
//            }
//            else if(choice == 4){
//                exit(0);
//            }
//        } while(true);

        Car car = new Car();
        Bike bike = new Bike();
        Truck truck = new Truck();
        car.getMaxSpeed();
        bike.getMaxSpeed();
        truck.getMaxSpeed();







    }
}
