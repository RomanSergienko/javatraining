package com.company;

import com.company.lesson3HW.Menu;
import com.company.lesson3HW.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    private static void calculateCostProducts(Menu menu, Date date) {
        Map<Product, Integer> products = menu.getProducts();

        //удаляем продукты, купленные до определенной даты
        Iterator<Product> iterator = products.keySet().iterator();
        while (iterator.hasNext()){
            if (iterator.next().getDatePurchase().before(date))
                iterator.remove();
        }

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

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Даты покупки товаров
        String strDate1 = "03/05/2018";
        String strDate2 = "04/05/2018";


        Product product1 = new Product("Молоко", 45.0, 2.5, sdf.parse(strDate1));
        Product product2 = new Product("Хлеб ржаной", 25.5, 4.2, sdf.parse(strDate2));

        Menu menu = new Menu();
        Map<Product, Integer> productIntegerMap = new HashMap<>();
        productIntegerMap.put(product1, 10);
        productIntegerMap.put(product2, 15);
        menu.setProducts(productIntegerMap);


        //Указываем дату, позднее которой должны быть даты покупки товаров
        String strDate3 = "2/05/2018";

        calculateCostProducts(menu, sdf.parse(strDate3));
    }
}
