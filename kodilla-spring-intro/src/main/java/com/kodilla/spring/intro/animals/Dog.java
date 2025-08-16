package com.kodilla.spring.intro.animals;

public class Dog implements Animal {
    @Override
    public String introduce() {
        return "I'm the dog.";
    }
}
