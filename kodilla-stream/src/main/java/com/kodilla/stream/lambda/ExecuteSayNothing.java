package com.kodilla.stream.lambda;

public class ExecuteSayNothing implements Executor {
    @Override
    public void process() {
        System.out.println("Nothing to say");
    }
}
