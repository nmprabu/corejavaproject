package com.corejavaproject.generics;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class OrderMain {

    public static void main(String[] args) {

        OrderPair<Integer, String> ord1 = new OrderPair<>(1, "Easan");
        log.info("Value of ord1 {}", ord1.getValue());

        OrderPair<Integer, Character> ord2 = new OrderPair<>(2, 'Y');

        log.info("Value of ord2 {}", ord2.getValue());

        OrderPair<Integer, String> ord3 = new OrderPair<>(3, "Neelan");
        log.info("Value of ord3 {}", ord3.getValue());


    }
}
