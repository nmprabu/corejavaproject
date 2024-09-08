package com.corejavaproject.thread.threadnotifycommunicaiton;

import com.corejavaproject.thread.thread.Order;

public class TestMain {
    public static void main(String[] args) {

        System.out.println("Starting threads to print numbers");
        SharedPrinter sharedPrinter = new SharedPrinter();
        EvenNumberProducer evenThread = new EvenNumberProducer(10, sharedPrinter);
        OddNumberProducer oddThread = new OddNumberProducer(10, sharedPrinter);
        evenThread.start();
        oddThread.start();
        System.out.println("Completed threads to print numbers");
    }
}
