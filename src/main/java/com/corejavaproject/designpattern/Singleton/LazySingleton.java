package com.corejavaproject.designpattern.Singleton;

public final class LazySingleton {
    public static volatile LazySingleton instance = null;

    private LazySingleton(){
    }

    public static LazySingleton getInstance(){
        if (instance == null){
            synchronized (LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }


}
