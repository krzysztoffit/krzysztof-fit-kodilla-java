package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean isTaskExecuted;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        isTaskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrivingTask that = (DrivingTask) o;
        return Objects.equals(taskName, that.taskName) && Objects.equals(where, that.where) && Objects.equals(using, that.using);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, where, using);
    }
}
