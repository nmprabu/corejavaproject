package com.corejavaproject.lambda.defaultstaticprivateinInterface;

public interface Vehicle1 {
    int NO_DOORS = 5;

    void engine();

    public default void gearBox(){
        System.out.println("Vehicle1 Gear box");
        print();
    }

    public static void getNoOfWheels(){
        System.out.println("No of wheels: 4");
    }

    private void print(){
        System.out.println("Print");
    }

}
