package com.kodilla.spring.intro.configuration;

import com.kodilla.spring.intro.animals.Animal;
import com.kodilla.spring.intro.animals.Cat;
import com.kodilla.spring.intro.animals.Dog;
import com.kodilla.spring.intro.animals.Mouse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class AppConfiguration {

    @Bean
    public Dog createCat() {
        return new Dog();
    }

    @Bean
    public Animal chosenAnimal() {
        Random random = new Random();
        int animalNumber = random.nextInt(3);
        if (animalNumber == 0) {
            return new Dog();
        } else if (animalNumber == 1) {
            return new Cat();
        }
        return new Mouse();
    }
}
