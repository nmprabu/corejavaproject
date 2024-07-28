package com.corejavaproject.thread.runnable;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Order implements Runnable{

    private long orderId;
    private float price;

    public Order(long orderId, float price) {
        this.orderId = orderId;
        this.price = price;
    }

    @Override
    public void run() {
        log.info(Thread.currentThread().getName() + " Start");

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        log.info(Thread.currentThread().getName() + " End: "+ orderId + " "+ price);
    }
}

