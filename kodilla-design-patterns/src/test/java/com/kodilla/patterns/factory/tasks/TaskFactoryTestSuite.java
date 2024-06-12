package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        // given
        TaskFactory factory = new TaskFactory();


        // when
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING_TASK);

        // then
        assertEquals(
                new ShoppingTask("Item to buy", "Bread", 2.50),
                shoppingTask
        );
    }

    @Test
    void testFactoryPaintingTask() {
        // given
        TaskFactory factory = new TaskFactory();

        // when
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING_TASK);

        // then
        assertEquals(
                new PaintingTask("Living Room painting", "Beige","Living Room"),
                paintingTask
        );
    }

    @Test
    void testFactoryDrivingTask() {
        // given
        TaskFactory factory = new TaskFactory();

        // when
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING_TASK);

        // then
        assertEquals(
                new DrivingTask("Drive to stadium", "National Stadium", "Car"),
                drivingTask
        );
    }

//    case SHOPPING_TASK -> new ShoppingTask("Item to buy", "Bread", 2.50);
//            case PAINTING_TASK -> new PaintingTask("Living Room painting", "Beige",
//                                                           "Living Room");
//            case DRIVING_TASK -> new DrivingTask("Drive to stadium", "National Stadium", "Car");
}
