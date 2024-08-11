package com.corejavaproject.volatileEx;

public class Singleton {
    private static volatile Singleton _instance; //volatile variable
    //private static Singleton _instance;
    public static Singleton getInstance() {

        if (_instance == null) {
            synchronized (Singleton.class) { // T1 T2
                if (_instance == null)
                    _instance = new Singleton();
            }
        }
        return _instance;
    }
}