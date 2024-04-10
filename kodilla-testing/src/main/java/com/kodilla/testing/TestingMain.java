package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int addResult = calculator.add(5, 10);
        int subResult = calculator.subtract(30, 10);

        if (addResult == 15) {
            System.out.println("Adding test is OK");
        } else {
            System.out.println("Adding test is failed");
        }

        if (subResult == 20) {
            System.out.println("Subtracting test is OK");
        } else {
            System.out.println("Subtracting test is failed");
        }
    }
}
