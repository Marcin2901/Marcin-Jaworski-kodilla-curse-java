package com.kodilla.patterns2.observator.homework;


public interface Observable {
    void registerObserver(Observer observer);
    void notifuObservers();
    void removeObserver(Observer observer);

}
