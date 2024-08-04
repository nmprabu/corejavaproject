package com.corejavaproject.thread.blockingqueue;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
@Log4j2
public class BlockingQueueEx {
    public static void main(String[] args) {
        BlockingQueue<Object> blockingQueue = new LinkedBlockingQueue<>(20);

        Runnable runnable = () -> {
            try {
                while(true) {
                    blockingQueue.put(new Object());
                    log.info("Thread name:{} and Blocking queue size:{}", Thread.currentThread().getName(), blockingQueue.size());
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread producer1 = new Thread(runnable);
        producer1.start();
        Thread producer2 = new Thread(runnable);
        producer2.start();
        Thread producer3 = new Thread(runnable);
        producer3.start();
        Thread producer4 = new Thread(runnable);
        producer4.start();

        Runnable runnable1 = ()->{
            try {
                /*
                while(true){
                    Object object =  blockingQueue.take();
                    log.info("Thread name:{} and and queue size:{} and object:{}", Thread.currentThread().getName(), blockingQueue.size(), object);
                }
                */
                Object object =  blockingQueue.take();
                log.info("Thread name:{} and and queue size:{} and object:{}", Thread.currentThread().getName(), blockingQueue.size(), object);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread consumer1 = new Thread(runnable1);
        Thread consumer2 = new Thread(runnable1);
        Thread consumer3 = new Thread(runnable1);
        Thread consumer4 = new Thread(runnable1);
        consumer1.start();
        consumer2.start();
        consumer3.start();
        consumer4.start();
    }


}

