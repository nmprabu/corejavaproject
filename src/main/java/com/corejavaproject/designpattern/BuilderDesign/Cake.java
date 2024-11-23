package com.corejavaproject.designpattern.BuilderDesign;

import lombok.Builder;
import lombok.ToString;

@ToString
//@Builder - Alternatively you can enable @Builder from lambok!
public class Cake {
    private final double sugar;
    private final double butter;
    private final int eggs;
    private final int vanila;
    private final double flour;
    private final double bakingPowder;
    private final double milk;
    private final int cherry;

    public static class Builder {
        private double sugar;
        private double butter;
        private int eggs;
        private int vanila;
        private double flour;
        private double bakingPowder;
        private double milk;
        private int cherry;

        public Builder sugar(double cup) {
            this.sugar = cup;
            return this;
        }

        public Builder butter(double butter) {
            this.butter = butter;
            return this;
        }

        public Builder eggs(int eggs) {
            this.eggs = eggs;
            return this;
        }

        public Builder vanila(int vanila) {
            this.vanila = vanila;
            return this;
        }

        public Builder flour(double flour) {
            this.flour = flour;
            return this;
        }

        public Builder bakingPowder(double bakingPowder) {
            this.bakingPowder = bakingPowder;
            return this;
        }

        public Builder milk(double milk) {
            this.milk = milk;
            return this;
        }

        public Builder cherry(int cherry) {
            this.cherry = cherry;
            return this;
        }

        public Cake build() {
            return new Cake(this);
        }
    }
    private Cake(Builder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.eggs = builder.eggs;
        this.vanila = builder.vanila;
        this.flour = builder.flour;
        this.bakingPowder = builder.bakingPowder;
        this.milk = builder.milk;
        this.cherry = builder.cherry;
    }

}
