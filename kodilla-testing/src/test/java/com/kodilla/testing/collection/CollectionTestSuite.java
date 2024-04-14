package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Exterminate odd numbers from the list and return new list " +
            "with only even numbers. Testing empty list.")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        // given
        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        // when
        List<Integer> exterminated = oddNumbersExterminator.exterminate(emptyList);

        // then
        Assertions.assertTrue(exterminated.isEmpty());
    }

    @DisplayName("Exterminate odd numbers from the list and return new list " +
            "with only even numbers. Testing normal list.")
    @Test
    void testOddNumbersExterminatorNormalList() {
        // given
        List<Integer> normalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        // when
        List<Integer> exterminated = oddNumbersExterminator.exterminate(normalList);

        // then
        Assertions.assertFalse(exterminated.isEmpty());
        for (Integer number : exterminated) {
            Assertions.assertTrue(number % 2 == 0);
        }

    }
}
