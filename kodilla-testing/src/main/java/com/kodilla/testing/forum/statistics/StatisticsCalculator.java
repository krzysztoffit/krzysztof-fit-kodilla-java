package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private Statistics statistics;

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double postsUserAvg;
    private double commentsUserAvg;
    private double commentsPostAvg;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public double getPostsUserAvg() {
        return postsUserAvg;
    }

    public double getCommentsUserAvg() {
        return commentsUserAvg;
    }

    public double getCommentsPostAvg() {
        return commentsPostAvg;
    }

    public void calculateAdvStatistics() {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postCount();
        commentsQuantity = statistics.commentsCount();

        if (usersQuantity > 0) {
            postsUserAvg = (double) postsQuantity / usersQuantity;
        }

        if (statistics.usersNames().size() > 0) {
            commentsUserAvg = (double) commentsQuantity / usersQuantity;
        }

        if (statistics.postCount() > 0) {
            commentsPostAvg = (double) commentsQuantity /postsQuantity;
        }
    }

    public void showStatistics() {
        System.out.println("Users quantity: " + usersQuantity);
        System.out.println("Posts quantity: " + postsQuantity);
        System.out.println("Comments quantity: " + commentsQuantity);
        System.out.println("Posts per user average: " + postsUserAvg);
        System.out.println("Comments per user average: " + commentsUserAvg);
        System.out.println("Comments per post average: " + commentsPostAvg);
    }
}
