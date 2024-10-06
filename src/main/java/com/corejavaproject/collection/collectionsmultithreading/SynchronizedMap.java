package com.corejavaproject.collection.collectionsmultithreading;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMap {

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();

        Collections.synchronizedMap(map1);

    }
}
