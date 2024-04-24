package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        // given
        World world = new World();
        BigDecimal expectedPeopleQuantity = new BigDecimal("2095408209");

        // when
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();

        // then
        assertEquals(expectedPeopleQuantity, worldPeopleQuantity);

    }
}
