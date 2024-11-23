package com.corejavaproject.stream;

import java.util.ArrayList;
import java.util.List;

public class StringToStream {

    public static void main(String[] args) {


        String testString = "hello\nworld\nis\nexecuted";

        List<String> strlines = new ArrayList<>();

       // testString.lines().filter(data -> data.equals("hello")).forEach(line -> strlines.add(line));

        testString.lines().forEach(line -> strlines.add(line));
        System.out.println(strlines);
    }
}
