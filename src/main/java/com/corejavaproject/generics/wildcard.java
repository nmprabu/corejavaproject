package com.corejavaproject.generics;

import java.util.Arrays;
import java.util.List;

public class wildcard {

    public static void main(String[] args) {
        wildcard wc = new wildcard();
        List<Object> strings = Arrays.asList("Prabhu", "Easan", "Neelan");
        List<Integer> nums = Arrays.asList(10, 20, 30);

        wc.printList(strings);
        wc.printList2(strings);
        wc.printList3(nums);
        wc.printList4(strings);
    }

    private void printList(List<?> list) {
        for (Object n: list){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    private <T> void printList2(List<T> list) {
        for (Object n: list){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    private void printList3(List<? extends Number> list) {
        for (Object n: list){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    private void printList4(List<? super Number> list) {
        for (Object n: list){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
