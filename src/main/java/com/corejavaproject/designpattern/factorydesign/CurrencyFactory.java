package com.corejavaproject.designpattern.factorydesign;

public class CurrencyFactory {

    public static Currency createCurrency(String country){
        if(country.equalsIgnoreCase("India"))
        {
            return new Rupee();
        } else if (country.equalsIgnoreCase("Singapore"))
        {
            return new SingaporeUSD();
        } else if (country.equalsIgnoreCase("USA")) {
            return new USDollar();
        }
        throw new IllegalArgumentException("No such Currency");

    }

}

