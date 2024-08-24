package org.example;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 50000, 5));
        products.add(new Product("Mobile", 12000, 10));
        products.add(new Product("Tablet", 30000, 15));
        products.add(new Product("Charegr", 3000, 5));
        products.add(new Product("Television", 70000, 2));

        for(Product product:products) {
            System.out.println(product);
        }
        System.out.println();System.out.println();

        List<Double> discountList = new ArrayList<>();
        for(Product p: products) {
            discountList.add(p.getPrice() * p.getQuantity() * 0.9);
        }
        Iterator it = discountList.iterator();
        Iterator<Product> it1 = products.iterator();
        System.out.println("ProductName     --------->   Price after Discount");
        while (it.hasNext() && it1.hasNext()) {
            System.out.println(it1.next().getName() + "         ------->        "+it.next());
        }
    }
}
