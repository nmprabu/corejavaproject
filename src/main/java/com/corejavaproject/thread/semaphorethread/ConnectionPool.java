package com.corejavaproject.thread.semaphorethread;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.Semaphore;

@Log4j2
public class ConnectionPool {

    Semaphore semaphore = new Semaphore(3);

    public static void main(String[] args) {

        ConnectionPool connectionPool = new ConnectionPool();

    Thread thread1 = new Thread(() -> {

        try {
            connectionPool.mutualExclusion();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    thread1.start();

        Thread thread2 = new Thread(() -> {
            try {
                connectionPool.mutualExclusion();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread2.start();

        Thread thread3 = new Thread(() -> {
            try {
                connectionPool.mutualExclusion();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread3.start();

        Thread thread4 = new Thread(() -> {
            try {
                connectionPool.mutualExclusion();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread4.start();

        Thread thread5 = new Thread(() -> {
            try {
                connectionPool.mutualExclusion();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread5.start();

    }

    public void mutualExclusion() throws InterruptedException {
        semaphore.acquire();
        try {
            log.info(Thread.currentThread().getName() + "Start");
            log.info("Semaphore current val" + semaphore.availablePermits());
            Thread.sleep(30000);
            log.info(Thread.currentThread().getName() + "Executing within semaphore" + "End");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }


    }
}
