package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer c = new CustomerService().createCustomer("Mayank", 23);
        Customer c1 = new CustomerService().createCustomer("Rahul", 14);
        System.out.println(new CustomerService().getCustomerDescription(c));
        System.out.println(new CustomerService().getCustomerDescription(c1));
    }
}
