package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result;
        try {
            result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("Can't divide by zero!");
        } finally {
            System.out.println("The end of the program.");
        }
    }
}
