package com.corejavaproject.designpattern.factorydesign;

public class Factory {
    public static void main(String[] args) {
        String country = "USA";
        Currency currency = CurrencyFactory.createCurrency(country);
        System.out.println(currency.getCurrency());
    }
}
