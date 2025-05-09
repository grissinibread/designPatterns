package observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update();
    }
}