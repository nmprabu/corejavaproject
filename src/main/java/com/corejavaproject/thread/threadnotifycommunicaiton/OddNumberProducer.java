package com.corejavaproject.thread.threadnotifycommunicaiton;

public class OddNumberProducer extends Thread{

    private int limit;
    private SharedPrinter sharedPrinter;

    public OddNumberProducer(int limit, SharedPrinter sharedPrinter) {
        this.limit = limit;
        this.sharedPrinter = sharedPrinter;
    }

    public void run(){
        int oddNumber =1;

        while(oddNumber <= limit){
            try {
                sharedPrinter.printOddNumber(oddNumber);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            oddNumber = oddNumber+2;
        }
    }
}
