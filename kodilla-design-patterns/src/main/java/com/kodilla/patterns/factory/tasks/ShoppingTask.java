package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public class ShoppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isTaskExecuted;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
        ShoppingTask that = (ShoppingTask) o;
        return Double.compare(quantity, that.quantity) == 0 && Objects.equals(taskName, that.taskName) && Objects.equals(whatToBuy, that.whatToBuy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, whatToBuy, quantity);
    }
}
