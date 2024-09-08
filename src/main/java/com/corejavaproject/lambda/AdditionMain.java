package com.corejavaproject.lambda;

import java.util.Collection;
import java.util.Collections;

public class AdditionMain {

    public static void main(String[] args) {

        Addition addition = (input1, input2) -> {
            return input1 + input2;
        };

        System.out.println(addition.add(5,6));

    }

}
