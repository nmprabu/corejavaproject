package com.corejavaproject.thread.threadlocal;

public class DemoMain {
    public static void main(String[] args) {
        DemoTask demoTask = new DemoTask();

        Thread thread1 = new Thread(demoTask);
        thread1.start();

        Thread thread2 = new Thread(demoTask);
        thread2.start();

        Thread thread3 = new Thread(demoTask);
        thread3.start();
    }
}
