package org.example.provider;

import org.example.service.Greetings;

public class SwedishGreeting implements Greetings {
    @Override
    public String greet(String name){
        return "hej" + name;
    }
}
