package com.corejavaproject.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrderPair<K,V> implements Pair<K,V> {

    private K key;

    private V value;

    /*
    @Override
    public K getKey() {
        return null;
    }

    @Override
    public V getValue() {
        return null;
    }*/
}
