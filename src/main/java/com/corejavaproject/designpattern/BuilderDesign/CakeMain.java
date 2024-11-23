package com.corejavaproject.designpattern.BuilderDesign;

public class CakeMain {
    public static void main(String[] args) {
        Cake whiteCake = new Cake.Builder()
                .sugar(1)
                .butter(0.5)
                .eggs(2)
                .flour(1.5)
                .bakingPowder(0.75)
                .milk(0.5)
                .build();

        System.out.println(whiteCake);
    }
}
