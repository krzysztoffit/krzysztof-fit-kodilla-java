package com.kodilla.spring.intro.beverages;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BeveragesTestSuite {

    @Autowired
    private CocaCola cocaCola;

    @Test
    void shouldGiveBeverageTaste() {
        // GIVEN
        // WHEN
        String taste = cocaCola.taste();

        // THEN
        assertEquals(taste, "sweet Coca-Cola");
    }
}
