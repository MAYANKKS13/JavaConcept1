package org.example;

/**
 * Hello world!
 *
 */
public class BankSystem 
{
    public static void main( String[] args )
    {
        TransactionProcessor tp = new TransactionProcessor();
        tp.setAccountNumber(12345);
        tp.setBalance(20000);
        tp.deposit(tp.getAccountNumber(), 30000);
        tp.withdraw(tp.getAccountNumber(), 10000);
        tp.deposit(tp.getAccountNumber(), 20000, "Nice deposit");
        System.out.println("Final balance is: "+tp.getBalance());
    }
}
