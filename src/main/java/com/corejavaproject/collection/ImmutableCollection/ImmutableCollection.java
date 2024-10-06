package com.corejavaproject.collection.ImmutableCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ImmutableCollection {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        list1.add("Chennai");
        list1.add("Delhi");
        list1.add("Pune");

        System.out.println(list1);


        List<String> list2 = List.of("Chennai", "Bangalore", "Pune");
       // list2.add("Delhi");  -> list2 is immutable, this add is not allowed.

        list1.add("Bangalore");
        System.out.println(list1);

        System.out.println(list2);

        List<String> list3 = Collections.unmodifiableList(list1);

        System.out.println(list3);
        //list3.add("Cochin");  --> This is not allowed as list3 is an unmodifiableList Immutable!
        System.out.println(list3);

        Map<String, String> map1 = Map.ofEntries(Map.entry("TN", "Chennai"),
                Map.entry("Kerala", "Cochin"),
                Map.entry("Karnataka","Bangalore")
        );

        //map1.put("Maharashtra", "Pune");-> map1 is immutable, this add is not allowed.

        System.out.println(map1);
    }
}
