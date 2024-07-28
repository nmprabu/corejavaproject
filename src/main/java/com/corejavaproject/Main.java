package com.corejavaproject;

import com.corejavaproject.thread.runnable.Order;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        log.info(Thread.currentThread().getName() + " Start");


        Order order1 = new Order(1, 2000.0f);
        Order order2 = new Order(2, 4000.0f);
        Order order3 = new Order(3, 6000.0f);

        Thread thread1 = new Thread(order1);
        thread1.start();

        Thread thread2 = new Thread(order2);
        thread2.start();

        Thread thread3 = new Thread(order3);
        thread3.start();

        log.info(Thread.currentThread().getName() + " End");
    }
}