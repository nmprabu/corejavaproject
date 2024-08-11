package com.corejavaproject.volatileEx;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class VolatileMain {

    public static void main(String[] args) {
        Singleton single1 = new Singleton();

        Runnable runnable = ()->{
                log.info("Thread name:{} ", Thread.currentThread().getName());
                //single1.getInstance();
                log.info("hascode of instnace {}", single1.getInstance().hashCode());
        };

        Thread t1 = new Thread(runnable);
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.start();

    }
}
