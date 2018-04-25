package com.company;

import com.company.lesson3HW.Menu;
import com.company.lesson3HW.Product;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static void calculateCostProducts(Menu menu) {
        Map<Product, Integer> products = menu.getProducts();
        double summ = 0;
        System.out.println("Расчет стоимости купленных, но не доставленных товаров");
        int count = products.keySet().size();
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product prd = entry.getKey();
            int amount = entry.getValue();
            summ += amount * prd.getPrice() + prd.getDeliveryCost();
            if (count > 1) {
                System.out.print("(Кол-во " + amount + "*" + "Цена товара " + prd.getName() + " " + prd.getPrice()
                        + " + " + "Цена доставки " + prd.getDeliveryCost() + ") + ");
            } else {
                System.out.print("(Кол-во " + amount + "*" + "Цена товара " + prd.getName() + " " + prd.getPrice()
                        + " + " + "Цена доставки " + prd.getDeliveryCost() + ") = ");
            }
            count--;
        }
        System.out.println(summ);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Молоко", 45.0, 2.5);
        Product product2 = new Product("Хлеб ржаной", 25.5, 4.2);

        Menu menu = new Menu();
        Map<Product, Integer> productIntegerMap = new HashMap<>();
        productIntegerMap.put(product1, 10);
        productIntegerMap.put(product2, 15);
        menu.setProducts(productIntegerMap);
        calculateCostProducts(menu);
    }
}
