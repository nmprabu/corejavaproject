package com.corejavaproject.stream;

import java.util.List;

public class takewhiledropwhile {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        numbers.stream().takeWhile(i -> i <5)
                .forEach(e -> System.out.print(e));

        System.out.println();

        List<Integer> number2 = List.of(1,2,3,4,5,6,7,8);
        number2.stream().dropWhile(n -> n<5)
                .forEach(e -> System.out.print(e));

        System.out.println();

        List<String> names = List.of("easan", "Neelan", "Prabhu");
        names.stream().takeWhile(name -> name.contains("e"))
                .forEach(e -> System.out.print(e));
    }
}
