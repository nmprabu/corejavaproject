package com.corejavaproject.thread.threadnotifycommunicaiton;

public class EvenNumberProducer extends Thread{

    private int limit;
    private SharedPrinter sharedPrinter;

    public EvenNumberProducer(int limit, SharedPrinter sharedPrinter) {
        this.limit = limit;
        this.sharedPrinter = sharedPrinter;
    }

    public void run(){
        int evenNumber =2;

        while(evenNumber <= limit){
            try {
                sharedPrinter.printEvenNumber(evenNumber);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            evenNumber = evenNumber+2;
        }
    }
}
