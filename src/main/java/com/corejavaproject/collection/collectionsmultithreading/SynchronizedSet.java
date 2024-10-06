package com.corejavaproject.collection.collectionsmultithreading;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronizedSet {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        Collections.synchronizedSet(set1);

        }
    }

