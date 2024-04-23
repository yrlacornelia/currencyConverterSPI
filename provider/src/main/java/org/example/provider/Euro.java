package org.example.provider;

import org.example.service.Currencies;

public class Euro implements Currencies {
    @Override
    public String getCurrencyName() {
        return "Euro";
    }

    @Override
    public double convert(double sek) {
        return sek * 0.086;
    }
}
