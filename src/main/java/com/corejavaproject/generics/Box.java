package com.corejavaproject.generics;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class Box <T>{
    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type){
        this.type = type;
    }


}
