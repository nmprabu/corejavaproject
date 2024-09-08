package com.corejavaproject.lambda.defaultstaticprivateinInterface;

public interface Vehicle {

    int NO_DOORS = 5;

    void engine();

    default void gearBox(){
        System.out.println("Vehicle Gear box");
        print();
    }

    static void getNoOfWheels(){
        System.out.println("No of wheels: 4");
    }

    private void print(){
        System.out.println("Print");
    }

}
