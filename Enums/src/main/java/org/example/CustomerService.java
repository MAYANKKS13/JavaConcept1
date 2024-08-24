package org.example;

public class CustomerService {
    public Customer createCustomer(String name, int age) {
        return new Customer(name, age);
    }
    public CustomerType getCustomerDescription(Customer customer) {
        if(customer.getAge() < 18) {
            return CustomerType.UNDERAGE;
        }
        else {
            return CustomerType.ADULT;
        }
    }
}
