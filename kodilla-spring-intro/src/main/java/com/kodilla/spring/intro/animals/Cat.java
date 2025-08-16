package com.kodilla.spring.intro.animals;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    @Override
    public String introduce() {
        return "I'm the cat.";
    }
}
