package org.example;

public class Product {
    private int pid;
    private String pname;
    private int quantity;
    private double price;

    public Product() {
    }

    public Product(int pid, String pname, int quantity, double price) {
        this.pid = pid;
        this.pname = pname;
        this.quantity = quantity;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
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
        return "pid: " + pid + ", pname: " + pname +", quantity: " + quantity +", price: " + price;
    }
}
