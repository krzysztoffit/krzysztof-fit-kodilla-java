package com.kodilla.spring.intro.animals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class AnimalTestSuite {

    @Test
    void shouldGiveCatIntroduce() {
        // GIVEN
        ApplicationContext context = new AnnotationConfigApplicationContext(
                Cat.class
        );
        Cat cat = context.getBean(Cat.class);

        // WHEN
        String mruczekVoice = cat.introduce();

        // THEN
        assertTrue("meow".equals(mruczekVoice));
    }

    @Test
    void shouldGiveDogIntroduce() {
        // GIVEN
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.kodilla.spring"
        );
        Dog dog = context.getBean(Dog.class);

        // WHEN
        String reksioVoice = dog.introduce();

        // THEN
        assertTrue("hau".equals(reksioVoice));
    }

    @Test
    void shouldChoseAnimal() {
        // GIVEN
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.intro");
        Animal animal = (Animal) context.getBean("chosenAnimal");

        // WHEN
        String introduce = animal.introduce();

        // THEN
        System.out.println(introduce);

    }
}
