package com.corejavaproject.thread.synchronizedthread;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Ticket implements Runnable{
    private long ticketId;
    private long ticketPrice;

    private SharedResource sharedResource;

    public Ticket(long ticketId, long ticketPrice, SharedResource sharedResource) {
        this.ticketId = ticketId;
        this.ticketPrice = ticketPrice;
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            sharedResource.save(ticketId, ticketPrice);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

