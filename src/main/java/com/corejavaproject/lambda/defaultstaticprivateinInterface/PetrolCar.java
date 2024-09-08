package com.corejavaproject.lambda.defaultstaticprivateinInterface;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PetrolCar implements Vehicle, Vehicle1{
    @Override
    public void engine() {
        log.info("Petrol Car");
    }

    @Override
    public void gearBox() {
        Vehicle.super.gearBox();
    }


    public void petrol(){
        log.info("Pertrol");
        gearBox();
    }
}
