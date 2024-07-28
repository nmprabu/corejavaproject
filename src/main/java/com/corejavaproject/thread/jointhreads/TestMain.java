package com.corejavaproject.thread.jointhreads;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestMain {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread (() -> {
            log.info(Thread.currentThread().getName() + "Start");
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info(Thread.currentThread().getName() + "End");
        });

        thread1.start();
        thread1.join();


        Thread thread2 = new Thread (() -> {
            log.info(Thread.currentThread().getName() + "Start");
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            log.info(Thread.currentThread().getName() + "End");
        });

        thread2.start();

    }
}
