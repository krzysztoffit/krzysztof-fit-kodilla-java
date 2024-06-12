package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING_TASK -> new ShoppingTask("Item to buy", "Bread", 2.50);
            case PAINTING_TASK -> new PaintingTask("Living Room painting", "Beige",
                    "Living Room");
            case DRIVING_TASK -> new DrivingTask("Drive to stadium", "National Stadium", "Car");
            default -> null;
        };
    }

}
