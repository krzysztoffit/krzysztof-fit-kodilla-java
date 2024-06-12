package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isTaskExecuted;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
        PaintingTask that = (PaintingTask) o;
        return Objects.equals(taskName, that.taskName) && Objects.equals(color, that.color) && Objects.equals(whatToPaint, that.whatToPaint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, color, whatToPaint);
    }
}
