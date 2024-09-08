package com.corejavaproject.stream;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private int orderId;
    private float price;
    private Address address;
}
