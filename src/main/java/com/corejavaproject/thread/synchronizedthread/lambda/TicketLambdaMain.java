package com.corejavaproject.thread.synchronizedthread.lambda;

import com.corejavaproject.thread.synchronizedthread.SharedResource;
import com.corejavaproject.thread.synchronizedthread.Ticket;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class TicketLambdaMain {

    public static void main(String[] args) {
        SharedResource sharedResource1 = new SharedResource();

        Thread thread1 = new Thread(() -> {
            try {
                sharedResource1.save(1, 500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();

        Thread thread2 = new Thread(() -> {
            try {
                sharedResource1.save(2, 600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread2.start();

        Thread thread3 = new Thread(() -> {
            try {
                sharedResource1.save(3, 600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread3.start();

    }
}
