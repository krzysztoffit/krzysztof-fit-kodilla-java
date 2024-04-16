package com.kodilla.testing.shape;

public class Square implements Shape {

    private double a;
    private double b;

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return a * b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;
        return Double.compare(a, square.a) == 0 && Double.compare(b, square.b) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(a);
        result = 31 * result + Double.hashCode(b);
        return result;
    }

}
