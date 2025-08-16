package com.kodilla.spring.intro;

import com.kodilla.spring.intro.beverages.BeveragesConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringIntroRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringIntroRunner.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.intro");
        String[] beans = context.getBeanDefinitionNames();

        Arrays.stream(beans)
                .filter(b -> !b.startsWith("org"))
                .forEach(b -> System.out.println("********************\n" + b));
    }
}
