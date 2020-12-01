package com.kodilla.patterns2.observator.homework;

public class Mentor implements Observer{
    private final String username;
    private int updateCount;

    public Mentor(String name) {
        this.username = name;
    }

    @Override
    public void update(QueueExercise queueExercise) {
        System.out.println(username + " New exercise in topic " + queueExercise.getName() + "\n" +
                "total: " + queueExercise.getExercises().size() + " exercise");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}