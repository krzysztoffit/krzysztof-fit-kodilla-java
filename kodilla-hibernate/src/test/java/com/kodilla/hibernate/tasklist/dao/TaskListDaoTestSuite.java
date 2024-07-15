package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LIST_NAME = "Example tasks list";

    @Test
    void testFindByListName() {
        // given
        TaskList taskList = new TaskList(LIST_NAME);
        taskListDao.save(taskList);

        // when
        List<TaskList> readTasksLists = taskListDao.findByListName(LIST_NAME);

        // then
        assertEquals(1, readTasksLists.size());

        // cleanUp
        int id = readTasksLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}
