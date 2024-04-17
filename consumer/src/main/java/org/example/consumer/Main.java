package org.example.consumer;

import org.example.service.Greetings;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        ServiceLoader<Greetings> loader = ServiceLoader.load(Greetings.class);

        for (Greetings greetings : loader){
        System.out.println(greetings.greet("Yrla"));
        }
    }
}
