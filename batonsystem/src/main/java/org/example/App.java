package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Product> products = Arrays.asList(
                new Product("TV","Electronic",5,20000.0),
                new Product("Mobile","Electronic",10,10000.0),
                new Product("WM","Home Aplliances",6,26000.0),
                new Product("Microwave Oven","Home Aplliances",3,7000.0),
                new Product("soap","grocery",40,60.0),
                new Product("Biscuits","grocery",50,30.0)
     );

       System.out.println();

        List<Product> groceryList = products.stream().filter(
                p -> p.getCategory().equalsIgnoreCase("grocery")
        ).collect(Collectors.toList());
        System.out.println("Product details of Grocery Category");
        groceryList.forEach(p -> System.out.println(p));
        System.out.println();

        List<String> groceryName = products.stream().filter(
                p -> p.getCategory().equalsIgnoreCase("grocery")).map(
                        p1 -> p1.getProdName()
        ).collect(Collectors.toList());
        System.out.println("Name of Grocery products");
        groceryName.forEach(p -> System.out.println(p));
        System.out.println();

        List<Product> priceLessThan7000 = products.stream().filter(
                p -> p.getPrice() < 7000
        ).collect(Collectors.toList());
        System.out.println("Products with price less than 7000");
        priceLessThan7000.forEach(p -> System.out.println(p));
        System.out.println();

        double totalPrice = products.stream().map(p -> p.getQuantity()*p.getPrice()).reduce(
                0.0, (sum, current) -> (sum + current)
        );
        System.out.println("Total price of all the products: " + totalPrice);
        System.out.println();

       System.out.println("Products and their Quantites");
        products.forEach(p -> System.out.println("ProdName: " + p.getProdName() + ", Quantity: " + p.getQuantity()));
        System.out.println();

        Product p1 = products.stream().max((p2, p3) -> Double.compare(p2.getPrice(), p3.getPrice())).get();
        System.out.println("Product with max. price: ");
       System.out.println(p1);
       System.out.println();

        double totalElectronicPrice = products.stream().filter(
                p -> p.getCategory().equalsIgnoreCase("Electronic")).map(
                        p -> p1.getQuantity()*p1.getPrice()).reduce(
                                0.0, (sum, current) -> (sum + current)
        );
        System.out.println("Total price of Electronic category: " + totalElectronicPrice);

    }
}
