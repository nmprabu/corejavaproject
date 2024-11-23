package com.corejavaproject.designpattern.PrototypeDesign;

public interface PrototypeCapable extends Cloneable{
    PrototypeCapable clone() throws CloneNotSupportedException;
}
