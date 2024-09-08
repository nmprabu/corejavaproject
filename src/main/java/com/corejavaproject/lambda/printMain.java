package com.corejavaproject.lambda;

public class printMain {

    public static void main(String[] args) {
        print print = (strval) -> {
            System.out.println(strval);
        };
        print.Print("LAmbda expression");
    }

}
