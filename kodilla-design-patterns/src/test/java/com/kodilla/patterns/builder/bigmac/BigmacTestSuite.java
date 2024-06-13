package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        // given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sesame")
                .burgers(2)
                .sauce("Tomato")
                .ingredient("cucumber")
                .ingredient("chili pepper")
                .ingredient("cheese")
                .ingredient("bacon")
                .build();
        System.out.println(bigmac);

        // when
        int howManyIngredients = bigmac.getIngredients().size();

        // then
        assertEquals(4, howManyIngredients);
    }
}
