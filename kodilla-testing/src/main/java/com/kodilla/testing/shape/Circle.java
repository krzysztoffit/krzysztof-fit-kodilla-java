package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double r;

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.PI * Math.sqrt(r);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;
        return Double.compare(r, circle.r) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(r);
    }
}
