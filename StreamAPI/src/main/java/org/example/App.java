package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 20000));
        products.add(new Product("Mobile", 12000));
        products.add(new Product("TV", 25000));
        products.add(new Product("Play Station", 45000));



        List<Product> discountedProducts = products.stream()
                .filter(p -> p.getPrice() > 15000)
                .map(p1 -> {
                    p1.setPrice(p1.getPrice()* 0.9);
                    return p1;
                })
                .collect(Collectors.toList());

        System.out.println();
        System.out.println("Prices after discount");
        System.out.println();
        discountedProducts.forEach(product -> {
            System.out.println(product);
        });
    }
}
