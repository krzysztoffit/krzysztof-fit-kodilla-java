package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
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

    @Test
    void testTaskListDaoSaveWithTasks() {
        // given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LIST_NAME);
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        // when
        taskListDao.save(taskList);
        int id = taskList.getId();

        // then
        assertNotEquals(0, id);

        // cleanUp
        taskListDao.deleteById(id);
    }
}
