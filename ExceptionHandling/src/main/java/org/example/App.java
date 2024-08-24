package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Account account = new Account(12345, null, 50000);
            String name = account.convertAccountHolderNameToUpperCase(account.getAccHolder());
            System.out.println(name);
        }
        catch (NullPointerException e) {
            System.out.println("Account Holder name can't be empty: "+ e.getMessage());
        }

        try {
            Account account1 = new Account(123, "Mayank", 20000);
            int interest = account1.calculateInterestOnBalance(account1.getBalance(), 0);
            System.out.println("Interest is: " + interest);
        }
        catch (ArithmeticException e) {
            System.out.println("Dividing by zero is invalid: " + e.getMessage());
        }
    }
}
