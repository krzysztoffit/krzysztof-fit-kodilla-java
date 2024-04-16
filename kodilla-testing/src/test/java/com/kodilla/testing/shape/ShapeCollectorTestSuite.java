package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        System.out.println("Starting test.");
    }

    @AfterEach
    public void afterEveryTest() {
        System.out.println("Test finished.");
    }

    @Nested
    @DisplayName("Tests for square")
    class TestForSquare {
        @Test
        void testAddFigure() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape figure = new Square();

            // when
            boolean result = shapeCollector.addFigure(figure);

            // then
            Assertions.assertTrue(result);
        }

        @Test
        void testRemoveFigure() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape figure = new Square();
            shapeCollector.addFigure(figure);

            // when
            boolean result = shapeCollector.removeFigure(figure);

            // then
            Assertions.assertTrue(result);
        }

        @Test
        void testGetFigure() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape figure = new Square();
            shapeCollector.addFigure(figure);

            // when
            Shape resultFigure = shapeCollector.getFigure(0);

            // then
            Assertions.assertEquals(resultFigure, figure);
        }

        @Test
        void testShowFigures() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape figure = new Square();
            shapeCollector.addFigure(figure);
            String figureString = figure.getShapeName();

            // when
            String resultString = shapeCollector.showFigures();

            // then
            Assertions.assertEquals(resultString, figureString);
        }
    }

    @Nested
    @DisplayName("Tests for triangle")
    class TestForTriangle {
        @Test
        void testAddFigure() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape figure = new Triangle();

            // when
            boolean result = shapeCollector.addFigure(figure);

            // then
            Assertions.assertTrue(result);
        }

        @Test
        void testRemoveFigure() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape figure = new Triangle();
            shapeCollector.addFigure(figure);

            // when
            boolean result = shapeCollector.removeFigure(figure);

            // then
            Assertions.assertTrue(result);
        }

        @Test
        void testGetFigure() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape figure = new Triangle();
            shapeCollector.addFigure(figure);

            // when
            Shape resultFigure = shapeCollector.getFigure(0);

            // then
            Assertions.assertEquals(resultFigure, figure);
        }

        @Test
        void testShowFigures() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape figure = new Triangle();
            shapeCollector.addFigure(figure);
            String figureString = figure.getShapeName();

            // when
            String resultString = shapeCollector.showFigures();

            // then
            Assertions.assertEquals(resultString, figureString);
        }
    }

    @Nested
    @DisplayName("Tests for circle")
    class TestForCircle {
        @Test
        void testAddFigure() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape figure = new Circle();

            // when
            boolean result = shapeCollector.addFigure(figure);

            // then
            Assertions.assertTrue(result);
        }

        @Test
        void testRemoveFigure() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape figure = new Circle();
            shapeCollector.addFigure(figure);

            // when
            boolean result = shapeCollector.removeFigure(figure);

            // then
            Assertions.assertTrue(result);
        }

        @Test
        void testGetFigure() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape figure = new Circle();
            shapeCollector.addFigure(figure);

            // when
            Shape resultFigure = shapeCollector.getFigure(0);

            // then
            Assertions.assertEquals(resultFigure, figure);
        }

        @Test
        void testShowFigures() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape figure = new Circle();
            shapeCollector.addFigure(figure);
            String figureString = figure.getShapeName();

            // when
            String resultString = shapeCollector.showFigures();

            // then
            Assertions.assertEquals(resultString, figureString);
        }
    }
}
