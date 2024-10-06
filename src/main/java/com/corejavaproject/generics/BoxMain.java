package com.corejavaproject.generics;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BoxMain {

    public static void main(String[] args) {

        Box<Integer> box1 = new Box<>();

        box1.setType(100);
        log.info("VAlue of box1 {}", box1.getType());

        Box<String> box2 = new Box<>();

        box2.setType("Prabhu");
        log.info("Value of box2 {}", box2.getType());



    }
}
