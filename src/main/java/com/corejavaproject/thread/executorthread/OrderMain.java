package com.corejavaproject.thread.executorthread;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Log4j2
public class OrderMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);

        OrderTask orderTask1 = new OrderTask(1, "234");
        OrderTask orderTask2 = new OrderTask(3, "456");
        OrderTask orderTask3 = new OrderTask(5, "6345");
        OrderTask orderTask4 = new OrderTask(6, "564");
        OrderTask orderTask5 = new OrderTask(7, "4564");
        OrderTask orderTask6 = new OrderTask(7, "7345");
        OrderTask orderTask7 = new OrderTask(3, "456");
        OrderTask orderTask8 = new OrderTask(8, "456");
        OrderTask orderTask9 = new OrderTask(5, "456");
        OrderTask orderTask10 = new OrderTask(3, "464");
        List<OrderTask> orderTaskList = new ArrayList<>();
        orderTaskList.add(orderTask1);
        orderTaskList.add(orderTask2);
        orderTaskList.add(orderTask3);
        orderTaskList.add(orderTask4);
        orderTaskList.add(orderTask5);
        orderTaskList.add(orderTask6);
        orderTaskList.add(orderTask7);
        orderTaskList.add(orderTask8);
        orderTaskList.add(orderTask9);
        orderTaskList.add(orderTask10);

        List<Future<String>> futureList = service.invokeAll(orderTaskList);

        futureList.forEach(stringFuture -> {
            try {
                log.info(stringFuture.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });



    }

}