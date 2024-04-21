package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsCalculatorTestSuite {

    @Mock
    private Statistics statistics;

    private List<String> usersGenerator(int usersQuantity) {
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < usersQuantity; i++) {
            usersList.add("User" + i);
        }
        return usersList;
    }

    @Test
    @DisplayName("Tests for zero posts")
    void testCalculateAdvStatisticsZeroPosts() {
        // given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statistics);
        when(statistics.usersNames()).thenReturn(usersGenerator(1000));
        when(statistics.postCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);

        // when
        statisticsCalculator.calculateAdvStatistics();

        // then
        assertEquals(0.0, statisticsCalculator.getPostsUserAvg());
        assertEquals(0.0, statisticsCalculator.getCommentsUserAvg());
        assertEquals(0.0, statisticsCalculator.getCommentsPostAvg());

    }

    @Test
    @DisplayName("Tests for thousand posts")
    void testCalculateAdvStatisticsThousandPosts() {
        // given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statistics);
        when(statistics.postCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(50000);
        when(statistics.usersNames()).thenReturn(usersGenerator(10000));

        // when
        statisticsCalculator.calculateAdvStatistics();

        // then
        assertEquals(0.1, statisticsCalculator.getPostsUserAvg());
        assertEquals(5.0, statisticsCalculator.getCommentsUserAvg());
        assertEquals(50.0, statisticsCalculator.getCommentsPostAvg());
    }

    @Test
    @DisplayName("Tests for zero comments")
    void testCalculateAdvStatisticsZeroComments() {
        // given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statistics);
        when(statistics.postCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersGenerator(10000));

        // when
        statisticsCalculator.calculateAdvStatistics();

        // then
        assertEquals(0.1, statisticsCalculator.getPostsUserAvg());
        assertEquals(0.0, statisticsCalculator.getCommentsUserAvg());
        assertEquals(0.0, statisticsCalculator.getCommentsPostAvg());
    }

    @Test
    @DisplayName("Tests for more posts than comments")
    void testCalculateAdvStatisticsMorePostsThanComments() {
        // given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statistics);
        when(statistics.postCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(500);
        when(statistics.usersNames()).thenReturn(usersGenerator(10000));

        // when
        statisticsCalculator.calculateAdvStatistics();

        // then
        assertEquals(0.1, statisticsCalculator.getPostsUserAvg());
        assertEquals(0.05, statisticsCalculator.getCommentsUserAvg());
        assertEquals(0.5, statisticsCalculator.getCommentsPostAvg());
    }

    @Test
    @DisplayName("Tests for more comments than posts")
    void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        // given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statistics);
        when(statistics.postCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(5000);
        when(statistics.usersNames()).thenReturn(usersGenerator(10000));

        // when
        statisticsCalculator.calculateAdvStatistics();

        // then
        assertEquals(0.1, statisticsCalculator.getPostsUserAvg());
        assertEquals(0.5, statisticsCalculator.getCommentsUserAvg());
        assertEquals(5.0, statisticsCalculator.getCommentsPostAvg());
    }

    @Test
    @DisplayName("Tests for zero users")
    void testCalculateAdvStatisticsZeroUsers() {
        // given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statistics);
        when(statistics.postCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(new ArrayList<>());

        // when
        statisticsCalculator.calculateAdvStatistics();

        // then
        assertEquals(0.0, statisticsCalculator.getPostsUserAvg());
        assertEquals(0.0, statisticsCalculator.getCommentsUserAvg());
        assertEquals(0.0, statisticsCalculator.getCommentsPostAvg());
    }

    @Test
    @DisplayName("Tests for hundred users")
    void testCalculateAdvStatisticsHundredUsers() {
        // given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statistics);
        when(statistics.postCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(500);
        when(statistics.usersNames()).thenReturn(usersGenerator(100));

        // when
        statisticsCalculator.calculateAdvStatistics();

        // then
        assertEquals(10.0, statisticsCalculator.getPostsUserAvg());
        assertEquals(5.0, statisticsCalculator.getCommentsUserAvg());
        assertEquals(0.5, statisticsCalculator.getCommentsPostAvg());
    }
}
