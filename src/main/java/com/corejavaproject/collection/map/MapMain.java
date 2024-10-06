package com.corejavaproject.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        Account acc1 = new Account(1, "Chennai");
        Account acc2 = new Account(2, "Bangalore");
        Account acc3 = new Account(3, "Mumbai");
        Account acc4 = new Account(4, "Delhi");
        Account acc5 = new Account(4, "Kolkata");

        Customer cust1 = new Customer(1001, "Tom");
        Customer cust2 = new Customer(1002, "Harry");
        Customer cust3 = new Customer(1003, "Steve");
        Customer cust4 = new Customer(1004, "Chris");

        Map<Account, Customer> map1 = new HashMap<>();

        map1.put(acc1, cust1);
        map1.put(acc2, cust2);
        map1.put(acc3, cust3);
        map1.put(acc4, cust4);
        map1.put(acc5, cust4);

        map1.forEach((account, customer) ->
                        System.out.println(account + " - " + customer)
                );

    }
}
