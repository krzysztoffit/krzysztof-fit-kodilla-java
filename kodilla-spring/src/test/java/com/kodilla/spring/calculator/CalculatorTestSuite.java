package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        // given
        // nothing

        // when
        double add = calculator.add(5.5, 4.5);
        double sub = calculator.sub(5.5, 4.5);
        double mul = calculator.mul(5.5, 2.0);
        double div = calculator.div(12.8, 4.0);

        // then
        assertEquals(10.0, add);
        assertEquals(1.0, sub);
        assertEquals(11.0, mul);
        assertEquals(3.2, div);
    }
}
