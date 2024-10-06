package com.corejavaproject.collection.collectionsmultithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("Chennai");
        list1.add("Delhi");
        list1.add("Pune");

        System.out.println(list1);

        Collections.synchronizedList(list1);

    }
}
