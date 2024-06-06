package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        // given

        // when
        board.taskAdd(board.getToDoList(), "Some task to do.");
        board.taskAdd(board.getInProgressList(), "Some task in progress.");
        board.taskAdd(board.getDoneList(), "Some task is done.");

        // then
        assertEquals("Some task to do.", board.taskRead(board.getToDoList(), 0));
        assertEquals("Some task in progress.", board.taskRead(board.getInProgressList(), 0));
        assertEquals("Some task is done.", board.taskRead(board.getDoneList(), 0));
    }
}
