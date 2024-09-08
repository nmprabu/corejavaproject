package com.corejavaproject.thread.threadnotifycommunicaiton;

public class SharedPrinter {
    boolean isOddNumberPrinted = false;

    public synchronized void printOddNumber(int oddNumber) throws InterruptedException {

        while(isOddNumberPrinted){
            wait();
        }
        System.out.println(oddNumber);

        isOddNumberPrinted = true;
        notify();
    }

    public synchronized void printEvenNumber(int evenNumber) throws InterruptedException {

        while(!isOddNumberPrinted){
            wait();
        }
        System.out.println(evenNumber);

        isOddNumberPrinted = false;
        notify();
    }
}
