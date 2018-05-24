package com.company.lesson6;

import com.company.lesson3HW.Product;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapUtil {
        public static Map<Product, Integer> sortByValue(Map<Product, Integer> map) {
            List<Map.Entry<Product, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort(Map.Entry.comparingByValue());

            Map<Product, Integer> result = new LinkedHashMap<>();
            for (Map.Entry<Product, Integer> entry : list) {
                result.put(entry.getKey(), entry.getValue());
            }

            return result;
        }

}
