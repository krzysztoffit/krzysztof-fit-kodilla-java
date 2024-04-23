package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int userId;
    private final String username;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int postsQuantity;

    public ForumUser(int userId, String username, char gender, LocalDate dateOfBirth, int postsQuantity) {
        this.userId = userId;
        this.username = username;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.postsQuantity = postsQuantity;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
