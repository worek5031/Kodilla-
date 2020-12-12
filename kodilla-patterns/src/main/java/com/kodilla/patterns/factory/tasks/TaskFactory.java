package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskMaker) {
        switch (taskMaker) {
            case DRIVING:
                return new DrivingTask("Poznan drive", "Poznan", "VW");
            case PAINTING:
                return new PaintingTask("Sleeping room painting", "green", "Sleeping room");
            case SHOPPING:
                return new ShoppingTask("Vacation shopping", "Complex food supply", 300);
            default:
                return null;
        }
    }
}
