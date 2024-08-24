package org.cgidemo;

public class Order {
    private int order_id;
    private String order_name;
    private double order_price;

    public Order() {
    }

    public Order(int order_id, String order_name, double order_price) {
        this.order_id = order_id;
        this.order_name = order_name;
        this.order_price = order_price;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public double getOrder_price() {
        return order_price;
    }

    public void setOrder_price(double order_price) {
        this.order_price = order_price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", order_name='" + order_name + '\'' +
                ", order_price=" + order_price +
                '}';
    }
}
