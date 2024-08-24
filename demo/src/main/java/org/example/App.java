package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product p1 = new Product();
        p1.setProdName("Mobile");
        p1.setQuantity(2);
        p1.setPrice(12000);
        p1.setDiscount(0);
        p1.calPrice();
        p1.prodDetails();

        Product p2 = new Product();
        p2.setProdName("Laptop");
        p2.setQuantity(1);
        p2.setPrice(50000);
        p2.setDiscount(10);
        p2.calPrice();
        p2.prodDetails();

        Product p3 = new Product();
        p3.setProdName("TShirt");
        p3.setQuantity(5);
        p3.setPrice(250);
        p3.setDiscount(10);
        p3.calPrice();
        p3.prodDetails();

        Product p4 = new Product();
        p4.setProdName("Pen");
        p4.setQuantity(10);
        p4.setPrice(10);
        p4.setDiscount(0);
        p4.calPrice();
        p4.prodDetails();















        System.out.println( "Hello World!" );
    }
}
