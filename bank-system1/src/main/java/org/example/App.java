package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Account account = new SavingsAccount(12345, "Mayank", 20000, 0.5);

        double interest = account.calInterest();
        System.out.println("Interest is: " +interest);


    }
}
