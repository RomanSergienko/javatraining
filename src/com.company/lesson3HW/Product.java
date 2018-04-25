package com.company.lesson3HW;

public class Product {
    private String name;
    private double price;
    private double deliveryCost;


    public Product(String name, double price, double deliveryCost) {
        this.name = name;
        this.price = price;
        this.deliveryCost = deliveryCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

}
