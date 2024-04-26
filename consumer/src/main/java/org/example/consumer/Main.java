package org.example.consumer;

import org.example.service.Currencies;

import java.io.IOException;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) throws IOException {
        double sek = 100;

        ServiceLoader<Currencies> loader = ServiceLoader.load(Currencies.class);

        for (Currencies converter : loader) {
            double convertedAmount = converter.convert(sek);
            System.out.println(sek + " SEK blir " + convertedAmount + " " + converter.getCurrencyName());
        }
    }
    }
