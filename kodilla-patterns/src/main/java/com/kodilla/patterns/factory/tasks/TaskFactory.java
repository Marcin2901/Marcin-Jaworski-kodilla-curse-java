package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPING = "SHOPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(String taskClass) {
        switch (taskClass) {
            case SHOPING:
                return new ShoppingTask("Shoping Task", "glass", 5.0);
            case PAINTING:
                return new PaintingTask("Painting Task", "blue", "sky");
            case DRIVING:
                return new DrivingTask("Driving Task", "Wrocłąw", "bus");
            default:
                return null;
        }
    }
}
