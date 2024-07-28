package com.corejavaproject.thread.thread;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestMain {
    public static void main(String[] args) {
        log.info(Thread.currentThread().getName() + " Start");

        Order order1 = new Order(1, 2000.0f);
        Order order2 = new Order(2, 4000.0f);
        Order order3 = new Order(3, 6000.0f);
        order1.start();
        order2.start();
        order3.start();

        log.info(Thread.currentThread().getName() + " End");
    }
}