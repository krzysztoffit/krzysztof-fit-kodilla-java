package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private final List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void taskAdd(final String task) {
        tasks.add(task);
    }

    public String taskRead(final int index) {
        return tasks.get(index);
    }
}
