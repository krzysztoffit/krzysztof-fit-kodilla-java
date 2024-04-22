package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating exspressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println();
        System.out.println("Calculating exspressions with method references");
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::divideAByB);

        System.out.println();
        System.out.println("Poem decorator");
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Some beautiful sentence.", textToDecor -> textToDecor.toUpperCase());
        poemBeautifier.beautify(
                "Some other text with beautifier.", textToDecor -> "***".concat(textToDecor).concat("***")
        );
        poemBeautifier.beautify(
                "This beautifier is so cool!", textToDecor -> textToDecor.replace(" ", "_")
        );
    }
}
