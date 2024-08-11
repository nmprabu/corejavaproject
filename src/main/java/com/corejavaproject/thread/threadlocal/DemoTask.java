package com.corejavaproject.thread.threadlocal;

import lombok.extern.log4j.Log4j2;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Log4j2
public class DemoTask implements Runnable{
    private static final AtomicInteger nextId = new AtomicInteger(0);

    private static final ThreadLocal<Integer> threadId = new ThreadLocal<>(){
        @Override
        protected Integer initialValue() {
            return nextId.getAndIncrement();
        }
    };

    public int getThreadId() {
        return threadId.get();
    }

    private static final ThreadLocal<Date>  startDate = new ThreadLocal<Date>(){
        @Override
        protected Date initialValue(){
            return new Date();
        }
    };

    @Override
    public void run() {
        log.info("Starting Thread: {} : {}", getThreadId(),startDate.get());
        try {
            TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Thread Finished: {}: {}", getThreadId(),startDate.get());
    }
}
