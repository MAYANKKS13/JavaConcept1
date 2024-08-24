package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InsufficientFundsException, InvalidTransactionException {
        Account account = new Account(12345, "Mayank", 50000);
        try {
            account.deposit(1000);
            account.deposit(-20000);
        }
        catch (InvalidTransactionException e1) {
            System.out.println(e1.getMessage());
        }
        try {
            account.withdrawal(50000);
            account.withdrawal(100);
            account.withdrawal(1000);

        }
       catch (InvalidTransactionException | InsufficientFundsException e) {
           System.out.println(e.getMessage());
        }
        try {
            account.withdrawal(-200);
        }
        catch (InvalidTransactionException | InsufficientFundsException e2) {
            System.out.println(e2.getMessage());
        }
    }
}
