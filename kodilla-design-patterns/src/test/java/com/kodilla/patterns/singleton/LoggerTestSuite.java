package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private final Logger logger = Logger.INSTANCE;

    @Test
    void testGetLastLog() {
        // given
        logger.log("Server crash");

        // when
        String lastLog = logger.getLastLog();

        // then
        assertEquals("Server crash", lastLog);
    }
}
