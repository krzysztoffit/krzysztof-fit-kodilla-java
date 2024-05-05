package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testSecondChallengeMethodWhenXIs2() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertThrows(Exception.class, () -> secondChallenge.propablyIWillThrowException(2.0, 5.0));
    }

    @Test
    void testSecondChallengeMethodWhenXIsLessThan1() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertThrows(Exception.class, () -> secondChallenge.propablyIWillThrowException(0.5, 5.0));
    }

    @Test
    void testSecondChallengeMethodWhenYIs1AndHalf() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertThrows(Exception.class, () -> secondChallenge.propablyIWillThrowException(5.0, 1.5));
    }
}
