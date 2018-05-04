package com.company.lesson3HW;

import java.util.Date;

public class Product {
    private String name;
    private double price;
    private double deliveryCost;
    private Date datePurchase;


    public Product(String name, double price, double deliveryCost, Date datePurchase) {
        this.name = name;
        this.price = price;
        this.deliveryCost = deliveryCost;
        this.datePurchase = datePurchase;
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

    public Date getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(Date datePurchase) {
        this.datePurchase = datePurchase;
    }
}
