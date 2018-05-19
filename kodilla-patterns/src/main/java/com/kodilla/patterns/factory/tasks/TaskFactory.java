package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING TASK";
    public static final String SHOPPING = "SHOPPING TASK";
    public static final String PAINTING = "PAINTING TASK";

    public Task makeTask(String taskType) {
        switch (taskType) {
            case DRIVING:
                return new DrivingTask("Example driving task", "School", "Car");
            case SHOPPING:
                return new ShoppingTask("Example shopping task", "Flour", 1);
            case PAINTING:
                return new PaintingTask("Example painting task", "green", "Doors of Stone");
            default:
                return null;
        }
    }
}
