package com.corejavaproject.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductMain {
    public static void main(String[] args) {

        Product prod1 = new Product(1001, "Phone", 10000);
        Product prod2 = new Product(1002, "TV", 20000);
        Product prod3 = new Product(1003, "SOFA", 15000);
        Product prod4 = new Product(1004, "Laundry", 15000);
        Product prod5 = new Product(1005, "Dishwasher", 8000);
        Product prod6 = new Product(1009, "Dishwasher", 8000);

        Set<Product> set1 = new TreeSet<>();

        set1.add(prod1);
        set1.add(prod2);
        set1.add(prod3);
        set1.add(prod4);
        set1.add(prod5);
        set1.add(prod6);



        System.out.println(set1);
        System.out.println(set1.size());

    }
}
