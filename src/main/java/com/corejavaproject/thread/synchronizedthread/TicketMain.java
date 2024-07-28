package com.corejavaproject.thread.synchronizedthread;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TicketMain {
    public static void main(String[] args) {
        SharedResource sharedResource1 = new SharedResource();
        SharedResource sharedResource2 = new SharedResource();
        SharedResource sharedResource3 = new SharedResource();

        Ticket ticket1 = new Ticket(1,500, sharedResource1);
        Ticket ticket2 = new Ticket(2,600, sharedResource2);
        Ticket ticket3 = new Ticket(3,700, sharedResource3);
        Ticket ticket4 = new Ticket(3,700, sharedResource3);


        Thread thread1 = new Thread(ticket1);
        thread1.setName("Order 1");
        thread1.start();


        Thread thread2 = new Thread(ticket2);
        thread2.setName("Order 2");
        thread2.start();

        Thread thread3 = new Thread(ticket3);
        thread3.setName("Order 3");
        thread3.setPriority(10);
        thread3.start();

        Thread thread4 = new Thread(ticket4);
        thread4.setName("Order 4");
        thread4.setPriority(10);
        thread4.start();
    }
}

