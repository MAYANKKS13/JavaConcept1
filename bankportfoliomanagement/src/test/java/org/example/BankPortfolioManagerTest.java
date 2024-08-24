package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class BankPortfolioManagerTest {
    BankPortfolioManager bfm;
    List<Customer> customers;

    @Before
    public void setUp() {
        bfm = new BankPortfolioManager();
        customers = new ArrayList<>();

        List<Account> a1 = new ArrayList<>();
        a1.add(new Account(1, "Savings", 25000));
        a1.add(new Account(2, "Salary", 25000));

        List<Account> a2 = new ArrayList<>();
        a2.add(new Account(3, "Salary", 95000));
        a2.add(new Account(4, "Salary", 40000));

        customers.add(new Customer(111, "Mayank", "Sinha", a1));
        customers.add(new Customer(222, "Rahul", "Kumar", a2));

        bfm.setCustomers(customers);
    }

    @Test
    public void testCalculateTotalBalanceCustomer () {
        Map<String, Double> checkBalance = new HashMap<>();
        checkBalance.put("Mayank Sinha", 50000.0);
        checkBalance.put("Rahul Kumar", 135000.0);

        Map<String, Double> result = bfm.calculateTotalBalanceCustomer();
        assertEquals(checkBalance.size(), result.size());


        for (String customerName : checkBalance.keySet()) {
            assertTrue(result.containsKey(customerName));
            assertEquals(checkBalance.get(customerName), result.get(customerName));
        }
    }

    @Test
    public void testFilterCustomerByLastName() {
        String lastName = "Kumar";
        List<Customer> filteredCustomers = bfm.filterCustomerByLastName(lastName);

        assertEquals(1, filteredCustomers.size());

        for (Customer customer : filteredCustomers) {
            assertEquals(lastName, customer.getLastName());
        }

    }
}
