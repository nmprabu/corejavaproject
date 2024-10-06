package com.corejavaproject.collection.map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Customer {
    private int custID;
    private String custName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return custID == customer.custID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(custID);
    }
}
