package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankPortfolioManager {
    List<Customer> customers;

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> filterCustomerByLastName(String lastName) {
        List<Customer> lName = new ArrayList<>();
        for(Customer c:customers) {
            if(c.getLastName().equals(lastName)) {
                lName.add(c);
            }
        }
        return lName;
    }

    public Map<String, Double> calculateTotalBalanceCustomer() {
        Map<String, Double> map = new HashMap<>();
        for(Customer c:customers) {
            double totalBalance = 0;
            for(Account account: c.getAccounts()) {
                totalBalance = totalBalance + account.getBalance();
            }
            map.put(c.getFirstName()+" "+c.getLastName(), totalBalance);
        }
        return map;
    }

}
