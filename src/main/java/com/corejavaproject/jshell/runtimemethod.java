package com.corejavaproject.jshell;

import java.io.IOException;

public class runtimemethod {

    public static void main(String[] args) throws IOException {


        try {
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
