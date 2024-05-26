package com.kodilla.good.patterns.challenges;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the number: ");
        int number = scanner.nextInt();
        System.out.println(calculateFactorial(number));
    }

    private static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
