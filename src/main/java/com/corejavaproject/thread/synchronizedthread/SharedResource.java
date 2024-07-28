package com.corejavaproject.thread.synchronizedthread;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SharedResource {
    public void save(long id, long price) throws InterruptedException {
        synchronized (SharedResource.class) {
            log.info("Thread name:{} and id:{} and name:{} START", Thread.currentThread().getName(), id, price);

            Thread.sleep(30000);

            log.info(Thread.currentThread().getName() + " END");
        }
    }
}