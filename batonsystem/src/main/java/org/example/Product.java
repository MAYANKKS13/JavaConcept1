package org.example;

public class Product {
    private String prodName;
    private String category;
    private int quantity;
    private double price;

    public Product(String prodName, String category, int quantity, double price) {
        this.prodName = prodName;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product:- " + "prodName- " + prodName +", category- " + category + ", quantity- " +
                quantity + ", price- " + price;
    }
}
