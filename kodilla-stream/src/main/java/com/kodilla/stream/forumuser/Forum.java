package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    List<ForumUser> forumUserList = new ArrayList<>();

    public List<ForumUser> getUserList() {
        List<ForumUser> theList = new ArrayList<>();

        theList.add(new ForumUser(0001, "kowal", 'M', LocalDate.of(1992, 10, 2), 23));
        theList.add(new ForumUser(0002, "marchewa", 'M', LocalDate.of(1982, 1, 2), 56));
        theList.add(new ForumUser(0003, "anet", 'K', LocalDate.of(1999, 2, 21), 123));
        theList.add(new ForumUser(0004, "joan", 'K', LocalDate.of(2001, 5, 29), 49));
        theList.add(new ForumUser(0005, "piter", 'M', LocalDate.of(2005, 10, 10), 10));
        theList.add(new ForumUser(0006, "leia", 'K', LocalDate.of(2005, 12, 31), 99));

        return new ArrayList<>(theList);
    }
}
