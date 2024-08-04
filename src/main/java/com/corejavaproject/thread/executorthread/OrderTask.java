package com.corejavaproject.thread.executorthread;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.Callable;
@Log4j2
public class OrderTask implements Callable<String> {
    private int orderId;
    private String price;

    public OrderTask(int orderId, String price) {
        this.orderId = orderId;
        this.price = price;
    }

    @Override
    public String call() throws Exception {
        log.info(Thread.currentThread().getName() + " Start");
        // business login to execute the order
        Thread.sleep(30000);
        log.info(Thread.currentThread().getName() + " End");
        return orderId+ " : " + price;
    }
}