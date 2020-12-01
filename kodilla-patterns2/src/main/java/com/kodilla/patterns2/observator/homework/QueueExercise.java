package com.kodilla.patterns2.observator.homework;

import java.util.ArrayList;
import java.util.List;

public class QueueExercise implements Observable{

    private final List<Observer> observers;
    private final String name;
    private List<String> exercises;

    public QueueExercise(String name) {
        this.name = name;
        exercises = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addExercise(String exercise) {
        exercises.add(exercise);
        notifuObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifuObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getName() {
        return name;
    }

    public List<String> getExercises() {
        return exercises;
    }
}
