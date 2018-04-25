package com.company.lesson3HW;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<Product, Integer> products = new HashMap<>();

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }
}
