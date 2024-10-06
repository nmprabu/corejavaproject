package com.corejavaproject.collection.collectionsmultithreading;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Log4j2
public class CopyOnArrayListExample {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        list1.add("Chennai");
        list1.add("Delhi");
        list1.add("Pune");

        CopyOnWriteArrayList<String> list2 = new CopyOnWriteArrayList<String>();

        list2.add("Chennai");
        list2.add("Bangalore");
        list2.add("Delhi");
        list2.add("Pune");

        Runnable runnablereader = ()->{
            try {
               // log.info("Thread name:{} ", Thread.currentThread().getName());
                //log.info(list2);
                log.info(Thread.currentThread().getName() + "Reader Start");
                log.info(list2);
                //Thread.sleep(9000);

                log.info(Thread.currentThread().getName() + "Reader End");

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };

        Runnable runnablewriter = ()->{
            try {
               // log.info("Thread name:{} ", Thread.currentThread().getName());

                log.info(Thread.currentThread().getName() + "Writer Start");
               // Thread.sleep(9000);
                list2.add("Hyderabad");
                log.info(Thread.currentThread().getName() + "Writer End");
                //log.info(list2);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread1 = new Thread(runnablereader);
        thread1.start();
        Thread thread2 = new Thread(runnablereader);
        thread2.start();
        Thread thread3 = new Thread(runnablereader);
        thread3.start();
        Thread thread4 = new Thread(runnablereader);
        thread4.start();

        Thread thread5 = new Thread(runnablewriter);
        thread5.start();





    }



}
