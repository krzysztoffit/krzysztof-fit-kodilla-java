package com.kodilla.stream.lambda;

public class ExectueSaySomething implements Executor {
    @Override
    public void process() {
        System.out.println("This is an example text.");
    }
}
