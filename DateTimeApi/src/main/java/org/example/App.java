package org.example;

import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.System.exit;

public class App 
{
    public static void getInfo() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Employee name: ");
        String name = s.nextLine();
        System.out.print("Enter DOB :");
        LocalDate dob = LocalDate.parse(s.nextLine());
        System.out.print("Enter DOJ: ");
        LocalDate doj = LocalDate.parse(s.nextLine());

        if(!DateChecker.checkValidity(dob, doj)) {
            System.out.println("Your DOJ should be after DOB");
        }
        else {
            int yearsOfWorking = DateChecker.calculateYears(new Employee(name, dob, doj));
            System.out.println("You are working for "+ yearsOfWorking+ " years");
        }

    }

    public static void main( String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to get info");
            System.out.println("Enter 2 to exit");
            System.out.print("Enter your choice: ");

            int num = sc.nextInt();

            switch (num) {
                case 1:
                    getInfo();
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                    break;
            }
        }
    }
}
