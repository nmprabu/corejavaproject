package com.corejavaproject.thread.reenterantlock;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

@Log4j2
public class ReenterantlockExample {

    ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {
        ReenterantlockExample reenterantlockExample = new ReenterantlockExample();

        Runnable runnable = ()->{
            try {
                //log.info("Thread name:{} ", Thread.currentThread().getName());
                reenterantlockExample.sharedResource1();
                reenterantlockExample.sharedResource2();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();


    }

    public void sharedResource1(){
        reentrantLock.lock();
        log.info(Thread.currentThread().getName()+ "Method1 start");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info(Thread.currentThread().getName()+ "Method1 End");
    }

    public void sharedResource2(){
        log.info(Thread.currentThread().getName()+ "Method2 start");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info(Thread.currentThread().getName()+ "Method2 End");
        reentrantLock.unlock();

    }
}
