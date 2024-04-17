package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> figures = new ArrayList<>();

    public boolean addFigure(Shape shape) {
        return figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return figures.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < figures.size()) {
            return figures.get(n);
        }
        return null;
    }

    public String showFigures() {
        String result = "";
        for (int i = 0; i < figures.size(); i++) {
            Shape figure = figures.get(i);
            result += figure.getShapeName();
            if (i < figures.size() - 1) {
                result += ",";
            }
        }
        return result;
    }

}
