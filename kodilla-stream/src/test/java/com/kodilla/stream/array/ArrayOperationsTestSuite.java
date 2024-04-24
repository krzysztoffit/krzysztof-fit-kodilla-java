package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        // given
        int[] array = {54, 172, 982, 88, 540, 150, 93, 54, 28, 95};

        // when
        double average = ArrayOperations.getAverage(array);

        // then
        assertEquals(225.6, average);

    }
}
