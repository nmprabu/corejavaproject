package com.corejavaproject.thread.countdownlatch;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.CountDownLatch;

@Log4j2
public class CountdownLatchThread {

   // static CountdownLatch countdownLatch = new CountdownLatch(3);
    static CountDownLatch countdownLatch = new CountDownLatch(3);
    public static void main(String[] args) {

        Runnable runnable = () -> {
            log.info(Thread.currentThread().getName() + "Start");
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info(Thread.currentThread().getName() + "End");
            countdownLatch.countDown();
        };

        Thread t1 = new Thread(runnable);
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.start();

        Thread t3 = new Thread(runnable);
        t3.start();

        Thread t4 = new Thread(() -> {

            try {
                countdownLatch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                log.info(Thread.currentThread().getName() + "Start");
                Thread.sleep(30000);
                log.info(Thread.currentThread().getName() + "End");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        t4.start();


    }


}
