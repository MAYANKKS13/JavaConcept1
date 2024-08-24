package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Customer> customers = new ArrayList<>();

        List<Account> account1 = new ArrayList<>();
        Account a1 = new Account(11, "Savings", 5000);
        Account a2 = new Account(22, "Salary", 10000);
        account1.add(a1);
        account1.add(a2);
        Customer c1 = new Customer(7777, "Mayank", "Sinha", account1);

        List<Account> account2 = new ArrayList<>();
        Account a3 = new Account(33, "Salary", 25000);
        Account a4 = new Account(44, "Salary", 30000);
        account2.add(a3);
        account2.add(a4);
        Customer c2 = new Customer(8888, "Abhishek", "Kumar", account2);

        List<Account> account3 = new ArrayList<>();
        Account a5 = new Account(55, "Savings", 25000);
        Account a6 = new Account(66, "Savings", 1000000);
        account3.add(a5);
        account3.add(a6);
        Customer c3 = new Customer(9999, "Rahul", "Kumar", account3);


        customers.add(c1);
        customers.add(c2);
        customers.add(c3);


        System.out.println(customers);

        BankPortfolioManager bpm = new BankPortfolioManager();
        bpm.setCustomers(customers);

        List<Customer> list = bpm.filterCustomerByLastName("Kumar");
        System.out.println("Customers with last name 'Kumar':");
        for (Customer cus : list) {
            System.out.println(cus);
        }

        Map<String, Double> totalBalances = bpm.calculateTotalBalanceCustomer();
        System.out.println("Total balances of customers:");
        for (Map.Entry<String, Double> entry : totalBalances.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }







    }
}
