package org.example;

/**
 * Hello world!
 *
 */
public class BankSystem
{
    public static void main( String[] args )
    {
        SavingAccount savingAccount = new SavingAccount(1234, "Mayank", 50000, 0.2);
        System.out.println("Account number: " + savingAccount.getAccNumber());
        System.out.println("Account Holder name: " + savingAccount.getAccHolder());
        System.out.println("Initial Balance: $" + savingAccount.getInitialBalance());

        savingAccount.deposit(4000);
        savingAccount.withdraw(1000);

        System.out.println("Interest: $" + savingAccount.calculateInterest());

        System.out.println( "Hello World!" );
    }
}
