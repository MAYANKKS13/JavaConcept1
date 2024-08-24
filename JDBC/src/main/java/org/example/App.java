package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Online Product App - Choose an option:");
            System.out.println("1 -> Display All Products");
            System.out.println("2 -> Add Product");
            System.out.println("3 -> Delete Product by ID");
            System.out.println("4 -> Update Product by ID");
            System.out.println("5 -> Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    productService.getAllProducts();
                    System.out.println("Products:");
                    for (Product p : productService.getProductList()) {
                        System.out.println(p.getPid() + ", " + p.getPname() + ", " + p.getQuantity() + ", " + p.getPrice());
                    }
                    break;

                case 2:
                    System.out.println("Enter Product ID:");
                    int pid = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter Product Name:");
                    String pname = scanner.nextLine();

                    System.out.println("Enter Quantity:");
                    int quantity = scanner.nextInt();

                    System.out.println("Enter Price:");
                    double price = scanner.nextDouble();

                    Product newProduct = new Product(pid, pname, quantity, price);
                    productService.addProduct(newProduct);
                    System.out.println("Product added successfully.");
                    break;

                case 3:
                    System.out.println("Enter Product ID to delete:");
                    int deletePid = scanner.nextInt();
                    productService.deleteProduct(deletePid);
                    System.out.println("Product deleted successfully.");
                    break;

                case 4:
                    System.out.println("Enter Product ID to update:");
                    int updatePid = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter New Product Name:");
                    String newPname = scanner.nextLine();

                    System.out.println("Enter New Quantity:");
                    int newQty = scanner.nextInt();

                    System.out.println("Enter New Price:");
                    double newPrice = scanner.nextDouble();

                    Product updatedProduct = new Product(updatePid, newPname, newQty, newPrice);
                    productService.updateProduct(updatedProduct);
                    System.out.println("Product updated successfully.");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
