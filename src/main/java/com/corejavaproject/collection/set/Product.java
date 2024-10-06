package com.corejavaproject.collection.set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Product implements Comparable<Product> {

    private int ProductID;

    private String ProductDesc;

    private int ProductPrice;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return ProductID == product.ProductID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ProductID);
    }

    @Override
    public int compareTo(Product o) {
        return o.getProductDesc().compareTo(this.getProductDesc());
    }
}
