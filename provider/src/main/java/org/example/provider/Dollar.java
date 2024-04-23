package org.example.provider;

import org.example.service.Currencies;

public class Dollar implements Currencies {


    @Override
    public String getCurrencyName() {
        return "Dollar";
    }

    @Override
    public double convert(double sekAmount) {
        return sekAmount * 0.092;
    }

}
