package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> figures = new ArrayList<>();

    public boolean addFigure(Shape shape) {
        return figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        if (figures.contains(shape)) {
            return figures.remove(shape);
        }
        return false;
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < figures.size()) {
            return figures.get(n);
        }
        return null;
    }

    public String showFigures() {
        String result = "";
        for (Shape figure : figures) {
            result += figure.getShapeName();
        }
        return result;
    }

}
