package com.corejavaproject.thread.atomicthread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.atomic.*;

public class Counter {

    private AtomicInteger value = new AtomicInteger();

    public void increment() {
        value.incrementAndGet();
    }

    public void decrement() {
        value.decrementAndGet();
    }

    public int get() {
        return value.get();
    }

   // private int value;


    /*
    Below is not thread safety...
    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public int get() {
        return value;
    }
    */

    /*
    Below achieves thread safety with synchronized...
    public synchronized void increment() {
        value++;
    }

    public synchronized void decrement() {
        value--;
    }

    public synchronized int get() {
        return value;
    }
    */

    /*
    Below achieves thread safety using Locks...
    private Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        value++;
        lock.unlock();
    }

    public void decrement() {
        lock.lock();
        value--;
        lock.unlock();
    }

    public synchronized int get() {
        return value;
    }

     */

}
