package com.corejavaproject.designpattern;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestMain {

    public static void main(String[] args) {



        Thread thread1 = new Thread(() -> {
            LazySingleton instance = LazySingleton.getInstance();
            log.info("Thread name:{}", Thread.currentThread().getName());
            log.info("Hashcode of object {}", instance.hashCode());
        });

        thread1.start();


         Thread thread2 = new Thread(() -> {
             LazySingleton instance = LazySingleton.getInstance();
            log.info("Thread name:{}", Thread.currentThread().getName());
            log.info("Hashcode of object {}", instance.hashCode());
        });

        thread2.start();
    }

}
