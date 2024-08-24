package org.example;

import java.util.List;

public class Customer {
   private int customerId;
   private String firstName;
   private String lastName;
   private List<Account> accounts;

    public Customer(int customerId, String firstName, String lastName, List<Account> accounts) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = accounts;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
