package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        // given
        User jan = new Millenials("Jan");
        User roman = new YGeneration("Roman");
        User adam = new ZGeneration("Adam");

        // when
        String janPublishOn = jan.publisher();
        System.out.println("Jan publish on: " + janPublishOn);
        String romanPublishOn = roman.publisher();
        System.out.println("Roman publish on: " + romanPublishOn);
        String adamPublishOn = adam.publisher();
        System.out.println("Adam publish on: " + adamPublishOn);

        // then
        assertEquals("Facebook", janPublishOn);
        assertEquals("Twitter", romanPublishOn);
        assertEquals("Snapchat", adamPublishOn);
    }

    @Test
    void testIndividualSharingStrategy() {
        // given
        User jan = new Millenials("Jan");

        // when
        String janPublishOn = jan.publisher();
        System.out.println("Jan publish on: " + janPublishOn);
        jan.sharePost(new SnapchatPublisher());
        janPublishOn = jan.publisher();
        System.out.println("From now Jan publish on: " + janPublishOn);

        // then
        assertEquals("Snapchat", janPublishOn);
    }
}
