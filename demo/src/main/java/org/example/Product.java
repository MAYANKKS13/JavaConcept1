package org.example;

public class Product {
    private String prodName;
    private int quantity;
    private double price;
    private double totalPrice;
    private double discount;

    public Product() {
    }

    public Product(String prodName, int quantity, double price) {
        this.prodName = prodName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
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

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void prodDetails() {
        System.out.println("Name: "+getProdName()+" Quantity: "+getQuantity()+" Price: "+getPrice()+
                " TotalPrice: "+getTotalPrice());
    }

    public double calPrice() {
        if(getDiscount() == 0) {
            totalPrice = getPrice() * getQuantity();
        }
        else {
            double discount = (getDiscount() * getPrice()) / 100;
            totalPrice = getQuantity() * (getPrice() - discount);
        }
        return totalPrice;
    }
}
