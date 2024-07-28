package com.corejavaproject.thread.cyclicbarrier;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

@Log4j2
public class cyclicBarrierThread {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5,()->{
            log.info("Reached cyclic barrier");
        });


        Runnable runnable = () -> {
            log.info(Thread.currentThread().getName() + "Start");
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
            log.info(Thread.currentThread().getName() + "End");
        };

        Thread t1 = new Thread(runnable);
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.start();

        Thread t3 = new Thread(runnable);
        t3.start();

        Thread t4 = new Thread(runnable);
        t4.start();

        Thread t5 = new Thread(runnable);
        t5.start();
    }

}
