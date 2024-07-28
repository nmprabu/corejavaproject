package com.corejavaproject.lambda;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TicketMain {

    public static void main(String[] args) {
        log.info(Thread.currentThread().getName() + " Start");

        Runnable runnable = () -> {
            log.info(Thread.currentThread().getName() + " Start");
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info(Thread.currentThread().getName() + " End: ");
        };

        Thread t1 = new Thread(runnable);
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.start();


        log.info(Thread.currentThread().getName() + " End");
    }
}
