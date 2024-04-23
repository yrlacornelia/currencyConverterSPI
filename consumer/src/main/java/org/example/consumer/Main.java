package org.example.consumer;

import org.example.service.Currencies;

import java.io.IOException;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ServiceLoader<Currencies> loader = ServiceLoader.load(Currencies.class);

        System.out.print("Skriv belopp i SEK: ");
        double sek = scanner.nextDouble();

        System.out.print("Konvertera till EURO eller dollar: ");
        String currencyChoice = scanner.next();

        Currencies selectedConverter = null;
        for (Currencies converter : loader) {
            if (currencyChoice.equalsIgnoreCase(converter.getCurrencyName())) {
                selectedConverter = converter;
                break;
            }
        }

        if (selectedConverter != null) {
            double convertedAmount = selectedConverter.convert(sek);
            System.out.println( sek + " SEK blir " +convertedAmount + " "+ selectedConverter.getCurrencyName() );
        } else {
            System.out.println("Ogiltigt val av valutaomvandlare.");
        }

        scanner.close();
    }
    }
