package com.kodilla.spring.stream.lambda;

public class ExecuteSaySomething implements Executor {
    @Override
    public void process() {
        System.out.println("THis is an example text");
    }
}
